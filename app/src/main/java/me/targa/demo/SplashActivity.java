package me.targa.demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent shortcutIntent = new Intent();
        shortcutIntent.setClassName("me.targa.playlistvbeta", "me.targa.playlistvbeta.activity.CategoryActivity");
        shortcutIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        shortcutIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        shortcutIntent.putExtra("url", "http://cinebox.ga");
        startActivity(shortcutIntent);
        finish();
    }
}
