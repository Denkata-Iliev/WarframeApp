
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Simaris {

    @SerializedName("target")
    @Expose
    private String target;
    @SerializedName("isTargetActive")
    @Expose
    private Boolean isTargetActive;
    @SerializedName("asString")
    @Expose
    private String asString;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Boolean getIsTargetActive() {
        return isTargetActive;
    }

    public void setIsTargetActive(Boolean isTargetActive) {
        this.isTargetActive = isTargetActive;
    }

    public String getAsString() {
        return asString;
    }

    public void setAsString(String asString) {
        this.asString = asString;
    }

}
