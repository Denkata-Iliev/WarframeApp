
package com.wfapp.retrofit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wfapp.retrofit.helpermodels.Alerts;
import com.wfapp.retrofit.helpermodels.Arbitration;
import com.wfapp.retrofit.helpermodels.CetusCycle;
import com.wfapp.retrofit.helpermodels.ConclaveChallenge;
import com.wfapp.retrofit.helpermodels.ConstructionProgress;
import com.wfapp.retrofit.helpermodels.DailyDeal;
import com.wfapp.retrofit.helpermodels.DarkSector;
import com.wfapp.retrofit.helpermodels.EarthCycle;
import com.wfapp.retrofit.helpermodels.Event;
import com.wfapp.retrofit.helpermodels.Fissure;
import com.wfapp.retrofit.helpermodels.FlashSale;
import com.wfapp.retrofit.helpermodels.GlobalUpgrade;
import com.wfapp.retrofit.helpermodels.Invasion;
import com.wfapp.retrofit.helpermodels.Kuva;
import com.wfapp.retrofit.helpermodels.News;
import com.wfapp.retrofit.helpermodels.Nightwave;
import com.wfapp.retrofit.helpermodels.PersistentEnemy;
import com.wfapp.retrofit.helpermodels.Simaris;
import com.wfapp.retrofit.helpermodels.Sortie;
import com.wfapp.retrofit.helpermodels.SyndicateMission;
import com.wfapp.retrofit.helpermodels.VallisCycle;
import com.wfapp.retrofit.helpermodels.VoidTrader;

public class WarframeHub {

    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("news")
    @Expose
    private List<News> news = null;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("alerts")
    @Expose
    private Alerts alerts;
    @SerializedName("sortie")
    @Expose
    private Sortie sortie;
    @SerializedName("syndicateMissions")
    @Expose
    private List<SyndicateMission> syndicateMissions = null;
    @SerializedName("fissures")
    @Expose
    private List<Fissure> fissures = null;
    @SerializedName("globalUpgrades")
    @Expose
    private List<GlobalUpgrade> globalUpgrades = null;
    @SerializedName("flashSales")
    @Expose
    private List<FlashSale> flashSales = null;
    @SerializedName("invasions")
    @Expose
    private List<Invasion> invasions = null;
    @SerializedName("darkSectors")
    @Expose
    private List<DarkSector> darkSectors = null;
    @SerializedName("voidTrader")
    @Expose
    private VoidTrader voidTrader;
    @SerializedName("dailyDeals")
    @Expose
    private List<DailyDeal> dailyDeals = null;
    @SerializedName("simaris")
    @Expose
    private Simaris simaris;
    @SerializedName("conclaveChallenges")
    @Expose
    private List<ConclaveChallenge> conclaveChallenges = null;
    @SerializedName("persistentEnemies")
    @Expose
    private List<PersistentEnemy> persistentEnemies = null;
    @SerializedName("earthCycle")
    @Expose
    private EarthCycle earthCycle;
    @SerializedName("cetusCycle")
    @Expose
    private CetusCycle cetusCycle;
    @SerializedName("vallisCycle")
    @Expose
    private VallisCycle vallisCycle;
    @SerializedName("constructionProgress")
    @Expose
    private ConstructionProgress constructionProgress;
    @SerializedName("nightwave")
    @Expose
    private Nightwave nightwave;
    @SerializedName("arbitration")
    @Expose
    private Arbitration arbitration;
    @SerializedName("kuva")
    @Expose
    private Kuva kuva;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }

    public Sortie getSortie() {
        return sortie;
    }

    public void setSortie(Sortie sortie) {
        this.sortie = sortie;
    }

    public List<SyndicateMission> getSyndicateMissions() {
        return syndicateMissions;
    }

    public void setSyndicateMissions(List<SyndicateMission> syndicateMissions) {
        this.syndicateMissions = syndicateMissions;
    }

    public List<Fissure> getFissures() {
        return fissures;
    }

    public void setFissures(List<Fissure> fissures) {
        this.fissures = fissures;
    }

    public List<GlobalUpgrade> getGlobalUpgrades() {
        return globalUpgrades;
    }

    public void setGlobalUpgrades(List<GlobalUpgrade> globalUpgrades) {
        this.globalUpgrades = globalUpgrades;
    }

    public List<FlashSale> getFlashSales() {
        return flashSales;
    }

    public void setFlashSales(List<FlashSale> flashSales) {
        this.flashSales = flashSales;
    }

    public List<Invasion> getInvasions() {
        return invasions;
    }

    public void setInvasions(List<Invasion> invasions) {
        this.invasions = invasions;
    }

    public List<DarkSector> getDarkSectors() {
        return darkSectors;
    }

    public void setDarkSectors(List<DarkSector> darkSectors) {
        this.darkSectors = darkSectors;
    }

    public VoidTrader getVoidTrader() {
        return voidTrader;
    }

    public void setVoidTrader(VoidTrader voidTrader) {
        this.voidTrader = voidTrader;
    }

    public List<DailyDeal> getDailyDeals() {
        return dailyDeals;
    }

    public void setDailyDeals(List<DailyDeal> dailyDeals) {
        this.dailyDeals = dailyDeals;
    }

    public Simaris getSimaris() {
        return simaris;
    }

    public void setSimaris(Simaris simaris) {
        this.simaris = simaris;
    }

    public List<ConclaveChallenge> getConclaveChallenges() {
        return conclaveChallenges;
    }

    public void setConclaveChallenges(List<ConclaveChallenge> conclaveChallenges) {
        this.conclaveChallenges = conclaveChallenges;
    }

    public List<PersistentEnemy> getPersistentEnemies() {
        return persistentEnemies;
    }

    public void setPersistentEnemies(List<PersistentEnemy> persistentEnemies) {
        this.persistentEnemies = persistentEnemies;
    }

    public EarthCycle getEarthCycle() {
        return earthCycle;
    }

    public void setEarthCycle(EarthCycle earthCycle) {
        this.earthCycle = earthCycle;
    }

    public CetusCycle getCetusCycle() {
        return cetusCycle;
    }

    public void setCetusCycle(CetusCycle cetusCycle) {
        this.cetusCycle = cetusCycle;
    }

    public VallisCycle getVallisCycle() {
        return vallisCycle;
    }

    public void setVallisCycle(VallisCycle vallisCycle) {
        this.vallisCycle = vallisCycle;
    }

    public ConstructionProgress getConstructionProgress() {
        return constructionProgress;
    }

    public void setConstructionProgress(ConstructionProgress constructionProgress) {
        this.constructionProgress = constructionProgress;
    }

    public Nightwave getNightwave() {
        return nightwave;
    }

    public void setNightwave(Nightwave nightwave) {
        this.nightwave = nightwave;
    }

    public Arbitration getArbitration() {
        return arbitration;
    }

    public void setArbitration(Arbitration arbitration) {
        this.arbitration = arbitration;
    }

    public Kuva getKuva() {
        return kuva;
    }

    public void setKuva(Kuva kuva) {
        this.kuva = kuva;
    }

}
