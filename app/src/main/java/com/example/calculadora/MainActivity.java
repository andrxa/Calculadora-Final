package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";

    //Variables
    private TextView resultado;
    private Button Num0, Num1, Num2, Num3, Num4, Num5, Num6, Num7, Num8, Num9;
    private Button Boton_Suma, Boton_Resta, Boton_Multiplicacion, Boton_Division, Boton_clear, Boton_Igual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.solucion);

        Num0 = findViewById(R.id.num_cero);
        Num1 = findViewById(R.id.num_uno);
        Num2 = findViewById(R.id.num_dos);
        Num3 = findViewById(R.id.num_tres);
        Num4 = findViewById(R.id.num_cuatro);
        Num5 = findViewById(R.id.num_cinco);
        Num6 = findViewById(R.id.num_seis);
        Num7 = findViewById(R.id.num_siete);
        Num8 = findViewById(R.id.num_ocho);
        Num9 = findViewById(R.id.num_nueve);

        Boton_Suma = findViewById(R.id.num_suma);
        Boton_Resta = findViewById(R.id.num_resta);
        Boton_Multiplicacion = findViewById(R.id.num_multiplicacion);
        Boton_Division = findViewById(R.id.num_division);
        Boton_clear = findViewById(R.id.num_borrar);
        Boton_Igual = findViewById(R.id.num_igual);

        //Listener
        Num0.setOnClickListener(this);
        Num1.setOnClickListener(this);
        Num2.setOnClickListener(this);
        Num3.setOnClickListener(this);
        Num4.setOnClickListener(this);
        Num5.setOnClickListener(this);
        Num6.setOnClickListener(this);
        Num7.setOnClickListener(this);
        Num8.setOnClickListener(this);
        Num9.setOnClickListener(this);

        Boton_Suma.setOnClickListener(this);
        Boton_Resta.setOnClickListener(this);
        Boton_Multiplicacion.setOnClickListener(this);
        Boton_Division.setOnClickListener(this);
        Boton_clear.setOnClickListener(this);
        Boton_Igual.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                        resultado.setText(numero);
                        break;
            case R.id.num_uno:
                numero = numero + "1";
                resultado.setText(numero);
                break;
            case R.id.num_dos:
                numero = numero + "2";
                resultado.setText(numero);
                break;
            case R.id.num_tres:
                numero = numero + "3";
                resultado.setText(numero);
                break;
            case R.id.num_cuatro:
                numero = numero + "4";
                resultado.setText(numero);
                break;
            case R.id.num_cinco:
                numero = numero + "5";
                resultado.setText(numero);
                break;
            case R.id.num_seis:
                numero = numero + "6";
                resultado.setText(numero);
                break;
            case R.id.num_siete:
                numero = numero + "7";
                resultado.setText(numero);
                break;
            case R.id.num_ocho:
                numero = numero + "8";
                resultado.setText(numero);
                break;
            case R.id.num_nueve:
                numero = numero + "9";
                resultado.setText(numero);
                break;

            case R.id.num_resta:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_suma:
                symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_multiplicacion:
                symbol = "*";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_division:
                symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_borrar:
                  symbol = "";
                  numero = "";
                  num1 = 0;
                  num2 = 0;
                  resultado.setText("");
                  break;
            case R.id.num_igual:
                num2 = Integer.parseInt(numero);

                switch (symbol){
                    case "-":
                    resultado.setText("resultado" + (num1 - num2));
                    break;
                    case "+":
                        resultado.setText("resultado" + (num1 + num2));
                        break;
                    case "*":
                        resultado.setText("resultado" + (num1 * num2));
                        break;
                    case "/":
                        resultado.setText("resultado" + (num1 / num2));
                        break;
                }
                numero = "";
                num1 = 0;
                num2 = 0;
                break;



        }

    }
}
