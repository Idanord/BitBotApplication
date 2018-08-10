package net.michelison.homebitbot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button bitBotButton;
    private Button listViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bitBotButton = findViewById(R.id.bitBotButton);
        listViewButton = findViewById(R.id.listViewButton2);
    }

    //sending to the chat bot
    //TODO figure out which is the chatbot activity via code -Will
    //TODO finish linking this to send user to chatbot -Will
    public void sendChat (View view){
        Intent intent = new Intent(this, );
    }

    //sending to list view activity
    //TODO add code to sent to the text list view activity -WILL
    public void sendTextActivity (View view){
        Intent intent = new Intent(this, );
    }
}
