/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package tomasulman.projekt;

/**
 *
 * @author TomasUlman
 */
public enum Pojisteni {
    PojisteniNemovitosti ("Pojištění nemovitosti"),
    PojisteniAuta ("Pojištění auta"),
    PojisteniZivotni ("Životní pojištění");
    
    private String nazev;
    
    Pojisteni(String nazev){
        this.nazev = nazev;
    }
    
    @Override
    public String toString(){
        return nazev;
    }
}
