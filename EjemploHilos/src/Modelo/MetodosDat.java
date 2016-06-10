package Modelo;

import java.util.ArrayList;
/**
 *
 * @author tecnologiamultimedia
 */
public class MetodosDat {
    
    private ArrayList <Jugador> arrayJugador;
    String arregloInformacionConsultada[]=new String[3];
    ArchivoDat archivoDat;
    
    public MetodosDat()
    {
        arrayJugador= new ArrayList<>();
        archivoDat=new ArchivoDat();
        verificarArchivo();
    }
    public void verificarArchivo()//Si el metodo existeArchivo()devuelve true entra a leer los datos del archivo si 
    {                             //devuleve false crea el archivo.
     boolean verificar=archivoDat.existeArchivo();
     if(verificar)
     {
       arrayJugador=archivoDat.leerInformacionCompleta();
       System.out.println("Se cargaron los datos al archivo: cursos.");
     }else{
       archivoDat.crearArchivo();
     }
    }
    public void guardarArchivo() //Escribe la informacion en el archivo creado.
    {
       archivoDat.crearArchivo();
       for(int contador=0; contador<arrayJugador.size();contador++){
          archivoDat.escribirInformacionEnElArchivo(arrayJugador.get(contador));
       }
    }
    public void agregarCurso(Jugador temporal) //Agrega la información del curso en el array
    {
        arrayJugador.add(temporal);
    }
    public void mostrarInformacion() //Recorre el array y muestra la información almacenada
    {
        for(int contador=0;contador<arrayJugador.size();contador++)
        {
            //System.out.println(arrayCursos.get(contador).getInformacion());
        }
    }
    public Jugador consultarJugador(String codigo)//Recorre el array buscando la informacion segun la sigla indicada.
    {                                          //Retorna false si no hay información para esa sigla.
        boolean existe=false;
        
        for(int contador=0;contador<arrayJugador.size();contador++)
        {
            if(arrayJugador.get(contador).getCodigo().equals(codigo))
            {
                return arrayJugador.get(contador);
            }
        }
           return null;
    }
 
    public void eliminarCurso(String codigo)//Elimina del array la información de la sigla 
    {                                          //guardada en la posicion indicada del vector
        for(int contador=0;contador<arrayJugador.size();contador++)
        {
            if(arrayJugador.get(contador).getCodigo().equals(codigo))
            {
                arrayJugador.remove(contador);
            }
        }
    }
    public String[] getArregloInformacion()//Devuelve el vector con la informacion cargada
    {
        return this.arregloInformacionConsultada;
    } 
}
