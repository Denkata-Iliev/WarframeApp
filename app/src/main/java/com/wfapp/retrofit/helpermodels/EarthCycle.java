
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EarthCycle {

    private static final String NIGHT = "night";
    private static final String DAY = "day";
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("isDay")
    @Expose
    private Boolean isDay;
    @SerializedName("timeLeft")
    @Expose
    private String timeLeft;
    @SerializedName("state")
    @Expose
    private String state;

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

    public Boolean getIsDay() {
        return isDay;
    }

    public void setIsDay(Boolean isDay) {
        this.isDay = isDay;
    }

    public String getTimeLeft() {
        return timeLeft.substring(0, 6);
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String getShortString() {
        return getTimeLeft() + " to " + (state.equals(NIGHT) ? DAY : NIGHT);
    }
}
