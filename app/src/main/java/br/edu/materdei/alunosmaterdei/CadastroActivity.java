package br.edu.materdei.alunosmaterdei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

    Button btnSalvar;
    EditText editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        editTextNome = (EditText) findViewById(R.id.editTextNome);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ação de salvar
                MainActivity.lsAlunos.add( editTextNome.getText().toString() );

                // saia da activity
                finish();
            }
        });
    }

}
