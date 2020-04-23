
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConclaveChallenge {

    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("endString")
    @Expose
    private String endString;
    @SerializedName("daily")
    @Expose
    private Boolean daily;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("asString")
    @Expose
    private String asString;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("rootChallenge")
    @Expose
    private Boolean rootChallenge;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public String getEndString() {
        return endString;
    }

    public void setEndString(String endString) {
        this.endString = endString;
    }

    public Boolean getDaily() {
        return daily;
    }

    public void setDaily(Boolean daily) {
        this.daily = daily;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getAsString() {
        return asString;
    }

    public void setAsString(String asString) {
        this.asString = asString;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getRootChallenge() {
        return rootChallenge;
    }

    public void setRootChallenge(Boolean rootChallenge) {
        this.rootChallenge = rootChallenge;
    }

}
