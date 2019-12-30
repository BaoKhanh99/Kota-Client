/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kota_client;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Socket_Client {
    public void Socket_Client(Socket_Data data_Client) throws InterruptedException{
        try {
            Socket socket = new Socket("localhost",9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            //data_Client = new Socket_Data(User[0], User[1], Integer.parseInt(User[2]), User[3], User[4]);
            oos.writeObject(data_Client);
        } 
        catch (IOException ex) {
            Logger.getLogger(Socket_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
