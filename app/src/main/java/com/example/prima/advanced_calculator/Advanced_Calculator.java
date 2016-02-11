package com.example.prima.advanced_calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import java.lang.*;
import java.math.*;

public class Advanced_Calculator extends AppCompatActivity {

    TextView edittext_View;
    TextView textView_Out;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonsin, buttonplus, buttondelete, buttoncos, buttonminus, buttonac;
    Button buttontan, buttonmultiply, buttonequal, buttonpoint, button0, buttonpi;
    Button buttonlog, buttondevided, buttone, buttonln, buttonpower;
    Button buttonsqure, buttonqube, buttonopeningbracket, buttonendingbracket;

    String storage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced__calculator);

        edittext_View = (TextView) findViewById(R.id.textView_in);

        textView_Out = (TextView) findViewById(R.id.textView_out);

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "0";
                edittext_View.setText(storage);
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "1";
                edittext_View.setText(storage);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "2";
                edittext_View.setText(storage);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "3";
                edittext_View.setText(storage);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "4";
                edittext_View.setText(storage);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "5";
                edittext_View.setText(storage);
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "6";
                edittext_View.setText(storage);
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "7";
                edittext_View.setText(storage);
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "8";
                edittext_View.setText(storage);
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "9";
                edittext_View.setText(storage);
            }
        });

        //==========================================================================================

        buttonsin = (Button) findViewById(R.id.buttonSin);
        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttoncos = (Button) findViewById(R.id.buttonCos);
        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttontan = (Button) findViewById(R.id.buttonTan);
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //==========================================================================================

        buttonplus = (Button) findViewById(R.id.buttonPlus);
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "+";
                edittext_View.setText(storage);
            }
        });

        buttonminus = (Button) findViewById(R.id.buttonMinus);
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "-";
                edittext_View.setText(storage);
            }
        });

        buttonmultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "*";
                edittext_View.setText(storage);
            }
        });

        buttondevided = (Button) findViewById(R.id.buttonDevide);
        buttondevided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "/";
                edittext_View.setText(storage);
            }
        });

        //==========================================================================================

        buttondelete = (Button) findViewById(R.id.buttonDelete);
        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str;
                str = edittext_View.getText().toString();
                if (str.length() > 0) {
                    str = str.substring(0, str.length()-1);
                }
                edittext_View.setText(str);
            }
        });

        buttonac = (Button) findViewById(R.id.buttonAC);
        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext_View.setText("");
                textView_Out.setText("0");
            }
        });

        buttonequal = (Button) findViewById(R.id.buttonEqual);
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();

                String expression = temp;
                try {
                    Double result = new DoubleEvaluator().evaluate(expression);
                    textView_Out.setText(result.toString());
                }
                catch (IllegalArgumentException ex) {
                    Context context = getApplicationContext();
                    CharSequence text = "Illegal Argument";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    textView_Out.setText("0");
                }
                finally {

                }
            }
        });

        //==========================================================================================

        buttonpoint= (Button) findViewById(R.id.buttonPoint);
        buttonpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + ".";
                edittext_View.setText(storage);
            }
        });

        buttonpi = (Button) findViewById(R.id.buttonPI);
        buttonpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "pi";
                edittext_View.setText(storage);
            }
        });

        buttonlog = (Button) findViewById(R.id.buttonLog);
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "log";
                edittext_View.setText(storage);
            }
        });

        buttone = (Button) findViewById(R.id.buttonE);
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "e";
                edittext_View.setText(storage);
            }
        });

        buttonln = (Button) findViewById(R.id.buttonLN);
        buttonln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "ln";
                edittext_View.setText(storage);
            }
        });

        buttonpower = (Button) findViewById(R.id.buttonPower);
        buttonpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "^";
                edittext_View.setText(storage);
            }
        });

        buttonsqure = (Button) findViewById(R.id.buttonSquare);
        buttonsqure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "^2";
                edittext_View.setText(storage);
            }
        });

        buttonqube = (Button) findViewById(R.id.buttonCube);
        buttonqube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "^3";
                edittext_View.setText(storage);
            }
        });

        buttonopeningbracket = (Button) findViewById(R.id.buttonOpeningBracket);
        buttonopeningbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + "(";
                edittext_View.setText(storage);
            }
        });

        buttonendingbracket = (Button) findViewById(R.id.buttonEndingBracket);
        buttonendingbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = edittext_View.getText().toString();
                storage = temp + ")";
                edittext_View.setText(storage);
            }
        });
    }

    @Override
    public void onRestart() {
        super.onRestart();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        finish();
    }
}
