
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sortie {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("rewardPool")
    @Expose
    private String rewardPool;
    @SerializedName("variants")
    @Expose
    private List<Variant> variants = null;
    @SerializedName("boss")
    @Expose
    private String boss;
    @SerializedName("faction")
    @Expose
    private String faction;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("eta")
    @Expose
    private String eta;

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

    public String getRewardPool() {
        return rewardPool;
    }

    public void setRewardPool(String rewardPool) {
        this.rewardPool = rewardPool;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
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

}
