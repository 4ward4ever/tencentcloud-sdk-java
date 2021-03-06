/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFleetCapacityRequest extends AbstractModel{

    /**
    * 服务部署ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 期望的服务器实例数
    */
    @SerializedName("DesiredInstances")
    @Expose
    private Long DesiredInstances;

    /**
    * 服务器实例数最小限制
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 服务器实例数最大限制
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 服务器伸缩容间隔
    */
    @SerializedName("ScalingInterval")
    @Expose
    private Long ScalingInterval;

    /**
     * Get 服务部署ID 
     * @return FleetId 服务部署ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务部署ID
     * @param FleetId 服务部署ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 期望的服务器实例数 
     * @return DesiredInstances 期望的服务器实例数
     */
    public Long getDesiredInstances() {
        return this.DesiredInstances;
    }

    /**
     * Set 期望的服务器实例数
     * @param DesiredInstances 期望的服务器实例数
     */
    public void setDesiredInstances(Long DesiredInstances) {
        this.DesiredInstances = DesiredInstances;
    }

    /**
     * Get 服务器实例数最小限制 
     * @return MinSize 服务器实例数最小限制
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 服务器实例数最小限制
     * @param MinSize 服务器实例数最小限制
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 服务器实例数最大限制 
     * @return MaxSize 服务器实例数最大限制
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 服务器实例数最大限制
     * @param MaxSize 服务器实例数最大限制
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 服务器伸缩容间隔 
     * @return ScalingInterval 服务器伸缩容间隔
     */
    public Long getScalingInterval() {
        return this.ScalingInterval;
    }

    /**
     * Set 服务器伸缩容间隔
     * @param ScalingInterval 服务器伸缩容间隔
     */
    public void setScalingInterval(Long ScalingInterval) {
        this.ScalingInterval = ScalingInterval;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "DesiredInstances", this.DesiredInstances);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "ScalingInterval", this.ScalingInterval);

    }
}

