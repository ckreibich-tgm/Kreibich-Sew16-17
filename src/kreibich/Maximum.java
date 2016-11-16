package kreibich;


/**
 * 
 * @author
 * Christian Kreibich
 * Begonnen am 15.11.2016 19:30 Dienstag
 * Beendet  am 16.11.2016 8:20 Mittwoch
**/
public class Maximum {
  
  /**
   * Fertiggestellt am 15.11.2016 19:35 Sonntag
   * Befüllt Array mit Integern und führt die Berechnungsmethoden aus
   * 
   * **/
  public Maximum(int z1,int z2,int z3,int z4,int z5){
    nums[0]=z1;
    nums[1]=z2;
    nums[2]=z3;
    nums[3]=z4;
    nums[4]=z5;
    Sum();
    Max();
    Min();
  }
    int[] nums=new int[5];
    int sum;
    int max;
    int min;
  
  /**
   * Fertiggestellt am 15.11.2016 19:37 Sonntag
   * Gibt Summe zurück
   * 
   * **/
  public int getSum(){
    return sum;  
  }
  
  /**
   * Fertiggestellt am 15.11.2016 19:40 Sonntag
   * Gibt Maximum zurück
   * 
   * **/
  public int getMax(){
    return max;  
  }
  
  /**
   * Fertiggestellt am 15.11.2016 19:41 Sonntag
   * Gibt Minimum zurück
   * 
   * **/
  public int getMin(){
    return min;
  }
  
  /**
   * Fertiggestellt am 15.11.2016 19:42 Sonntag
   * Summe berechnen
   * 
   * **/
  private void Sum(){
    for(int z=0;z<5;z++){
      sum=sum+nums[z];
    }
  }
  /**
   * Fertiggestellt am 15.11.2016 19:44 Sonntag
   * Maximum berechnen
   * 
   * **/
  private void Max(){
    max=nums[0];
    for(int z=1;z<5;z++){
      if(nums[z]>max){
        max=nums[z];
        for(int y=1;y<5;y++){
          if(nums[y-1]>nums[y]){
            max=nums[y-1];
          }else{
            max=nums[y];
          }
        }
      }
    }
  }
  /**
   * Fertiggestellt am 15.11.2016 19:45 Sonntag
   * Minumum berechnen
   * 
   * **/
  private void Min(){
    min=nums[0];
    for(int z=0;z<5;z++){
      if(nums[z]<min){
        min=nums[z];
        for(int y=1;y<5;y++){
          if(nums[y-1]<nums[y]){
            max=nums[y-1];
          }else{
            max=nums[y];
          }
        }
    
      }
    }
  }
}