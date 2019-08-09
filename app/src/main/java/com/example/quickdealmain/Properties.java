package com.example.quickdealmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Properties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinnerSecond);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Properties.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.second));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) {

                    startActivity(new Intent(Properties.this, Apartments.class));
                }

                else if (i == 2) {

                    startActivity(new Intent(Properties.this, Houses.class));
                }

                else if (i == 3) {

                    startActivity(new Intent(Properties.this, Lands.class));
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
