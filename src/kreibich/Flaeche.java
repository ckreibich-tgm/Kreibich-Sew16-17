package kreibich;

/**
 * Autor:Güngür Oguzhan
 * @author Güngür Oguzhan
 * @version 16.11.16
 * @Zweck Teamarbeit
 */


public class Flaeche {
	double fleache;
	
	/**
	 * Konstruktor für Fläche
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
	 * @param a länge
	 */
	private void fleacheQuadrat(double a){
		fleache = a*a;
	}
	/**
	 * Fläche von einem normalen Rechteck wird berechnet
	 * @param a länge
	 * @param b breite
	 */
	private void fleacheRechteck(double a, double b){
		fleache = a*b;
	}
	/**
	 * Die Fläche vom Dreieck wird berechnet 
	 * @param a seite
	 * @param b seite
	 * @param c seite
	 * @param h höhe
	 */
	private void fleacheDreieck(double a,double b,double c,double h){
		fleache = (a+b+c)*2/h;
	}
	/**
	 * Get Methode für Fläche
	 * @return
	 */
	double getfleache(){
		return this.fleache;
	}
	/**
	 * Set Methode für Fläche
	 * @return
	 */
	private double setfleache(){
		return this.fleache;
	}
}