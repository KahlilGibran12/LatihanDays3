package com.example.latihandays3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MoveWithOB extends AppCompatActivity {

    public static final String KEY_DATA = "key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_ob);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvType=  findViewById(R.id.tvType);
        TextView tvAge = findViewById(R.id.tvAge);

        Marvel marvel;
        if (Build.VERSION.SDK_INT >= 33) {
            marvel = getIntent().getParcelableExtra(KEY_DATA, Marvel.class);
        } else {
            marvel = getIntent().getParcelableExtra(KEY_DATA);
        }

        if (marvel != null) {
            // Menampilkan data ke dalam TextView
            tvName.setText("Name: " + marvel.getName());
            tvType.setText("Type: " + marvel.getType());
            tvAge.setText("Age: " + marvel.getAge());
        }

    }
}