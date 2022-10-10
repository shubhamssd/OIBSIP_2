package com.example.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1,e2;
        MaterialButton buttonDivide,buttonMultiply,buttonMinus,buttonPlus;
        TextView t1;

        e1=findViewById(R.id.edittext);
        e2=findViewById(R.id.edittext2);
        t1=findViewById(R.id.textview);

        buttonDivide=findViewById(R.id.button_divide);
        buttonMultiply=findViewById(R.id.button_multiply);
        buttonMinus=findViewById(R.id.button_minus);
        buttonPlus=findViewById(R.id.button_plus);

        buttonPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter the value",Toast.LENGTH_SHORT).show();
                }
                else{
                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());
                    int c= a+b;
                    t1.setText(String.valueOf(c));
                }
            }


        });

        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter the value",Toast.LENGTH_SHORT).show();
                }
                else{
                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());
                    int c= a-b;
                    t1.setText(String.valueOf(c));
                }
            }


        });

        buttonMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter the value",Toast.LENGTH_SHORT).show();
                }
                else{
                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());
                    int c= a*b;
                    t1.setText(String.valueOf(c));
                }
            }


        });

        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter the value",Toast.LENGTH_SHORT).show();
                }
                else{
                    int a=Integer.parseInt(e1.getText().toString());
                    int b=Integer.parseInt(e2.getText().toString());
                    int c= a/b;
                    t1.setText(String.valueOf(c));
                }
            }


        });



    }
}