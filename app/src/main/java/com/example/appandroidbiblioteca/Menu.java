package com.example.appandroidbiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnLibrary = findViewById(R.id.btnLibrary);
        Button btnBookSearch = findViewById(R.id.btnBookSearch);
        Button btnBookList = findViewById(R.id.btnBookList);
        Button btnCheckout = findViewById(R.id.btnCheckout);
        Button btnReviews = findViewById(R.id.btnReviews);
        Button btnUserProfile = findViewById(R.id.btnUserProfile);
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a activity da biblioteca
                Intent intent = new Intent(Menu.this, Library.class);
                startActivity(intent);
            }
        });

        btnBookSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a activity de busca de livros
                Intent intent = new Intent(Menu.this, BookSearch.class);
                startActivity(intent);
            }
        });

        btnBookList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a activity da lista de livros
                Intent intent = new Intent(Menu.this, BookList.class);
                startActivity(intent);
            }
        });

        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a activity de checkout
                Intent intent = new Intent(Menu.this, Checkout.class);
                startActivity(intent);
            }
        });

        btnReviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a activity de avaliações
                Intent intent = new Intent(Menu.this, Reviews.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}