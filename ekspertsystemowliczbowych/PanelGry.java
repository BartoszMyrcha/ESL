/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspertsystemowliczbowych;

import java.awt.Cursor;
import java.util.Random;
import javax.swing.*;
/**
 * Okno gry.
 * @author Bartosz Myrcha
 */
public class PanelGry extends javax.swing.JFrame {

    /**
     * Główny konstruktor klasy - ukrycie obramowania okna, inicjalizacja komponentów okna, ustawianie zmiennych.
     */
    public PanelGry() {
        this.setUndecorated(true);
        initComponents();
        klawisz0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        punkty=0;
        seria=0;
        for(int i=0; i<5; i++) //inicjalizacja tablic z systemami
        {
            if(Wybor_systemow.syst_wej[i])
            {
                switch(i){
                    case 0: wybrane_syst_wej[licznik_wej]=2;
                            break;
                    case 1: wybrane_syst_wej[licznik_wej]=4;
                            break;
                    case 2: wybrane_syst_wej[licznik_wej]=8;
                            break;
                    case 3: wybrane_syst_wej[licznik_wej]=10;
                            break;
                    case 4: wybrane_syst_wej[licznik_wej]=16;
                            break;
                }
                licznik_wej++;
            }
            if(Wybor_systemow.syst_wyj[i])
            {
                switch(i){
                    case 0: wybrane_syst_wyj[licznik_wyj]=2;
                            break;
                    case 1: wybrane_syst_wyj[licznik_wyj]=4;
                            break;
                    case 2: wybrane_syst_wyj[licznik_wyj]=8;
                            break;
                    case 3: wybrane_syst_wyj[licznik_wyj]=10;
                            break;
                    case 4: wybrane_syst_wyj[licznik_wyj]=16;
                            break;
                }
                licznik_wyj++;
            }
        }
        ilosc_cyfr=Wybor_systemow.cyfry_start; //pobranie początkowej ilości cyfr
        inicjalizuj_gre(); //inicjalizacja poziomu
    }
    
