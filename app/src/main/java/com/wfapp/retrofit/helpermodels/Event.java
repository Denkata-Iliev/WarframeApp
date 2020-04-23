
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("activation")
    @Expose
    private String activation;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("maximumScore")
    @Expose
    private Integer maximumScore;
    @SerializedName("currentScore")
    @Expose
    private Integer currentScore;
    @SerializedName("smallInterval")
    @Expose
    private Integer smallInterval;
    @SerializedName("largeInterval")
    @Expose
    private Integer largeInterval;
    @SerializedName("faction")
    @Expose
    private String faction;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("tooltip")
    @Expose
    private String tooltip;
    @SerializedName("node")
    @Expose
    private String node;
    @SerializedName("concurrentNodes")
    @Expose
    private List<String> concurrentNodes = null;
    @SerializedName("victimNode")
    @Expose
    private String victimNode;
    @SerializedName("scoreLocTag")
    @Expose
    private String scoreLocTag;
    @SerializedName("rewards")
    @Expose
    private List<Reward> rewards = null;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("health")
    @Expose
    private Integer health;
    @SerializedName("affiliatedWith")
    @Expose
    private String affiliatedWith;
    @SerializedName("jobs")
    @Expose
    private List<Job> jobs = null;
    @SerializedName("interimSteps")
    @Expose
    private List<InterimStep> interimSteps = null;
    @SerializedName("progressSteps")
    @Expose
    private ProgressSteps progressSteps;
    @SerializedName("progressTotal")
    @Expose
    private Integer progressTotal;
    @SerializedName("showTotalAtEndOfMission")
    @Expose
    private Boolean showTotalAtEndOfMission;
    @SerializedName("isPersonal")
    @Expose
    private Boolean isPersonal;
    @SerializedName("isCommunity")
    @Expose
    private Boolean isCommunity;
    @SerializedName("regionDrops")
    @Expose
    private List<String> regionDrops = null;
    @SerializedName("archwingDrops")
    @Expose
    private List<String> archwingDrops = null;
    @SerializedName("asString")
    @Expose
    private String asString;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("completionBonuses")
    @Expose
    private List<Integer> completionBonuses = null;
    @SerializedName("scoreVar")
    @Expose
    private String scoreVar;
    @SerializedName("altExpiry")
    @Expose
    private String altExpiry;
    @SerializedName("altActivation")
    @Expose
    private String altActivation;
    @SerializedName("nextAlt")
    @Expose
    private NextAlt nextAlt;

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

    public Integer getMaximumScore() {
        return maximumScore;
    }

    public void setMaximumScore(Integer maximumScore) {
        this.maximumScore = maximumScore;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public Integer getSmallInterval() {
        return smallInterval;
    }

    public void setSmallInterval(Integer smallInterval) {
        this.smallInterval = smallInterval;
    }

    public Integer getLargeInterval() {
        return largeInterval;
    }

    public void setLargeInterval(Integer largeInterval) {
        this.largeInterval = largeInterval;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public List<String> getConcurrentNodes() {
        return concurrentNodes;
    }

    public void setConcurrentNodes(List<String> concurrentNodes) {
        this.concurrentNodes = concurrentNodes;
    }

    public String getVictimNode() {
        return victimNode;
    }

    public void setVictimNode(String victimNode) {
        this.victimNode = victimNode;
    }

    public String getScoreLocTag() {
        return scoreLocTag;
    }

    public void setScoreLocTag(String scoreLocTag) {
        this.scoreLocTag = scoreLocTag;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getAffiliatedWith() {
        return affiliatedWith;
    }

    public void setAffiliatedWith(String affiliatedWith) {
        this.affiliatedWith = affiliatedWith;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<InterimStep> getInterimSteps() {
        return interimSteps;
    }

    public void setInterimSteps(List<InterimStep> interimSteps) {
        this.interimSteps = interimSteps;
    }

    public ProgressSteps getProgressSteps() {
        return progressSteps;
    }

    public void setProgressSteps(ProgressSteps progressSteps) {
        this.progressSteps = progressSteps;
    }

    public Integer getProgressTotal() {
        return progressTotal;
    }

    public void setProgressTotal(Integer progressTotal) {
        this.progressTotal = progressTotal;
    }

    public Boolean getShowTotalAtEndOfMission() {
        return showTotalAtEndOfMission;
    }

    public void setShowTotalAtEndOfMission(Boolean showTotalAtEndOfMission) {
        this.showTotalAtEndOfMission = showTotalAtEndOfMission;
    }

    public Boolean getIsPersonal() {
        return isPersonal;
    }

    public void setIsPersonal(Boolean isPersonal) {
        this.isPersonal = isPersonal;
    }

    public Boolean getIsCommunity() {
        return isCommunity;
    }

    public void setIsCommunity(Boolean isCommunity) {
        this.isCommunity = isCommunity;
    }

    public List<String> getRegionDrops() {
        return regionDrops;
    }

    public void setRegionDrops(List<String> regionDrops) {
        this.regionDrops = regionDrops;
    }

    public List<String> getArchwingDrops() {
        return archwingDrops;
    }

    public void setArchwingDrops(List<String> archwingDrops) {
        this.archwingDrops = archwingDrops;
    }

    public String getAsString() {
        return asString;
    }

    public void setAsString(String asString) {
        this.asString = asString;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Integer> getCompletionBonuses() {
        return completionBonuses;
    }

    public void setCompletionBonuses(List<Integer> completionBonuses) {
        this.completionBonuses = completionBonuses;
    }

    public String getScoreVar() {
        return scoreVar;
    }

    public void setScoreVar(String scoreVar) {
        this.scoreVar = scoreVar;
    }

    public String getAltExpiry() {
        return altExpiry;
    }

    public void setAltExpiry(String altExpiry) {
        this.altExpiry = altExpiry;
    }

    public String getAltActivation() {
        return altActivation;
    }

    public void setAltActivation(String altActivation) {
        this.altActivation = altActivation;
    }

    public NextAlt getNextAlt() {
        return nextAlt;
    }

    public void setNextAlt(NextAlt nextAlt) {
        this.nextAlt = nextAlt;
    }

}
