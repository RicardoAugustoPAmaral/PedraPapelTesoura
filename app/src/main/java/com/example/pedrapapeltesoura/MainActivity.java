package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada) {


        ImageView imagemResultado = findViewById(R.id.imgResultado);
        TextView textoResultado = findViewById(R.id.textResultado);


        int numero = new Random().nextInt(3);//0 1 2
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.hand_rock_solid_svgrepo_com);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.hand_svgrepo_com);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.hand_scissors_svgrepo_com);
                break;
        }
        if ((opcaoApp == "tesoura" &&  opcaoSelecionada=="papel")||
           (opcaoApp == "papel" &&  opcaoSelecionada=="pedra")||
           (opcaoApp == "pedra" &&  opcaoSelecionada=="tesoura")){

            textoResultado.setText("Você perdeu!");

        } else if ((opcaoSelecionada == "tesoura" &&  opcaoApp=="papel")||
                (opcaoSelecionada == "papel" &&  opcaoApp=="pedra")||
                (opcaoSelecionada == "pedra" &&  opcaoApp=="tesoura")) {

            textoResultado.setText("Você ganhou!");

        } else { textoResultado.setText("Empatamos!!");

        }
    }

}



