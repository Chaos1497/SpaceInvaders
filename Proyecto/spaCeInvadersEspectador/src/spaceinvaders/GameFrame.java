package spaceinvaders;

import java.awt.Color;
import javax.swing.JFrame;
import socketespectador.Espectador;

/**
 *
 * @author LuisAndres
 */
public class GameFrame extends JFrame
{
    private GamePanel game;
    
    public GameFrame()
    {
        // Add text to title bar 
        super("Space Invaders");
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        game = new GamePanel();
        game.setDoubleBuffered(true);
        
        this.getContentPane().add(game); 
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        // Start the game
        game.start();  
    }
    
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Thread hilo= new Espectador("Espectador");
                hilo.start();
             
            }
        });
        
    }
}
