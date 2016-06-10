/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */

import Modelo.Jugador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoDat {

    /**
     * @param args the command line arguments
     */


/**
 *
 * @author Jennifer
 */
public class ArchivoJugador {
    
    ObjectOutputStream archivoSalida;//cuando se necesita obtener informacion
    ObjectInputStream archivoEntrada;//cuando se quiere guardar informacion
    
    public ArchivoJugador()
    {
        
    }
    public boolean existeArchivoJugador()
    {
     boolean existe=false;
     try
     {
         archivoEntrada= new ObjectInputStream(new FileInputStream("jugador.dat"));
         existe=true;
     }
     catch(Exception e)
     {
        
            System.out.println("No existe el archivo jugador" + e);

     }
        return existe;
    }
    public void crearArchivoJugador()
    {
        try
        {
             archivoSalida=new ObjectOutputStream(new FileOutputStream("jugador.dat"));
             System.out.println("Archivo jugador Creado");
        }
        catch(Exception e)//el catch y el try son excepciones por si el archivo tiene un erro o se cae el programa
        {
           System.out.println("Error al crear el archivo jugador: " + e); //trae cual es el error
        }
        
    }
    public void escribirInfoEnElArchivoJugador(Jugador jugador)//recive a la persona para escribirla en el archivo
    {
        try
        {
            archivoSalida.writeObject(jugador);
            System.out.println("Se escribio la informacion de manera correcta");
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir en el archivo jugador");
        }
        
    }
    public Jugador leerInformacionJugador()//solo sirve para leer un archivo el primero
    {
        Jugador jugador=null;
       try
       {
        archivoEntrada=new ObjectInputStream(new FileInputStream("jugador.dat"));//en el archivo tiene que poner el mismo nombre que cuando guardo
        jugador=(Jugador)archivoEntrada.readObject();//se hace un casting que es el (Persona) lo que hace es para que sepa que lo que tiene  que devolver es un objeto tipo persona
       }
       catch(Exception e)
       {
           System.out.println("ERROR al leer el archivo jugador");
       }
       return jugador;
    }
    public ArrayList<Jugador> leerInformacionCompletaJugador()
    {
       ArrayList<Jugador> arrayJugador=new ArrayList<Jugador>();
       try
       {
        archivoEntrada=new ObjectInputStream(new FileInputStream("jugador.dat"));//en el archivo tiene que poner el mismo nombre que cuando guardo
          while(true)//es para que se detenga cuando se detenga cuando ya no haya nada en el archivo
          {
        
              arrayJugador.add((Jugador)archivoEntrada.readObject());//se utiliza el array que es tipo persona y el punto add por que eso recibe objeto, y lo que esta adentro es un objeto
          }
        }
       catch(Exception e)
       {
           System.out.println("Fin del archivo jugador" + e);
       } 
       return arrayJugador;
    }
}
}
