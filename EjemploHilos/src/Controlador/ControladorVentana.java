/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Ventana;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Jeniffer
 */
public class ControladorVentana implements MouseMotionListener, KeyListener{

    private FRM_Ventana fRM_Ventana;
    public ControladorVentana(FRM_Ventana fRM_Ventana) {
        this.fRM_Ventana=fRM_Ventana;
    }

    
    
    // eventos del  mouse
    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
    }

    
    
    // Eventos del teclado
    @Override
    public void keyTyped(KeyEvent e) {
   
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            fRM_Ventana.moverBarrilIzquierda();
        }
         if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            fRM_Ventana.moverBarrilDerecha();
        }
     
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
