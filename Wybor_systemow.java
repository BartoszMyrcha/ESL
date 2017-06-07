/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspertsystemowliczbowych;

import javax.swing.*;

/**
 * Okno wyboru systemów oraz ilości cyfr.
 * @author Bartosz Myrcha
 */
public class Wybor_systemow extends javax.swing.JFrame {
    
    
    /**
     * Główny konstruktor klasy - ukrycie obramowania okna, inicjalizacja komponentów okna
     * oraz ustawienie domyślnych parametrów gry (wejściowy system - dziesiętny, wyjściowy system - binarny, zakres cyfr od 2 do 8).
     */
    public Wybor_systemow() {
        this.setUndecorated(true);
        initComponents();
        for (int i=0; i<5; i++)
        {
            syst_wej[i] = i==3;
        }
        for (int i=0; i<5; i++)
        {
            syst_wyj[i] = i==0;
        }
        cyfry_start=2;
        cyfry_koniec=8;
    }
    /** Tablica informująca o stanie wyboru systemów wejściowych */
    public static boolean[] syst_wej = new boolean[5];
    /** Tablica informująca o stanie wyboru systemów wejściowych */
    public static boolean[] syst_wyj = new boolean[5];
    /** Licznik przechowujący ilość wybranych systemów wejściowych */
    public static int licznik_syst_wej=0;
    /** Licznik przechowujący ilość wybranych systemów wyjściowych */
    public static int licznik_syst_wyj=0;
    /** Zmienne przechowujące początkową oraz końcową ilość cyfr */
    public static int cyfry_start, cyfry_koniec;
    /** Zmienna pomagająca w weryfikacji parametrów (wykorzystywana w metodzie DalejMousePressed) */
    public static boolean takie_same;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        sys_wej = new javax.swing.JLabel();
        sys_wyj = new javax.swing.JLabel();
        bin_wej = new javax.swing.JLabel();
        bin_wyj = new javax.swing.JLabel();
        czw_wej = new javax.swing.JLabel();
        czw_wyj = new javax.swing.JLabel();
        os_wej = new javax.swing.JLabel();
        os_wyj = new javax.swing.JLabel();
        dziej_wej = new javax.swing.JLabel();
        dzies_wyj = new javax.swing.JLabel();
        szes_wej = new javax.swing.JLabel();
        szes_wyj = new javax.swing.JLabel();
        bin_wej_box = new javax.swing.JLabel();
        bin_wyj_box = new javax.swing.JLabel();
        czw_wej_box = new javax.swing.JLabel();
        czw_wyj_box = new javax.swing.JLabel();
        os_wej_box = new javax.swing.JLabel();
        os_wyj_box = new javax.swing.JLabel();
        dzies_wej_box = new javax.swing.JLabel();
        dzies_wyj_box = new javax.swing.JLabel();
        szes_wej_box = new javax.swing.JLabel();
        szes_wyj_box = new javax.swing.JLabel();
        cyf_start = new javax.swing.JLabel();
        start_2 = new javax.swing.JLabel();
        start_3 = new javax.swing.JLabel();
        start_4 = new javax.swing.JLabel();
        start_5 = new javax.swing.JLabel();
        start_6 = new javax.swing.JLabel();
        start_7 = new javax.swing.JLabel();
        start_8 = new javax.swing.JLabel();
        cyf_koniec = new javax.swing.JLabel();
        koniec_2 = new javax.swing.JLabel();
        koniec_3 = new javax.swing.JLabel();
        koniec_4 = new javax.swing.JLabel();
        koniec_5 = new javax.swing.JLabel();
        koniec_6 = new javax.swing.JLabel();
        koniec_7 = new javax.swing.JLabel();
        koniec_8 = new javax.swing.JLabel();
        Dalej = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        Tlo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(108, 0, 800, 80);

        sys_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sys_wej.png"))); // NOI18N
        jPanel1.add(sys_wej);
        sys_wej.setBounds(80, 80, 410, 50);

