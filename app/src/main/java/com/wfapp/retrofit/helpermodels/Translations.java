
package com.wfapp.retrofit.helpermodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Translations {

    @SerializedName("es")
    @Expose
    private String es;

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

}
