
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProgressSteps {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("progressAmt")
    @Expose
    private Integer progressAmt;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getProgressAmt() {
        return progressAmt;
    }

    public void setProgressAmt(Integer progressAmt) {
        this.progressAmt = progressAmt;
    }

}
