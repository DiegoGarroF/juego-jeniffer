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
        jlVaca.setLocation(660, jlVaca.getY());
        continuarLanzamientoObjetos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlVaca = new javax.swing.JLabel();
        jlBarril = new javax.swing.JLabel();
        jL_Leche1 = new javax.swing.JLabel();
        jL_Popo2 = new javax.swing.JLabel();
        jL_Popo3 = new javax.swing.JLabel();
        jL_Popo4 = new javax.swing.JLabel();
        jL_Popo5 = new javax.swing.JLabel();
        jl_Popo6 = new javax.swing.JLabel();
        jL_Leche7 = new javax.swing.JLabel();
        jL_Leche8 = new javax.swing.JLabel();
        jL_Leche9 = new javax.swing.JLabel();
        jL_Leche10 = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlVaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/686_-_Cow-128.png"))); // NOI18N
        getContentPane().add(jlVaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 120, 70));

        jlBarril.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recycle_bin_empty_128.png"))); // NOI18N
        getContentPane().add(jlBarril, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, -1));
        jlBarril.getAccessibleContext().setAccessibleName("recolector");

        jL_Leche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lechita.png"))); // NOI18N
        getContentPane().add(jL_Leche1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 60));

        jL_Popo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poo.png"))); // NOI18N
        getContentPane().add(jL_Popo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jL_Popo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poo.png"))); // NOI18N
        getContentPane().add(jL_Popo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jL_Popo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poo.png"))); // NOI18N
        getContentPane().add(jL_Popo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jL_Popo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poo.png"))); // NOI18N
        getContentPane().add(jL_Popo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jl_Popo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poo.png"))); // NOI18N
        getContentPane().add(jl_Popo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jL_Leche7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lechita.png"))); // NOI18N
        getContentPane().add(jL_Leche7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jL_Leche8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lechita.png"))); // NOI18N
        getContentPane().add(jL_Leche8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jL_Leche9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lechita.png"))); // NOI18N
        getContentPane().add(jL_Leche9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jL_Leche10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lechita.png"))); // NOI18N
        getContentPane().add(jL_Leche10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoCesped.jpg"))); // NOI18N
        jl_Fondo.setText("acfs");
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    public void moverVaca() {
        jlVaca.setLocation(jlVaca.getX() - 10, jlVaca.getY());

        if (jlVaca.getLocation().getX() < -100) {
            jlVaca.setLocation(660, jlVaca.getY());
        }

    }

    public void llenarListaElementos() {
        //Escrementos
        listaElementos.add(0, jL_Popo2);
        listaElementos.add(1, jL_Popo3);
        listaElementos.add(2, jL_Popo4);
        listaElementos.add(3, jL_Popo5);
        listaElementos.add(4, jl_Popo6);

        //Leches
        listaElementos.add(5, jL_Leche1);
        listaElementos.add(6, jL_Leche7);
        listaElementos.add(7, jL_Leche8);
        listaElementos.add(8, jL_Leche9);
        listaElementos.add(9, jL_Leche10);
    }

////    definira si lo que sale es una popo o una leche
//    public JLabel objetoSalida() {
//        
//        return ;
//
//    }
// Mueve ya se un escremento o un a leche 
    public void moverElemento(int num) throws InterruptedException {

        if (listaElementos.get(num).getLocation().getY() < 450)
        {
            listaElementos.get(num).setVisible(true);
            if (contador == 0) 
            {
                listaElementos.get(num).setLocation(jlVaca.getX() + 100, listaElementos.get(num).getY());
                contador++;
            } 
            else 
            {
                listaElementos.get(num).setLocation(listaElementos.get(num).getX(), listaElementos.get(num).getY() + 5);
            }
        }
        else
        {
                 listaElementos.get(num).setVisible(false);
        }
    }

    public void estadoInicialJlabel() {
        jL_Leche1.setVisible(false);
        jL_Leche7.setVisible(false);
        jL_Leche8.setVisible(false);
        jL_Leche9.setVisible(false);
        jL_Leche10.setVisible(false);
        jL_Popo2.setVisible(false);
        jL_Popo3.setVisible(false);
        jL_Popo4.setVisible(false);
        jL_Popo5.setVisible(false);
        jl_Popo6.setVisible(false);
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

    //metodoque cambia los iconos para mostrar luego el tiempo de juego o la puntuacion
    public void cambiarIcono(int contador) {

    }

    public void comprobarColision()//metodo que comprueba cuando el personaje choca con el obstaculo()
    {
    }

    public void llenarArray() {

    }

    public void generarElementos() {

    }

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
    private javax.swing.JLabel jL_Leche1;
    private javax.swing.JLabel jL_Leche10;
    private javax.swing.JLabel jL_Leche7;
    private javax.swing.JLabel jL_Leche8;
    private javax.swing.JLabel jL_Leche9;
    private javax.swing.JLabel jL_Popo2;
    private javax.swing.JLabel jL_Popo3;
    private javax.swing.JLabel jL_Popo4;
    private javax.swing.JLabel jL_Popo5;
    private javax.swing.JLabel jlBarril;
    private javax.swing.JLabel jlVaca;
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_Popo6;
    // End of variables declaration//GEN-END:variables

    public void generarObjetoAleatorio() {
        // Pregunta que si el numero generado aleatoriamnte se encuentra repetido
        do {
            numAleatObjeto = (int) (numAleatorios.nextDouble() * 10 + 0);
        } while (verificarExistencia(numAleatObjeto) && (listaPosiciones.size() != 10));

        if (!verificarExistencia(numAleatObjeto)) {
            listaPosiciones.add(numAleatObjeto);
            System.err.println("----->"+numAleatObjeto);
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

    public void enviarElementos() throws InterruptedException {
        //Primer elemento
        if (jlVaca.getX() > 530 && jlVaca.getX() < 550) {
            listaPosiciones = new ArrayList<>();
            generarObjetoAleatorio();
        }
//    //Segundo elemento
        if (jlVaca.getX() > 500 && jlVaca.getX() < 520) {
            generarObjetoAleatorio();
        }
//    //tercer elemento
        if (jlVaca.getX() > 450 && jlVaca.getX() < 470) {
            generarObjetoAleatorio();

        }
//     //cuarto elemento
        if (jlVaca.getX() > 400 && jlVaca.getX() < 420) {
            generarObjetoAleatorio();
        }
//      //quinto elemento
        if (jlVaca.getX() > 350 && jlVaca.getX() < 370) {
            generarObjetoAleatorio();
        }
//    //sexto elemento
        if (jlVaca.getX() > 300 && jlVaca.getX() < 320) {
            generarObjetoAleatorio();

        }
//     //septimo elemento
        if (jlVaca.getX() > 250 && jlVaca.getX() < 270) {
            generarObjetoAleatorio();
        }
//    //octavo elemento
        if (jlVaca.getX() > 200 && jlVaca.getX() < 220) {
            generarObjetoAleatorio();
        }
//      //noveno elemento
        if (jlVaca.getX() > 150 && jlVaca.getX() < 170) {
            generarObjetoAleatorio();
        }
//        //decimo elemento
        if (jlVaca.getX() > 100 && jlVaca.getX() < 120) {
            generarObjetoAleatorio();
            System.err.println("\n\n");
        }
    }
    
    public void continuarLanzamientoObjetos() 
    {
        while(true)
        {
            try {
                enviarElementos();
            } catch (InterruptedException ex) {
                Logger.getLogger(FRM_Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

    public void mover() throws InterruptedException {
       
        enviarElementos(); 
      
          // JOptionPane.showMessageDialog(null, listaPosiciones.size());
         //   listaElementos.get(listaPosiciones.get(0)).setVisible(true);
          //  listaElementos.get(listaPosiciones.get(0)).setLocation(500, listaElementos.get(listaPosiciones.get(0)).getY() + 5);
           moverElemento(listaPosiciones.get(0));
       
    }

}
