package socketespectador;

import Controller.KeyboardController;
import java.net.*;
import java.io.*;
import spaceinvaders.GameFrame;

public class Espectador extends Thread   {
   
    public Espectador(String msg){
        super(msg);
    }
    public void run() {
        Espectador1 E = new Espectador1();
        E.empezar();
}
}