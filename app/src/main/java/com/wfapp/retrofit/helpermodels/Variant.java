
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variant {

    @SerializedName("node")
    @Expose
    private String node;
    @SerializedName("boss")
    @Expose
    private String boss;
    @SerializedName("missionType")
    @Expose
    private String missionType;
    @SerializedName("planet")
    @Expose
    private String planet;
    @SerializedName("modifier")
    @Expose
    private String modifier;
    @SerializedName("modifierDescription")
    @Expose
    private String modifierDescription;

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifierDescription() {
        return modifierDescription;
    }

    public void setModifierDescription(String modifierDescription) {
        this.modifierDescription = modifierDescription;
    }

}
