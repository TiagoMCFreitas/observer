/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer.model;

import com.google.gson.Gson;
import com.observer.api.Ticker;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author tiago
 */
public class Ethereum  implements Observador{
   private Criptomoedas criptos;
    private Subject centralAnalise;
    
    public Ethereum (Subject centralAnalise){
        this.centralAnalise = centralAnalise;
        this.centralAnalise.registerObserver(this);
      
    }
   
     public String mostrar(){
        String saida = "";
        saida += "Alta Bitcoin: " + criptos.getBitcoin() + "\n";
        
        saida += "Alta Ethereum: " + criptos.getEthereum() + "\n";
       
        saida += "Alta Tether: " + criptos.getTether() + "\n";
        
        return saida;
        
    }
    @Override
    public void atualizar(Criptomoedas dados){
        this.criptos = dados;
        System.out.println(mostrar());
    }

  
    
    
}
