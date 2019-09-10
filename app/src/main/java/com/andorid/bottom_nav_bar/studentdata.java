package com.andorid.bottom_nav_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class studentdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentdata);

        PDFView pdfView = findViewById(R.id.data_pdf);
        pdfView.fromAsset("studentdata.pdf").load();

    }
}
