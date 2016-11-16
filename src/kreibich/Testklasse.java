package kreibich;

/*
 * @author Agam Cheema
 * Begonnen am 13.11.2016 um 16:56 (Sonntag)
 * Beendet am 16.11.2016 um 8:28 (Mittwoch)
 */
public class Testklasse {
	/**
	 * Main Methode der Testklasse.
	 * @param args
	 */
  public static void main (String []args){
    System.out.println("Flaechenberechnung");
    
    /*
     * Erstellt ein neues Objekt von "Flaeche" und gibt eine Flaeche aus. 
     */
    Flaeche f1= new Flaeche(0,1,2,3);
      System.out.println(f1.getfleache());
      
      /*
       * Erstellt ein neues Objekt von "Flaeche" und gibt eine Flaeche aus. 
       */
    Flaeche f2= new Flaeche(1,1,2,3);
      System.out.println(f2.getfleache());
    
      /*
       * Erstellt ein neues Objekt von "Flaeche" und gibt eine Flaeche aus. 
       */
    Flaeche f3= new Flaeche(2,1,2,3);
      System.out.println(f3.getfleache());
    
    /*
     * Gibt "Rauminhalte" aus.
     */
    System.out.println("Rauminhalte")  ;
    
    /*
     * Erstellt ein neues Objekt von "Rauminhalt" und gibt eine Flaeche aus. 
     */
    Rauminhalt r1 = new Rauminhalt(1,2,3,0);
      System.out.println(r1.getInhalt());
      
      /*
       * Erstellt ein neues Objekt von "Rauminhalt" und gibt eine Flaeche aus. 
       */
    Rauminhalt r2 = new Rauminhalt(1,2,3,1);
      System.out.println(r2.getInhalt());
    
      /*
       * Erstellt ein neues Objekt von "Rauminhalt" und gibt eine Flaeche aus. 
       */
    Rauminhalt r3 = new Rauminhalt(1,2,3,2);
      System.out.println(r3.getInhalt());
    /*
     * Gibt "BErechnung von Zahlen aus"
     */
    System.out.println("Berechnung von Zahlen");
    
    /*
     *  Erstellt ein neues Objekt von "Maximum" und gibt eine Flaeche aus. 
     */
    //Array Index out of bounds fehler.
    Maximum m1 = new Maximum(1,2,3,4,5);
      System.out.println(m1.getSum());
      System.out.println(m1.getMax());
      System.out.println(m1.getMin());
      
    
      



  }

  
}