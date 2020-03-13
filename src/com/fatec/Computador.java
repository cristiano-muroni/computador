package com.fatec;

public class Computador {
    String marca;
    String cor;
    String modelo;
    long numeroSerie;
    double preco;


}

public void imprimir(){
    System.out.println("marca = " + marca);
    System.out.println("modelo = " + modelo);
    System.out.println("cor = " + cor);
    System.out.println("numeroSerie = " + numeroSerie);


}

public void calcularValor(){
    if ( marca.equalsIgnoreCase("hp")){
        preco*=1.3;
        return;
    }
    if ( marca.equalsIgnoreCase("IBM")){
        preco*=1.5;
        return;
    }

}
public int alterarValor( int valor){
    if( valor == 0){
        preco = valor;
        return 1;
    }
    return 0;

}

