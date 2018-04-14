package spaceinvaders;

import java.awt.Color;
import javax.swing.JFrame;
import socketcliente.Conector;

/**
 *
 * @author LuisAndres
 */
public class GameFrame extends JFrame
{
    private GamePanel game;
    public static Conector Conect;
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
        this.Conect = new Conector();
        this.Conect.inicio();
        game.start();  
    }
    
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame().setVisible(true);
                
            }
        });
        
    }
}
