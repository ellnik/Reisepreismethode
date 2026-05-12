/**
 * 
 */
package reisenpreismethode;

/**
 * 
 */
public class Reisenpreismethode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  int E       = 2;      // Anzahl der Erwachsenen
		  double PE   = 1000;  // Preis pro einen Erwachsenen
		  int K       = 1;      // Anzahl der Kinder
		  double PK   = 800;  // Preis pro Kind.
		  int N       = 10;      // Anzahl der Nächte
		  double t    = 2.5;   // Nachtpauschele in €
		  
		  // Grundpreis
		  double grundpreis = E * PE + K * PK;
		  
		  // Nachlässe
		  double kinderabzug = 20 * K;
		  double gruppenrabatt = prozentbetrag(grundpreis, 3);
		  double onlineRabatt = prozentbetrag(grundpreis, 2);

		  // Preis zu zahlen
		  double preisZuZahlen = grundpreis - kinderabzug - gruppenrabatt - onlineRabatt;
		  
		  // Mehrwertsteuer
		  double mehrwertsteuer = prozentbetrag(preisZuZahlen, 19);
		  
		  // Preis zu zahlen
		  preisZuZahlen = preisZuZahlen + mehrwertsteuer;
		  
		  // Kurtaxe
		  double kurtaxe = (E + K) * N * t;
		  
		  // Preis zu zahlen
		  preisZuZahlen = preisZuZahlen + kurtaxe;

		  System.out.println("Zu zahlen " + preisZuZahlen);
		      
		  }
		  
		  /**
		   * Berechnet den Prozentbetrag 
		   */
		     static double prozentbetrag(double grundbetrag, double prozentzahl) {
		       
		      // System.out.println("12 " + grundbetrag + " " + prozentzahl);
		       double ergebnis = grundbetrag / 100 * prozentzahl;
		       
		       return ergebnis;
		     }
		     
		}


