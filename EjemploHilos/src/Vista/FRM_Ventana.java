/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorVentana;
import Modelo.Hilo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
    private int  numAleatorio1,numAleatorio2, contador;

    private ArrayList<Integer> listaPosiciones;
    
    public FRM_Ventana() {

        initComponents();
       
        
        
        
          hilo= new Hilo(this);
            hilo.start();
        listaElementos = new ArrayList<>();
        listaPosiciones = new ArrayList<>();
      
        setLocationRelativeTo(null);
        iconoUno = new ImageIcon(getClass().getResource("../images/Lilo-y-Stich-01.gif"));//instancias
        iconoDos = new ImageIcon(getClass().getResource("../images/panda.gif"));//instancias
        i = 1;
        controladorVentana = new ControladorVentana(this);
        this.addKeyListener(controladorVentana);
        this.addMouseMotionListener(controladorVentana);
       // jMSalir.addActionListener(controladorVentana);
       // jMNuevo.addActionListener(controladorVentana);
        llenarListaElementos();
        estadoInicialJlabel();
        contador = 0; 
      
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLfruta1 = new javax.swing.JLabel();
        jLfruta2 = new javax.swing.JLabel();
        jLObtaculo = new javax.swing.JLabel();
        jLTiempo = new javax.swing.JLabel();
        jLImagenTiempo = new javax.swing.JLabel();
        jLPuntos = new javax.swing.JLabel();
        jTxtPuntos = new javax.swing.JTextField();
        jlBarril = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMNuevo = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLfruta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panda.gif"))); // NOI18N
        getContentPane().add(jLfruta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLfruta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panda.gif"))); // NOI18N
        getContentPane().add(jLfruta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 50, 40));

        jLObtaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rocka.png"))); // NOI18N
        getContentPane().add(jLObtaculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 60, 50));

        jLTiempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLTiempo.setForeground(new java.awt.Color(255, 51, 51));
        jLTiempo.setText("Tiempo");
        getContentPane().add(jLTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jLImagenTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        jLImagenTiempo.setText("jLabel3");
        getContentPane().add(jLImagenTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 40, -1));

        jLPuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLPuntos.setForeground(new java.awt.Color(255, 0, 0));
        jLPuntos.setText("Puntos");
        getContentPane().add(jLPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        jTxtPuntos.setEditable(false);
        jTxtPuntos.setBackground(new java.awt.Color(0, 204, 153));
        jTxtPuntos.setText("0.0");
        getContentPane().add(jTxtPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 30, -1));

        jlBarril.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlBarril.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carretillo2.png"))); // NOI18N
        jlBarril.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jlBarrilKeyPressed(evt);
            }
        });
        getContentPane().add(jlBarril, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 50));
        jlBarril.getAccessibleContext().setAccessibleName("recolector");

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noche2.png"))); // NOI18N
        jl_Fondo.setText("acfs");
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        jMenu1.setText("Juego ");

        jMNuevo.setText("Nuevo");
        jMenu1.add(jMNuevo);

        jMSalir.setText("Salir");
        jMenu1.add(jMSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Control");

        jMenuItem2.setText("Mejor Puntuacion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Peor Puntuacion");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
System.err.println("Hola Mundo");
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
           moverBarrilIzquierda();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
           moverBarrilDerecha();
        }
        if(evt.getKeyCode()==38)
        {
            moverBarriArriba();
        }
        if(evt.getKeyCode()==40)
        {
           moverHaciaBajo();
        }
    }//GEN-LAST:event_formKeyPressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jlBarrilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlBarrilKeyPressed
        // TODO add your handling code here:
        System.err.println("Hola Mundo");
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
           moverBarrilIzquierda();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
           moverBarrilDerecha();
        }
        if(evt.getKeyCode()==38)
        {
            moverBarriArriba();
        }
        if(evt.getKeyCode()==40)
        {
           moverHaciaBajo();
        }
    }//GEN-LAST:event_jlBarrilKeyPressed

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
    private javax.swing.JLabel jLImagenTiempo;
    private javax.swing.JLabel jLObtaculo;
    private javax.swing.JLabel jLPuntos;
    private javax.swing.JLabel jLTiempo;
    private javax.swing.JLabel jLfruta1;
    private javax.swing.JLabel jLfruta2;
    private javax.swing.JMenuItem jMNuevo;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTxtPuntos;
    private javax.swing.JLabel jlBarril;
    private javax.swing.JLabel jl_Fondo;
    // End of variables declaration//GEN-END:variables

     public void llenarListaElementos() {
        //Escrementos
        listaElementos.add(0,jLfruta1);
        listaElementos.add(1, jLfruta2);       
    }
    
    public void estadoInicialJlabel() {    
        jLfruta2.setVisible(false);
        jLfruta1.setVisible(false);
    }

    public void moverBarrilDerecha() {
        
      if((jlBarril.getX()>240&&jlBarril.getX()<330)&&jlBarril.getY()>313)
      {
          jLObtaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Erase.png"))); 
      }
      else
      {
           jLObtaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rocka.png"))); 
            if (jlBarril.getLocation().getX() < 580) 
            {
                jlBarril.setLocation(jlBarril.getX() + 20, jlBarril.getY());
                jlBarril.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carretillo2.png"))); 
             }
      }    
    }

    public void moverBarrilIzquierda() 
    {
        if((jlBarril.getX()<362&&jlBarril.getX()>300)&&jlBarril.getY()>313)
      {
         jLObtaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Erase.png"))); 
      }
        else
        {
             jLObtaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rocka.png"))); 
            if (jlBarril.getLocation().getX() > 10) 
            {
                jlBarril.setLocation(jlBarril.getX() -20, jlBarril.getY());
                jlBarril.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carretillo2Volteadoo.png"))); 
            } 
        }
    }
      public void moverBarriArriba() {
        if (jlBarril.getLocation().getY() > 250) 
        {
            jlBarril.setLocation(jlBarril.getX(), jlBarril.getY()-20);
        }
      }
      
      
    public void moverHaciaBajo()
    {   
        if(jlBarril.getX()>303&&jlBarril.getX()<360 && jlBarril.getY()>360)
            {
                    jLObtaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Erase.png"))); 
            }
            else
            {
                jLObtaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rocka.png"))); 
                if (jlBarril.getLocation().getY() < 340) 
                {
                    jlBarril.setLocation(jlBarril.getX(), jlBarril.getY()+20);
                }  
            }
    }
    
    public int generarAletorio1()
    {
        return (int) (numAleatorios.nextDouble() *630 + 10);
       
    }
    public int generarAleatorio2()
    {
        return (int) (numAleatorios.nextDouble() *630 + 10);
    }
    
    
   public void mover ()
   {
       listaElementos.get(0).setVisible(true);
       listaElementos.get(1).setVisible(true);

       listaElementos.get(0).setLocation(listaElementos.get(0).getX(), listaElementos.get(0).getY()+6);
       listaElementos.get(1).setLocation(listaElementos.get(1).getX(), listaElementos.get(1).getY()+4);
       if(listaElementos.get(0).getY()>450)
       {
          listaElementos.get(0).setLocation(generarAletorio1(), 50);
       }
        if(listaElementos.get(1).getY()>450)
       {
          listaElementos.get(1).setLocation(generarAleatorio2(), 50);
       }            
   }
   
   public void cambiarNumero(int numero)
   {
       jLImagenTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+numero+".png"))); 
   }
   
   public void nuevoJuego()
   {
       if(hilo==null)
       {
            
       }
       else
       {          
           hilo.stop();
           hilo= new Hilo(this);
           hilo.start();
       }
      
   }
   
   public void exito()
   {
       if(listaElementos.get(0).getY()==jlBarril.getY()&&listaElementos.get(0).getX()==jlBarril.getX())
       {
           JOptionPane.showMessageDialog(null, "Atrapado");
       }
   }   


}