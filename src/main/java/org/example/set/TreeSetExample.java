package org.example.set;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {

    public static void main(String[] args) {
//        // Tworzenie TreeSet przechowującego liczby całkowite w porządku rosnącym
//        Set<Integer> mojTreeSet = new TreeSet<>();
//
//        // Dodawanie elementów do TreeSet
//        mojTreeSet.add(3);
//        mojTreeSet.add(1);
//        mojTreeSet.add(2);
//
//        // Rozmiar TreeSet
//        int rozmiarTreeSet = mojTreeSet.size();
//        System.out.println("Rozmiar TreeSet: " + rozmiarTreeSet);
//
//        // Sprawdzanie, czy TreeSet zawiera konkretny element
//        boolean czyZawiera = mojTreeSet.contains(2);
//        System.out.println("Czy TreeSet zawiera 2? " + czyZawiera);
//
//        // Usuwanie elementu z TreeSet
//        mojTreeSet.remove(1);
//
//        // Iterowanie przez TreeSet i wyświetlanie jego zawartości (w porządku rosnącym)
//        System.out.println("Zawartość TreeSet:");
//        for (Integer liczba : mojTreeSet) {
//            System.out.println(liczba);
//        }

        // Tworzenie TreeSet przechowującego liczby całkowite w porządku malejącym
        Set<Integer> mojTreeSet = new TreeSet<>(Collections.reverseOrder());

        // Dodawanie elementów
        mojTreeSet.add(5);
        mojTreeSet.add(3);
        mojTreeSet.add(8);
        mojTreeSet.add(1);
        mojTreeSet.add(5);
        mojTreeSet.add(5);
        mojTreeSet.add(5);

        // Wyświetlanie elementów w porządku malejącym
        for (Integer liczba : mojTreeSet) {
            System.out.println(liczba);
        }









    }
}
