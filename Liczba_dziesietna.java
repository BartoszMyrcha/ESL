/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspertsystemowliczbowych;

/**
 * Klasa odpowiadająca za liczbę dziesiętną
 * @author Bartosz Myrcha
 */
public class Liczba_dziesietna extends Liczba {
    int system;
    /**
     * Konstruktor główny
     * @param wartosc wartość liczby dziesiętnej
     */
    public Liczba_dziesietna(int wartosc)
    {
        super(wartosc);
        this.system=10;
    }
    /**
     * Metoda wyliczająca ilość cyfr liczby po konwersji z systemu 10 na system docelowy
     * @param system_liczbowy_docelowy podstawa docelowego systemu liczbowego
     * @return ilość cyfr po konwersji na docelowy system wyjściowy
     */
    int ilosc_cyfr_po_konwersji(int system_liczbowy_docelowy)
    {
        int liczba_dzies=wartosc;
        int n=1;
	while(Math.pow(system_liczbowy_docelowy,n)<=liczba_dzies)
	{
		n++;
	}
        return n;
    }
    /**
     * Konwersja liczby w systemie dziesiętnym (podanej jako liczba całkowita)
     * na liczbę w docelowym systemie liczbowym (podanej w postaci tablicy znaków).
     * @param system_liczbowy_docelowy podstawa docelowego systemu liczbowego 
     * @return liczba w docelowym systemie liczbowym (tablica znaków)
     */
    char[] konwertuj_na(int system_liczbowy_docelowy)
    {
        int liczba_dzies=wartosc;
        int n=this.ilosc_cyfr_po_konwersji(system_liczbowy_docelowy);
	int modulo;
	char zmienna_pom;
        
        char[] liczba_po_konwersji = new char[100];
	int i=n;
	while(i>0)
	{
		modulo=(liczba_dzies%system_liczbowy_docelowy);
		if (modulo>9)
		{
			switch(modulo)
			{
				case 10: zmienna_pom='A';
					break;
				case 11: zmienna_pom='B';
					break;
                		case 12: zmienna_pom='C';
					break;
				case 13: zmienna_pom='D';
					break;
				case 14: zmienna_pom='E';
					break;
				case 15: zmienna_pom='F';
					break;
				default: zmienna_pom='Z';
			}
			liczba_po_konwersji[i-1]=zmienna_pom;
		}
		else
		{
                    liczba_po_konwersji[i-1] = (char)('0'+modulo);
		}
		liczba_dzies=(liczba_dzies-modulo)/system_liczbowy_docelowy;
		i--;
	}
        
        return liczba_po_konwersji;
                
    }
}


