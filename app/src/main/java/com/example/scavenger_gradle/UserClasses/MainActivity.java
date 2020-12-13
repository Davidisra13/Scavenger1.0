package com.example.scavenger_gradle.UserClasses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scavenger_gradle.R;
import com.example.scavenger_gradle.codescanner.CodeScannerView;

public class MainActivity extends AppCompatActivity {
    private static final int GALLERY_INTENT_CODE = 1023;
    TextView mStartScanning, mSKU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartScanning = findViewById(R.id.StartScanning);
        mSKU = findViewById(R.id.SKU);


        mStartScanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CodeScannerView.class));
            }
        });

        mSKU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CodeScannerView.class));
            }
        });

    }
}
