package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import socketcliente.Conector;
import static spaceinvaders.GameFrame.Conect;
import spaceinvaders.GamePanel;
import static spaceinvaders.GamePanel.highScore;
import static spaceinvaders.GamePanel.level;
import static spaceinvaders.GamePanel.numberOfLives;
import static spaceinvaders.GamePanel.playerShip;
import static spaceinvaders.GamePanel.score;

/**
 *
 * @author LuisAndres
 */
public class KeyboardController implements KeyListener{
    private boolean[] keyStatus; 
   
   
        
        
        
        
    public KeyboardController(){
        keyStatus = new boolean[256]; 
      
            
        
    }
    
    public boolean getKeyStatus(int keyCode)
    {
        if(keyCode < 0 || keyCode > 255)
        {
            return false; 
        }
        else
        {
            return keyStatus[keyCode]; 
        }
    }
    
    public void resetController()
    {
        keyStatus = new boolean[256]; 
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
            
            String data= Integer.toString(playerShip.getXPosition())+"_"+score+"_"+highScore+"_"+level+"_"+numberOfLives;
            Conect.enviar(data);                
            keyStatus[ke.getKeyCode()] = true;            
            
            
           
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keyStatus[ke.getKeyCode()] = false; 
    }
    
}