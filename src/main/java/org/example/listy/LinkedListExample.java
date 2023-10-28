package org.example.listy;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {

        // Tworzenie LinkedList przechowującej łańcuchy znaków
        LinkedList<String> mojaLista = new LinkedList<>();

        // Dodawanie elementów na koniec listy
        mojaLista.add("Pierwszy element");
        mojaLista.add("Drugi element");
        mojaLista.add("Trzeci element");

        // Sprawdzenie rozmiaru listy
        int rozmiarListy = mojaLista.size();
        System.out.println("Rozmiar listy: " + rozmiarListy);

        System.out.println(mojaLista);


        System.out.println("   ");

        // Dodawanie elementu na początek listy
        mojaLista.addFirst("Nowy początek");

        // Dodawanie elementu na koniec listy
        mojaLista.addLast("Nowy koniec");

        System.out.println(mojaLista);

        // Sprawdzenie rozmiaru listy
        int rozmiarListy1 = mojaLista.size();
        System.out.println("Rozmiar listy: " + rozmiarListy1);


        System.out.println("   ");

        // Usuwanie pierwszego elementu
        mojaLista.removeFirst();

        // Usuwanie ostatniego elementu
        mojaLista.removeLast();


        // Iterowanie przez listę i wyświetlanie jej zawartości
        for (String element : mojaLista) {
            System.out.println(element);
        }

        System.out.println("   ");

        // Sprawdzenie rozmiaru listy
        int rozmiarListy2 = mojaLista.size();
        System.out.println("Rozmiar listy: " + rozmiarListy2);


        LinkedList<Integer> listaLiczbCalkowitych = new LinkedList<>();
        listaLiczbCalkowitych.add(1);
        listaLiczbCalkowitych.add(2);


        System.out.println(listaLiczbCalkowitych);

        System.out.println(listaLiczbCalkowitych.size());

        System.out.println("  ");
        System.out.println(listaLiczbCalkowitych.removeLast());
        System.out.println(listaLiczbCalkowitych);

        System.out.println(listaLiczbCalkowitych.size());

        System.out.println("  ");


        LinkedList<Double> listaLiczbZmiennoprzecinkowych = new LinkedList<>();
        listaLiczbZmiennoprzecinkowych.add(1.2);
        listaLiczbZmiennoprzecinkowych.add(1.2);
        System.out.println(listaLiczbZmiennoprzecinkowych);



    }
}
