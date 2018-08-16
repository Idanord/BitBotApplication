package net.michelison.homebitbot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class DropDownActivity extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Blockchain Terms");

        // Adding child data
        List<String> terms = new ArrayList<String>();
        terms.add("Address");
        terms.add("Bit");
        terms.add("Bitcoin");
        terms.add("Block");
        terms.add("Block Chain");
        terms.add("BTC");
        terms.add("Confirmation");
        terms.add("Cryptography");
        terms.add("Double Spend");
        terms.add("Hash Rate");
        terms.add("Mining");
        terms.add("P2P");
        terms.add("Private Key");
        terms.add("Signature");
        terms.add("Wallet");

        listDataChild.put(listDataHeader.get(0), terms); // Header, Child data
    }
}
