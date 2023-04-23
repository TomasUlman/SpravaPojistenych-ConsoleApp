/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.projekt;

import java.util.Scanner;

/**
 *
 * @author TomasUlman
 */
public class Rozhrani {

    // Vytvoření proměnné sc, do které se budou ukládat vstupy uživatele 
    Scanner sc = new Scanner(System.in, "Windows-1250");
    // Atribut pro zadání příkazu uživatelem
    private String prikaz = "";
    // vytvoření instance záznamu
    private Zaznam zaznam = new Zaznam();

    // Metoda pro vytisknutí menu aplikace
    public void vytiskniMenu() {
        System.out.println("----------------   MENU   ----------------");
        System.out.println("Aplikace se ovládá následujícími příkazy:");
        System.out.println("- 1: Vytvoření nového pojištěného");
        System.out.println("- 2: Zobrazí všechny pojištěné");
        System.out.println("- 3: Dohledání konkrétního pojištěného");
        System.out.println("- 4: Editace konkrétního pojištěného");
        System.out.println("- 5: Odstranění pojištěného");
        System.out.println("- 6: Ukončení aplikace");
        System.out.println("----------------   MENU   ----------------");
    }

    // Načtení příkazu zadaného uživatelem
    public String nactiPrikaz() {
        System.out.print("Zadejte příkaz: ");
        prikaz = sc.nextLine();
        return prikaz;
    }

    // Metoda, která vykonává celý běh aplikace až do ukončení uživatelem (příkaz "zavri")
    void Program() {
        vytiskniMenu();
        while (!prikaz.equals("6")) { // dokud nebyl zadán platný prikaz
            nactiPrikaz();
            switch (prikaz) { 
                case "1":
                    zaznam.novyZaznam();
                    vytiskniMenu();
                    break;
                case "2":
                    zaznam.vypisVsechnyZaznamy();
                    vytiskniMenu();
                    break;
                case "3":
                    zaznam.najdiZaznam();
                    vytiskniMenu();
                    break;
                case "4":
                    zaznam.editujZaznam();
                    vytiskniMenu();
                    break;
                case "5":
                    zaznam.smazZaznam();
                    vytiskniMenu();
                    break;
                case "6":
                    break;
            }
        }
    }
}
