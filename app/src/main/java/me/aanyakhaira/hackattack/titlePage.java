package me.aanyakhaira.hackattack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class titlePage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlepage);

        ImageButton btnSettings = (ImageButton) findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(titlePage.this, settingsActivity.class);
                startActivity(intent);
            }
        });

    }

        public void changeText(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("New Game")) {
            Intent intent = new Intent(this, recruitmentActivity.class);
            startActivity(intent);
        }
    }

}