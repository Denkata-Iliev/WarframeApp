
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fissure {

    @SerializedName("node")
    @Expose
    private String node;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("missionType")
    @Expose
    private String missionType;
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("tierNum")
    @Expose
    private Integer tierNum;
    @SerializedName("enemy")
    @Expose
    private String enemy;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("activation")
    @Expose
    private String activation;

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Integer getTierNum() {
        return tierNum;
    }

    public void setTierNum(Integer tierNum) {
        this.tierNum = tierNum;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

}
