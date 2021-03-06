package com.example.a403.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import android.widget.Toast;

import static com.example.a403.myapplication.R.drawable.aaa;
import static com.example.a403.myapplication.R.drawable.bbb;
import static com.example.a403.myapplication.R.drawable.ccc;

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
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);
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
                if(isChecked ==true) {
                    a = 5 / 100;
                    imageView.setImageResource(aaa);
                }

            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked ==true) a = 10/100;
                imageView.setImageResource(bbb);
            }
        });
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked ==true) a = 20/100;
                imageView.setImageResource(ccc);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText() == null || editText2.getText() == null || editText3.getText() == null){
                    Toast.makeText(getApplicationContext(), "인원을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    int result = (Integer.parseInt(editText.getText().toString()) * 15000 + Integer.parseInt(editText2.getText().toString()) * 12000 + Integer.parseInt(editText3.getText().toString()) * 8000);
                    int people = Integer.parseInt(editText.getText().toString()) + Integer.parseInt(editText2.getText().toString()) + Integer.parseInt(editText3.getText().toString());
                    textView5.setText(people);
                    textView7.setText(result * a);
                    textView9.setText(result - result * a);
                }
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
