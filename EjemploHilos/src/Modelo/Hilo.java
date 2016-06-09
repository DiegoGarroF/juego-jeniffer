/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.FRM_Ventana;
import java.applet.AudioClip;

/**
 *
 * @author JoséFabián
 */
//los hilos tienen varios estados
public class Hilo extends Thread{

    FRM_Ventana ventana;
    public int contador=-1;
    AudioClip sonido;
    public Hilo(FRM_Ventana ventana)
    {
        this.ventana=ventana;
        
    }        
    
    
    public void run(){
    
       // sonido = java.applet.Applet.newAudioClip(getClass().getResource("../images/FT_zero.wav"));
        //sonido.loop(); //loop cuando termina, vuelve a empezar
        
        while(true)
        {
            try{
                
                sleep(50);
                
                ventana.moverVaca();//metodo que mueve el obstaculo ()
                comprobarPersonaje();
                ventana.comprobarColision();//(metodo que detecta cuando el personaje luigui choca con el panda)
                ventana.cambiarIcono(contador++);
            
                ventana.mover();
           
            }
            catch(Exception e){
                System.out.println("Hubo un error en el hilo de ejecución"+e);
            }
        }
    }
      
    public void comprobarPersonaje(){
    
        
        
    }
    
}
