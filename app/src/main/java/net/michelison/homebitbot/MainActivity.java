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
    }

    //sending to the chat bot
    public void sendChat (View view){
        Intent intent = new Intent(this, BotActivity.class);
        startActivity(intent);
    }

    //sending to list view activity
    public void sendTextActivity (View view){
        Intent intent = new Intent(this, TermActivity.class);
        startActivity(intent);
    }

}
