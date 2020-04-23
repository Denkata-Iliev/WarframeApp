
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DefenderReward {

    @SerializedName("countedItems")
    @Expose
    private List<CountedItem___> countedItems = null;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("color")
    @Expose
    private Integer color;
    @SerializedName("credits")
    @Expose
    private Integer credits;
    @SerializedName("asString")
    @Expose
    private String asString;
    @SerializedName("items")
    @Expose
    private List<Item___> items = null;
    @SerializedName("itemString")
    @Expose
    private String itemString;

    public List<CountedItem___> getCountedItems() {
        return countedItems;
    }

    public void setCountedItems(List<CountedItem___> countedItems) {
        this.countedItems = countedItems;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getAsString() {
        return asString;
    }

    public void setAsString(String asString) {
        this.asString = asString;
    }

    public List<Item___> getItems() {
        return items;
    }

    public void setItems(List<Item___> items) {
        this.items = items;
    }

    public String getItemString() {
        return itemString;
    }

    public void setItemString(String itemString) {
        this.itemString = itemString;
    }

}
