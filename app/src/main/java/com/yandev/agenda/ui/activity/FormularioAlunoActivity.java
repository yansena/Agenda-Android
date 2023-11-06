package com.yandev.agenda.ui.activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.yandev.agenda.R;
import com.yandev.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle("Cadastrar novo aluno");
        EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);


        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();


                new Aluno(nome, telefone, email);
                Toast.makeText(FormularioAlunoActivity.this, alunoCriado.getNome() + " - "
                        + alunoCriado.getTelefone() + "-" + alunoCriado.getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
