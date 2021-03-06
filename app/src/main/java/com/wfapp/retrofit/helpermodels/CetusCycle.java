
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CetusCycle {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("isDay")
    @Expose
    private Boolean isDay;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("timeLeft")
    @Expose
    private String timeLeft;
    @SerializedName("isCetus")
    @Expose
    private Boolean isCetus;
    @SerializedName("shortString")
    @Expose
    private String shortString;

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

    public Boolean getIsDay() {
        return isDay;
    }

    public void setIsDay(Boolean isDay) {
        this.isDay = isDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public Boolean getIsCetus() {
        return isCetus;
    }

    public void setIsCetus(Boolean isCetus) {
        this.isCetus = isCetus;
    }

    public String getShortString() {
        return shortString;
    }

    public void setShortString(String shortString) {
        this.shortString = shortString;
    }

}
