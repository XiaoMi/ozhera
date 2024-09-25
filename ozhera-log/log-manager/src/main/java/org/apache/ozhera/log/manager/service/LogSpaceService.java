/*
 * Copyright (C) 2020 Xiaomi Corporation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.ozhera.log.manager.service;

import org.apache.ozhera.log.common.Result;
import org.apache.ozhera.log.manager.model.MilogSpaceParam;
import org.apache.ozhera.log.manager.model.dto.MapDTO;
import org.apache.ozhera.log.manager.model.dto.MilogSpaceDTO;
import org.apache.ozhera.log.manager.model.page.PageInfo;
import org.apache.ozhera.log.manager.model.pojo.MilogSpaceDO;

import java.util.List;

public interface LogSpaceService {

    /**
     * new
     *
     * @param cmd
     * @return
     */
    Result<String> newMilogSpace(MilogSpaceParam cmd);

    /**
     * getById
     *
     * @param id
     * @return
     */
    Result<MilogSpaceDTO> getMilogSpaceById(Long id);

    /**
     * Paging query
     *
     * @param spaceName
     * @param page
     * @param pagesize
     * @return
     */
    Result<PageInfo<MilogSpaceDTO>> getMilogSpaceByPage(String spaceName, Long tenantId, Integer page, Integer pagesize);


    Result<List<MapDTO<String, Long>>> getMilogSpaces(Long tenantId);

    /**
     * update
     *
     * @param cmd
     * @return
     */
    Result<String> updateMilogSpace(MilogSpaceParam cmd);

    Result<String> deleteMilogSpace(Long id);

    Result<String> setSpacePermission(Long spaceId, String permDeptIds);

    MilogSpaceDO buildMiLogSpace(MilogSpaceParam cmd, String appCreator);
}