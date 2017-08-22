package com.example.iot.networkingexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import static com.example.iot.networkingexample.R.styleable.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnJson, btnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJson = (Button) findViewById(R.id.btnJsonRequest);
        btnImage = (Button) findViewById(R.id.btnImageRequest);

        // button click listeners
        btnJson.setOnClickListener(this);
        btnImage.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnJsonRequest:
                startActivity(new Intent(MainActivity.this,
                        JsonDownloadActivity.class));
                break;
            case R.id.btnImageRequest:
                startActivity(new Intent(MainActivity.this,
                        ImageDownloadActivity.class));
                break;
            default:
                break;
        }
    }

}
