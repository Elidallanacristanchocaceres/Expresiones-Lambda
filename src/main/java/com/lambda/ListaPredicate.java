package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListaPredicate {
        public static void main(String[] args) {
            // Lista de personas con nombres y edades
            List<persona> personas = Arrays.asList(
                new persona("Juan", 25),
                new persona("Ana", 17),
                new persona("Luis", 30),
                new persona("Marta", 16),
                new persona("Carlos", 22)
            );
    
            Predicate<persona> esMayorDe18 = persona -> persona.getEdad() > 18;
    
            List<persona> personasMayoresDe18 = personas.stream()
                    .filter(esMayorDe18)
                    .collect(Collectors.toList());
    
            System.out.println("personas mayores de 18 años: " + personasMayoresDe18);
        }
    }
