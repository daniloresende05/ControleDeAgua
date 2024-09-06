package com.example.atividade3_exercicio1.Model;

import java.util.ArrayList;
import java.util.List;

public class AguaDiaria {
    private int peso;
    private int volumeCopo;
    private List<Copo> copos;

    public AguaDiaria(int peso, int volumeCopo) {
        this.peso = peso;
        this.volumeCopo = volumeCopo;
        this.copos = new ArrayList<>();
        int quantidadeCopos = (int) Math.ceil(peso * 35.0 / volumeCopo);
        for (int i = 0; i < quantidadeCopos; i++) {
            copos.add(new Copo(volumeCopo));
        }
    }

    public List<Copo> getCopos() {
        return copos;
    }

    public int getPeso() {
        return peso;
    }

    public float getVolumeTotal() {
        return peso * 35.0f;
    }

    public float getQuantidadeBebida() {
        float total = 0;
        for (Copo c : copos) {
            if (c.isCheio()) {
                total += c.getVolume();
            }
        }
        return total;
    }

    public void voltarCopo() {
        for (Copo copo : copos) {
            copo.desbeber();
        }
    }
}
