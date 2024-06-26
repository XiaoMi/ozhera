/*
 * Copyright 2020 Xiaomi
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
package run.mone.chaos.operator.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxiaowei6
 * @Date 2023/12/13 14:20
 */
@Data
public class IOBO extends PipelineBO implements Serializable {
    private String type;
    private String path;
    private List<String> methods;
    private Integer percent;
    private String latency;
    private String volume;
    private String id;
}