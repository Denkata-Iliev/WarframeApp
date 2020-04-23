
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GlobalUpgrade {

    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private String end;
    @SerializedName("upgrade")
    @Expose
    private String upgrade;
    @SerializedName("operation")
    @Expose
    private String operation;
    @SerializedName("operationSymbol")
    @Expose
    private String operationSymbol;
    @SerializedName("upgradeOperationValue")
    @Expose
    private Integer upgradeOperationValue;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("desc")
    @Expose
    private String desc;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperationSymbol() {
        return operationSymbol;
    }

    public void setOperationSymbol(String operationSymbol) {
        this.operationSymbol = operationSymbol;
    }

    public Integer getUpgradeOperationValue() {
        return upgradeOperationValue;
    }

    public void setUpgradeOperationValue(Integer upgradeOperationValue) {
        this.upgradeOperationValue = upgradeOperationValue;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
