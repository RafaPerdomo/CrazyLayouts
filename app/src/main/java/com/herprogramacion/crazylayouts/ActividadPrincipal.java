package com.herprogramacion.crazylayouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActividadPrincipal extends AppCompatActivity {

private TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,punto,igual,por,menos,suma,resta,vista;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    n1=(Button) findViewById(R.id.numero_1);
    n2=(TextView) findViewById(R.id.numero_2);
    n3=(TextView) findViewById(R.id.numero_3);
    n4=(TextView) findViewById(R.id.numero_4);
    n5=(TextView) findViewById(R.id.numero_5);
    n6=(TextView) findViewById(R.id.numero_6);
    n7=(TextView) findViewById(R.id.numero_7);
    n8=(TextView) findViewById(R.id.numero_8);
    n9=(TextView) findViewById(R.id.numero_9);
    suma=(TextView) findViewById(R.id.signo_mas);
    vista=(TextView) findViewById(R.id.Pantalla);
    final int[] Pnumero = {0};

    n1.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            String text = n1.getText().toString();
            vista.append(text);
        }
    });
    n2.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            String text = n2.getText().toString();
            vista.append(text);
        }
    });
   suma.setOnClickListener(new OnClickListener() {
       @Override
       public void onClick(View v) {
           if(Pnumero[0] == 0 )
           {
               Pnumero[0] =  Integer.parseInt(vista.getText().toString());
               vista.setText("");

           }
           else
           {      int text = (Pnumero[0]+Integer.parseInt(vista.getText().toString()));
               vista.setText(Integer.toString(text));
                Pnumero[0]=0;
           }
       }
   });
    }


}
