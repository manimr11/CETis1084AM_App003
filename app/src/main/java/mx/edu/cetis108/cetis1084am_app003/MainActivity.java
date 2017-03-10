package mx.edu.cetis108.cetis1084am_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnIdentificar_onclick (View v)
    {
        EditText txtNumero1 = (EditText)findViewById(R.id.txtNumero1);
        EditText txtNumero2 = (EditText)findViewById(R.id.txtNumero2);
        TextView lblResultado_mayor_menor = (TextView)findViewById(R.id.lblResultado_mayor_menor);
        TextView lblIndicacion_suma_resta = (TextView)findViewById(R.id.lblIndicacion_suma_r);
        TextView lblResultado_suma_resta = (TextView)findViewById(R.id.lblResultado_suma_r);
        float txt_Numero1 = Float.parseFloat(txtNumero1.getText().toString());
        float txt_Numero2 = Float.parseFloat(txtNumero2.getText().toString());
        if(txt_Numero1>txt_Numero2)
        {
            lblResultado_mayor_menor.setText("");
            lblIndicacion_suma_resta.setText("");
            lblResultado_suma_resta.setText("");
            lblResultado_mayor_menor.setText("El mayor es el número 1: "+txt_Numero1);
            lblIndicacion_suma_resta.setText("Se restarán (el mayor menos el menor):");
            float resta = txt_Numero1 - txt_Numero2;
            lblResultado_suma_resta.setText("resta es: "+resta);
        }
        else
        {
            if(txt_Numero1 == txt_Numero2)
            {
                lblResultado_mayor_menor.setText("");
                lblIndicacion_suma_resta.setText("");
                lblResultado_suma_resta.setText("");
                lblResultado_mayor_menor.setText("Los números ingresados son iguales...");
                lblIndicacion_suma_resta.setText("No se realizará ninguna operación...");
            }
            else
            {
                lblResultado_mayor_menor.setText("");
                lblIndicacion_suma_resta.setText("");
                lblResultado_suma_resta.setText("");
                lblResultado_mayor_menor.setText("El mayor es el número 2: " + txt_Numero2);
                lblIndicacion_suma_resta.setText("Se sumarán el mayor más el menor):");
                float suma = txt_Numero2 + txt_Numero1;
                lblResultado_suma_resta.setText("La resta es: " + suma);
            }
        }
    }
}
