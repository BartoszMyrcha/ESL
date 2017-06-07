/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspertsystemowliczbowych;
import javax.swing.*;
/**
 * Okno menu głównego gry.
 * @author Bartosz Myrcha
 */
public class MenuGlowne extends JFrame {
    /**
     * Główny konstruktor klasy - ukrycie obramowania okna oraz inicjalizacja komponentów okna.
     */
    public MenuGlowne() {
        this.setUndecorated(true); //Ukryj obramowanie okna
        initComponents(); //inicjalizuj komponenty
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Zacznij = new javax.swing.JLabel();
        Konwerter = new javax.swing.JLabel();
        Pomoc = new javax.swing.JLabel();
        Koniec = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Tlo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(null);

        Zacznij.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zacznij_gre.png"))); // NOI18N
        Zacznij.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Zacznij.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ZacznijMousePressed(evt);
            }
        });
        jPanel1.add(Zacznij);
        Zacznij.setBounds(370, 150, 270, 60);

        Konwerter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/konwerter.png"))); // NOI18N
        Konwerter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Konwerter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KonwerterMousePressed(evt);
            }
        });
        jPanel1.add(Konwerter);
        Konwerter.setBounds(380, 290, 258, 68);

        Pomoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pomoc.png"))); // NOI18N
        Pomoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pomoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PomocMousePressed(evt);
            }
        });
        jPanel1.add(Pomoc);
        Pomoc.setBounds(420, 430, 169, 68);

        Koniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zakoncz.png"))); // NOI18N
        Koniec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Koniec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KoniecMousePressed(evt);
            }
        });
        jPanel1.add(Koniec);
        Koniec.setBounds(370, 590, 300, 68);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(108, 0, 800, 80);

        Tlo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tlo.jpg"))); // NOI18N
        jPanel1.add(Tlo);
        Tlo.setBounds(0, 0, 1024, 768);
        Tlo.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Wykrycie wciśnięcia napisu "Zacznij grę" - zamykanie bieżącego okna i otwieranie okna konfigurującego grę.
     * @param evt zdarzenie myszy
     */
    private void ZacznijMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZacznijMousePressed
        Wybor_systemow syst_wyb = new Wybor_systemow(); //stwórz nowy obiekt klasy Wybor_systemow o nazwie syst_wyb
        this.dispose(); //zamknij bieżące okno
        syst_wyb.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno syst_wyb
        syst_wyb.setVisible(true); //ustaw okno syst_wyb jako widoczne
    }//GEN-LAST:event_ZacznijMousePressed
    /**
     * Wykrycie wciśnięcia napisu "Zakończ grę" - zamykanie bieżącego okna.
     * @param evt zdarzenie myszy
     */
    private void KoniecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KoniecMousePressed
        this.dispose(); //zamknij bieżące okno
    }//GEN-LAST:event_KoniecMousePressed
    /**
     * Wykrycie wciśnięcia napisu "Konwerter" - zamykanie bieżącego okna i otwieranie okna konwertera.
     * @param evt zdarzenie myszy
     */
    private void KonwerterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KonwerterMousePressed
        Konwerter konwerter = new Konwerter(); //stwórz nowy obiekt klasy Konwerter o nazwie konwerter
        this.dispose(); //zamknij bieżące okno
        konwerter.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno konwerter
        konwerter.setVisible(true); //ustaw okno konwerter jako widoczne
    }//GEN-LAST:event_KonwerterMousePressed
    /**
     * Wykrycie wciśnięcia napisu "Pomoc" - zamykanie bieżącego okna i otwieranie okna pomocy.
     * @param evt zdarzenie myszy
     */
    private void PomocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PomocMousePressed
        Pomoc pomoc = new Pomoc(); //stwórz nowy obiekt klasy Pomoc o nazwie pomoc
        this.dispose(); //zamknij bieżące okno
        pomoc.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno pomoc
        pomoc.setVisible(true); //ustaw okno pomoc jako widoczne
    }//GEN-LAST:event_PomocMousePressed

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
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGlowne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Koniec;
    private javax.swing.JLabel Konwerter;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Pomoc;
    private javax.swing.JLabel Tlo;
    private javax.swing.JLabel Zacznij;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
