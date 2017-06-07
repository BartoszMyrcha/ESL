/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspertsystemowliczbowych;

import javax.swing.JFrame;

/**
 * Klasa inicjalizująca menu główne.
 * @author Bartosz Myrcha
 */
public class EkspertSystemowLiczbowych {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MenuGlowne menu = new MenuGlowne(); //stwórz nowy obiekt klasy MenuGlowne o nazwie menu
       menu.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno menu
       menu.setVisible(true); //ustaw okno menu jako widoczne
    }
    
}
