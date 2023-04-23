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
public class Pojisteny {

    /* Inicializace atributů */
    private String jmeno;
    private String prijmeni;
    private String telefon;
    private int vek;
    public Pojisteni pojisteni;

    /* Konstruktor */
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefon, Pojisteni pojisteni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
        this.pojisteni = pojisteni;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @param vek the vek to set
     */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * @return the pojisteni
     */
    public Pojisteni getPojisteni() {
        return pojisteni;
    }

    /**
     * @param pojisteni the pojisteni to set
     */
    public void setPojisteni(Pojisteni pojisteni) {
        this.pojisteni = pojisteni;
    }
    
    @Override
    public String toString() {
        return "   " + getJmeno() + "   " + getPrijmeni() + "   " + getVek() + "   " + "   " + getTelefon() + "   " + pojisteni;
    }
}
