package com.it18155358.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.NotActiveException;

public class Sign_up extends AppCompatActivity {
    Button btNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btNotification = findViewById(R.id.bt_notification);
        btNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="This is a notifiaction example";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(
                        context Sign_up.this
                )
                        .setSmallIcon(R.drawable.ic_message)
                        .setContentTitle()
            }
        });
    }
}
