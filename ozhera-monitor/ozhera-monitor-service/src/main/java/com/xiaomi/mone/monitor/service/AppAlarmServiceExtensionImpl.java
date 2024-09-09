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

import com.xiaomi.mone.monitor.result.Result;
import com.xiaomi.mone.monitor.service.api.AppAlarmServiceExtension;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author dingtao
 * @Date 2023/4/21 2:53 PM
 */
@Service
@ConditionalOnProperty(name = "service.selector.property", havingValue = "outer")
public class AppAlarmServiceExtensionImpl implements AppAlarmServiceExtension {
    @Override
    public Result queryFunctionList(Integer projectId) {
        return null;
    }

    @Override
    public Result queryRulesByIamId(Integer iamId, String userName) {
        return null;
    }

    @Override
    public Integer getAlarmIdByResult(Result result) {
        Double alarmId = (Double) result.getData();
        return alarmId == null ? null : alarmId.intValue();
    }
}