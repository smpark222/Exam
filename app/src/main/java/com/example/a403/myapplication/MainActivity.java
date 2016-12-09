package com.example.a403.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Button button, button2, back, complete;
    Chronometer chronometer;
    Switch start;
    EditText editText, editText2, editText3;
    RadioButton radioButton, radioButton2, radioButton3, radioButton4, radioButton5;
    LinearLayout layout1, layout2;
    TimePicker time;
    CalendarView date;
    TextView textView5, textView7, textView9;
    ImageView imageView;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView5 = (TextView)findViewById(R.id.textView);
        textView7 = (TextView)findViewById(R.id.textView2);
        textView9 = (TextView)findViewById(R.id.textView3);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        start = (Switch) findViewById(R.id.start);
        time = (TimePicker)findViewById(R.id.time);
        date = (CalendarView) findViewById(R.id.date);
        layout1 = (Layout)findViewById(R.id.layout1);
        layout2 = (Layout)findViewById(R.id.layout2);
        radioButton = (RadioButton)findViewById(R.id.radioButton);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton)findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton)findViewById(R.id.radioButton5);
        imageView = (ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        back = (Button)findViewById(R.id.back);
        complete = (Button)findViewById(R.id.complete);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);


        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true) {
                    layout1.setVisibility(View.VISIBLE);
                }
                else{
                    layout1.setVisibility(View.GONE);
                    layout2.setVisibility(View.GONE);
                }
            }
        });
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked ==true) a = 5/100;

            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked ==true) a = 10/100;
            }
        });
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked ==true) a = 20/100;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = (Integer.parseInt(editText.getText().toString()) * 15000 + Integer.parseInt(editText2.getText().toString()) * 12000 + Integer.parseInt(editText3.getText().toString()) * 8000)* a;
                int people = Integer.parseInt(editText.getText().toString()) + Integer.parseInt(editText2.getText().toString()) + Integer.parseInt(editText3.getText().toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
            }
        });

    }
}
