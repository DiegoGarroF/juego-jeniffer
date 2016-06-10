/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    }

    @Override
    public void mouseMoved(MouseEvent e) {
     
    }

    
    
    // Eventos del teclado
    @Override
    public void keyTyped(KeyEvent e) {
   System.err.println(""+e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        System.err.println(""+e.getKeyCode());
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            fRM_Ventana.moverBarrilIzquierda();
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            fRM_Ventana.moverBarrilDerecha();
        }
        if(e.getKeyCode()==38)
        {
            fRM_Ventana.moverBarriArriba();
        }
        if(e.getKeyCode()==40)
        {
            fRM_Ventana.moverHaciaBajo();
        }
     
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

   
    
}
