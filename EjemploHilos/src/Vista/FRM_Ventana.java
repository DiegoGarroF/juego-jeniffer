/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorVentana;
import Modelo.Hilo;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class FRM_Ventana extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Ventana
     */
    //public int tiempo1=5;
    //public int tiempo2=100;
    Hilo hilo;
    private String estado = "EnElSuelo";
    Icon iconoUno, iconoDos;//iconos que se usaran para mostrar el tiempo(por el momento solo cambia imagenes)
    private int i;
    private ControladorVentana controladorVentana;
    private ArrayList<JLabel> listaElementos;
    private Random coordenadasAleatorias = new Random();// lanzara coordenadas aleatoreamente
    private Random numAleatorios = new Random(); //numeros aleatorios que se le asignaran a el objeto popo y leche
    private int  numAleatObjeto, contador;

    private ArrayList<Integer> listaPosiciones;

    public FRM_Ventana() {

        initComponents();
        listaElementos = new ArrayList<>();
        listaPosiciones = new ArrayList<>();
        hilo = new Hilo(this);
        hilo.start();
        setLocationRelativeTo(null);
        iconoUno = new ImageIcon(getClass().getResource("../images/Lilo-y-Stich-01.gif"));//instancias
        iconoDos = new ImageIcon(getClass().getResource("../images/panda.gif"));//instancias
        i = 1;
        controladorVentana = new ControladorVentana(this);
        this.addKeyListener(controladorVentana);
        llenarListaElementos();
        estadoInicialJlabel();
        contador = 0; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlBarril = new javax.swing.JLabel();
        jL_Popo2 = new javax.swing.JLabel();
        jLfruta3 = new javax.swing.JLabel();
        jLfruta1 = new javax.swing.JLabel();
        jLfruta2 = new javax.swing.JLabel();
        jL_Popo6 = new javax.swing.JLabel();
        jlEspacio = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlBarril.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recycle_bin_empty_128.png"))); // NOI18N
        getContentPane().add(jlBarril, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, -1));
        jlBarril.getAccessibleContext().setAccessibleName("recolector");

        jL_Popo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poo.png"))); // NOI18N
        getContentPane().add(jL_Popo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLfruta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panda.gif"))); // NOI18N
        getContentPane().add(jLfruta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLfruta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panda.gif"))); // NOI18N
        getContentPane().add(jLfruta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLfruta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panda.gif"))); // NOI18N
        getContentPane().add(jLfruta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 50, 40));

        jL_Popo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poo.png"))); // NOI18N
        getContentPane().add(jL_Popo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, 40));

        jlEspacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Del-espacio-y-el-tiempo-III (1).jpg"))); // NOI18N
        getContentPane().add(jlEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 70));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoCesped.jpg"))); // NOI18N
        jl_Fondo.setText("acfs");
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_Popo2;
    private javax.swing.JLabel jL_Popo6;
    private javax.swing.JLabel jLfruta1;
    private javax.swing.JLabel jLfruta2;
    private javax.swing.JLabel jLfruta3;
    private javax.swing.JLabel jlBarril;
    private javax.swing.JLabel jlEspacio;
    private javax.swing.JLabel jl_Fondo;
    // End of variables declaration//GEN-END:variables

     public void llenarListaElementos() {
        //Escrementos
      
        listaElementos.add(0,jLfruta1);
        listaElementos.add(1, jLfruta2);
        listaElementos.add(2, jLfruta3);
        listaElementos.add(3, jL_Popo2);
        listaElementos.add(4, jL_Popo6);
         
    }
    
    public void estadoInicialJlabel() {    
        jL_Popo2.setVisible(false);
        jLfruta2.setVisible(false);
    }

    public void moverBarrilDerecha() {
        if (jlBarril.getLocation().getX() < 550) {
            jlBarril.setLocation(jlBarril.getX() + 10, jlBarril.getY());
        }
    }

    public void moverBarrilIzquierda() {
        if (jlBarril.getLocation().getX() > -5) {
            jlBarril.setLocation(jlBarril.getX() - 10, jlBarril.getY());
        }
    }
    ///
    public void generarObjetoAleatorio() {
        // Pregunta que si el numero generado aleatoriamnte se encuentra repetido
        do {
            numAleatObjeto = (int) (numAleatorios.nextDouble() * 5+ 0);
        } while (verificarExistencia(numAleatObjeto) && (listaPosiciones.size() != 5));

        if (!verificarExistencia(numAleatObjeto)) {
            listaPosiciones.add(numAleatObjeto);
        }
    }
    public boolean verificarExistencia(int numero) {
        for (int i = 0; i < listaPosiciones.size(); i++) {
            if (listaPosiciones.get(i) == numero) {
                return true;
            }
        }
        return false;
    }
