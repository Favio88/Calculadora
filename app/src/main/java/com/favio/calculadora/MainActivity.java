package com.favio.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_on, btn_off, btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9,
            btn_suma, btn_resta, btn_multiplicacion, btn_division, btn_punto, btn_igual, btn_mrc;
    EditText etxt_pantalla;
    char operacion;
    double operando1, operando2, resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_on=findViewById(R.id.btn_on);
        btn_off=findViewById(R.id.btn_off);
        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        btn_suma=findViewById(R.id.btn_suma);
        btn_resta=findViewById(R.id.btn_resta);
        btn_multiplicacion=findViewById(R.id.btn_multiplicacion);
        btn_division=findViewById(R.id.btn_division);
        btn_punto=findViewById(R.id.btn_punto);
        btn_igual=findViewById(R.id.btn_igual);
        btn_mrc=findViewById(R.id.btn_mrc);

        etxt_pantalla=findViewById(R.id.etxt_pantalla);


        btn_0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString()+"9");
            }
        });

        btn_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt_pantalla.setText(etxt_pantalla.getText().toString() + ".");
            }
        });


        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = '+';

                operando1 = Double.parseDouble(etxt_pantalla.getText().toString());
                etxt_pantalla.setText("");
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = '-';

                operando1 = Double.parseDouble(etxt_pantalla.getText().toString());
                etxt_pantalla.setText("");
            }
        });

        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = '*';

                operando1 = Double.parseDouble(etxt_pantalla.getText().toString());
                etxt_pantalla.setText("");
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = '/';

                operando1 = Double.parseDouble(etxt_pantalla.getText().toString());
                etxt_pantalla.setText("");
            }
        });

        btn_mrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operando1 = 0;
                operando2 = 0;

                etxt_pantalla.setText("");
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operando2 = Double.parseDouble(etxt_pantalla.getText().toString());

                switch (operacion){
                    case '+':
                        etxt_pantalla.setText("");
                        resultado=operando1+operando2;
                        break;
                    case '-':
                        etxt_pantalla.setText("");
                        resultado=operando1-operando2;
                        break;
                    case '*':
                        etxt_pantalla.setText("");
                        resultado=operando1*operando2;
                        break;
                    case '/':
                        etxt_pantalla.setText("");
                        resultado=operando1/operando2;
                        break;
                }

                etxt_pantalla.setText(Double.toString(resultado));
            }
        });

        btn_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void encender(View v){
        //Toast.makeText(this, "Encendido", Toast.LENGTH_LONG).show();

        etxt_pantalla=findViewById(R.id.etxt_pantalla);
        etxt_pantalla.setText("");
    }

    public void apagar(View v){

        etxt_pantalla=findViewById(R.id.etxt_pantalla);
        etxt_pantalla.setText("");
    }

}
