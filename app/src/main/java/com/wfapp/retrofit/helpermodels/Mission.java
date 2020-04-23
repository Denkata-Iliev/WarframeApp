
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mission {

    @SerializedName("reward")
    @Expose
    private Reward__ reward;
    @SerializedName("node")
    @Expose
    private String node;
    @SerializedName("faction")
    @Expose
    private String faction;
    @SerializedName("maxEnemyLevel")
    @Expose
    private Integer maxEnemyLevel;
    @SerializedName("minEnemyLevel")
    @Expose
    private Integer minEnemyLevel;
    @SerializedName("maxWaveNum")
    @Expose
    private Integer maxWaveNum;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("nightmare")
    @Expose
    private Boolean nightmare;
    @SerializedName("archwingRequired")
    @Expose
    private Boolean archwingRequired;
    @SerializedName("isSharkwing")
    @Expose
    private Boolean isSharkwing;
    @SerializedName("enemySpec")
    @Expose
    private String enemySpec;
    @SerializedName("levelOverride")
    @Expose
    private String levelOverride;
    @SerializedName("advancedSpawners")
    @Expose
    private List<String> advancedSpawners = null;
    @SerializedName("requiredItems")
    @Expose
    private List<String> requiredItems = null;
    @SerializedName("consumeRequiredItems")
    @Expose
    private Boolean consumeRequiredItems;
    @SerializedName("leadersAlwaysAllowed")
    @Expose
    private Boolean leadersAlwaysAllowed;
    @SerializedName("levelAuras")
    @Expose
    private List<String> levelAuras = null;

    public Reward__ getReward() {
        return reward;
    }

    public void setReward(Reward__ reward) {
        this.reward = reward;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public Integer getMaxEnemyLevel() {
        return maxEnemyLevel;
    }

    public void setMaxEnemyLevel(Integer maxEnemyLevel) {
        this.maxEnemyLevel = maxEnemyLevel;
    }

    public Integer getMinEnemyLevel() {
        return minEnemyLevel;
    }

    public void setMinEnemyLevel(Integer minEnemyLevel) {
        this.minEnemyLevel = minEnemyLevel;
    }

    public Integer getMaxWaveNum() {
        return maxWaveNum;
    }

    public void setMaxWaveNum(Integer maxWaveNum) {
        this.maxWaveNum = maxWaveNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getNightmare() {
        return nightmare;
    }

    public void setNightmare(Boolean nightmare) {
        this.nightmare = nightmare;
    }

    public Boolean getArchwingRequired() {
        return archwingRequired;
    }

    public void setArchwingRequired(Boolean archwingRequired) {
        this.archwingRequired = archwingRequired;
    }

    public Boolean getIsSharkwing() {
        return isSharkwing;
    }

    public void setIsSharkwing(Boolean isSharkwing) {
        this.isSharkwing = isSharkwing;
    }

    public String getEnemySpec() {
        return enemySpec;
    }

    public void setEnemySpec(String enemySpec) {
        this.enemySpec = enemySpec;
    }

    public String getLevelOverride() {
        return levelOverride;
    }

    public void setLevelOverride(String levelOverride) {
        this.levelOverride = levelOverride;
    }

    public List<String> getAdvancedSpawners() {
        return advancedSpawners;
    }

    public void setAdvancedSpawners(List<String> advancedSpawners) {
        this.advancedSpawners = advancedSpawners;
    }

    public List<String> getRequiredItems() {
        return requiredItems;
    }

    public void setRequiredItems(List<String> requiredItems) {
        this.requiredItems = requiredItems;
    }

    public Boolean getConsumeRequiredItems() {
        return consumeRequiredItems;
    }

    public void setConsumeRequiredItems(Boolean consumeRequiredItems) {
        this.consumeRequiredItems = consumeRequiredItems;
    }

    public Boolean getLeadersAlwaysAllowed() {
        return leadersAlwaysAllowed;
    }

    public void setLeadersAlwaysAllowed(Boolean leadersAlwaysAllowed) {
        this.leadersAlwaysAllowed = leadersAlwaysAllowed;
    }

    public List<String> getLevelAuras() {
        return levelAuras;
    }

    public void setLevelAuras(List<String> levelAuras) {
        this.levelAuras = levelAuras;
    }

}
