package com.example.atividade3_exercicio1.Model;

import java.util.ArrayList;
import java.util.List;

public class AguaDiaria {
    private float peso;
    private float volumeCopo;
    private List<Copo> copos = new ArrayList<Copo>();

    public AguaDiaria(float peso, float volumeCopo) {
        this.peso = peso;
        this.volumeCopo = volumeCopo;
    }

    public List<Copo> getCopos() {
        return copos;
    }

    public float litrosBebidosAteAgora(){
        int count =0;
        for(Copo c: copos){
            if(c.isCheio()){
                count+=1;
            }
        }
        return (volumeCopo*count)/1000;
    }
}
