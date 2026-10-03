package com.example.calcolatrice;

import android.os.Bundle;
import android.view.View;import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    
    public void somma(android.view.View view) {
        EditText editNum1 = findViewById(R.id.hint_num1);
        double a = Double.parseDouble(editNum1.getText().toString());

        EditText editNum2 = findViewById(R.id.hint_num2);
        double b = Double.parseDouble(editNum2.getText().toString());

        double s = a + b;

        EditText editResul = findViewById(R.id.hint_risul);
        editResul.setHint(String.valueOf(s));
    }

    public void sottrazione(android.view.View view) {
        EditText editNum1 = findViewById(R.id.hint_num1);
        double a = Double.parseDouble(editNum1.getText().toString());

        EditText editNum2 = findViewById(R.id.hint_num2);
        double b = Double.parseDouble(editNum2.getText().toString());

        double s = a - b;

        EditText editResul = findViewById(R.id.hint_risul);
        editResul.setHint(String.valueOf(s));
    }

    public void moltiplicazione(android.view.View view) {
        EditText editNum1 = findViewById(R.id.hint_num1);
        double a = Double.parseDouble(editNum1.getText().toString());

        EditText editNum2 = findViewById(R.id.hint_num2);
        double b = Double.parseDouble(editNum2.getText().toString());

        double s = a * b;

        EditText editResul = findViewById(R.id.hint_risul);
        editResul.setHint(String.valueOf(s));
    }

    public void Divisione(android.view.View view) {
        EditText editNum1 = findViewById(R.id.hint_num1);
        double a = Double.parseDouble(editNum1.getText().toString());

        EditText editNum2 = findViewById(R.id.hint_num2);
        double b = Double.parseDouble(editNum2.getText().toString());

        double s = a / b;

        EditText editResul = findViewById(R.id.hint_risul);
        editResul.setHint(String.valueOf(s));
    }
}