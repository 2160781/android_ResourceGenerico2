package com.example.android_resource;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;


public class DadosApp extends MainActivity{

    private List<Plano> listaPlanos;
    private int posicao;
    private int tarefa;


    // singleton
    public DadosApp()  {

        tarefa = getpositionTarefa();

        switch (tarefa){
            case 1:
                listaPlanos = new ArrayList<>();
                listaPlanos.add(new Plano());
                posicao = 1;
                break;
            case 2:

                break;


            default:
        }

    }


    public String getTextoPassoReceita() {

        return listaPlanos.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < listaPlanos.size())
            posicao++;

    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {
        listaPlanos.get(posicao - 1).marcarFeito();
    }


}
