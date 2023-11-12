package com.example.appandroidbiblioteca;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnEntrar = findViewById(R.id.buttonEnviar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exibirMensagem();
                abrirMenuActivity();

            }
        });


    }

    private void exibirMensagem() {
        Toast.makeText(this, "Entrada Bem-sucedida", Toast.LENGTH_SHORT).show();
    }

    private void abrirMenuActivity() {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void onBackButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish(); // Encerra a atividade atual para evitar a acumulação na pilha
    }
}
