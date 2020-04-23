package com.wfapp.retrofit;

import android.util.Log;

import com.wfapp.ApiConst;
import com.wfapp.retrofit.helpermodels.CetusCycle;
import com.wfapp.retrofit.helpermodels.EarthCycle;
import com.wfapp.retrofit.helpermodels.VallisCycle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WarframeWebService implements WarframeRepository {

    private static WarframeWebService webService;
    private WarframeService service;

    private WarframeWebService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConst.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(WarframeService.class);
    }

    public static WarframeWebService getInstance() {
        if (webService == null) {
            return webService = new WarframeWebService();
        } else {
            return webService;
        }
    }

    @Override
    public void getCetusCycle(final CetusListener listener) {
        Call<CetusCycle> call = service.getCetusCycle();
        call.enqueue(new Callback<CetusCycle>() {
            @Override
            public void onResponse(Call<CetusCycle> call, Response<CetusCycle> response) {
                listener.onCetusReceived(response.body());
            }

            @Override
            public void onFailure(Call<CetusCycle> call, Throwable t) {
                listener.onCetusFailed(t);
            }
        });
    }

    @Override
    public void getVallisCycle(final VallisListener listener) {
        Call<VallisCycle> call = service.getVallisCycle();
        call.enqueue(new Callback<VallisCycle>() {
            @Override
            public void onResponse(Call<VallisCycle> call, Response<VallisCycle> response) {
                listener.onVallisReceived(response.body());
            }

            @Override
            public void onFailure(Call<VallisCycle> call, Throwable t) {
                listener.onVallisFailed(t);
            }
        });
    }

    @Override
    public void getEarthCycle(final EarthListener listener) {
        Call<EarthCycle> call = service.getEarthCycle();
        call.enqueue(new Callback<EarthCycle>() {
            @Override
            public void onResponse(Call<EarthCycle> call, Response<EarthCycle> response) {
                listener.onEarthReceived(response.body());
            }

            @Override
            public void onFailure(Call<EarthCycle> call, Throwable t) {
                listener.onEarthFailed(t);
            }
        });
    }
}
