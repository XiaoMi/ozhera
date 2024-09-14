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
package org.apache.ozhera.log.api.model.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: wtt
 * @date: 2022/5/24 18:24
 * @description:
 */
@Data
public class MiLogMoneTransfer implements Serializable {
    private Long milogAppId;
    private Long appId;
    private String appName;
    private Long envId;
    private String envName;
    private List<String> tailNames;
}
