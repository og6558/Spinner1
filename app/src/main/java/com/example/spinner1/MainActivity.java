package com.example.spinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener,AdapterView.OnItemClickListener {
    ListView list;
    TextView tv1, tv2, tv3, tv4;
    Spinner spin;
    ArrayAdapter<String> adp;
    String [][] familynames = {{"gabay", "gedge", "bonkin", "levi", "rabaliov", "kredeif", "shtayman", "benbaroch", "menachem", "iluzz"},
            {"curry","james","harden","bryant","durant","westbrook","malone","jordan","oneal","web"},
            {"ronaldo", "messi", "ibrahimovich", "ronnie", "antatakompo", "irving", "pnini", "zomer", "puol", "gasol"},
            {"adams", "brown", "sorkin", "willbakin", "benshitrit", "kol", "cohen", "ziv", "nevo", "agmon"}};

    String [][] firstnames = {{"orel", "dorel", "idan", "harel", "dan", "nisim", "shay", "erel", "inber", "yonathan"},
            {"stephen","lebron","james","kobe","kevin","russal","karl","michael","shaqil","spud"},
            {"cristiano", "lional", "zlatan", "wayne", "gainnis", "kairye", "gay", "bar", "chris", "pao"},
            {"jalen", "loranzo", "roman", "scottie", "ytzhak", "sorin", "jake", "yftach", "josh", "tomar"}};

    String [][] borndate = {{"1/9/2006", "2/9/2006", "3/9/2006", "4/9/2006", "5/9/2006", "6/9/2006", "7/9/2006", "8/9/2006", "9/9/2006", "10/9/2006"},
            {"11/9/2006","12/9/2006","13/9/2006","14/9/2006","15/9/2006","16/9/2006","17/9/2006","18/9/2006","19/9/2006","20/9/2006"},
            {"21/9/2006", "22/9/2006", "23/9/2006", "24/9/2006", "25/9/2006", "26/9/2006", "27/9/2006", "28/9/2006", "29/9/2006", "30/9/2006"},
            {"1/10/2006", "2/10/2006", "3/10/2006", "4/10/2006", "5/10/2006", "6/10/2006", "7/10/2006", "8/10/2006", "9/10/2006", "10/10/2006"}};

    String [][] phonenumber = {{"058501651", "058501652", "058501653", "058501654", "058501655", "058501656", "058501657", "058501658", "058501659", "058501650"},
            {"057501651", "057501652", "057501653", "057501654", "057501655", "057501656", "057501657", "057501658", "057501659", "057501650"},
            {"058901651", "058901652", "058901653", "058901654", "058901655", "058901656", "058901657", "058901658", "058901659", "058901650"},
            {"058581651", "058581652", "058581653", "058581654", "058581655", "058581656", "058581657", "058581658", "058581659", "058581650"}};

    String [] classes = {"choose a class","class1","class2","class3","class4"};

    int classeleced = 0;

    ArrayAdapter<String> adp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        list = (ListView) findViewById(R.id.list);
        spin = (Spinner) findViewById(R.id.spin);

        spin.setOnItemSelectedListener(this);

        list.setOnItemClickListener(this);  

        adp1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, classes);
        spin.setAdapter(adp1);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        adp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, firstnames[i-1]);
        list.setAdapter(adp);
        classeleced = i-1;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        tv1.setText(familynames[classeleced][i]);
        tv2.setText(firstnames[classeleced][i]);
        tv3.setText(borndate[classeleced][i]);
        tv4.setText(phonenumber[classeleced][i]);
    }
}