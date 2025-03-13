package com.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class supplier {
public static void main(String[] args) {
// Crear un Supplier que proporciona un número aleatorio
Supplier<Integer> generarNumeroAleatorio = () -> {
Random random = new Random();
return random.nextInt(100); // Número aleatorio entre 0 y 99
};
// Usar el Supplier para obtener un número aleatorio
Integer numeroAleatorio = generarNumeroAleatorio.get();
System.out.println("Número aleatorio: " + numeroAleatorio);
// Obtener otro número aleatorio
Integer otroNumeroAleatorio = generarNumeroAleatorio.get();
System.out.println("Otro número aleatorio: " + otroNumeroAleatorio);
}
}
