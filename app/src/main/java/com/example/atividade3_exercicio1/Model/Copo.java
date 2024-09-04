package com.example.atividade3_exercicio1.Model;

public class Copo {
    private float volume;
    private boolean cheio = true;

    public Copo(float volume) {
        this.volume = volume;
    }

    public Copo() {
    }

    public float getVolume() {
        return volume;
    }
    public boolean isCheio() {
        return cheio;
    }

    public void beber(){
        this.cheio = false;
    }

    public void desbeber(){
        this.cheio = true;
    }
}
