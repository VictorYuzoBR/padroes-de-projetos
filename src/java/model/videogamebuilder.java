/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class videogamebuilder {
    
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

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setTipomidia(String tipomidia) {
        this.tipomidia = tipomidia;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


    public videogame constroi(){
        
        return new videogame(id,nome,fabricante,tipo,garantia,valor,memoria, processador,tipomidia,ano);
        
    }
    
    
    
}
