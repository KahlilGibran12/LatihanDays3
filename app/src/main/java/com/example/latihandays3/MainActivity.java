package com.example.latihandays3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btnMove);
        Button btnMoveActivityWithData = findViewById(R.id.btnMoveData);
        Button btnMoveActivityWithOb = findViewById(R.id.btnMoveWB);
        Button btnImplicit = findViewById(R.id.btnImplicit);

        btnMoveActivity.setOnClickListener(this);
        btnMoveActivityWithData.setOnClickListener(this);
        btnMoveActivityWithOb.setOnClickListener(this);
        btnImplicit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnMove){
            Intent intent = new Intent(this, MoveActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.btnMoveData) {
            Intent intent = new Intent(this, MoveWithData.class);
            intent.putExtra(MoveWithData.KEY_DATA, "Fulan");
            startActivity(intent);
        } else if (v.getId() == R.id.btnMoveWB) {
            Marvel marvel = new Marvel();
            marvel.setName("Hulk");
            marvel.setType("Human");
            marvel.setAge("12");

            Intent intent = new Intent(this, MoveWithOB.class);
            intent.putExtra(MoveWithOB.KEY_DATA, marvel);
            startActivity(intent);
        } else if (v.getId() == R.id.btnImplicit) {
            String phone = "082274268796";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +phone));
            startActivity(intent);
        }
    }
}