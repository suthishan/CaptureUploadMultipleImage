package com.capturemultipleimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button upload_report;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intUI();
        onClickListner();
    }

    private void onClickListner() {
        upload_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ImageSelectedActivity.class));
            }
        });
    }

    public void intUI(){
        upload_report = (Button) findViewById(R.id.upload_report);
    }
}
