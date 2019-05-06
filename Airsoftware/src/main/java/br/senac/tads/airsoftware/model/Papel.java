package br.senac.tads.airsoftware.model;

import java.io.Serializable;

/**
 *
 * @author victor
 */
public class Papel implements Serializable {

    private String nome;

    public Papel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
