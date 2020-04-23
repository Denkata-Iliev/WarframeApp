
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyDeal {

    @SerializedName("sold")
    @Expose
    private Integer sold;
    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("originalPrice")
    @Expose
    private Integer originalPrice;
    @SerializedName("salePrice")
    @Expose
    private Integer salePrice;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("id")
    @Expose
    private String id;

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
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

}
