package net.michelison.homebitbot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button bitBotButton;
    private Button listViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bitBotButton = findViewById(R.id.bitBotButton);
        listViewButton = findViewById(R.id.listViewButton);

        // dan set the listeners
        bitBotButton.setOnClickListener(this);
        listViewButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bitBotButton:
                startActivity(new Intent(this, BotActivity.class));
            case R.id.listViewButton:
                startActivity(new Intent(this, DropDownActivity.class));
        }

    }
}
