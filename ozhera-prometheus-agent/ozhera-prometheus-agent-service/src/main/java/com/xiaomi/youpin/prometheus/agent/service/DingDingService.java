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

package com.xiaomi.youpin.prometheus.agent.service;

/**
 * @author zhangxiaowei6
 * @Date 2023/9/15 09:33
 */
public interface DingDingService {
    
    public void init() throws Exception;
    
    public void sendDingDing(String content, String[] unionIds, String cardBizId);
    
    public void updateDingDingCard(String content, String cardBizId);
    
    public String getNameByUserId(String userId);
}
