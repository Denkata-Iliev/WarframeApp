
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SyndicateMission {

    @SerializedName("nodes")
    @Expose
    private List<String> nodes = null;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("jobs")
    @Expose
    private List<Job_> jobs = null;
    @SerializedName("syndicate")
    @Expose
    private String syndicate;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiry")
    @Expose
    private String expiry;
    @SerializedName("activation")
    @Expose
    private String activation;

    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public List<Job_> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job_> jobs) {
        this.jobs = jobs;
    }

    public String getSyndicate() {
        return syndicate;
    }

    public void setSyndicate(String syndicate) {
        this.syndicate = syndicate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

}