        sys_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sys_wyj.png"))); // NOI18N
        jPanel1.add(sys_wyj);
        sys_wyj.setBounds(580, 80, 410, 60);

        bin_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bin.png"))); // NOI18N
        jPanel1.add(bin_wej);
        bin_wej.setBounds(160, 170, 150, 40);

        bin_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bin.png"))); // NOI18N
        jPanel1.add(bin_wyj);
        bin_wyj.setBounds(660, 170, 150, 40);

        czw_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/czw.png"))); // NOI18N
        jPanel1.add(czw_wej);
        czw_wej.setBounds(160, 230, 230, 40);

        czw_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/czw.png"))); // NOI18N
        jPanel1.add(czw_wyj);
        czw_wyj.setBounds(660, 230, 230, 40);

        os_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/os.png"))); // NOI18N
        jPanel1.add(os_wej);
        os_wej.setBounds(160, 290, 230, 50);

        os_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/os.png"))); // NOI18N
        jPanel1.add(os_wyj);
        os_wyj.setBounds(660, 290, 230, 50);

        dziej_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dzies.png"))); // NOI18N
        jPanel1.add(dziej_wej);
        dziej_wej.setBounds(160, 360, 210, 40);

        dzies_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dzies.png"))); // NOI18N
        jPanel1.add(dzies_wyj);
        dzies_wyj.setBounds(660, 360, 210, 40);

        szes_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/szes.png"))); // NOI18N
        jPanel1.add(szes_wej);
        szes_wej.setBounds(160, 420, 260, 50);

        szes_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/szes.png"))); // NOI18N
        jPanel1.add(szes_wyj);
        szes_wyj.setBounds(660, 420, 260, 50);

