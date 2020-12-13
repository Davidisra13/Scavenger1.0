package com.example.scavenger_gradle.UserClasses;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.scavenger_gradle.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    EditText editText01;
    Button geneBtn;
    ImageView bar_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        editText01 = (EditText)findViewById(R.id.edittext01);
        geneBtn = (Button)findViewById(R.id.geneBtn);
        bar_code = (ImageView)findViewById(R.id.bar_code);

        geneBtn.setOnClickListener(v -> {
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            try {
                BitMatrix bitMatrix = multiFormatWriter.encode(editText01.getText().toString(), BarcodeFormat.QR_CODE, 500, 500);
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                bar_code.setImageBitmap(bitmap);
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}