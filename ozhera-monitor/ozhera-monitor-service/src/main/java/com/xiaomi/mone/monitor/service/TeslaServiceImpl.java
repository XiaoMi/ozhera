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
import com.xiaomi.mone.monitor.service.api.TeslaService;
import com.xiaomi.mone.monitor.service.model.prometheus.AlarmRuleData;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author dingtao
 * @Date 2023/4/20 5:07 PM
 */
@Service
@ConditionalOnProperty(name = "service.selector.property", havingValue = "outer")
public class TeslaServiceImpl implements TeslaService {
    @Override
    public String getTeslaTimeCost4P99(AlarmRuleData rule) {
        return null;
    }

    @Override
    public String getTeslaAvailability(AlarmRuleData rule) {
        return null;
    }

    @Override
    public void checkTeslaMetrics(StringBuilder title, String alert) {

    }

    @Override
    public Result getTeslaAlarmHealthByUser(String user) {
        return null;
    }

}