package com.wfapp.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WarframeService {

    @GET("pc/cetusCycle")
    Call<WarframeHub> getCetusCycle();

    @GET("vallisCycle")
    Call<WarframeHub> getVallisCycle();
}
