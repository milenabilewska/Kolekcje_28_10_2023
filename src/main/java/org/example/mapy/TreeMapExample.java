package org.example.mapy;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {

    public static void main(String[] args) {
        // Tworzenie TreeMap przechowującej pary klucz-wartość typu String-Integer
        Map<String, Integer> mojaMapa = new TreeMap<>();

        // Tworzenie TreeMap przechowującej pary klucz-wartość typu String-String
        Map<String, String> mojaMapaString = new TreeMap<>();
        mojaMapaString.put("Klucz 1", "Wartosc 1");
        mojaMapaString.put("Klucz 2", "Wartosc 2");
        mojaMapaString.put("Klucz 3", "Wartosc 444");
        mojaMapaString.put("Klucz 4", "Wartosc 2");

        System.out.println(mojaMapaString );

        System.out.println("    ");

        // Tworzenie TreeMap przechowującej pary klucz-wartość typu Integer-Double
        Map<Integer, Double> mojaMapaIntegerDouble = new TreeMap<>();
        mojaMapaIntegerDouble.put(1,2.22);
        mojaMapaIntegerDouble.put(2,55.5);
        System.out.println(mojaMapaIntegerDouble);

        System.out.println("    ");

        // Dodawanie par klucz-wartość do TreeMap
        mojaMapa.put("Klucz 3", 300);
        mojaMapa.put("Klucz 1", 100);
        mojaMapa.put("Klucz 2", 200);






        // Pobieranie wartości na podstawie klucza
        int wartosc = mojaMapa.get("Klucz 2");
        System.out.println("Wartość dla Klucz 2: " + wartosc);

        // Sprawdzanie, czy TreeMap zawiera określony klucz
        boolean czyZawieraKlucz = mojaMapa.containsKey("Klucz 1");
        System.out.println("Czy TreeMap zawiera Klucz 1? " + czyZawieraKlucz);

        // Usuwanie pary klucz-wartość z TreeMap
        mojaMapa.remove("Klucz 3");

        // Iterowanie przez TreeMap i wyświetlanie jego zawartości (w porządku posortowanym)
        System.out.println("Zawartość TreeMap:");
        for (Map.Entry<String, Integer> entry : mojaMapa.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue());
        }
    }
}
