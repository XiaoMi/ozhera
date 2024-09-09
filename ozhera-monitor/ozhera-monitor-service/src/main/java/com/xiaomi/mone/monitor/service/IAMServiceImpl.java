/*
 *  Copyright (C) 2020 Xiaomi Corporation
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.xiaomi.mone.monitor.service;

import com.xiaomi.mone.monitor.service.api.IAMService;
import com.xiaomi.mone.tpc.common.param.NodeQryParam;
import com.xiaomi.mone.tpc.common.vo.NodeVo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author dingtao
 * @Date 2023/4/20 6:44 PM
 */
@Service
@ConditionalOnProperty(name = "service.selector.property", havingValue = "outer")
public class IAMServiceImpl implements IAMService {
    @Override
    public List<NodeVo> list(NodeQryParam nodeQryParam) {
        return null;
    }
}