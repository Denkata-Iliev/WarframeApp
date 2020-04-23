
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Inventory {

    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("ducats")
    @Expose
    private Integer ducats;
    @SerializedName("credits")
    @Expose
    private Integer credits;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getDucats() {
        return ducats;
    }

    public void setDucats(Integer ducats) {
        this.ducats = ducats;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

}
