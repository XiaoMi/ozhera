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
package org.apache.ozhera.log.manager.model.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class LogContextQuery implements Serializable {
    private String logstore;
    private String ip;
    private String fileName;
    private Long lineNumber;
    private String timestamp;
    private Integer pageSize;
    private Integer type; //0-around;1-after;2-before
}
