package com.example.calculatorbyashish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double in1=0,i2=0;
    TextView edittext1;
    boolean add;
    boolean sub;
    boolean multiply;
    boolean divide;
    boolean remainder;
    boolean deci;
    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_add;
    Button button_sub;
    Button button_mul;
    Button button_div;
    Button button_equal;
    Button button_dele;
    Button button_Dot;
    Button button_remainder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_0 = (Button) findViewById(R.id.bZero);
        button_1 = (Button) findViewById(R.id.b1);
        button_2 = (Button) findViewById(R.id.b2);
        button_3 = (Button) findViewById(R.id.b3);
        button_4 = (Button) findViewById(R.id.b4);
        button_5 = (Button) findViewById(R.id.b5);
        button_6 = (Button) findViewById(R.id.b6);
        button_7 = (Button) findViewById(R.id.b7);
        button_8 = (Button) findViewById(R.id.b8);
        button_9 = (Button) findViewById(R.id.b9);
        button_Dot = (Button) findViewById(R.id.bDot);
        button_add = (Button) findViewById(R.id.badd);
        button_sub = (Button) findViewById(R.id.dsubstraction);
        button_mul = (Button) findViewById(R.id.bmultiply);
        button_div = (Button) findViewById(R.id.div);
        button_remainder = (Button) findViewById(R.id.bRemaing);
        button_dele = (Button) findViewById(R.id.buttonDelete);
        button_equal= (Button) findViewById(R.id.buttoneqal);

        edittext1 = (TextView) findViewById(R.id.display);

        button_1.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "1");
        }));

        button_2.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "2");
        }));

        button_3.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "3");
        }));

        button_4.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "4");
        }));

        button_5.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "5");
        }));

        button_6.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "6");
        }));

        button_7.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "7");
        }));

        button_8.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "8");
        }));

        button_9.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "9");
        }));

        button_0.setOnClickListener((v -> {
            edittext1.setText(edittext1.getText() + "0");
        }));

        button_add.setOnClickListener((v -> {
            if (edittext1.getText().length()!=0)
            {
                in1 = Float.parseFloat(edittext1.getText() + "");
                        add=true;
                deci=false;
                edittext1.setText(null);
            }
        }));

        button_sub.setOnClickListener((v -> {
            if (edittext1.getText().length()!=0)
            {
                in1 = Float.parseFloat(edittext1.getText() + "");
                sub=true;
                deci=false;
                edittext1.setText(null);
            }
        }));

        button_mul.setOnClickListener((v -> {
            if (edittext1.getText().length()!=0)
            {
                in1 = Float.parseFloat(edittext1.getText() + "");
                multiply=true;
                deci=false;
                edittext1.setText(null);
            }
        }));

        button_div.setOnClickListener((v -> {
            if (edittext1.getText().length()!=0)
            {
                in1 = Float.parseFloat(edittext1.getText() + "");
                divide=true;
                deci=false;
                edittext1.setText(null);
            }
        }));

        button_remainder.setOnClickListener((v -> {
            if (edittext1.getText().length()!=0)
            {
                in1 = Float.parseFloat(edittext1.getText() + "");
                remainder=true;
                deci=false;
                edittext1.setText(null);
            }
        }));

        button_equal.setOnClickListener((v -> {
            if (add || sub || multiply || divide || remainder)
            {
                i2=Float.parseFloat(edittext1.getText() +"");
            }

            if (add)
            {
                edittext1.setText(in1 + i2 + "");
                add=false;
            }

            if (sub)
            {
                edittext1.setText(in1 - i2 + "");
                sub=false;
            }
            if (multiply)
            {
                edittext1.setText(in1 * i2 + "");
                multiply=false;
            }
            if (divide)
            {
                edittext1.setText(in1 / i2 + "");
                divide=false;
            }
            if (remainder)
            {
                edittext1.setText(in1 % i2 + "");
                remainder=false;
            }

        }));
        button_dele.setOnClickListener(v -> {
            edittext1.setText("");
            in1=0.0;
            i2=0.0;
        });
        button_Dot.setOnClickListener(v -> {
            if (deci)
            {

            }
            else {
                edittext1.setText(edittext1.getText() + ".");
                deci=true;
            }
        });

    }
}