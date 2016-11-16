package kreibich;

/**
*
* @author
* Semih Cakir
* Begonnen am 13.11.2016 14:30 Sonntag
* Beendet  am 16.11.2016 8:20 Mittwoch
*/
public class Rauminhalt {
   public double inhalt;
   /**Fertiggestellt am 13.11.2016 14:41 Sonntag
    * Konstruktor fuer Rauminhalt
    * @param par1 laenge/laenge/radius
    * @param par2 breite/breite/hoehe
    * @param par3 hoehe/hoehe/nicht vorhanden
    * @param art 0...Quader, 1...Pyramide, 2... Kegel
    */
   public Rauminhalt(int par1, int par2, int par3, int art){
       inhalt = 0;
       switch(art){
           case 0 : calcQuader(par1, par2, par3); 
               break;
           case 1: calcPyramid(par1, par2, par3);
               break;
           case 2: calcKegel(par1, par2);
           default: break;
               
       }

   }
   
   /**Fertiggestellt am 13.11.2016 14:50 Sonntag
    * innere Quaderberechnung
    * @param l laenge
    * @param b breite
    * @param h hoehe
    */
   private void calcQuader(int l, int b, int h){
       inhalt = l*b*h;
   }
   
   /**Fertiggestellt am 13.11.2016 14:53 Sonntag
    * innere Pyramidenberechnung Grundflaeche Rechteck
    * @param l laenge
    * @param b breite
    * @param h hoehe
    */
   private void calcPyramid(int l, int b, int h){
       inhalt = (1.0/3.0)*(l*b)*h;
   }

   /**Fertiggestellt am 13.11.2016 14:55 Sonntag
    * innere Kegelberechnung
    * @param r Radius
    * @param h Hoehe
    */
   private void calcKegel(int r, int h){
       inhalt = (1.0/3.0)*(Math.PI)*(r*r)*h;
   }
   
   /**Fertiggestellt am 13.11.2016 14:59 Sonntag
    * gibt inhalt zurueck
    * @return inhalt
    */
   public double getInhalt(){
       return inhalt;
   }
}