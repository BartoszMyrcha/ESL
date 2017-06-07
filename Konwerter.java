/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspertsystemowliczbowych;

import javax.swing.JFrame;

/**
 * Okno konwertera
 * @author Bartosz Myrcha
 */
public class Konwerter extends javax.swing.JFrame {

    /**
     * Główny konstruktor klasy - ukrycie obramowania okna, inicjalizacja komponentów okna oraz ustawienie domyślnych systemów.
     */
    public Konwerter() {
        this.setUndecorated(true);
        initComponents();
        system_wej=2;
        system_wyj=2;
    }
    
    Liczba_dziesietna liczba = new Liczba_dziesietna(0); //stworzenie obiektu klasy Liczba_dziesiętna o nazwie liczba i wartości 0.
    int system_wej; //deklaracja zmiennej przechowującej podstawę systemu wejściowego
    int system_wyj; //deklaracja zmiennej przechowującej podstawę systemu wyjściowego

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        syst_wej_combobox = new javax.swing.JComboBox<>();
        syst_wyj_combobox = new javax.swing.JComboBox<>();
        liczba_textfield = new javax.swing.JTextField();
        label_liczba = new javax.swing.JLabel();
        label_syst_wej = new javax.swing.JLabel();
        label_syst_wyj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tlo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(108, 0, 809, 68);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(980, 0, 45, 29);

