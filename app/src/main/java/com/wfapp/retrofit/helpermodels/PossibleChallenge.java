
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PossibleChallenge {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("isDaily")
    @Expose
    private Boolean isDaily;
    @SerializedName("isElite")
    @Expose
    private Boolean isElite;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("reputation")
    @Expose
    private Integer reputation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Boolean getIsDaily() {
        return isDaily;
    }

    public void setIsDaily(Boolean isDaily) {
        this.isDaily = isDaily;
    }

    public Boolean getIsElite() {
        return isElite;
    }

    public void setIsElite(Boolean isElite) {
        this.isElite = isElite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

}
