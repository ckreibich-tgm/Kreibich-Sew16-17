package kreibich;

/**
 * Autor:G�ng�r Oguzhan
 * @author G�ng�r Oguzhan
 * @version 16.11.16
 * @Zweck Teamarbeit
 */


public class Flaeche {
	double fleache;
	
	/**
	 * Konstruktor f�r Fl�che
	 * @return
	 */
	public Flaeche(int art,int part1,int part2,int part3){
		 
		switch(art){
		 
		 case 0:
			 fleacheQuadrat(fleache);
			 break;
		 case 1:
			 fleacheRechteck(fleache, fleache);
			 break;
		 case 2:
			 fleacheDreieck(fleache, fleache, fleache, fleache);
			 break;
		}
	}
	/**
	 * Quadrat wird berechnet
	 * @param a l�nge
	 */
	private void fleacheQuadrat(double a){
		fleache = a*a;
	}
	/**
	 * Fl�che von einem normalen Rechteck wird berechnet
	 * @param a l�nge
	 * @param b breite
	 */
	private void fleacheRechteck(double a, double b){
		fleache = a*b;
	}
	/**
	 * Die Fl�che vom Dreieck wird berechnet 
	 * @param a seite
	 * @param b seite
	 * @param c seite
	 * @param h h�he
	 */
	private void fleacheDreieck(double a,double b,double c,double h){
		fleache = (a+b+c)*2/h;
	}
	/**
	 * Get Methode f�r Fl�che
	 * @return
	 */
	double getfleache(){
		return this.fleache;
	}
	/**
	 * Set Methode f�r Fl�che
	 * @return
	 */
	private double setfleache(){
		return this.fleache;
	}
}