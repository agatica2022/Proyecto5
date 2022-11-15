package cl.gatica.proyecto5;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    //Definición de objetos para referencia de la activity
    private EditText num;
    private EditText la1,la2,lo1,lo2;
    private TextView resultado,calculo;
    private Button btnconvertir,btncalcular;
    Double convertido=0.0;
    int a=10;
    int b=15;
    int r=a+b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.txtdecimales);
        la1 = (EditText) findViewById(R.id.txtLat1);
        la2 = (EditText) findViewById(R.id.txtLat2);
        lo1 = (EditText) findViewById(R.id.txtLong1);
        lo2 = (EditText) findViewById(R.id.txtLong2);

        btnconvertir = (Button) findViewById(R.id.btnConvertir);
        btncalcular = (Button) findViewById(R.id.btnCalcular);
        resultado = (TextView) findViewById(R.id.lblResultado);
        calculo = (TextView) findViewById(R.id.lblDistancia);
        btnconvertir.setOnClickListener(view -> {


            r = Integer.parseInt(num.getText().toString());
            resultado.setText(String.valueOf(r));
        });

        btncalcular.setOnClickListener((view) -> {


            Double a, b, c, d;
            a = Double.parseDouble(la1.getText().toString());
            b = Double.parseDouble(la2.getText().toString());
            c = Double.parseDouble(lo1.getText().toString());
            d = Double.parseDouble(lo2.getText().toString());
            convertido = Calcular(a, b, c, d);
            calculo.setText(String.valueOf(convertido));
        });


    }

    public Double Calcular(double lat1, double lat2, double long1, double long2)
    {
        Double calculo = 0.0;
        Double radio = Math.sin(6537.0);
        calculo= (lat1 + lat2) - (long1 + long2);

        return calculo;
    }
}