/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer.model;

import com.observer.api.Ticker;

/**
 *
 * @author tiago
 */
public class Criptomoedas {
   private String bitcoin;
   private String tether;
   private String ethereum;

    public Criptomoedas(String precoBitcoin, String precoTether, String precoEthereum) {
        this.bitcoin = precoBitcoin;
        this.tether = precoTether;
        this.ethereum = precoEthereum;
    }

   
    public String getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(String bitcoin) {
        this.bitcoin = bitcoin;
    }

    public String getTether() {
        return tether;
    }

    public void setTether(String tether) {
        this.tether = tether;
    }

    public String getEthereum() {
        return ethereum;
    }

    public void setEthereum(String ethereum) {
        this.ethereum = ethereum;
    }
    
    
}
