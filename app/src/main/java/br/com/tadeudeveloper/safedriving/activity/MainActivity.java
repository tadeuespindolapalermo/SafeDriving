package br.com.tadeudeveloper.safedriving.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.tadeudeveloper.safedriving.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Esconde a ActionBar
        getSupportActionBar().hide();
    }

    public void abrirTelaLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void abrirTelaCadastro(View view) {
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
