package me.aanyakhaira.hackattack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class settingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ImageButton btnBack = (ImageButton)findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(settingsActivity.this, titlePage.class);
                startActivity(intent);
            }

        });
    }

    public void changeText(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Settings")) {
            Intent intent = new Intent(this, titlePage.class);
            startActivity(intent);
        }
    }


}