    boolean ok=true; //zmienna kontrolna
    boolean wcisniety=false; //zmienna kontrolna odpowiadająca za monitorowanie przyciśnięcia lewego przycisku myszy
    /** Wylosowany system wejściowy */
    public static int wylosowany_syst_wej;
    /** Wylosowany system wyjściowy */
    public static int wylosowany_syst_wyj;
    /** Aktualna ilość cyfr */
    public static int ilosc_cyfr;
    /** Aktaulne punkty */
    public static int punkty=0;
    /** Seria bez błędu */
    public static int seria=0;
    static int stara_liczba=-1;
    /** Tablica przechowująca informacje o wybranych systemach wejściowych */
    public static int[] wybrane_syst_wej = new int[5];
    /** Tablica przechowująca informacje o wybranych systemach wyjściowych */
    public static int[] wybrane_syst_wyj = new int[5];
    /** Tablica przechowująca pola, na których użytkownik będzie umieszczał cyfry     */
    public JLabel[] cyfry = new JLabel[Wybor_systemow.cyfry_koniec];
    /** Klawisz, który będzie przeciągany w czasie rzeczywistym     */
    public JLabel przeciagany = new JLabel();
    /** Tablica znaków przechowująca liczbę w wejściowym systemie liczbowym */
    public char[] liczba_do_wyswietlenia;
    /** Tablica znaków przechowująca liczbę w wyjściowym systemie liczbowym */
    public char[] popr_odpowiedz;
    char wcisniety_klawisz; //deklaracja znaku odpowiadającego przeciąganemu znakowi
    /** Tablica znaków przechowująca odpowiedź udzieloną przez użytkownika */
    public char[] odp_uzytkownika = new char[8];
    int licznik_wej=0, licznik_wyj=0; //deklaracja oraz inicjalizacja zmiennych dopowiadających za licznik systemów wejściowych oraz licznik systemów wyjściowych
    Liczba_dziesietna liczba = new Liczba_dziesietna(0); //stworzenie obiektu klasy Liczba_dziesiętna o nazwie liczba i wartości 0.
    
    
    
   
    
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        exit = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Liczba = new javax.swing.JLabel();
        klawisz0 = new javax.swing.JLabel();
        klawisz1 = new javax.swing.JLabel();
        klawisz2 = new javax.swing.JLabel();
        klawisz3 = new javax.swing.JLabel();
        klawisz4 = new javax.swing.JLabel();
        klawisz5 = new javax.swing.JLabel();
        klawisz6 = new javax.swing.JLabel();
        klawisz7 = new javax.swing.JLabel();
        klawisz8 = new javax.swing.JLabel();
        klawisz9 = new javax.swing.JLabel();
        klawiszA = new javax.swing.JLabel();
        klawiszB = new javax.swing.JLabel();
        klawiszC = new javax.swing.JLabel();
        klawiszD = new javax.swing.JLabel();
        klawiszE = new javax.swing.JLabel();
        klawiszF = new javax.swing.JLabel();
        label_syst_wej = new javax.swing.JLabel();
        liczba_label = new javax.swing.JLabel();
        label_syst_wyj = new javax.swing.JLabel();
        sprawdz = new javax.swing.JLabel();
        syst_wej = new javax.swing.JLabel();
        syst_wyj = new javax.swing.JLabel();
        label_wynik = new javax.swing.JLabel();
        pasek = new javax.swing.JLabel();
        Tlo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(null);

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jLayeredPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseDragged(evt);
            }
        });
        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLayeredPane1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseReleased(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jLayeredPane1.add(exit);
        exit.setBounds(980, 0, 45, 29);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLayeredPane1.add(Logo);
        Logo.setBounds(108, 0, 810, 90);

        Liczba.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Liczba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/liczba.png"))); // NOI18N
        jLayeredPane1.add(Liczba);
        Liczba.setBounds(20, 130, 220, 60);

        klawisz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz0.png"))); // NOI18N
        jLayeredPane1.add(klawisz0);
        klawisz0.setBounds(670, 410, 75, 75);

        klawisz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz1.png"))); // NOI18N
        jLayeredPane1.add(klawisz1);
        klawisz1.setBounds(750, 410, 75, 75);

        klawisz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz2.png"))); // NOI18N
        klawisz2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(klawisz2);
        klawisz2.setBounds(830, 410, 75, 75);

        klawisz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz3.png"))); // NOI18N
        klawisz3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(klawisz3);
        klawisz3.setBounds(910, 410, 75, 75);

        klawisz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz4.png"))); // NOI18N
        jLayeredPane1.add(klawisz4);
        klawisz4.setBounds(670, 490, 75, 75);

        klawisz5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz5.png"))); // NOI18N
        klawisz5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(klawisz5);
        klawisz5.setBounds(750, 490, 75, 75);

        klawisz6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz6.png"))); // NOI18N
        klawisz6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(klawisz6);
        klawisz6.setBounds(830, 490, 75, 75);

        klawisz7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz7.png"))); // NOI18N
        jLayeredPane1.add(klawisz7);
        klawisz7.setBounds(910, 490, 75, 75);

        klawisz8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz8.png"))); // NOI18N
        jLayeredPane1.add(klawisz8);
        klawisz8.setBounds(670, 570, 75, 75);

        klawisz9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz9.png"))); // NOI18N
        jLayeredPane1.add(klawisz9);
        klawisz9.setBounds(750, 570, 75, 75);

        klawiszA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszA.png"))); // NOI18N
        klawiszA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(klawiszA);
        klawiszA.setBounds(830, 570, 75, 75);

        klawiszB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszB.png"))); // NOI18N
        jLayeredPane1.add(klawiszB);
        klawiszB.setBounds(910, 570, 75, 75);

        klawiszC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszC.png"))); // NOI18N
        jLayeredPane1.add(klawiszC);
        klawiszC.setBounds(670, 650, 75, 75);

        klawiszD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszD.png"))); // NOI18N
        jLayeredPane1.add(klawiszD);
        klawiszD.setBounds(750, 650, 75, 75);

        klawiszE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszE.png"))); // NOI18N
        klawiszE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(klawiszE);
        klawiszE.setBounds(830, 650, 75, 75);

        klawiszF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszF.png"))); // NOI18N
        klawiszF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.add(klawiszF);
        klawiszF.setBounds(910, 650, 75, 75);

        label_syst_wej.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_syst_wej.setForeground(new java.awt.Color(255, 255, 255));
        label_syst_wej.setText("a");
        jLayeredPane1.add(label_syst_wej);
        label_syst_wej.setBounds(610, 250, 180, 58);

        liczba_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        liczba_label.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.add(liczba_label);
        liczba_label.setBounds(110, 190, 770, 50);

        label_syst_wyj.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_syst_wyj.setForeground(new java.awt.Color(255, 255, 255));
        label_syst_wyj.setText("b");
        label_syst_wyj.setToolTipText("");
        jLayeredPane1.add(label_syst_wyj);
        label_syst_wyj.setBounds(600, 340, 240, 58);

        sprawdz.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        sprawdz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sprawdz.png"))); // NOI18N
        sprawdz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sprawdz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sprawdzMousePressed(evt);
            }
        });
        jLayeredPane1.add(sprawdz);
        sprawdz.setBounds(220, 640, 371, 104);

        syst_wej.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/syst_wej.png"))); // NOI18N
        jLayeredPane1.add(syst_wej);
        syst_wej.setBounds(20, 240, 590, 70);

        syst_wyj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/syst_wyj.png"))); // NOI18N
        jLayeredPane1.add(syst_wyj);
        syst_wyj.setBounds(20, 310, 580, 100);

        label_wynik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_wynik.setText("PUNKTY: ");
        jLayeredPane1.add(label_wynik);
        label_wynik.setBounds(10, 748, 480, 22);

        pasek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pasek.png"))); // NOI18N
        jLayeredPane1.add(pasek);
        pasek.setBounds(0, 740, 500, 30);

        jPanel1.add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 1024, 768);

        Tlo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tlo.jpg"))); // NOI18N
        jPanel1.add(Tlo);
        Tlo.setBounds(0, 0, 1024, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Wykrycie przyciśnięcia napisu "Sprawdź" - sprawdzenie poprawności udzielonej odpowiedzi
     * @param evt zdarzenie myszy
     */
    private void sprawdzMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sprawdzMousePressed
        ok=true;
        for(int i=0; i<ilosc_cyfr; i++) //sprawdź czy odpowiedź użytkownika zgadza się z poprawną odpowiedzią
        {
            if(odp_uzytkownika[i]!=popr_odpowiedz[i])
                ok=false;
        }
        if(ok) //jeśli odpowiedź jest prawidłowa dodaj punkty i zwiększ serię o jeden
        {
            seria++; 
            punkty+=10*ilosc_cyfr*Math.pow(wylosowany_syst_wyj, 1/3); //dodawanie punktów
            if (seria%5==0) //sprawdzenie czy seria jest wielokrotnością liczby 5
            {
                if(ilosc_cyfr==Wybor_systemow.cyfry_koniec) //sprawdzenie czy osiągnięto końcową ilość cyfr
                {
                    if(Wybor_systemow.cyfry_koniec==8 && Wybor_systemow.licznik_syst_wej==5 && Wybor_systemow.licznik_syst_wyj==5) //sprawdzenie czy został wybrany pełen zakres możliwości testu
                    {
                        JOptionPane.showMessageDialog(this,"Jesteś ekspertem systemów liczbowych!", "Gratulacje!",JOptionPane.PLAIN_MESSAGE); //wyświetlenie komunikatu o ukończeniu gry
                    }else
                    {
                        JOptionPane.showMessageDialog(this,"Super! Jednak żeby być ekspertem musisz jeszcze poćwiczyć. :)", "Gratulacje!",JOptionPane.PLAIN_MESSAGE); //wyświetlenie komunikatu o zakonczeniu testu
                    }
                    this.dispose(); //zamknij bieżące okno
                    MenuGlowne menu = new MenuGlowne(); //stwórz nowy obiekt klasy MenuGlowne o nazwie menu
                    menu.setExtendedState(JFrame.MAXIMIZED_BOTH); //maksymalizuj okno menu
                    menu.setVisible(true); //ustaw okno menu jako widoczne
                }
                else
                {
                    skasuj_pola(ilosc_cyfr); //ukryj pola
                    ilosc_cyfr++; //zwiększ poziom trudności o jedną cyfrę
                   
                }
            }
        }
        else //jeśli została udzielona zła odpowiedź
        {
            if(punkty>15*ilosc_cyfr*wylosowany_syst_wyj) // sprawdź ilość punktów (aby nie było wyniku ujemnego) i odejmij je
            punkty-=15*ilosc_cyfr*wylosowany_syst_wyj;
            else
            punkty=0; //wyzeruj punkty
            seria=0; //wyzeruj serię
        }
        
        inicjalizuj_gre(); //inicjalizacja poziomu
        
        
    }//GEN-LAST:event_sprawdzMousePressed
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
     * Wykrycie wciśnięcia lewego przycisku myszy - wczytanie położenia myszy oraz sprawdzenie w jakim polu został przyciśnięty
     * @param evt zdarzenie myszy
     */
    private void jLayeredPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MousePressed
        if(evt.getX()>670 && evt.getX()<745 && evt.getY()>410 && evt.getY()<485) //sprawdź czy LPM został przyciśnięty w polu klawisza 0
        {
            wcisniety_klawisz='0'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz0.png"))); //ustaw odpowiednią grafikę dla przeciąganego klawisza
            
        } else if(evt.getX()>750 && evt.getX()<825 && evt.getY()>410 && evt.getY()<485)  //sprawdź czy LPM został przyciśnięty w polu klawisza 1
        {
            wcisniety_klawisz='1'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz1.png")));
        } else if(evt.getX()>830 && evt.getX()<905 && evt.getY()>410 && evt.getY()<485 && wylosowany_syst_wyj>2)  //sprawdź czy LPM został przyciśnięty w polu klawisza 2
        {
            wcisniety_klawisz='2'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz2.png")));
        } else if(evt.getX()>910 && evt.getX()<985 && evt.getY()>410 && evt.getY()<485 && wylosowany_syst_wyj>2)  //sprawdź czy LPM został przyciśnięty w polu klawisza 3
        {
            wcisniety_klawisz='3'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz3.png")));
        } else if(evt.getX()>670 && evt.getX()<745 && evt.getY()>490 && evt.getY()<565 && wylosowany_syst_wyj>4)  //sprawdź czy LPM został przyciśnięty w polu klawisza 4
        {
            wcisniety_klawisz='4'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz4.png")));
            
        } else if(evt.getX()>750 && evt.getX()<825 && evt.getY()>490 && evt.getY()<565 && wylosowany_syst_wyj>4)  //sprawdź czy LPM został przyciśnięty w polu klawisza 5
        {
            wcisniety_klawisz='5'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz5.png")));
        } else if(evt.getX()>830 && evt.getX()<905 && evt.getY()>490 && evt.getY()<565 && wylosowany_syst_wyj>4)  //sprawdź czy LPM został przyciśnięty w polu klawisza 6
        {
            wcisniety_klawisz='6'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz6.png")));
        } else if(evt.getX()>910 && evt.getX()<985 && evt.getY()>490 && evt.getY()<565 && wylosowany_syst_wyj>4)  //sprawdź czy LPM został przyciśnięty w polu klawisza 7
        {
            wcisniety_klawisz='7'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz7.png")));
        } else if(evt.getX()>670 && evt.getX()<745 && evt.getY()>570 && evt.getY()<645 && wylosowany_syst_wyj>8)  //sprawdź czy LPM został przyciśnięty w polu klawisza 8
        {
            wcisniety_klawisz='8'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz8.png")));
            
        } else if(evt.getX()>750 && evt.getX()<825 && evt.getY()>570 && evt.getY()<645 && wylosowany_syst_wyj>8)  //sprawdź czy LPM został przyciśnięty w polu klawisza 9
        {
            wcisniety_klawisz='9'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz9.png")));
        } else if(evt.getX()>830 && evt.getX()<905 && evt.getY()>570 && evt.getY()<645 && wylosowany_syst_wyj>10)  //sprawdź czy LPM został przyciśnięty w polu klawisza A
        {
            wcisniety_klawisz='A'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszA.png")));
        } else if(evt.getX()>910 && evt.getX()<985 && evt.getY()>570 && evt.getY()<645 && wylosowany_syst_wyj>10)  //sprawdź czy LPM został przyciśnięty w polu klawisza B
        {
            wcisniety_klawisz='B'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszB.png")));
        } else if(evt.getX()>670 && evt.getX()<745 && evt.getY()>650 && evt.getY()<725 && wylosowany_syst_wyj>10)  //sprawdź czy LPM został przyciśnięty w polu klawisza C
        {
            wcisniety_klawisz='C'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszC.png")));
            
        } else if(evt.getX()>750 && evt.getX()<825 && evt.getY()>650 && evt.getY()<725 && wylosowany_syst_wyj>10) //sprawdź czy LPM został przyciśnięty w polu klawisza D
        {
            wcisniety_klawisz='D'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszD.png")));
        } else if(evt.getX()>830 && evt.getX()<905 && evt.getY()>650 && evt.getY()<725 && wylosowany_syst_wyj>10) //sprawdź czy LPM został przyciśnięty w polu klawisza E
        {
            wcisniety_klawisz='E'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszE.png")));
        } else if(evt.getX()>910 && evt.getX()<985 && evt.getY()>650 && evt.getY()<725 && wylosowany_syst_wyj>10) //sprawdź czy LPM został przyciśnięty w polu klawisza F
        {
            wcisniety_klawisz='F'; //przypisz klawisz do zmiennej
            wcisniety=true; //ustaw zmienną kontrolną odpowiadającą za monitorowanie przyciśnięcia LPM
            przeciagany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszF.png")));
        }
        if(wcisniety) //sprawdź czy zmienna kontrolna monitorująca przyciśnięcie LPM jest ustawiona
        {
            getContentPane().add(przeciagany, 0); //dodaj przeciągany klawisz do panelu
            przeciagany.setBounds(evt.getX()-50,evt.getY()-50 , 75, 75); //ustaw położenie i wymiary przeciąganego klawisza
            przeciagany.setVisible(true); //ustaw przeciągany klawisz jako widoczny
        }
    }//GEN-LAST:event_jLayeredPane1MousePressed
    /**
     * Wykrycie przemieszczenia myszy podczas przyciśniętego LPM - przesuwanie klawisza za myszą. 
     * @param evt zdarzenie myszy
     */
    private void jLayeredPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseDragged
        if(wcisniety) //sprawdź czy zmienna kontrolna monitorująca przyciśnięcie LPM jest ustawiona
        {
            przeciagany.setBounds(evt.getX()-50,evt.getY()-50 , 75, 75); //ustaw położenie przeciąganego klawisza
            przeciagany.setCursor(new Cursor(Cursor.MOVE_CURSOR)); // ustaw wygląd kursora nad przeciąganym klawiszem
        }
    }//GEN-LAST:event_jLayeredPane1MouseDragged
    /**
     * Wykrycie puszczenia LPM - sprawdzenie położenia myszy, przypisanie przenoszonego klawisza do pola nad którym się znajdował w chwili puszczenia LPM. 
     * @param evt zdarzenie myszy
     */
    private void jLayeredPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseReleased
        if(wcisniety) //sprawdź czy zmienna kontrolna monitorująca przyciśnięcie LPM jest ustawiona
        {
            wcisniety=false; //zerowanie zmiennej monitorującej przyciśnięcie LPM
            przeciagany.setVisible(false); //ustaw przeciągany klawisz jako niewidoczny
            for (int i=0; i<ilosc_cyfr; i++) //sprawdzenie czy położenie myszy odpowiada położeniu któregokolwiek z pól
            {
                if(i<4) //pierwszy wiersz pól
                {
                    if(evt.getX()>(150+i*100) && evt.getX()<(225+i*100) && evt.getY()>450 && evt.getY()<525)
                    {
                        odp_uzytkownika[i]=wcisniety_klawisz; //przypisanie znaku do tablicy odpowiedzi użytkownika
                        cyfry[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz"+wcisniety_klawisz+".png"))); //ustawienie odpowiedniej grafiki klawisza w polu
                    }
                }
                else
                {
                    if((evt.getX()>(150+(i-4)*100)) && (evt.getX()<(225+(i-4)*100)) && (evt.getY()>550) && (evt.getY()<625))
                    {
                        odp_uzytkownika[i]=wcisniety_klawisz; //przypisanie znaku do tablicy odpowiedzi użytkownika
                        cyfry[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz"+wcisniety_klawisz+".png"))); //ustawienie odpowiedniej grafiki klawisza w polu
                    }
                        
                }
            }
        }
        
    }//GEN-LAST:event_jLayeredPane1MouseReleased

    /**
     * Metoda losująca systemy spośród wybranych systemów wejściowych oraz wyjściowych.
     */
    void losuj_systemy()
    {
        Random rand = new Random();
        wylosowany_syst_wej=wybrane_syst_wej[rand.nextInt(1000)%Wybor_systemow.licznik_syst_wej];
        do{
            wylosowany_syst_wyj=wybrane_syst_wyj[rand.nextInt(1000)%Wybor_systemow.licznik_syst_wyj];
        }while(wylosowany_syst_wej==wylosowany_syst_wyj);
        label_syst_wej.setText(Integer.toString(wylosowany_syst_wej));
        label_syst_wyj.setText(Integer.toString(wylosowany_syst_wyj));
        aktywuj_pola();
        dezaktywuj_pola();
    }
    /**
     * Metoda losująca liczbę mającą odpowiednią ilość cyfr w wyjściowym systemie liczbowym.
     */
    void losuj_liczbe()
    {
        Random rand = new Random();
        do
        {
        liczba.wartosc=(int)Math.pow(wylosowany_syst_wyj, ilosc_cyfr-1) + Math.abs(rand.nextInt()) %((int)Math.pow(wylosowany_syst_wyj, ilosc_cyfr) - (int)Math.pow(wylosowany_syst_wyj, ilosc_cyfr-1));
        } while(liczba.wartosc==stara_liczba);
        stara_liczba=liczba.wartosc;
    }
    /**
     * Metoda ustawiająca pola pod odpowiedź użytkownika.
     * @param ilosc_pol ilość pól do rozstawienia
     */
    void rozstaw_pola(int ilosc_pol)
    {        
        for(int i=0; i<ilosc_pol; i++)
        {   
            if(i<4)
            {
                cyfry[i]= new JLabel("");
                cyfry[i].setBounds(150+i*100, 450, 75, 75);
                jLayeredPane1.add(cyfry[i], 0);
                cyfry[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz_pole.png"))); 
            }else
            {
                cyfry[i]= new JLabel("");
                cyfry[i].setBounds(150+(i-4)*100, 550, 75, 75);
                jLayeredPane1.add(cyfry[i], 0);
                cyfry[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz_pole.png")));
            }
            
        }
    }
    /**
     * Metoda usuwająca pola pod odpowiedź.
     * @param ilosc_pol ilość pól do usunięcia
     */
    void skasuj_pola(int ilosc_pol)
    {
        for(int i=0; i<ilosc_pol; i++)
        {   
            jLayeredPane1.remove(cyfry[i]);      
        }
    }
    
    /**
     * Metoda "podświetlająca" wszystkie klawisze na wirtualnej klawiaturze.
     */
    void aktywuj_pola()
    {
        klawisz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz2.png")));
        klawisz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz3.png")));
        klawisz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz4.png")));
        klawisz5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz5.png")));
        klawisz6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz6.png")));
        klawisz7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz7.png")));
        klawisz8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz8.png")));
        klawisz9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz9.png")));
        klawiszA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszA.png")));
        klawiszB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszB.png")));
        klawiszC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszC.png")));
        klawiszD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszD.png")));
        klawiszE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszE.png")));
        klawiszF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszF.png")));
        klawisz2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawisz9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawiszA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawiszB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawiszC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawiszD.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawiszE.setCursor(new Cursor(Cursor.HAND_CURSOR));
        klawiszF.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    /**
     * Metoda wygaszająca poszególne pola w zależności od systemu wyjściowego.
     */
    void dezaktywuj_pola(){
        if(wylosowany_syst_wyj<=10)
        {
            klawiszA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszA_nact.png")));
            klawiszB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszB_nact.png")));
            klawiszC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszC_nact.png")));
            klawiszD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszD_nact.png")));
            klawiszE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszE_nact.png")));
            klawiszF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawiszF_nact.png")));
            klawiszA.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawiszB.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawiszC.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawiszD.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawiszE.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawiszF.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } 
        if(wylosowany_syst_wyj<=8)
        {
            klawisz8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz8_nact.png")));
            klawisz9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz9_nact.png")));
            klawisz8.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawisz9.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        if(wylosowany_syst_wyj<=4)
        {
            klawisz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz4_nact.png")));
            klawisz5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz5_nact.png")));
            klawisz6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz6_nact.png")));
            klawisz7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz7_nact.png")));
            klawisz4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawisz5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawisz6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawisz7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        if(wylosowany_syst_wyj<=2)
        {
            klawisz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz2_nact.png")));
            klawisz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klawisz3_nact.png")));
            klawisz2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            klawisz3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }
    /**
     * Metoda inicjalizująca poziom
     */
    void inicjalizuj_gre()
    {

        losuj_systemy(); //losowanie systemu wejściowego oraz wyjściowego        
        losuj_liczbe(); //losowanie liczby w systemie wejściowym
        rozstaw_pola(ilosc_cyfr); //wyświetlenie odpowiedniej ilości pól
        liczba_do_wyswietlenia=liczba.konwertuj_na(wylosowany_syst_wej); //konwersja wylosowanej liczby z dziesiętnego na wylosowany system wejściowy
        popr_odpowiedz=liczba.konwertuj_na(wylosowany_syst_wyj); //konwersja wylosowanej liczby z dziesiętnego na wylosowany system wyjściowy
        liczba_label.setText(""); //wyczyszczenie napisu
        for(int i=0; i<liczba.ilosc_cyfr_po_konwersji(wylosowany_syst_wej); i++) //wyświetlenie liczby, która ma zostać przekonwertowana
        liczba_label.setText(liczba_label.getText()+liczba_do_wyswietlenia[i]);
        label_wynik.setText("PUNKTY: "+punkty+" pkt.     SERIA BEZ POMYŁKI: "+seria); // wyświetlenie aktualnego stanu gry (ilość punktów oraz seria bezbłędnych odpowiedzi)    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelGry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Liczba;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Tlo;
    private javax.swing.JLabel exit;
    public javax.swing.JLayeredPane jLayeredPane1;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel klawisz0;
    private javax.swing.JLabel klawisz1;
    private javax.swing.JLabel klawisz2;
    private javax.swing.JLabel klawisz3;
    private javax.swing.JLabel klawisz4;
    private javax.swing.JLabel klawisz5;
    private javax.swing.JLabel klawisz6;
    private javax.swing.JLabel klawisz7;
    private javax.swing.JLabel klawisz8;
    private javax.swing.JLabel klawisz9;
    private javax.swing.JLabel klawiszA;
    private javax.swing.JLabel klawiszB;
    private javax.swing.JLabel klawiszC;
    private javax.swing.JLabel klawiszD;
    private javax.swing.JLabel klawiszE;
    private javax.swing.JLabel klawiszF;
    private javax.swing.JLabel label_syst_wej;
    private javax.swing.JLabel label_syst_wyj;
    private javax.swing.JLabel label_wynik;
    private javax.swing.JLabel liczba_label;
    private javax.swing.JLabel pasek;
    private javax.swing.JLabel sprawdz;
    private javax.swing.JLabel syst_wej;
    private javax.swing.JLabel syst_wyj;
    // End of variables declaration//GEN-END:variables
}