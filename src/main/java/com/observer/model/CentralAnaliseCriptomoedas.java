/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer.model;

import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class CentralAnaliseCriptomoedas implements Subject{
     private ArrayList observers;
    private Criptomoedas dados;
    
    public CentralAnaliseCriptomoedas(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observador o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observador o) {
        int i = observers.indexOf(o);   
        if (i >= 0) {
            observers.remove(i);
        }
    }
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observador observer = (Observador)observers.get(i);
            observer.atualizar(dados);
        }
    }
    public void setDados(Criptomoedas dados){
        this.dados = dados;
        notifyObservers();
    }    
}
