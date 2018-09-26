package com.example.student.demo;

import android.app.assist.AssistStructure;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {implements AdapterView.OnItemSelectedListener  {
    String[] bank_names={"IOB","SBI","HDFC"};
}
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Spinner spin=(Spinner) findViewById (R.id.spinner);
    spin.setOnItemSelectedListener(this);
    ArrayAdapter aa = new ArrayAdapter( Context: this, android.R.layout.simple_spinner_item,bank_names);
    aa. setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
   spin.setAdapter(aa);

    }
}
