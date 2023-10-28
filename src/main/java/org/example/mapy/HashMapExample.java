package org.example.mapy;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Tworzenie HashMap przechowującej pary klucz-wartość typu String-Integer
        Map<String, Integer> mojaMapa = new HashMap<>();

        // Tworzenie HashMap przechowującej pary klucz-wartość typu Integer-Integer
        Map<Integer, Integer> mojaMapaInteger = new HashMap<>();

        // Tworzenie HashMap przechowującej pary klucz-wartość typu String-String
        Map<String, String> mojaMapaString = new HashMap<>();

        // Tworzenie HashMap przechowującej pary klucz-wartość typu String-Double
        Map<String, Double> mojaMapaStringDouble = new HashMap<>();

        // Tworzenie HashMap przechowującej pary klucz-wartość typu Double - String
        Map<Double, String> mojaMapaDoubleString = new HashMap<>();


        // Dodawanie par klucz-wartość do HashMap
        mojaMapa.put("Klucz 1", 100);
        mojaMapa.put("Klucz 2", 200);
        mojaMapa.put("Klucz 3", 300);

        System.out.println(mojaMapa);

        System.out.println("  ");

        mojaMapaInteger.put(1,2);
        mojaMapaInteger.put(2,3);
        System.out.println(mojaMapaInteger);

        System.out.println("  ");

        mojaMapaDoubleString.put(2.2, "wartosc 1");
        mojaMapaDoubleString.put(2.3, "wartosc 2");

        System.out.println(mojaMapaDoubleString);

        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        // Pobieranie wartości na podstawie klucza
        int wartosc = mojaMapa.get("Klucz 2");
        System.out.println("Wartość dla Klucz 2: " + wartosc);

        // Sprawdzanie, czy HashMap zawiera określony klucz
        boolean czyZawieraKlucz = mojaMapa.containsKey("Klucz 1");
        System.out.println("Czy HashMap zawiera Klucz 1? " + czyZawieraKlucz);

        // Usuwanie pary klucz-wartość z HashMap
        mojaMapa.remove("Klucz 3");

        // Iterowanie przez HashMap i wyświetlanie jego zawartości
        System.out.println("Zawartość HashMap:");
        for (Map.Entry<String, Integer> entry : mojaMapa.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue());
        }

        System.out.println("Zawartość HashMap DoubleString");
        for (Map.Entry<Double, String> entry : mojaMapaDoubleString.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue());
        }
    }
}
