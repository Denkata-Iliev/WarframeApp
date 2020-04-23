package com.wfapp.retrofit;

import com.wfapp.retrofit.helpermodels.CetusCycle;
import com.wfapp.retrofit.helpermodels.EarthCycle;
import com.wfapp.retrofit.helpermodels.VallisCycle;

public interface WarframeRepository {

    void getCetusCycle(CetusListener listener);

    void getVallisCycle(VallisListener listener);

    void getEarthCycle(EarthListener listener);

    interface CetusListener {
        void onCetusReceived(CetusCycle cetusCycle);

        void onCetusFailed(Throwable t);
    }

    interface VallisListener {
        void onVallisReceived(VallisCycle vallisCycle);

        void onVallisFailed(Throwable t);
    }

    interface EarthListener {
        void onEarthReceived(EarthCycle earthCycle);

        void onEarthFailed(Throwable t);
    }
}
