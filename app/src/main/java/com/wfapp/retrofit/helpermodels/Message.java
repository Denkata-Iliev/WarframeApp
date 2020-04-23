
package com.wfapp.retrofit.helpermodels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("sender")
    @Expose
    private String sender;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("senderIcon")
    @Expose
    private String senderIcon;
    @SerializedName("attachments")
    @Expose
    private List<String> attachments = null;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderIcon() {
        return senderIcon;
    }

    public void setSenderIcon(String senderIcon) {
        this.senderIcon = senderIcon;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

}
