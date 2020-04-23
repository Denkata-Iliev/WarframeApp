
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reward__ {

    @SerializedName("countedItems")
    @Expose
    private List<CountedItem__> countedItems = null;
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
    private List<Item__> items = null;
    @SerializedName("itemString")
    @Expose
    private String itemString;

    public List<CountedItem__> getCountedItems() {
        return countedItems;
    }

    public void setCountedItems(List<CountedItem__> countedItems) {
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

    public List<Item__> getItems() {
        return items;
    }

    public void setItems(List<Item__> items) {
        this.items = items;
    }

    public String getItemString() {
        return itemString;
    }

    public void setItemString(String itemString) {
        this.itemString = itemString;
    }

}
