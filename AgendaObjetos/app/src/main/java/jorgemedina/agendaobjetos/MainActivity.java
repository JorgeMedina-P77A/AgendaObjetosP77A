package jorgemedina.agendaobjetos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button nuevoC;
    ListView lista;

    ArrayList<ObjetoRegistro> datosLista = new ArrayList <ObjetoRegistro> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nuevoC = (Button) findViewById(R.id.agregar_btn);

        nuevoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplication(),"Nuevo Contacto", Toast.LENGTH_SHORT).show();

                Intent miIntent = new Intent(getApplicationContext(), Registros.class);

                startActivityForResult(miIntent, 1000);


            }

        });

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        lista = (ListView) findViewById(R.id.lista_contactos);


        if(requestCode==1000 && resultCode==RESULT_OK){

            datosLista.add((ObjetoRegistro) data.getSerializableExtra("paramObject"));

            String[] datosArreglo = new String[datosLista.size()];
            for (int i=0; i<datosLista.size(); i++){

                datosArreglo[i] = datosLista.get(i).getName()+"\n"+datosLista.get(i).getMail();

            }

            ArrayAdapter<String>adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datosArreglo);

            lista.setAdapter(adp);

        }

    }

}