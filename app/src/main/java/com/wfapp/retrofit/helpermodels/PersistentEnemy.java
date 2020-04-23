
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PersistentEnemy {

    @SerializedName("locationTag")
    @Expose
    private String locationTag;
    @SerializedName("agentType")
    @Expose
    private String agentType;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("healthPercent")
    @Expose
    private Integer healthPercent;
    @SerializedName("fleeDamage")
    @Expose
    private Integer fleeDamage;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("lastDiscoveredTime")
    @Expose
    private String lastDiscoveredTime;
    @SerializedName("lastDiscoveredAt")
    @Expose
    private String lastDiscoveredAt;
    @SerializedName("isDiscovered")
    @Expose
    private Boolean isDiscovered;
    @SerializedName("isUsingTicketing")
    @Expose
    private Boolean isUsingTicketing;
    @SerializedName("pid")
    @Expose
    private String pid;

    public String getLocationTag() {
        return locationTag;
    }

    public void setLocationTag(String locationTag) {
        this.locationTag = locationTag;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getHealthPercent() {
        return healthPercent;
    }

    public void setHealthPercent(Integer healthPercent) {
        this.healthPercent = healthPercent;
    }

    public Integer getFleeDamage() {
        return fleeDamage;
    }

    public void setFleeDamage(Integer fleeDamage) {
        this.fleeDamage = fleeDamage;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLastDiscoveredTime() {
        return lastDiscoveredTime;
    }

    public void setLastDiscoveredTime(String lastDiscoveredTime) {
        this.lastDiscoveredTime = lastDiscoveredTime;
    }

    public String getLastDiscoveredAt() {
        return lastDiscoveredAt;
    }

    public void setLastDiscoveredAt(String lastDiscoveredAt) {
        this.lastDiscoveredAt = lastDiscoveredAt;
    }

    public Boolean getIsDiscovered() {
        return isDiscovered;
    }

    public void setIsDiscovered(Boolean isDiscovered) {
        this.isDiscovered = isDiscovered;
    }

    public Boolean getIsUsingTicketing() {
        return isUsingTicketing;
    }

    public void setIsUsingTicketing(Boolean isUsingTicketing) {
        this.isUsingTicketing = isUsingTicketing;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

}
