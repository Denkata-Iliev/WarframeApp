
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlashSale {

    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("premiumOverride")
    @Expose
    private Integer premiumOverride;
    @SerializedName("isPopular")
    @Expose
    private Boolean isPopular;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("isFeatured")
    @Expose
    private Boolean isFeatured;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getPremiumOverride() {
        return premiumOverride;
    }

    public void setPremiumOverride(Integer premiumOverride) {
        this.premiumOverride = premiumOverride;
    }

    public Boolean getIsPopular() {
        return isPopular;
    }

    public void setIsPopular(Boolean isPopular) {
        this.isPopular = isPopular;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

}
