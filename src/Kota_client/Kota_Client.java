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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Kota_Client {

    public static Socket sk = null;
    public static String ip_server = "localhost";
    public static int socket_port = 9999;
    public static boolean connected = false;
    public static fr_Registration fr_Reg = new fr_Registration();
    public static fr_Sign_In fr_Signin = new fr_Sign_In();
    public static fr_Chat fr_Chat = new fr_Chat();
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        fr_Signin.setVisible(true);
        //new fr_Chat().setVisible(true);
        Kota_Client.init();
        
    }
    public static void init(){
        
        try {
            sk = new Socket(ip_server,socket_port);
            Thread Receive = new Receive(sk);
            Receive.start();
            connected = true;
            System.out.println("conected");
        } catch (IOException ex) {
            Logger.getLogger(fr_Sign_In.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "socket error");
        }
        
    }
    
    
}
