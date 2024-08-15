package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC Gamer
 */
public class videogame {
    
    private int id;  
    private String nome;
    private String fabricante;
    private String tipo;
    private String garantia;
    private double valor;
    private int memoria;
    private String processador;
    private String tipomidia;
    private String ano;

    public videogame(String nome, String fabricante, String tipo, String garantia, double valor, int memoria, String processador, String tipomidia, String ano) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.garantia = garantia;
        this.valor = valor;
        this.memoria = memoria;
        this.processador = processador;
        this.tipomidia = tipomidia;
        this.ano = ano;
    }

    public videogame(int id, String nome, String fabricante, String tipo, String garantia, double valor, int memoria, String processador, String tipomidia, String ano) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.garantia = garantia;
        this.valor = valor;
        this.memoria = memoria;
        this.processador = processador;
        this.tipomidia = tipomidia;
        this.ano = ano;
    }
    
    

    public videogame() {
    }

    public videogame(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }


    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getTipomidia() {
        return tipomidia;
    }

    public void setTipomidia(String tipomidia) {
        this.tipomidia = tipomidia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
 
    
}
