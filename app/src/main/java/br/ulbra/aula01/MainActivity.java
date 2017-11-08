package br.ulbra.aula01;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView texto1;
    EditText editText;
    Button  btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("AULA01", "ON CREATE");
        texto1 =(TextView) findViewById(R.id.textView);
        editText =(EditText) findViewById(R.id.editText);
        btn1 =(Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto1.setText(editText.getText().toString().toUpperCase());
                Toast.makeText(MainActivity.this,"O BOTÃO FOI CLICADO",Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("AULA01", "PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("AULA01", "STOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("AULA01", "RESTART");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("AULA01", "START");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("AULA01", "DESTROY");

    }
}
