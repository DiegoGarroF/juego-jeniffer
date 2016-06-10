package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author vaio01
 */
public class ArchivoDat {
    ObjectOutputStream archivoSalida;
    ObjectInputStream archivoEntrada;

    public ArchivoDat() {
   }

 public void crearArchivo(){//Se creara el archivo
      try
      {
         archivoSalida=new ObjectOutputStream(new FileOutputStream("jugador.dat"));
         System.out.println("El archivo 'cursos', ha sido creado.");
      }
      catch(Exception e)
      {
          System.out.println("Error al crear el archivo: "+e);
      }
    }
    
    public void escribirInformacionEnElArchivo(Jugador jugador){//Inserta en el archivo la información digitada
      try
      {
         archivoSalida.writeObject(jugador);
         System.out.println("Se escribió la información de forma correcta en: cursos");
      }
      catch(Exception e)
      {
          System.out.println("Error al escribir en el archivo: "+e);
      }
    }
    public String leerInformacion()//Muestra la informacion almacenada en el archivo.
    {
     Jugador jugador=null;
      try
      {
        archivoEntrada=new ObjectInputStream(new FileInputStream("jugador.dat"));
        jugador=(Jugador)archivoEntrada.readObject();
      }
      catch(Exception e)
      {
          System.out.println("Error al leer información del archivo: "+e);
      }
        return jugador.datosJugador();
    }
   
    public ArrayList<Jugador> leerInformacionCompleta()//Extrae la info del array
    {
      ArrayList<Jugador>arrayCursos=new ArrayList<Jugador>();
      try
      {
        archivoEntrada=new ObjectInputStream(new FileInputStream("jugador.dat"));
        while(true)
        {
          arrayCursos.add((Jugador)archivoEntrada.readObject());
        }
      }
      catch(Exception e)
      {
          System.out.println("Fin del archivo: "+e);
      }
        return arrayCursos;
    }
    public boolean existeArchivo()//Empleado en la clase metodosCursos para verificarArchivo();
    {                             //Si devuelve true el archivo ya fue creado si retorna false el archivo aun no existe.
      boolean existe=false;
      try{
        archivoEntrada=new ObjectInputStream(new FileInputStream("jugador.dat"));
        existe=true;
      }
      catch(Exception e)
      {
          System.out.println("No existe el archivo "+e);
      }
      return existe;
    }
}
