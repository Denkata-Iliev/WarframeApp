
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InterimStep {

    @SerializedName("goal")
    @Expose
    private Integer goal;
    @SerializedName("reward")
    @Expose
    private Reward_ reward;
    @SerializedName("message")
    @Expose
    private Message message;
    @SerializedName("winnerCount")
    @Expose
    private Integer winnerCount;

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Reward_ getReward() {
        return reward;
    }

    public void setReward(Reward_ reward) {
        this.reward = reward;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Integer getWinnerCount() {
        return winnerCount;
    }

    public void setWinnerCount(Integer winnerCount) {
        this.winnerCount = winnerCount;
    }

}
