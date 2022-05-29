import java.util.*;
import java.nio.file.*;

class TestHashTable
{
   static int[] weights;
      public static int[] getWeights(){
         return weights;
      }
      
   public TestHashTable ()
   {
   }
   
   void run ( int threshold )
   {
      HashTable h = new HashTable ();
      
      int hit1=0, miss1=0, hit2=0, miss2=0;
      List<String> lines = null;
      List<String> linesmiss = null;
   
      try {
         lines = Files.readAllLines (Paths.get ("names36.txt"));
         //linesmiss = Files.readAllLines (Paths.get ("namesmiss.txt"));
      } catch (Exception e) {
         System.out.println (e.toString ());
      }   
      
      // for ( int i=0; i<lines.size (); i++ )
      // {
      //    h.insert (lines.get (i));
      // }
      
      // for ( int i=0; i<lines.size (); i++ )
      // {
      //    if (h.find (lines.get(i)))
      //       hit1++;
      //    else
      //       miss1++;
      // }

      // for ( int i=0; i<linesmiss.size (); i++ )
      // {
      //    if (h.find (linesmiss.get(i)))
      //       hit2++;
      //    else
      //       miss2++;
      // }
      for (int i =0; i<5; i++){
         for (int j =0; j<5; j++){
            for (int k =0; k<5; k++){
               for (int l =0; l<5; l++){
                  for (int m =0; m<5; m++){
                     for (int n =0; n<5; n++){
                        for (int o =0; o<5; o++){
                           for (int p =0; p<5; p++){
                              for (int q =0; q<5; q++){
                                 int[] temp = {i,j,k,l,m,n,o,p,q};
                                 weights = temp;
                                 for ( int e=0; e<lines.size (); e++ )
                                 {
                                    h.insert (lines.get (i));
                                 }
                                 for ( int d=0; d<lines.size (); d++ )
                                 {
                                    if (h.find (lines.get(d)))
                                       hit1++;
                                    else
                                       miss1++;
                                 }
                                 
                                 if(miss1==0){
                                    System.out.println(i+""+j+""+k+""+l+""+m+""+n+""+o+""+p+""+q);
                                 }
                                 miss1=0;


                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      
      System.out.println ("Collision Threshold: " + threshold);
      if (h.getCollisions () <= threshold)
         System.out.println ("Collisions Threshold Met!");
      else   
         System.out.println ("Collisions Threshold Not Met! Collisions = " + h.getCollisions ());
      System.out.println ("Seen data [Hit:Miss]: " + hit1 + ":" + miss1);
      System.out.println ("Unseen data [Hit:Miss]: " + hit2 + ":" + miss2);
   }

   public static void main ( String [] args )
   {
      (new TestHashTable ()).run(100/*Integer.valueOf (args[0])*/);
   }
}
