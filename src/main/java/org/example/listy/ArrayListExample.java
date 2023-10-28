package org.example.listy;

import java.util.*;
import java.util.List;

public class ArrayListExample{

    public static void main(String[] args) {
        // Tworzenie listy typu ArrayList przechowującej liczby całkowite
        List<Integer> mojaLista = new ArrayList<>();
        List<Double> listaliczb = new ArrayList<>();

        // Dodawanie elementów do listy
        mojaLista.add(1);
        mojaLista.add(2);
        mojaLista.add(3);


        listaliczb.add(1.2);
        listaliczb.add(1.5);
        listaliczb.add(9.2);

        for (Double x : listaliczb) {
            System.out.println(x);
        }

        // Pobieranie elementu z listy na podstawie indeksu
        int pierwszyElement = mojaLista.get(0);
        System.out.println("Pierwszy element: " + pierwszyElement);
        int drugiElement = mojaLista.get(1);
        System.out.println("Pierwszy element: " + drugiElement);

        for (Integer liczba : mojaLista) {
            System.out.println(liczba);
        }
        System.out.println("  ");
        System.out.println("  ");

        // Usuwanie elementu z listy
        mojaLista.remove(1); // Usuwa drugi element (indeks 1)

        // Iterowanie przez listę i wyświetlanie jej zawartości
        for (Integer liczba : mojaLista) {
            System.out.println(liczba);
        }


        // Sprawdzenie rozmiaru listy
        int rozmiarListy = mojaLista.size();
        System.out.println("Rozmiar listy: " + rozmiarListy);



        //Deklaracja listy znaków
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println("  ");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("  ");
        for (String x : cars) {
            System.out.println(x);
        }

        System.out.println("  ");
        // sprawdzanie rozmiaru listy

        System.out.println(cars.size());
        System.out.println("  ");
        //usuwanie elementow listy
        cars.remove(2);
        System.out.println(cars);


    }
}
