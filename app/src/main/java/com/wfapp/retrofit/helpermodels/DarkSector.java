
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DarkSector {

    @SerializedName("defenderMOTD")
    @Expose
    private String defenderMOTD;
    @SerializedName("deployerName")
    @Expose
    private String deployerName;
    @SerializedName("defenderDeploymentActivation")
    @Expose
    private Integer defenderDeploymentActivation;
    @SerializedName("defenderName")
    @Expose
    private String defenderName;
    @SerializedName("deployerClan")
    @Expose
    private String deployerClan;
    @SerializedName("isAlliance")
    @Expose
    private Boolean isAlliance;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("history")
    @Expose
    private List<History> history = null;

    public String getDefenderMOTD() {
        return defenderMOTD;
    }

    public void setDefenderMOTD(String defenderMOTD) {
        this.defenderMOTD = defenderMOTD;
    }

    public String getDeployerName() {
        return deployerName;
    }

    public void setDeployerName(String deployerName) {
        this.deployerName = deployerName;
    }

    public Integer getDefenderDeploymentActivation() {
        return defenderDeploymentActivation;
    }

    public void setDefenderDeploymentActivation(Integer defenderDeploymentActivation) {
        this.defenderDeploymentActivation = defenderDeploymentActivation;
    }

    public String getDefenderName() {
        return defenderName;
    }

    public void setDefenderName(String defenderName) {
        this.defenderName = defenderName;
    }

    public String getDeployerClan() {
        return deployerClan;
    }

    public void setDeployerClan(String deployerClan) {
        this.deployerClan = deployerClan;
    }

    public Boolean getIsAlliance() {
        return isAlliance;
    }

    public void setIsAlliance(Boolean isAlliance) {
        this.isAlliance = isAlliance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

}
