package pl.jaknauczycsieprogramowania;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party party = new Party();


        while (shouldContinue) {
            System.out.println("============");
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");
            System.out.println("============");

            int userChoice = scanner.nextInt(); // utworz zmienna PRZED pętlą


            switch (userChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addNewGuest();
                case 3 -> System.out.println("wybrano 3");
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;

            }
        }
    }
}





