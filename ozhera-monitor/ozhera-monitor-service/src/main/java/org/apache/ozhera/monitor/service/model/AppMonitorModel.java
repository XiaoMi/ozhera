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
package org.apache.ozhera.monitor.service.model;

import com.xiaomi.mone.app.api.model.HeraAppBaseInfoModel;
import org.apache.ozhera.monitor.dao.model.AppMonitor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author gaoxihui
 * @date 2022/2/21 2:38 AM
 */

@ToString
@Data
public class AppMonitorModel implements Serializable {

    private Integer projectId;

    private Integer iamTreeId;

    private Integer iamTreeType;

    private String projectName;

    private String projectCName;

    private String owner;

    private Integer appSource;

    private Integer bindType;

    private String appLanguage;

    private Integer appType;

    private String envMapping;

    private List<String> joinedMembers;

    public AppMonitor appMonitor(){
        AppMonitor appMonitor = new AppMonitor();
        BeanUtils.copyProperties(this,appMonitor);
        return appMonitor;
    }

    public HeraAppBaseInfoModel baseInfo(){

        HeraAppBaseInfoModel heraAppBaseInfo = new HeraAppBaseInfoModel();

        heraAppBaseInfo.setBindId(String.valueOf(this.getProjectId()));
        heraAppBaseInfo.setBindType(this.getBindType());
        heraAppBaseInfo.setAppName(this.getProjectName());
        heraAppBaseInfo.setAppCname(this.getProjectCName());

        heraAppBaseInfo.setAppLanguage(this.getAppLanguage());
        heraAppBaseInfo.setPlatformType(this.getAppSource());
        heraAppBaseInfo.setAppType(this.getAppType());
        heraAppBaseInfo.setEnvsMap(this.getEnvMapping());

        heraAppBaseInfo.setIamTreeId(this.getIamTreeId());

        return heraAppBaseInfo;
    }

}