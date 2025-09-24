//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
public class Esercizio {

    //Creo l'oggetto in per l'input da tastiera
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Variabili del programma
        String c;
        int n, i, e;

        System.out.println("Inserisci la dimensione del vettore: ");
        n = Integer.parseInt( input.nextLine() );

        // Alloco più spazio rispetto alla dimensione effettiva perchè sul vettore saranno effettuate operazioni di inserimento e cancellazione.
        int[] v = new int[n * 10];

        azzeraVettore(v, n);

        do {
            c = leggiComando();
            if (c.equals("I")) {
                System.out.println("Valore da inserire");
                e = Integer.parseInt( input.nextLine() );
                do {
                    System.out.println("In quale posizione?");
                    i = Integer.parseInt( input.nextLine() );
                } while (i < 0 || i > n);

                n = inserisciInVettoreFast(v, n, e, i);
            }
            if ( c.equals("E") ) {
                if (n > 1) {
                    do {
                        System.out.println("Quale cella del vettore eliminare? (indice)");
                        i = Integer.parseInt( input.nextLine() );
                    } while (i < 0 || i >= n);

                    n = eliminaDaVettoreFast(v, n, i);
                } else {
                    System.out.println("Non posso eliminare celle da un vettore di un solo elemento");
                }
            }
            if (c.equals("R")) {
                System.out.println("Valore da cercare");
                e = Integer.parseInt(input.nextLine());
                i = ricercaNelVettore(v, n, e);
                if (i >= 0) {
                    System.out.println("elemento " + e + " trovato in posizione " + i);
                } else {
                    System.out.println("Elemento " + e + " non trovato.");
                }
            }
            if (c.equals("D")) {
                System.out.println("Rimozione dei duplicati");

                n = rimuoviDuplicatiFunz(v, n);
            }
            if (c.equals("V")) {
                visualizzaVettore(v, n);
            }
        } while (!c.equals("X"));

        input.close();
    }
    
    //--- Definizione di tutti i metodi ---//

    public static void azzeraVettore(int[] v, int n) {
        int i;

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
    }
        
    public static int eliminaDaVettoreFast(int[] v, int n, int ie) {
        return 0;
    }
    
    public static int inserisciInVettore(int[] v, int n, int e, int ie) {        
        return 0;
    }
    
    public static int inserisciInVettoreFast(int[] v, int n, int e, int ie) {        
        return 0;
    }
    
    public static String leggiComando() {
        String c;

        do {
            System.out.println("1. [I]nserisci elemento " + (char) 10 + "2. [E]limina elemento " + (char) 10 + "3. [R]icerca valore " + (char) 10 + "4. [D] Elimina Duplicati " + (char) 10 + "5. [V]isualizza vettore " + (char) 10 + "6. [X] Esci");
            c = input.nextLine();
        } while (!c.equals("I") && !c.equals("E") && !c.equals("R") && !c.equals("D") && !c.equals("V") && !c.equals("X"));
        
        return c;
    }
    
    public static int ricercaNelVettore(int[] v, int n, int valore) {        
        return 0;
    }
        
    public static int rimuoviDuplicatiFunz(int[] v, int n) {        
        return 0;
    }
    
    public static void visualizzaVettore(int[] v, int n) {
        int i;

        System.out.println("-------");

        i = 0;
        while (i < n) {
            System.out.println(Integer.toString(i) + ": " + v[i]);
            i = i + 1;
        }

        System.out.println("-------");
    }
}