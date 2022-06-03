package br.com.othonbatista.listofproducts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pessoa> pessoasList = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Thiago", "25", R.drawable.a);
        Pessoa pessoa2 = new Pessoa("Paulo", "34", R.drawable.paulo);
        Pessoa pessoa3 = new Pessoa("Italo", "33", R.drawable.italo);

        pessoasList.add(pessoa1);
        pessoasList.add(pessoa2);
        pessoasList.add(pessoa3);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        PessoaAdapter adapter = new PessoaAdapter(pessoasList);
        rv.setAdapter(adapter);
    }
}