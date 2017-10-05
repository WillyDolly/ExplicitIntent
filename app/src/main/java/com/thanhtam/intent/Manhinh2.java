package com.thanhtam.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Manhinh2 extends Activity {
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        btnBack = (Button)findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manhinh2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Log.d("AAA","onCreate Manhinh2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA","onStart Manhinh2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA","onRestart Manhinh2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA","onResume Manhinh2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA","onPause Manhinh2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA","onStop Manhinh2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA","onDestroy Manhinh2");
    }
}
