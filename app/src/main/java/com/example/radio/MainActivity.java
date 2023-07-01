package com.example.radio;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected TextView textView;
    protected RadioGroup radioGroup;
    protected RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       textView = (TextView) findViewById(R.id.textView);
       radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

           @SuppressLint("NonConstantResourceId")
           @Override
           public void onCheckedChanged(RadioGroup group,@IdRes int checkedId) {

               radioButton = (RadioButton) findViewById(checkedId);
               switch (radioButton.getId()){

                   case R.id.pizza:
                       textView.setText("Pizza");
                       Log.d("log","Pizza");
                       break;

                       case R.id.hamburger:
                           textView.setText("hamburger");
                           Log.d("log","hamburger");
                           break;

                           case R.id.steak:
                               textView.setText("Steak");
                               Log.d("log","Steak");
                               break;

                   default:
                       textView.setText("Radio");
               }
           }
       });

    }
}