package com.wfapp.retrofit;

import com.wfapp.ApiConst;

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
        Call<WarframeHub> call = service.getCetusCycle();
        call.enqueue(new Callback<WarframeHub>() {
            @Override
            public void onResponse(Call<WarframeHub> call, Response<WarframeHub> response) {
               listener.onCetusReceived(response.body());
            }

            @Override
            public void onFailure(Call<WarframeHub> call, Throwable t) {
                listener.onCetusFailed();
            }
        });
    }

    @Override
    public void getVallisCycle(final VallisListener listener) {
        Call<WarframeHub> call = service.getVallisCycle();
        call.enqueue(new Callback<WarframeHub>() {
            @Override
            public void onResponse(Call<WarframeHub> call, Response<WarframeHub> response) {
                listener.onVallisReceived(response.body());
            }

            @Override
            public void onFailure(Call<WarframeHub> call, Throwable t) {
                listener.onVallisFailed();
            }
        });
    }

}
