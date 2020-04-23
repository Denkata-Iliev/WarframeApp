
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class History {

    @SerializedName("defender")
    @Expose
    private String defender;
    @SerializedName("defenderIsAlliance")
    @Expose
    private Boolean defenderIsAlliance;
    @SerializedName("attacker")
    @Expose
    private String attacker;
    @SerializedName("winner")
    @Expose
    private String winner;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private String end;

    public String getDefender() {
        return defender;
    }

    public void setDefender(String defender) {
        this.defender = defender;
    }

    public Boolean getDefenderIsAlliance() {
        return defenderIsAlliance;
    }

    public void setDefenderIsAlliance(Boolean defenderIsAlliance) {
        this.defenderIsAlliance = defenderIsAlliance;
    }

    public String getAttacker() {
        return attacker;
    }

    public void setAttacker(String attacker) {
        this.attacker = attacker;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

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

}
