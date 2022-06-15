package com.example.triviasladder.model;

import javafx.scene.control.Tab;

public class Tablero {

    public String casillaInicio,casillaFin;
    public int casillaNumero;

    public Tablero(String casillaInicio,String casillaFin,int casillaNumero){
        this.casillaInicio = casillaInicio;
        this.casillaFin = casillaFin;
        this.casillaNumero = casillaNumero;
    }
}
