
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("imageLink")
    @Expose
    private String imageLink;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("primeAccess")
    @Expose
    private Boolean primeAccess;
    @SerializedName("stream")
    @Expose
    private Boolean stream;
    @SerializedName("translations")
    @Expose
    private Translations translations;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("update")
    @Expose
    private Boolean update;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("asString")
    @Expose
    private String asString;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("priority")
    @Expose
    private Boolean priority;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public Boolean getPrimeAccess() {
        return primeAccess;
    }

    public void setPrimeAccess(Boolean primeAccess) {
        this.primeAccess = primeAccess;
    }

    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsString() {
        return asString;
    }

    public void setAsString(String asString) {
        this.asString = asString;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

}
