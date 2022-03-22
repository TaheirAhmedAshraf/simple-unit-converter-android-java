package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText TextKG;
    private Button SubmitButton;
    private TextView ValueText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextKG = findViewById(R.id.editKGText);
        SubmitButton = findViewById(R.id.submitButton);
        ValueText = findViewById(R.id.Value);
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = TextKG.getText().toString();
                int KG = Integer.parseInt(s);
                double Pound = KG * 2.205;
                ValueText.setText(KG + " KG = " + Pound + " pound");

//                Toast.makeText(MainActivity.this, "This is workinng!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}