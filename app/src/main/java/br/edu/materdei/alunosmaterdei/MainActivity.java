package br.edu.materdei.alunosmaterdei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<String> lsAlunos = new ArrayList<>();

    Button btnNovo;
    ListView listAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsAlunos.add("Cesar");

        btnNovo = (Button) findViewById(R.id.btnNovo);
        listAlunos = (ListView) findViewById(R.id.listAlunos);

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent
                                (MainActivity.this, CadastroActivity.class);

                startActivity( intent );
            }
        });
    }


    @Override
    protected void onResume() {
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_list_item_1,
                        lsAlunos
                );
        listAlunos.setAdapter(adapter);
        super.onResume();
    }


}
