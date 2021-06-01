package com.compasso.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class carro {
    @Id
    @GeneratedValue
    private String chassi;
    private String modelo;
    private double ano;
    private double valor;
    private String nome;

    public carro(String chassi, String modelo, double ano, double valor, String nome) {
        super();
        this.chassi = chassi;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.nome = nome;
    }

    public carro() {
        super();

    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
