
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Job {

    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("rewardPool")
    @Expose
    private List<String> rewardPool = null;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("enemyLevels")
    @Expose
    private List<Integer> enemyLevels = null;
    @SerializedName("standingStages")
    @Expose
    private List<Integer> standingStages = null;
    @SerializedName("minMR")
    @Expose
    private Integer minMR;

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public List<String> getRewardPool() {
        return rewardPool;
    }

    public void setRewardPool(List<String> rewardPool) {
        this.rewardPool = rewardPool;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getEnemyLevels() {
        return enemyLevels;
    }

    public void setEnemyLevels(List<Integer> enemyLevels) {
        this.enemyLevels = enemyLevels;
    }

    public List<Integer> getStandingStages() {
        return standingStages;
    }

    public void setStandingStages(List<Integer> standingStages) {
        this.standingStages = standingStages;
    }

    public Integer getMinMR() {
        return minMR;
    }

    public void setMinMR(Integer minMR) {
        this.minMR = minMR;
    }

}
