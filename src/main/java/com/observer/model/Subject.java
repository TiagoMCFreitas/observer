/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.observer.model;

/**
 *
 * @author tiago
 */
public interface Subject {
     public void registerObserver(Observador o);
    public void removeObserver(Observador o);
    public void notifyObservers();
}
