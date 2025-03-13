package com.lambda;

public class persona {
    private String nombre;
    private int edad;
    public persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    }
    public String getNombre() {
    return nombre;
    }
    public int getEdad() {
    return edad;
    }
    @Override
    public String toString() {
    return nombre + " - " + edad;
    }
    public Object setNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }
    }
