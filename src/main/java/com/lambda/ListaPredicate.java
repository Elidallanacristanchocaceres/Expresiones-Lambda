package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListaPredicate {
public static void main(String[] args) {
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Predicate<Integer> esPar = n -> n % 2 == 0;
List<Integer> numerosPares = numeros.stream()
.filter(esPar)
.collect(Collectors.toList());
System.out.println("Números pares: " + numerosPares);
}
}
