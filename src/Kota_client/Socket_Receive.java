/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kota_client;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Socket_Receive implements Serializable{
    
    private String[] data;
    private String action;

    public Socket_Receive(String[] data) {
        this.data = data;
    }

    public Socket_Receive(String action) {
        this.action = action;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    

    
    public Socket_Receive(){
        super();
    }
}