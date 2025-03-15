package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numA, numB;
    Button  submitButton, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numA = findViewById(R.id.numA);
        numB = findViewById(R.id.numB);
        submitButton = findViewById(R.id.submitButton);
        btnClear = findViewById(R.id.btnClear);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //khaiao intent
                Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                //lấy du lieu
                int a = Integer.parseInt(numA.getText().toString());
                int b = Integer.parseInt(numB.getText().toString());

                //dong goi du lieu
                Bundle bundle = new Bundle();
                bundle.putInt("numA", a);
                bundle.putInt("numB", b);
                //dua du lieu vao intent
                intent.putExtra("package",bundle);
                //khoi dong
                startActivity(intent);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numA.setText("");
                numB.setText("");

            }
        });
    }

}
