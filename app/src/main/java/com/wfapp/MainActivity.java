package com.wfapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.wfapp.databinding.ActivityMainBinding;
import com.wfapp.retrofit.WarframeRepository;
import com.wfapp.retrofit.WarframeWebService;
import com.wfapp.retrofit.helpermodels.CetusCycle;
import com.wfapp.retrofit.helpermodels.EarthCycle;
import com.wfapp.retrofit.helpermodels.VallisCycle;

public class MainActivity extends AppCompatActivity {

    private static final int DELAY_MILLIS = 60000;
    private static final String CETUS_ERROR = "Cetus-Failed";
    private static final String VALLIS_ERROR = "Vallis-Failed";
    private static final String EARTH_ERROR = "Earth-Failed";
    private static final String ERROR_MESSAGE = "Call Failed";
    ActivityMainBinding binding;
    private WarframeRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        repository = WarframeWebService.getInstance();

        setCetusText();
        setVallisText();
        setEarthText();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setCetusText();
                setVallisText();
                setEarthText();
                handler.postDelayed(this, DELAY_MILLIS);
            }
        }, 0);
    }

    private void setCetusText() {
        repository.getCetusCycle(new WarframeRepository.CetusListener() {
            @Override
            public void onCetusReceived(CetusCycle cetusCycle) {
                binding.txtCetus.setText(cetusCycle.getShortString());
            }

            @Override
            public void onCetusFailed(Throwable t) {
                binding.txtCetus.setText(ERROR_MESSAGE);
                Log.e(CETUS_ERROR, t.getCause().toString());
            }
        });
    }

    private void setEarthText() {
        repository.getEarthCycle(new WarframeRepository.EarthListener() {
        @Override
        public void onEarthReceived(EarthCycle earthCycle) {
            binding.txtEarth.setText(earthCycle.getShortString());
        }

        @Override
        public void onEarthFailed(Throwable t) {
            binding.txtEarth.setText(ERROR_MESSAGE);
            Log.e(EARTH_ERROR, t.getCause().toString());
        }
    });
    }

    private void setVallisText() {
        repository.getVallisCycle(new WarframeRepository.VallisListener() {
            @Override
            public void onVallisReceived(VallisCycle vallisCycle) {
                binding.txtVallis.setText(vallisCycle.getShortString());
            }

            @Override
            public void onVallisFailed(Throwable t) {
                Log.e(VALLIS_ERROR, t.getCause().toString());
            }
        });
    }

}
