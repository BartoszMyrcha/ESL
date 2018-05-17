/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspertsystemowliczbowych;

/**
 * Klasa abstrakcyjna odpowiedzialna za liczbę
 * @author Bartosz Myrcha
 */
public abstract class Liczba {
    static int wartosc=0;
    int ilosc_cyfr;
    int system_liczbowy;
    /**
     * Konstruktor główny
     * @param wartosc wartość liczby
     */
    public Liczba(int wartosc){
        this.wartosc=wartosc;
        this.ilosc_cyfr=ile_cyfr();
    }
    /**
     * Metoda zwracająca ilość cyfr liczby.
     * @return ilość cyfr liczby
     */
    public static int ile_cyfr(){
        int wynik=0;
        int zmienna_pom=wartosc;
        while(zmienna_pom>=1)
        {
            zmienna_pom=zmienna_pom/10;
            wynik++;
        }
        return wynik;
    }
}
