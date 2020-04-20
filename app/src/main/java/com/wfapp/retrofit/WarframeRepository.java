package com.wfapp.retrofit;

public interface WarframeRepository {

    void getCetusCycle(CetusListener listener);

    void getVallisCycle(VallisListener listener);

    interface CetusListener {
        void onCetusReceived(WarframeHub hub);

        void onCetusFailed();
    }

    interface VallisListener {
        void onVallisReceived(WarframeHub hub);

        void onVallisFailed();
    }
}
