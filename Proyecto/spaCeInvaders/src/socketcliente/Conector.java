package socketcliente;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
    Socket cliente;
    int puerto = 2500;
    String ip = "172.19.54.58";
    BufferedReader entrada,teclado;
    PrintStream salida;
    public void inicio(){
        try{
            cliente = new Socket(ip,puerto);          
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            teclado = new BufferedReader(new InputStreamReader(System.in));
        }catch(Exception e){} 
            
        }
    public void enviar(String dato){
        
        try {
            String tec = dato;
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(tec);
            String msg = entrada.readLine();
            System.out.println(msg);
        } catch (IOException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    
}