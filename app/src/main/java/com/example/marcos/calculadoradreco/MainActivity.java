package com.example.marcos.calculadoradreco;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {
    float valor1;
    float valor2;
    float r1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText v1 = (EditText) findViewById(R.id.edtValor1);
        final EditText v2 = (EditText) findViewById(R.id.edtValor2);
        final TextView resultado = (TextView) findViewById(R.id.textView5);

        Button somar = (Button) findViewById(R.id.btnSomar);
        Button subtrair = (Button) findViewById(R.id.btnSubtrair);
        Button multiplicar = (Button) findViewById(R.id.btnMultiplicar);
        Button dividir = (Button) findViewById(R.id.btnDividir);



        somar.setOnClickListener(new View.OnClickListener()
        {
             public void onClick(View v)
             {
                 valor1 = Float.valueOf(v1.getText().toString());
                 valor2 = Float.valueOf(v2.getText().toString());

                 r1 = valor1 + valor2;

                 resultado.setText(String.valueOf(r1));
                 Toast.makeText(getBaseContext(), "Resultado Final " + String.valueOf(r1).toString(), Toast.LENGTH_SHORT).show();

             }
        });

        subtrair.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                valor1 = Float.valueOf(v1.getText().toString());
                valor2 = Float.valueOf(v2.getText().toString());

                r1 = valor1 - valor2;

                resultado.setText(String.valueOf(r1));
                Toast.makeText(getBaseContext(), "Resultado Final " + String.valueOf(r1).toString(), Toast.LENGTH_SHORT).show();

            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                valor1 = Float.valueOf(v1.getText().toString());
                valor2 = Float.valueOf(v2.getText().toString());

                r1 = valor1 * valor2;

                resultado.setText(String.valueOf(r1));
                Toast.makeText(getBaseContext(), "Resultado Final " + String.valueOf(r1).toString(), Toast.LENGTH_SHORT).show();

            }
        });

        dividir.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                valor1 = Float.valueOf(v1.getText().toString());
                valor2 = Float.valueOf(v2.getText().toString());

                if (valor2 == 0)
                {
                    resultado.setText("Divisão por zero indefinida! ");

                    Toast.makeText(getBaseContext(), "Divisão por zero indefinida!", Toast.LENGTH_LONG).show();
                }

                else
                {
                    r1 = valor1 / valor2;

                    resultado.setText(String.valueOf(r1));
                    Toast.makeText(getBaseContext(), "Resultado Final " + String.valueOf(r1).toString(), Toast.LENGTH_SHORT).show();

                }




            }
        });

    }

}