        syst_wej_combobox.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        syst_wej_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dwójkowy", "Czwórkowy", "Ósemkowy", "Dziesiętny", "Szesnastkowy" }));
        syst_wej_combobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        syst_wej_combobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                syst_wej_comboboxItemStateChanged(evt);
            }
        });
        jPanel1.add(syst_wej_combobox);
        syst_wej_combobox.setBounds(600, 160, 276, 50);

        syst_wyj_combobox.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        syst_wyj_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dwójkowy", "Czwórkowy", "Ósemkowy", "Dziesiętny", "Szesnastkowy" }));
        syst_wyj_combobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        syst_wyj_combobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                syst_wyj_comboboxItemStateChanged(evt);
            }
        });
        jPanel1.add(syst_wyj_combobox);
        syst_wyj_combobox.setBounds(600, 340, 276, 50);

        liczba_textfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        liczba_textfield.setToolTipText("Wprowadź liczbę");
        liczba_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                liczba_textfieldKeyTyped(evt);
            }
        });
        jPanel1.add(liczba_textfield);
        liczba_textfield.setBounds(40, 250, 840, 60);

        label_liczba.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        label_liczba.setForeground(new java.awt.Color(255, 255, 255));
        label_liczba.setText("Liczba po konwersji");
        jPanel1.add(label_liczba);
        label_liczba.setBounds(90, 430, 810, 190);
        label_liczba.getAccessibleContext().setAccessibleDescription("");

        label_syst_wej.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        label_syst_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/syst_wej.png"))); // NOI18N
        label_syst_wej.setToolTipText("");
        jPanel1.add(label_syst_wej);
        label_syst_wej.setBounds(20, 140, 563, 84);

        label_syst_wyj.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        label_syst_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/syst_wyj.png"))); // NOI18N
        jPanel1.add(label_syst_wyj);
        label_syst_wyj.setBounds(20, 320, 563, 84);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/konwertuj.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(384, 610, 256, 68);

        Tlo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tlo.jpg"))); // NOI18N
        Tlo.setToolTipText("Wprowadź liczbę");
        jPanel1.add(Tlo);
        Tlo.setBounds(0, 0, 1024, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        MenuGlowne menu = new MenuGlowne(); //stwórz nowy obiekt klasy MenuGlowne o nazwie menu
        this.dispose(); //zamknij bieżące okno
        menu.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno menu
        menu.setVisible(true); //ustaw okno menu jako widoczne
    }//GEN-LAST:event_exitMousePressed
    /**
     * Metoda kontrolująca poprawność wpisywanych klawiszy.
     * @param evt zdarzenie klawiatury
     */
    private void liczba_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_liczba_textfieldKeyTyped
        boolean zly_znak=false;
        if(system_wej==2)
        {
            if (!(evt.getKeyChar()=='0' || evt.getKeyChar()=='1' || (int)evt.getKeyChar()==127 || (int)evt.getKeyChar()==8))
                zly_znak=true;
        }
        if(system_wej==4)
        {
            if (!(((int)evt.getKeyChar()>=48 && (int)evt.getKeyChar()<48+system_wej ) || (int)evt.getKeyChar()==127 || (int)evt.getKeyChar()==8))
                zly_znak=true;
        }
        if(system_wej==8)
        {
            if (!(((int)evt.getKeyChar()>=48 && (int)evt.getKeyChar()<48+system_wej ) || (int)evt.getKeyChar()==127 || (int)evt.getKeyChar()==8))
                zly_znak=true;
        }
        if(system_wej==10)
        {
            if (!(Character.isDigit(evt.getKeyChar()) || (int)evt.getKeyChar()==127 || (int)evt.getKeyChar()==8))
                zly_znak=true;
        }
        if(system_wej==16)
        {
            if (!(Character.isDigit(evt.getKeyChar()) || ((int)evt.getKeyChar()>=65 && (int)evt.getKeyChar()<=70 ) || ((int)evt.getKeyChar()>=97 && (int)evt.getKeyChar()<=102 )  || (int)evt.getKeyChar()==127 || (int)evt.getKeyChar()==8))
                zly_znak=true;
        }
        
        if(zly_znak)
        {
            evt.consume();
        } 
        
    }//GEN-LAST:event_liczba_textfieldKeyTyped
    /**
     * Metoda sprawdzająca aktualny wybór comboboxa zawierającego wybrany system wejściowy.
     * @param evt zdarzenie
     */
    private void syst_wej_comboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_syst_wej_comboboxItemStateChanged
        switch (syst_wej_combobox.getSelectedIndex()) {
            case 0:
                system_wej=2;
                break;
            case 1:
                system_wej=4;
                break;
            case 2:
                system_wej=8;
                break;
            case 3:
                system_wej=10;
                break;
            default:
                system_wej=16;
                break;
        }
        liczba_textfield.setText("");
    }//GEN-LAST:event_syst_wej_comboboxItemStateChanged
    /**
     * Wykrycie wciśnięcia napisu "Konwertuj" - przeprowadzenie konwersji (z systemu wejściowego na 10 oraz z 10 na system wyjściowy) i wyświetlenie jej wyniku.
     * @param evt zdarzenie myszy
     */
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        label_liczba.setText("");
        liczba.wartosc=konwertuj_na_10(liczba_textfield.getText().toCharArray(),system_wyj);
        char[] liczba_char = liczba.konwertuj_na(system_wyj);
        label_liczba.setText("<html>("+liczba_textfield.getText()+")_"+system_wej+"<br>&#09=<br>(");
        for(int i=0; i<liczba.ilosc_cyfr_po_konwersji(system_wyj);i++)
        {
            label_liczba.setText(label_liczba.getText()+liczba_char[i]);
        }
        label_liczba.setText(label_liczba.getText()+")_"+system_wyj+"<html>");
        
         
            
    }//GEN-LAST:event_jLabel1MousePressed
    /**
     * Metoda sprawdzająca aktualny wybór comboboxa zawierającego wybrany system wyjściowy.
     * @param evt zdarzenie
     */
    private void syst_wyj_comboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_syst_wyj_comboboxItemStateChanged
        switch (syst_wyj_combobox.getSelectedIndex()) {
            case 0:
                system_wyj=2;
                break;
            case 1:
                system_wyj=4;
                break;
            case 2:
                system_wyj=8;
                break;
            case 3:
                system_wyj=10;
                break;
            default:
                system_wyj=16;
                break;
        }
    }//GEN-LAST:event_syst_wyj_comboboxItemStateChanged
    /**
     * Konwersja liczby z wejściowego systemu w postaci tablicy znaków na dziesiętny w postaci liczby całkowitej
     * @param liczba liczba o podstawie sys_wyj podana jako tablica znaków
     * @param sys_wyj podstawa systemu wyjściowego
     * @return Liczba w systemie dziesiętnym 
     */
    int konwertuj_na_10(char[] liczba, int sys_wyj)
    {
        int suma=0, i=1, n=liczba_textfield.getText().length(), cyfra=0;
        
        for (char znak : liczba)
        {
            if(Character.isDigit(znak))
            {
                cyfra=znak-'0';                
            } else
                switch((int)znak)
                {
                    case 65:
                    case 97:    cyfra=10;
                                break;
                    case 66:  
                    case 98:    cyfra=11;
                                break;  
                    case 67:
                    case 99:    cyfra=12;
                                break;
                    case 68:
                    case 100:   cyfra=13; 
                                break;
                    case 69:
                    case 101:   cyfra=14; 
                                break;  
                    case 70:
                    case 102:   cyfra=15; 
                                break;
                }
            suma+=cyfra*Math.pow(system_wej,(n-i));
            i++;
        }
        return suma;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Konwerter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konwerter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konwerter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konwerter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konwerter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tlo;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_liczba;
    private javax.swing.JLabel label_syst_wej;
    private javax.swing.JLabel label_syst_wyj;
    private javax.swing.JTextField liczba_textfield;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> syst_wej_combobox;
    private javax.swing.JComboBox<String> syst_wyj_combobox;
    // End of variables declaration//GEN-END:variables
}
