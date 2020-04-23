
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConstructionProgress {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("fomorianProgress")
    @Expose
    private String fomorianProgress;
    @SerializedName("razorbackProgress")
    @Expose
    private String razorbackProgress;
    @SerializedName("unknownProgress")
    @Expose
    private String unknownProgress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFomorianProgress() {
        return fomorianProgress;
    }

    public void setFomorianProgress(String fomorianProgress) {
        this.fomorianProgress = fomorianProgress;
    }

    public String getRazorbackProgress() {
        return razorbackProgress;
    }

    public void setRazorbackProgress(String razorbackProgress) {
        this.razorbackProgress = razorbackProgress;
    }

    public String getUnknownProgress() {
        return unknownProgress;
    }

    public void setUnknownProgress(String unknownProgress) {
        this.unknownProgress = unknownProgress;
    }

}
