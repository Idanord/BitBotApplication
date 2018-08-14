package net.michelison.homebitbot;

// import android.content.res.AssetManager;
import android.content.Context;
// import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

// import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {

    //constructor
    // not sure what to pass in here
    public CSVHandler(){

    }

    private List<TermsActivity> termsActivity = new ArrayList<>();

    private void readTermData(Context context) {
      //  AssetManager assets = getResources().getAssets;

        InputStream is = context.getResources().openRawResource(R.raw.bitbot_content);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = "";
        try {
            //step over header
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                Log.d("MyActivity", "Line: " + line);
                //split by commas
                String[] tokens = line.split(",");

                //read the data
                TermsActivity sample = new TermsActivity();
                sample.setTermID(Integer.parseInt(tokens[0]));
                if (tokens[1].length() > 0){
                    sample.setTerm(tokens[1]);
                }else {
                    sample.setTerm(null);
                }
                if (tokens.length >= 3 && tokens[2].length() > 0){
                    sample.setTermDefinition(tokens[2]);
                }else {
                    sample.setTermDefinition(null);
                }

                sample.setTerm(tokens[1]);
                sample.setTermDefinition(tokens[2]);
                termsActivity.add(sample);

                Log.d("MyActivity", "Just created: " + sample);

            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading data file on line " + line, e);
            e.printStackTrace();
        }
    }
}
