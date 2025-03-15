package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {
    DecimalFormat df = new DecimalFormat("#0.00");

    TextView  resultText;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultText = findViewById(R.id.result);
        btnBack =findViewById(R.id.btnBack);

        //Nhan Intent, lay bundle khoi intent
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("package");
        if (bundle != null) {
            // Lấy dữ liệu từ Bundle
            int a = bundle.getInt("numA",0);
            int b = bundle.getInt("numB",0);
            int c = bundle.getInt("numC",0);
        int delta = b*b - 4*a*c;
            if (delta < 0) {
                resultText.setText("Vô nghiệm" );
            } else if (delta == 0) {
                resultText.setText("x1 = x2 = " + (-b / (2.0 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
                resultText.setText("x1 = " + df.format(x1) + "\n" + "x2 = " + df.format(x2));
            }

        }

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}