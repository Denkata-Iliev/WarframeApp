package com.wfapp.retrofit;

import com.wfapp.retrofit.helpermodels.CetusCycle;
import com.wfapp.retrofit.helpermodels.EarthCycle;
import com.wfapp.retrofit.helpermodels.VallisCycle;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WarframeService {

    @GET("cetusCycle")
    Call<CetusCycle> getCetusCycle();

    @GET("vallisCycle")
    Call<VallisCycle> getVallisCycle();

    @GET("earthCycle")
    Call<EarthCycle> getEarthCycle();
}