        bin_wej_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        bin_wej_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bin_wej_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bin_wej_boxMousePressed(evt);
            }
        });
        jPanel1.add(bin_wej_box);
        bin_wej_box.setBounds(110, 170, 40, 40);

        bin_wyj_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        bin_wyj_box.setText("jLabel10");
        bin_wyj_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bin_wyj_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bin_wyj_boxMousePressed(evt);
            }
        });
        jPanel1.add(bin_wyj_box);
        bin_wyj_box.setBounds(610, 170, 40, 40);

        czw_wej_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        czw_wej_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        czw_wej_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                czw_wej_boxMousePressed(evt);
            }
        });
        jPanel1.add(czw_wej_box);
        czw_wej_box.setBounds(110, 230, 40, 40);

        czw_wyj_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        czw_wyj_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        czw_wyj_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                czw_wyj_boxMousePressed(evt);
            }
        });
        jPanel1.add(czw_wyj_box);
        czw_wyj_box.setBounds(610, 230, 40, 40);

        os_wej_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        os_wej_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        os_wej_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                os_wej_boxMousePressed(evt);
            }
        });
        jPanel1.add(os_wej_box);
        os_wej_box.setBounds(110, 290, 40, 40);

        os_wyj_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        os_wyj_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        os_wyj_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                os_wyj_boxMousePressed(evt);
            }
        });
        jPanel1.add(os_wyj_box);
        os_wyj_box.setBounds(610, 300, 40, 40);

        dzies_wej_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        dzies_wej_box.setText("jLabel10");
        dzies_wej_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dzies_wej_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dzies_wej_boxMousePressed(evt);
            }
        });
        jPanel1.add(dzies_wej_box);
        dzies_wej_box.setBounds(110, 360, 40, 40);

        dzies_wyj_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        dzies_wyj_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dzies_wyj_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dzies_wyj_boxMousePressed(evt);
            }
        });
        jPanel1.add(dzies_wyj_box);
        dzies_wyj_box.setBounds(610, 360, 40, 40);

        szes_wej_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        szes_wej_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        szes_wej_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                szes_wej_boxMousePressed(evt);
            }
        });
        jPanel1.add(szes_wej_box);
        szes_wej_box.setBounds(110, 430, 40, 40);

        szes_wyj_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nok.png"))); // NOI18N
        szes_wyj_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        szes_wyj_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                szes_wyj_boxMousePressed(evt);
            }
        });
        jPanel1.add(szes_wyj_box);
        szes_wyj_box.setBounds(610, 430, 40, 40);

        cyf_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cyfry_start.png"))); // NOI18N
        jPanel1.add(cyf_start);
        cyf_start.setBounds(10, 490, 480, 50);

        start_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_act.png"))); // NOI18N
        start_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_2MousePressed(evt);
            }
        });
        jPanel1.add(start_2);
        start_2.setBounds(230, 540, 40, 50);

        start_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_nact.png"))); // NOI18N
        start_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_3MousePressed(evt);
            }
        });
        jPanel1.add(start_3);
        start_3.setBounds(310, 540, 40, 50);

        start_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4_nact.png"))); // NOI18N
        start_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_4MousePressed(evt);
            }
        });
        jPanel1.add(start_4);
        start_4.setBounds(390, 540, 40, 50);

        start_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5_nact.png"))); // NOI18N
        start_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_5MousePressed(evt);
            }
        });
        jPanel1.add(start_5);
        start_5.setBounds(470, 540, 40, 50);

        start_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6_nact.png"))); // NOI18N
        start_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_6MousePressed(evt);
            }
        });
        jPanel1.add(start_6);
        start_6.setBounds(550, 540, 40, 50);

        start_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7_nact.png"))); // NOI18N
        start_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_7MousePressed(evt);
            }
        });
        jPanel1.add(start_7);
        start_7.setBounds(630, 540, 40, 50);

        start_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8_nact.png"))); // NOI18N
        start_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_8MousePressed(evt);
            }
        });
        jPanel1.add(start_8);
        start_8.setBounds(710, 540, 40, 50);

        cyf_koniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cyfry_koniec.png"))); // NOI18N
        jPanel1.add(cyf_koniec);
        cyf_koniec.setBounds(10, 590, 440, 50);

        koniec_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_nact.png"))); // NOI18N
        koniec_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koniec_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                koniec_2MousePressed(evt);
            }
        });
        jPanel1.add(koniec_2);
        koniec_2.setBounds(230, 640, 40, 50);

        koniec_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_nact.png"))); // NOI18N
        koniec_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koniec_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                koniec_3MousePressed(evt);
            }
        });
        jPanel1.add(koniec_3);
        koniec_3.setBounds(310, 640, 40, 50);

        koniec_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4_nact.png"))); // NOI18N
        koniec_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koniec_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                koniec_4MousePressed(evt);
            }
        });
        jPanel1.add(koniec_4);
        koniec_4.setBounds(390, 640, 40, 50);

        koniec_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5_nact.png"))); // NOI18N
        koniec_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koniec_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                koniec_5MousePressed(evt);
            }
        });
        jPanel1.add(koniec_5);
        koniec_5.setBounds(470, 640, 40, 50);

        koniec_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6_nact.png"))); // NOI18N
        koniec_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koniec_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                koniec_6MousePressed(evt);
            }
        });
        jPanel1.add(koniec_6);
        koniec_6.setBounds(550, 640, 40, 50);

        koniec_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7_nact.png"))); // NOI18N
        koniec_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koniec_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                koniec_7MousePressed(evt);
            }
        });
        jPanel1.add(koniec_7);
        koniec_7.setBounds(630, 640, 40, 50);

        koniec_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8_act.png"))); // NOI18N
        koniec_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        koniec_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                koniec_8MousePressed(evt);
            }
        });
        jPanel1.add(koniec_8);
        koniec_8.setBounds(710, 640, 40, 50);

        Dalej.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Dalej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dalej.png"))); // NOI18N
        Dalej.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dalej.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DalejMousePressed(evt);
            }
        });
        jPanel1.add(Dalej);
        Dalej.setBounds(800, 550, 200, 110);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(980, 0, 45, 29);

        Tlo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tlo.jpg"))); // NOI18N
        jPanel1.add(Tlo);
        Tlo.setBounds(0, 0, 1024, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru binarnego systemu wejściowego.
     * @param evt zdarzenie myszy
     */
    private void bin_wej_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_wej_boxMousePressed
    syst_wej[0]=!syst_wej[0]; //zmiana stanu wyboru systemu binarnego w tablicy stanu systemów wejściowych
    if(syst_wej[0]) bin_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png"))); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else bin_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png")));
    }//GEN-LAST:event_bin_wej_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru czwórkowego systemu wejściowego.
     * @param evt zdarzenie myszy
     */
    private void czw_wej_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_czw_wej_boxMousePressed
    syst_wej[1]=!syst_wej[1]; //zmiana stanu wyboru systemu czwórkowego w tablicy stanu systemów wejściowych
    if(syst_wej[1]) czw_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else czw_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_czw_wej_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru ósemkowego systemu wejściowego.
     * @param evt zdarzenie myszy
     */
    private void os_wej_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_os_wej_boxMousePressed
    syst_wej[2]=!syst_wej[2]; //zmiana stanu wyboru systemu ósemkowego w tablicy stanu systemów wejściowych
    if(syst_wej[2]) os_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else os_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_os_wej_boxMousePressed
    /**
    * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru dziesiętnego systemu wejściowego.
    * @param evt zdarzenie myszy
    */
    private void dzies_wej_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dzies_wej_boxMousePressed
    syst_wej[3]=!syst_wej[3]; //zmiana stanu wyboru systemu dziesiętnego w tablicy stanu systemów wejściowych
    if(syst_wej[3]) dzies_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else dzies_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_dzies_wej_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru szesnastkowego systemu wejściowego.
     * @param evt zdarzenie myszy
     */
    private void szes_wej_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_szes_wej_boxMousePressed
    syst_wej[4]=!syst_wej[4]; //zmiana stanu wyboru systemu szesnastkowego w tablicy stanu systemów wejściowych
    if(syst_wej[4]) szes_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else szes_wej_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_szes_wej_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru binarnego systemu wyjściowego.
     * @param evt zdarzenie myszy
     */
    private void bin_wyj_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_wyj_boxMousePressed
    syst_wyj[0]=!syst_wyj[0]; //zmiana stanu wyboru systemu binarnego w tablicy stanu systemów wyjściowych
    if(syst_wyj[0]) bin_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else bin_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_bin_wyj_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru czwórkowego systemu wyjściowego.
     * @param evt zdarzenie myszy
     */
    private void czw_wyj_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_czw_wyj_boxMousePressed
    syst_wyj[1]=!syst_wyj[1]; //zmiana stanu wyboru systemu czwórkowego w tablicy stanu systemów wyjściowych
    if(syst_wyj[1]) czw_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else czw_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_czw_wyj_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru ósemkowego systemu wyjściowego.
     * @param evt zdarzenie myszy
     */
    private void os_wyj_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_os_wyj_boxMousePressed
    syst_wyj[2]=!syst_wyj[2]; //zmiana stanu wyboru systemu ósemkowego w tablicy stanu systemów wyjściowych
    if(syst_wyj[2]) os_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else os_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_os_wyj_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru dziesiętnego systemu wyjściowego.
     * @param evt zdarzenie myszy
     */
    private void dzies_wyj_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dzies_wyj_boxMousePressed
    syst_wyj[3]=!syst_wyj[3]; //zmiana stanu wyboru systemu dziesiętnego w tablicy stanu systemów wyjściowych
    if(syst_wyj[3]) dzies_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png") ) ); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else dzies_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png") ) );
    }//GEN-LAST:event_dzies_wyj_boxMousePressed
    /**
     * Wykrycie przyciśnięcia "checkboxa" odpowiadającego za stan wyboru szesnastkowego systemu wyjściowego.
     * @param evt zdarzenie myszy
     */
    private void szes_wyj_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_szes_wyj_boxMousePressed
    syst_wyj[4]=!syst_wyj[4]; //zmiana stanu wyboru systemu szesnastkowego w tablicy stanu systemów wyjściowych
    if(syst_wyj[4]) szes_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/ok.png"))); //ustawienie grafiki odpowiadającej aktualnemu stanowi wyboru systemu
    else szes_wyj_box.setIcon(new ImageIcon(getClass().getResource("/img/nok.png")));
    }//GEN-LAST:event_szes_wyj_boxMousePressed
    /**
     * Wykrycie przyciśnięcia przycisku &gt;&gt; oraz sprawdzenie poprawności wybranych parametrów.
     * @param evt zdarzenie myszy
     */
    private void DalejMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DalejMousePressed
        licznik_syst_wej=0; //zerowanie licznika systemów wejściowych
        licznik_syst_wyj=0; //zerowanie licznika systemów wyjściowych
        takie_same=false; //wyzerowanie zmiennej kontrolnej
        for(int i=0; i<5; i++) //zliczanie ilości wybranych systemów
        {
            if(syst_wej[i]) licznik_syst_wej++;
            if(syst_wyj[i]) licznik_syst_wyj++;
        }

        if((licznik_syst_wej==1)&&(licznik_syst_wyj==1)) //sprawdzenie czy jest wybrany dokładnie jeden system wejściowy oraz jeden wyjściowy
        {
            for(int i=0;i<5;i++)
            {
                if((syst_wej[i])&&(syst_wyj[i])) //sprawdź czy wybrany został ten sam system jako wejściowy i wyjściowy
                {
                    takie_same=true; //ustaw zmienną kontrolną
                }
            }
        }
        if (takie_same) JOptionPane.showMessageDialog(this,"Należy wybrać dwa różne systemy liczbowe.", "Błąd",JOptionPane.WARNING_MESSAGE); //sprawdzenie zmiennej kontrolnej oraz wyświetlenie odpowiedniego komunikatu błędu
        else if(licznik_syst_wej==0 || licznik_syst_wyj==0) JOptionPane.showMessageDialog(this, "Należy wybrać co najmniej po jednym systemie wejściowym i wyściowym.", "Błąd", JOptionPane.WARNING_MESSAGE); //sprawdzenie czy użytkownik nie wybrał żadnego systemu z systemów wejściowych lub wyjściowych i wyświetlenie odpowiedniego komunikatu błędu
        else if(cyfry_start>cyfry_koniec)JOptionPane.showMessageDialog(this, "Końcowa ilość cyfr musi być większa od ilości cyfr końcowych.", "Błąd", JOptionPane.WARNING_MESSAGE); //sprawdzenie poprawności wyboru ilości cyfr - czy początkowa ilość cyfr jest większa od końcowej i w takim przypadku wyświetlenie odpowiedniego komunikatu błędu
        else
        {
            PanelGry panel_gry = new PanelGry();  //stwórz nowy obiekt klasy PanelGry o nazwie panel_gry
            this.dispose(); //zamknij bieżące okno
            panel_gry.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno panel_gry     
            panel_gry.setVisible(true); //ustaw okno panel_gry jako widoczne
        }
    }//GEN-LAST:event_DalejMousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór początkowej ilości cyfr jako 2 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void start_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_2MousePressed
        if(cyfry_start!=2) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako początkową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_start=2;
            start_2.setIcon(new ImageIcon(getClass().getResource("/img/2_act.png")));
            start_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            start_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            start_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            start_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            start_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            start_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_start_2MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór początkowej ilości cyfr jako 3 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void start_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_3MousePressed
        if(cyfry_start!=3) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako początkową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_start=3;
            start_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            start_3.setIcon(new ImageIcon(getClass().getResource("/img/3_act.png")));
            start_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            start_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            start_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            start_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            start_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_start_3MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór początkowej ilości cyfr jako 4 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void start_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_4MousePressed
        if(cyfry_start!=4) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako początkową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_start=4;
            start_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            start_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            start_4.setIcon(new ImageIcon(getClass().getResource("/img/4_act.png")));
            start_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            start_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            start_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            start_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_start_4MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór początkowej ilości cyfr jako 5 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void start_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_5MousePressed
        if(cyfry_start!=5) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako początkową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_start=5;
            start_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            start_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            start_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            start_5.setIcon(new ImageIcon(getClass().getResource("/img/5_act.png")));
            start_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            start_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            start_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_start_5MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór początkowej ilości cyfr jako 6 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void start_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_6MousePressed
        if(cyfry_start!=6) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako początkową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_start=6;
            start_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            start_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            start_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            start_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            start_6.setIcon(new ImageIcon(getClass().getResource("/img/6_act.png")));
            start_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            start_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_start_6MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór początkowej ilości cyfr jako 7 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void start_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_7MousePressed
        if(cyfry_start!=7) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako początkową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_start=7;
            start_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            start_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            start_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            start_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            start_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            start_7.setIcon(new ImageIcon(getClass().getResource("/img/7_act.png")));
            start_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_start_7MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór początkowej ilości cyfr jako 8 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void start_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_8MousePressed
        if(cyfry_start!=8) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako początkową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_start=8;
            start_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            start_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            start_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            start_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            start_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            start_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            start_8.setIcon(new ImageIcon(getClass().getResource("/img/8_act.png")));
        }
    }//GEN-LAST:event_start_8MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór końcowej ilości cyfr jako 2 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void koniec_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koniec_2MousePressed
       if(cyfry_koniec!=2) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako końcową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_koniec=2;
            koniec_2.setIcon(new ImageIcon(getClass().getResource("/img/2_act.png")));
            koniec_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            koniec_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            koniec_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            koniec_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            koniec_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            koniec_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_koniec_2MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór końcowej ilości cyfr jako 3 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void koniec_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koniec_3MousePressed
       if(cyfry_koniec!=3) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako końcową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_koniec=3;
            koniec_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            koniec_3.setIcon(new ImageIcon(getClass().getResource("/img/3_act.png")));
            koniec_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            koniec_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            koniec_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            koniec_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            koniec_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_koniec_3MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór końcowej ilości cyfr jako 4 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void koniec_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koniec_4MousePressed
       if(cyfry_koniec!=4) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako końcową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_koniec=4;
            koniec_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            koniec_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            koniec_4.setIcon(new ImageIcon(getClass().getResource("/img/4_act.png")));
            koniec_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            koniec_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            koniec_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            koniec_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_koniec_4MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór końcowej ilości cyfr jako 5 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void koniec_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koniec_5MousePressed
       if(cyfry_koniec!=5) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako końcową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_koniec=5;
            koniec_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            koniec_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            koniec_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            koniec_5.setIcon(new ImageIcon(getClass().getResource("/img/5_act.png")));
            koniec_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            koniec_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            koniec_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_koniec_5MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór końcowej ilości cyfr jako 6 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void koniec_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koniec_6MousePressed
       if(cyfry_koniec!=6) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako końcową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_koniec=6;
            koniec_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            koniec_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            koniec_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            koniec_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            koniec_6.setIcon(new ImageIcon(getClass().getResource("/img/6_act.png")));
            koniec_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            koniec_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_koniec_6MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór końcowej ilości cyfr jako 7 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void koniec_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koniec_7MousePressed
       if(cyfry_koniec!=7) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako końcową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_koniec=7;
            koniec_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            koniec_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            koniec_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            koniec_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            koniec_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            koniec_7.setIcon(new ImageIcon(getClass().getResource("/img/7_act.png")));
            koniec_8.setIcon(new ImageIcon(getClass().getResource("/img/8_nact.png")));
        }
    }//GEN-LAST:event_koniec_7MousePressed
    /**
     * Wykrycie przyciśnięcia przycisku odpowiadającego za wybór końcowej ilości cyfr jako 8 oraz ustawienie grafik "wygaszonych" cyfr na pozostałych opcjach.
     * @param evt zdarzenie myszy
     */
    private void koniec_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koniec_8MousePressed
       if(cyfry_koniec!=8) //sprawdź czy inna opcja była włączona, jeśli tak - ustaw tą ilość cyfr jako końcową, "podświetl" ją i "wygaś" pozostałe
        {
            cyfry_koniec=8;
            koniec_2.setIcon(new ImageIcon(getClass().getResource("/img/2_nact.png")));
            koniec_3.setIcon(new ImageIcon(getClass().getResource("/img/3_nact.png")));
            koniec_4.setIcon(new ImageIcon(getClass().getResource("/img/4_nact.png")));
            koniec_5.setIcon(new ImageIcon(getClass().getResource("/img/5_nact.png")));
            koniec_6.setIcon(new ImageIcon(getClass().getResource("/img/6_nact.png")));
            koniec_7.setIcon(new ImageIcon(getClass().getResource("/img/7_nact.png")));
            koniec_8.setIcon(new ImageIcon(getClass().getResource("/img/8_act.png")));
        }
    }//GEN-LAST:event_koniec_8MousePressed
    /**
     * Wykrycie wciśnięcia przycisku przechodzącego do menu - zamykanie bieżącego okna i otwieranie okna menu głównego gry.
     * @param evt zdarzenie myszy
     */
    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        this.dispose(); //zamknij bieżące okno
        MenuGlowne menu = new MenuGlowne(); //stwórz nowy obiekt klasy MenuGlowne o nazwie menu
        menu.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno menu
        menu.setVisible(true); //ustaw okno menu jako widoczne
    }//GEN-LAST:event_exitMousePressed

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
            java.util.logging.Logger.getLogger(Wybor_systemow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wybor_systemow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wybor_systemow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wybor_systemow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wybor_systemow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dalej;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Tlo;
    private javax.swing.JLabel bin_wej;
    private javax.swing.JLabel bin_wej_box;
    private javax.swing.JLabel bin_wyj;
    private javax.swing.JLabel bin_wyj_box;
    private javax.swing.JLabel cyf_koniec;
    private javax.swing.JLabel cyf_start;
    private javax.swing.JLabel czw_wej;
    private javax.swing.JLabel czw_wej_box;
    private javax.swing.JLabel czw_wyj;
    private javax.swing.JLabel czw_wyj_box;
    private javax.swing.JLabel dziej_wej;
    private javax.swing.JLabel dzies_wej_box;
    private javax.swing.JLabel dzies_wyj;
    private javax.swing.JLabel dzies_wyj_box;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel koniec_2;
    private javax.swing.JLabel koniec_3;
    private javax.swing.JLabel koniec_4;
    private javax.swing.JLabel koniec_5;
    private javax.swing.JLabel koniec_6;
    private javax.swing.JLabel koniec_7;
    private javax.swing.JLabel koniec_8;
    private javax.swing.JLabel os_wej;
    private javax.swing.JLabel os_wej_box;
    private javax.swing.JLabel os_wyj;
    private javax.swing.JLabel os_wyj_box;
    private javax.swing.JLabel start_2;
    private javax.swing.JLabel start_3;
    private javax.swing.JLabel start_4;
    private javax.swing.JLabel start_5;
    private javax.swing.JLabel start_6;
    private javax.swing.JLabel start_7;
    private javax.swing.JLabel start_8;
    private javax.swing.JLabel sys_wej;
    private javax.swing.JLabel sys_wyj;
    private javax.swing.JLabel szes_wej;
    private javax.swing.JLabel szes_wej_box;
    private javax.swing.JLabel szes_wyj;
    private javax.swing.JLabel szes_wyj_box;
    // End of variables declaration//GEN-END:variables
}
