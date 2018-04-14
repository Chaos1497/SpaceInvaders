package socketespectador;

import Controller.KeyboardController;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.net.*;
import java.io.*;
import spaceinvaders.GameFrame;
import spaceinvaders.GameObject;
import spaceinvaders.GamePanel;
import spaceinvaders.GamePanel;
import static spaceinvaders.GamePanel.playerShip;
public class Espectador1  extends GamePanel {
    
    String L,R,B;
    Socket cliente;
    int puerto = 2500;
    String ip = "172.19.54.58";
    BufferedReader entrada;
    //PrintStream salida;
   
    public void empezar() {
        int iniciar=0;
        
        try{
            cliente = new Socket(ip,puerto);          
            
            //teclado = new BufferedReader(new InputStreamReader(System.in));
            while(true){
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            String mensaje = entrada.readLine();
            String[] dato= mensaje.split("_");
            System.out.println("X"+dato[0]+"\n");            
            System.out.println("b"+dato[2]+"\n");   
            
            int x= Integer.valueOf(dato[0]);
            int b= Integer.valueOf(dato[1]);
            int h =Integer.valueOf(dato[2]);
            //int l=Integer.valueOf(dato[3]);
            //int n_l=Integer.valueOf(dato[4]);
            playerShip.setXPosition(x);
            
            score=b;
            highScore=h;
            //level=l;
            //numberOfLives=n_l;
          
            
            
            if(iniciar==0){
                iniciar=+1;
                new GameFrame().setVisible(true);
            }
           
            System.out.println(mensaje);            
            
            }          
        }catch(Exception e){} 
            
        }

  
}