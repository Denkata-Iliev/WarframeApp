
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alerts {

    @SerializedName("mission")
    @Expose
    private Mission mission;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("rewardTypes")
    @Expose
    private List<String> rewardTypes = null;

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
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

    public List<String> getRewardTypes() {
        return rewardTypes;
    }

    public void setRewardTypes(List<String> rewardTypes) {
        this.rewardTypes = rewardTypes;
    }

}
