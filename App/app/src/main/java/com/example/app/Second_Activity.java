package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {

    TextView displayA, displayB, resultText;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayA = findViewById(R.id.displayA);
        displayB = findViewById(R.id.displayB);
        resultText = findViewById(R.id.result);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnBack =findViewById(R.id.btnBack);

        //Nhan Intent, lay bundle khoi intent
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("package");
        if (bundle != null) {
            // Lấy dữ liệu từ Bundle
            int a = bundle.getInt("numA",0);
            int b = bundle.getInt("numB",0);

            // Gán giá trị vào displayA và displayB
            displayA.setText(getString(R.string.number_a, a));  // Sử dụng tài nguyên string
            displayB.setText(getString(R.string.number_b, b));  // Sử dụng tài nguyên string

            btnAdd.setOnClickListener(v -> {
                double result = a + b;
                resultText.setText(getString(R.string.result, result));  // Sử dụng tài nguyên string
            });

            btnSubtract.setOnClickListener(v -> {
                double result = a - b;
                resultText.setText(getString(R.string.result, result));  // Sử dụng tài nguyên string
            });

            btnMultiply.setOnClickListener(v -> {
                double result = a * b;
                resultText.setText(getString(R.string.result, result));  // Sử dụng tài nguyên string
            });

            btnDivide.setOnClickListener(v -> {
                if (b != 0) {
                    double result = (double) a / b;
                    resultText.setText(getString(R.string.result, result));  // Sử dụng tài nguyên string
                } else {
                    resultText.setText(R.string.cannot_divide_by_zero);  // Sử dụng tài nguyên string cho thông báo lỗi
                }
            });
        }

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}