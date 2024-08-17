package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etWeight, etheight;
        Button btcal;
        TextView rt; LinearLayout lt;

        etWeight = findViewById(R.id.etWeight);
        etheight = findViewById(R.id.etheightCm);
        btcal = findViewById(R.id.BtCal);
        rt = findViewById(R.id.rt);
        lt = findViewById(R.id.rtbg);

        btcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(etWeight.getText().toString());
                double ht = Integer.parseInt(etheight.getText().toString());

                double heightM = ht / 100;
                double bmi = wt / (heightM * heightM);

                if (bmi > 25) {
                    rt.setText(R.string.Unhealthy);
                    lt.setBackgroundColor(getResources().getColor(R.color.red));
                } else if (bmi < 18)
                {
                    rt.setText(R.string.Skinny);
                    lt.setBackgroundColor(getResources().getColor(R.color.yellow));
                } else
                {
                    lt.setBackgroundColor(getResources().getColor(R.color.green));
                    rt.setText(R.string.Fit);
                }
            }
        });
    }
}