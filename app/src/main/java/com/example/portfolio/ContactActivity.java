package com.example.portfolio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contact);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etMessage = findViewById(R.id.etMessage);
        Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(v -> {
            String message = etMessage.getText().toString();

            if (message.isEmpty()) {
                Toast.makeText(this, "Please write a message", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Message sent: " + message, Toast.LENGTH_LONG).show();
            }
        });
    }
}