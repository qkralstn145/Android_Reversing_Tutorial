package com.example.smsreceiver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView senderText;
    TextView receivedDateText;
    TextView contentsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requirePerms();

        senderText = findViewById(R.id.senderText);
        receivedDateText = findViewById(R.id.receivedDateText);
        contentsText = findViewById(R.id.contentsText);

        Intent intent = getIntent();
        processCommand(intent);
    }

    private void requirePerms() {
        String[] permissions = {Manifest.permission.RECEIVE_SMS};
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS);
        if(permissionCheck == PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this, permissions, 1);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processCommand(intent);
    }

    private void processCommand(Intent intent) {
        if(intent != null) {
            String sender = intent.getStringExtra("sender");
            String receivedDate = intent.getStringExtra("receivedDate");
            String contents = intent.getStringExtra("contents");

            senderText.setText(sender);
            receivedDateText.setText(receivedDate);
            contentsText.setText(contents);
        }
    }
}