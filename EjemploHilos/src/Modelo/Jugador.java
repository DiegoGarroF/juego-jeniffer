/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diego
 */
public class Jugador {
    
    private String nombre;
    private int puntuacion;
    private String codigo;
    public Jugador() {
    }

    public Jugador(String nombre, int puntuacion, String codigo) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
    public String datosJugador() {
        return  "Nombre= " + nombre + "\n Puntuacion=" + puntuacion + ", codigo=" + codigo + '}';
    }

   
}
