package jorgemedina.agendaobjetos;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registros extends AppCompatActivity {

    Button guardar;
    EditText textNombre;
    EditText textEmail;
    EditText textTwitter;
    EditText textTelefono;
    EditText textfecha;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_datos);

        guardar = (Button)findViewById(R.id.guarda_btn);
        textNombre = (EditText)findViewById(R.id.nombre_txt);
        textEmail = (EditText)findViewById(R.id.correo_txt);
        textTwitter = (EditText)findViewById(R.id.twitter_txt);
        textTelefono = (EditText)findViewById(R.id.telefono_txt);
        textfecha = (EditText)findViewById(R.id.fecha_txt);


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = textNombre.getText().toString();
                String mail = textEmail.getText().toString();
                String twit = textTwitter.getText().toString();
                String phone = textTelefono.getText().toString();
                String day = textfecha.getText().toString();

                if(name.matches("")){

                    Toast.makeText(getApplication(),"HAY CAMPOS VACIOS", Toast.LENGTH_SHORT).show();

                }else if (mail.matches("")){

                    Toast.makeText(getApplication(),"HAY CAMPOS VACIOS", Toast.LENGTH_SHORT).show();

                }else if (twit.matches("")){

                    Toast.makeText(getApplication(),"HAY CAMPOS VACIOS", Toast.LENGTH_SHORT).show();

                }else if (phone.matches("")){

                    Toast.makeText(getApplication(),"HAY CAMPOS VACIOS", Toast.LENGTH_SHORT).show();

                }else if (day.matches("")){

                    Toast.makeText(getApplication(),"HAY CAMPOS VACIOS", Toast.LENGTH_SHORT).show();

                }else {

                    ObjetoRegistro obj = new ObjetoRegistro(name, mail, twit, phone, day);


                    Intent i = new Intent();
                    i.putExtra("paramObject",obj);


                    setResult(RESULT_OK, i);

                    finish();

                }

            }

        });

    }

}