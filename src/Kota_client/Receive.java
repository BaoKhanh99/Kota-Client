/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kota_client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;
import javax.swing.JOptionPane;
import Kota_client.fr_Registration;
/**
 *
 * @author Administrator
 */
public class Receive extends Thread{
    Socket socket = null;
    ObjectInputStream din = null;
    Socket_Data sd;
    String[] data = new String[2];
    InputStream i ;
    fr_Registration frRegistration;
    
    public Receive(Socket sk) {
        socket = sk;
    }
    @Override
    public void run()  {
       
        try {
             i = socket.getInputStream();
            din = new ObjectInputStream(i);
            data = (String[]) din.readObject();
            System.out.println(data);
            switch(data[0]){
                case "login"             :  this.check_login();  break;
                case "reg"               : System.out.println("haha"); this.registration(data[1]);break;
                default                  : System.out.println("unknow action");
            }
        } 
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
            System.out.println("Mất kết nối");
            JOptionPane.showMessageDialog(null, "Mất kết nối máy chủ, Crương trình sẽ tự thoát");
            System.exit(0);
        }
    }
    public void registration(String s) {
        if(s.equalsIgnoreCase("true")){
            JOptionPane.showMessageDialog(null, "Đăng ký thành công");
            Kota_Client.fr_Reg.dispose();
            Kota_Client.fr_Signin.setVisible(true);
            System.out.println("thanh cong");
        }else{
            
            JOptionPane.showMessageDialog(null, "Tên người dùng đã tồn tại");
        }
    }

    public void check_login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
