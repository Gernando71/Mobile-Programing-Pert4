package com.example.ahmadgernando;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4, button5;
    private AlertDialog.Builder alertdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button.setOnClickListener(view -> {

            alertdialog = new AlertDialog.Builder(MainActivity.this);
            alertdialog.setTitle(R.string.alert_1);
            alertdialog.setMessage("Tampilan pada alert 1");
            alertdialog.setPositiveButton("Ya", (dialogInterface, i) -> finish());
            alertdialog.setNegativeButton("Tidak", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Kamu menekan tombol tidak", Toast.LENGTH_SHORT).show());
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> {

            alertdialog = new AlertDialog.Builder(MainActivity.this);
            alertdialog.setTitle(R.string.alert_2);
            alertdialog.setMessage("Tampilan pada alert 2");
            alertdialog.setPositiveButton("Ya", (dialogInterface, i) -> finish());
            alertdialog.setNegativeButton("Tidak", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Kamu menekan tombol tidak", Toast.LENGTH_SHORT).show());
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {

            alertdialog = new AlertDialog.Builder(MainActivity.this);
            alertdialog.setTitle(R.string.alert_2);
            alertdialog.setMessage("Tampilan pada alert 3");
            alertdialog.setPositiveButton("Ya", (dialogInterface, i) -> finish());
            alertdialog.setNegativeButton("Tidak", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Kamu menekan tombol tidak", Toast.LENGTH_SHORT).show());
        });
    }
}
