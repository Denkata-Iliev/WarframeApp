
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Invasion {

    @SerializedName("defenderReward")
    @Expose
    private DefenderReward defenderReward;
    @SerializedName("attackingFaction")
    @Expose
    private String attackingFaction;
    @SerializedName("completion")
    @Expose
    private Integer completion;
    @SerializedName("attackerReward")
    @Expose
    private AttackerReward attackerReward;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("completed")
    @Expose
    private Boolean completed;
    @SerializedName("requiredRuns")
    @Expose
    private Integer requiredRuns;
    @SerializedName("vsInfestation")
    @Expose
    private Boolean vsInfestation;
    @SerializedName("node")
    @Expose
    private String node;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("defendingFaction")
    @Expose
    private String defendingFaction;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("rewardTypes")
    @Expose
    private List<String> rewardTypes = null;
    @SerializedName("desc")
    @Expose
    private String desc;

    public DefenderReward getDefenderReward() {
        return defenderReward;
    }

    public void setDefenderReward(DefenderReward defenderReward) {
        this.defenderReward = defenderReward;
    }

    public String getAttackingFaction() {
        return attackingFaction;
    }

    public void setAttackingFaction(String attackingFaction) {
        this.attackingFaction = attackingFaction;
    }

    public Integer getCompletion() {
        return completion;
    }

    public void setCompletion(Integer completion) {
        this.completion = completion;
    }

    public AttackerReward getAttackerReward() {
        return attackerReward;
    }

    public void setAttackerReward(AttackerReward attackerReward) {
        this.attackerReward = attackerReward;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Integer getRequiredRuns() {
        return requiredRuns;
    }

    public void setRequiredRuns(Integer requiredRuns) {
        this.requiredRuns = requiredRuns;
    }

    public Boolean getVsInfestation() {
        return vsInfestation;
    }

    public void setVsInfestation(Boolean vsInfestation) {
        this.vsInfestation = vsInfestation;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getDefendingFaction() {
        return defendingFaction;
    }

    public void setDefendingFaction(String defendingFaction) {
        this.defendingFaction = defendingFaction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public List<String> getRewardTypes() {
        return rewardTypes;
    }

    public void setRewardTypes(List<String> rewardTypes) {
        this.rewardTypes = rewardTypes;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
