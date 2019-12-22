/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kota_client;

import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
/**
 *
 * @author PC
 */
public class Kota_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
       // new fr_Sign_In().setVisible(true);
        new fr_Chat().setVisible(true);
        
    }
    
    
}
