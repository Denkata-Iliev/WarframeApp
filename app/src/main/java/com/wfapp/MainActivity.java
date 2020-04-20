package com.wfapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.wfapp.retrofit.WarframeHub;
import com.wfapp.retrofit.WarframeRepository;
import com.wfapp.retrofit.WarframeWebService;

public class MainActivity extends AppCompatActivity {

    private TextView txtCetus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WarframeRepository repository = WarframeWebService.getInstance();

        Button button = findViewById(R.id.btn);
        txtCetus = findViewById(R.id.txt_cetus);
        button.setOnClickListener(e -> repository.getCetusCycle(new WarframeRepository.CetusListener() {
            @Override
            public void onCetusReceived(WarframeHub hub) {
                Log.d("cetus succ", hub.getCetusCycle().getShortString());
            }

            @Override
            public void onCetusFailed() {
            }
        }));
    }
}
