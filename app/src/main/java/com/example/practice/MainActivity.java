package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinnerGivenWeight;
    private Spinner spinnerCalculatedWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropDownGivenWeight();
        dropDownCalculatedWeight();
    }
    public void dropDownGivenWeight(){
        spinnerGivenWeight = findViewById(R.id.spinnerGivenWeight);
        String[] givenWeights = getResources().getStringArray(R.array.Weight_convert);
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,givenWeights);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinnerGivenWeight.setAdapter(adapter);
    }
    public void dropDownCalculatedWeight(){
        spinnerCalculatedWeight = findViewById(R.id.spinnerCalculatedWeight);
        String[] givenWeights = getResources().getStringArray(R.array.Weight_convert);
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,givenWeights);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinnerCalculatedWeight.setAdapter(adapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(getParent().getTaskId() == R.id.spinnerGivenWeight);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}