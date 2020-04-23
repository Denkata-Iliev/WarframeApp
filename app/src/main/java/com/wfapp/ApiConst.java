package com.wfapp;

public class ApiConst {

    public static final String BASE_URL = "https://api.warframestat.us/pc/";

    /* //TODO THAT WORKS
    * {
                String cetusCycle = "{\"id\":\"cetusCycle1587385200000\",\"expiry\":\"2020-04-20T12:20:00.000Z\",\"activation\":\"2020-04-20T11:30:00.000Z\",\"isDay\":false,\"state\":\"night\",\"timeLeft\":\"1m 28s\",\"isCetus\":true,\"shortString\":\"1m to Day\"}";
                Gson gson = new Gson();
                CetusCycle cycle = gson.fromJson(cetusCycle, CetusCycle.class);
                txtCetus.setText(cycle.getShortString());
                Log.d("cetus-succ", cycle.getShortString());
        }*/
}
