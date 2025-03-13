package com.lambda;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class Aleatorio {
public static void main(String[] args) {

// Crear un array de nombres posibles
String[] nombres = {"Carlos", "Ana", "Jose", "Maria", "Luis"};

// Crear un Set para rastrear nombres ya usados
Set<String> nombresUsados = new HashSet<>();

// Crear un Supplier que proporciona instancias de persona sin nombresrepetidos
Supplier<persona> generarpersonaAleatoria = () -> {
Random random = new Random();
String nombreAleatorio = null;

// Encontrar un nombre que no haya sido usado
while (true) {
nombreAleatorio = nombres[random.nextInt(nombres.length)];
if (!nombresUsados.contains(nombreAleatorio)) {
nombresUsados.add(nombreAleatorio);
break;
}
}
int edadAleatoria = 18 + random.nextInt(43); // Edad entre 18 y 60
return new persona(nombreAleatorio, edadAleatoria);
};

// Usar el Supplier para obtener instancias de persona
for (int i = 0; i < nombres.length; i++) {
persona persona = generarpersonaAleatoria.get();
System.out.println(persona);
}
}
}
