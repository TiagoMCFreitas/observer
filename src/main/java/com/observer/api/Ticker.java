/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer.api;

import com.google.gson.Gson;
import com.observer.model.Bitcoin;
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
public class Ticker {
    private Criptos ticker;

    public Criptos getTicker() {
        return ticker;
    }

    public void setTicker(Criptos ticker) {
        this.ticker = ticker;
    }
    
    public Ticker BuscarCriptos(String moeda) throws IOException{
        String url = "https://www.mercadobitcoin.net/api/"+ moeda +"/ticker/";
            HttpGet request = new HttpGet(url);
            Ticker end = null;
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();
			if (entity != null) {
                            try {
                                String result = EntityUtils.toString(entity);
                                
                                
                                Gson gson = new Gson();
                                end = gson.fromJson(result, Ticker.class);
                            } catch (IOException ex) {
                                Logger.getLogger(Bitcoin.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ParseException ex) {
                                Logger.getLogger(Bitcoin.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
                        
		}
         
        return end;
    }
    
}
