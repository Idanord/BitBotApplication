package net.michelison.homebitbot;

import android.app.Activity;
import android.os.Bundle;

public class TermsActivity extends Activity {

    private int TermID;
    private String Term;
    private String TermDefinition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
    }
}
