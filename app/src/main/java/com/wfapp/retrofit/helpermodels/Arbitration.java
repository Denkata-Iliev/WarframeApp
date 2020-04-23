
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Arbitration {

    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("node")
    @Expose
    private String node;
    @SerializedName("enemy")
    @Expose
    private String enemy;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("archwing")
    @Expose
    private Boolean archwing;
    @SerializedName("sharkwing")
    @Expose
    private Boolean sharkwing;

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getArchwing() {
        return archwing;
    }

    public void setArchwing(Boolean archwing) {
        this.archwing = archwing;
    }

    public Boolean getSharkwing() {
        return sharkwing;
    }

    public void setSharkwing(Boolean sharkwing) {
        this.sharkwing = sharkwing;
    }

}
