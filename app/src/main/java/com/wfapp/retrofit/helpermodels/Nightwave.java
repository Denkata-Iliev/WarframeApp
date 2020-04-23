
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nightwave {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("params")
    @Expose
    private Params params;
    @SerializedName("rewardTypes")
    @Expose
    private List<String> rewardTypes = null;
    @SerializedName("season")
    @Expose
    private Integer season;
    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("phase")
    @Expose
    private Integer phase;
    @SerializedName("possibleChallenges")
    @Expose
    private List<PossibleChallenge> possibleChallenges = null;
    @SerializedName("activeChallenges")
    @Expose
    private List<ActiveChallenge> activeChallenges = null;

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

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public List<String> getRewardTypes() {
        return rewardTypes;
    }

    public void setRewardTypes(List<String> rewardTypes) {
        this.rewardTypes = rewardTypes;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    public List<PossibleChallenge> getPossibleChallenges() {
        return possibleChallenges;
    }

    public void setPossibleChallenges(List<PossibleChallenge> possibleChallenges) {
        this.possibleChallenges = possibleChallenges;
    }

    public List<ActiveChallenge> getActiveChallenges() {
        return activeChallenges;
    }

    public void setActiveChallenges(List<ActiveChallenge> activeChallenges) {
        this.activeChallenges = activeChallenges;
    }

}