// Metodo se encarga de enviar ya sean leches o escrementos 

   public void mover ()
   {
       listaElementos.get(0).setVisible(true);
       listaElementos.get(1).setVisible(true);

       listaElementos.get(0).setLocation(listaElementos.get(0).getX(), listaElementos.get(0).getY()+10);
       listaElementos.get(1).setLocation(listaElementos.get(1).getX(), listaElementos.get(1).getY()+5);
       if(listaElementos.get(0).getY()>450)
       {
          listaElementos.get(0).setLocation(listaElementos.get(0).getX(), 50);
       }
        if(listaElementos.get(1).getY()>450)
       {
          listaElementos.get(1).setLocation(listaElementos.get(1).getX(), 50);
       }            
   }
  public void generar()
  {
      generarObjetoAleatorio();
    
        if((listaPosiciones.size()>4)&&(listaElementos.get(listaPosiciones.get(4)).getY()>390 ))
      {
          listaPosiciones= new ArrayList<>();
          System.err.println("tamano "+listaPosiciones.size());
          listaPosiciones.clear();
          JOptionPane.showMessageDialog(null, "Paso la linea");
      }
        
     if(listaPosiciones.size()==1)
     {
         listaElementos.get(listaPosiciones.get(0)).setVisible(true);
          listaElementos.get(listaPosiciones.get(0)).setLocation(30, listaElementos.get(listaPosiciones.get(0)).getY()+6);
     }
     if(listaPosiciones.size()==2)
     {
         listaElementos.get(listaPosiciones.get(1)).setVisible(true);
         listaElementos.get(listaPosiciones.get(0)).setLocation(30, listaElementos.get(listaPosiciones.get(0)).getY()+6);   
         listaElementos.get(listaPosiciones.get(1)).setLocation(130, listaElementos.get(listaPosiciones.get(1)).getY()+6);
     }
     if(listaPosiciones.size()>3)
     {
         listaElementos.get(listaPosiciones.get(2)).setVisible(true);
         
         listaElementos.get(listaPosiciones.get(0)).setLocation(30, listaElementos.get(listaPosiciones.get(0)).getY()+6);    
         listaElementos.get(listaPosiciones.get(1)).setLocation(130, listaElementos.get(listaPosiciones.get(1)).getY()+6);
         listaElementos.get(listaPosiciones.get(2)).setLocation(300, listaElementos.get(listaPosiciones.get(2)).getY()+6);
     }
      if(listaPosiciones.size()==4)
     {
         listaElementos.get(listaPosiciones.get(3)).setVisible(true);
         
         listaElementos.get(listaPosiciones.get(0)).setLocation(30, listaElementos.get(listaPosiciones.get(0)).getY()+6);    
         listaElementos.get(listaPosiciones.get(1)).setLocation(130, listaElementos.get(listaPosiciones.get(1)).getY()+6);
         listaElementos.get(listaPosiciones.get(2)).setLocation(300, listaElementos.get(listaPosiciones.get(2)).getY()+6);
         listaElementos.get(listaPosiciones.get(3)).setLocation(400, listaElementos.get(listaPosiciones.get(3)).getY()+6);
     }
       if(listaPosiciones.size()>4)
     {
         listaElementos.get(listaPosiciones.get(4)).setVisible(true);
         
         listaElementos.get(listaPosiciones.get(0)).setLocation(30, listaElementos.get(listaPosiciones.get(0)).getY()+6);    
         listaElementos.get(listaPosiciones.get(1)).setLocation(130, listaElementos.get(listaPosiciones.get(1)).getY()+6);
         listaElementos.get(listaPosiciones.get(2)).setLocation(300, listaElementos.get(listaPosiciones.get(2)).getY()+6);
         listaElementos.get(listaPosiciones.get(3)).setLocation(400, listaElementos.get(listaPosiciones.get(3)).getY()+6);
         listaElementos.get(listaPosiciones.get(4)).setLocation(550, listaElementos.get(listaPosiciones.get(4)).getY()+6);
         System.err.println("---> y  del ultimo "+listaElementos.get(listaPosiciones.get(4)).getY());
     }
    
            
     
  }

}
