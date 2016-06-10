/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Principal;
import com.sun.imageio.plugins.jpeg.JPEG;
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
public class ControladorVentana implements MouseMotionListener,ActionListener {

    private FRM_Principal fRM_Principal;
    public ControladorVentana(FRM_Principal fRM_Ventana) {
        this.fRM_Principal=fRM_Principal;
       
    }

   
    
  
    // eventos del  mouse
    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.err.println("hola ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        if(e.getActionCommand().endsWith("Nuevo"))
        {
          fRM_Principal.nuevoJuego();
        }
    }
    

    
    
    
}
