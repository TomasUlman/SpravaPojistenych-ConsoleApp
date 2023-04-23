/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.projekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TomasUlman
 */
public class Zaznam {

    // Vytvoření proměnné sc, do které se budou ukládat vstupy uživatele 
    Scanner sc = new Scanner(System.in, "Windows-1250");
    // List pro evidenci všech pojištěných //
    private List<Pojisteny> seznamPojistenych = new ArrayList<Pojisteny>();
    // Vytvoření instance pojištěného
    private Pojisteny pojisteny;
    // Vytvoření instance výčtového typu Pojisteni
    private Pojisteni pojisteni;

    // Vytvoří nového pojištěného, kterého uživatel zadá a vloží jej do seznamu
    public void novyZaznam() {
        System.out.println("------------------------------------------");
        System.out.print("Zadejte jméno pojištěného: ");
        String jmeno = sc.nextLine();
        System.out.print("Zadejte příjmení pojištěného: ");
        String prijmeni = sc.nextLine();
        System.out.print("Zadejte věk pojištěného: ");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.print("Zadejte telefon pojištěného: ");
        String telefon = sc.nextLine();
        zadejTypPojisteni();
        seznamPojistenych.add(pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefon, pojisteni));
        System.out.println("Pojištěný byl vytvořen");
        System.out.println("------------------------------------------");
    }

    // Metoda pro zadnání typu pojištění, která má pojištěný sjednané
    public void zadejTypPojisteni() {
        boolean spravneZadani = false;
        while (!spravneZadani) {
            System.out.println("------------------------------------------");
            System.out.println("- 1: Pojištění nemovitosti");
            System.out.println("- 2: Pojištění auta");
            System.out.println("- 3: Životní pojištění");
            System.out.print("Zadejte jaké má pojištění: ");
            int cisloPojisteni = Integer.parseInt(sc.nextLine());
            switch (cisloPojisteni) {
                case 1:
                    pojisteni = Pojisteni.PojisteniNemovitosti;
                    spravneZadani = true;
                    break;
                case 2:
                    pojisteni = Pojisteni.PojisteniAuta;
                    spravneZadani = true;
                    break;
                case 3:
                    pojisteni = Pojisteni.PojisteniZivotni;
                    spravneZadani = true;
                    break;
                default:
            }
        }
    }

    // Vypíše všechny záznamy v seznamu pojištěných
    public void vypisVsechnyZaznamy() {
        System.out.println("------------------------------------------");
        System.out.println("           | Všichni pojištění |          ");
        System.out.println("------------------------------------------");
        for (Pojisteny pojisteny : seznamPojistenych) {
            System.out.println("ID: " + seznamPojistenych.indexOf(pojisteny) + " " + pojisteny);
        }
        System.out.println("------------------------------------------");
    }

    // Najde konkrétní záznam zadaný uživatelem podle jména a příjmení
    public void najdiZaznam() {
        System.out.print("Zadejte jméno pojištěného: ");
        String jmeno = sc.nextLine();
        System.out.print("Zadejte příjmení pojištěného: ");
        String prijmeni = sc.nextLine();
        System.out.println("------------------------------------------");
        System.out.println("          | Nalezení pojištění |          ");
        System.out.println("------------------------------------------");
        for (Pojisteny pojisteny : seznamPojistenych) {
            if ((jmeno.equals(pojisteny.getJmeno()) && (prijmeni.equals(pojisteny.getPrijmeni())))) {
                System.out.println("ID: " + seznamPojistenych.indexOf(pojisteny) + " " + pojisteny);
            }
        }
        System.out.println("------------------------------------------");
    }

    // Edituje záznam nalezený pomocí zadaného ID pojištěného
    public void editujZaznam() {
        int index = 0;
        boolean validIndex = false;
        while (!validIndex) {
            System.out.print("Zadejte ID pojištěného k editaci: ");
            index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index < seznamPojistenych.size()) { // ověření, zda je index platný
                validIndex = true;
            } else {
                System.out.println("Zadaná hodnota neodpovídá indexu žádného z pojištěných");
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("         | Editace pojištěného |          ");
        System.out.println("------------------------------------------");
        System.out.println("ID: " + index + "   " + seznamPojistenych.get(index));
        System.out.println("------------------------------------------");
        System.out.println("- 1: Jméno");
        System.out.println("- 2: Příjmení");
        System.out.println("- 3: Věk");
        System.out.println("- 4: Telefon");
        System.out.println("- 5: Typ pojištění");
        System.out.print("Zadejte co chcete editovat: ");
        String zadani = sc.nextLine();
        switch (zadani) {
            case "1" -> {
                System.out.print("Zadejte nové jméno: ");
                String jmeno = sc.nextLine();
                seznamPojistenych.get(index).setJmeno(jmeno);
            }
            case "2" -> {
                System.out.print("Zadejte nové příjmení: ");
                String prijmeni = sc.nextLine();
                seznamPojistenych.get(index).setPrijmeni(prijmeni);
            }
            case "3" -> {
                System.out.print("Zadejte nový věk: ");
                int vek = Integer.parseInt(sc.nextLine());
                seznamPojistenych.get(index).setVek(vek);
            }
            case "4" -> {
                System.out.print("Zadejte nové příjmení: ");
                String telefon = sc.nextLine();
                seznamPojistenych.get(index).setTelefon(telefon);
            }
            case "5" -> {
                zadejTypPojisteni();
                seznamPojistenych.get(index).pojisteni = pojisteni;
            }
            default ->
                System.out.println("Špatné zadání");
        }

    }

    // Smaze zaznam nalezeny pomocí metody najdiZaznam()
    public void smazZaznam() {
        int index = 0;
        vypisVsechnyZaznamy();
        System.out.println("Koho si přejete vymazat ?");
        System.out.println("- pro vymazání pojištěného zadejte jeho ID, například => 1");
        boolean validIndex = false; // nastavení hodnoty pro podmínku ve while smyčce
        while (!validIndex) { // dokud nebyl zadán platný index
            System.out.print("Pojištěný k vymazání: ");
            index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index < seznamPojistenych.size()) { // ověření, zda je index platný
                validIndex = true;
            } else {
                System.out.println("Zadaná hodnota neodpovídá indexu žádného z pojištěných");
            }
        }
        seznamPojistenych.remove(index);
    }
}
