
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VallisCycle {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("timeLeft")
    @Expose
    private String timeLeft;
    @SerializedName("isWarm")
    @Expose
    private Boolean isWarm;
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

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public Boolean getIsWarm() {
        return isWarm;
    }

    public void setIsWarm(Boolean isWarm) {
        this.isWarm = isWarm;
    }

    public String getShortString() {
        return shortString;
    }

    public void setShortString(String shortString) {
        this.shortString = shortString;
    }
}
