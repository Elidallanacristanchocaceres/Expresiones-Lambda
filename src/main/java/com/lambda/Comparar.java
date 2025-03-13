package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparar {
public static void main(String[] args) {
List<persona> personas = new ArrayList<>();
personas.add(new persona("Carlos", 25));
personas.add(new persona("Ana", 23));
personas.add(new persona("Jose", 30));
personas.add(new persona("Maria", 20));

// Usar un Comparator con expresión lambda para ordenar por edad
Comparator<persona> porEdad = (p1, p2) -> Integer.compare(p1.getEdad(),
p2.getEdad());
Collections.sort(personas, porEdad);

// Mostrar la lista ordenada
personas.forEach(System.out::println);
}
}
