class HashTableFunctions
{
   // hash function weights
   // 9 integers, each in the range 0-5 to act as weights for the characters in the keys
   int [] weights =  {9, 9, 1, 4, 5, 6, 7, 8, 9};//TestHashTable.getWeights();
   // ADD YOUR WEIGHTS INSTEAD OF 1s

   // returns True if the hash table contains string s
   // return False if the hash table does not contain string s
   boolean find ( String s, int h, int hashTableSize, String [] hashTableArray )
   {
      // for (int i = 0; i < hashTableSize; i++) 
      // {
         if (s.compareTo(hashTableArray[h])==0)
         {
            return true;
         }
      // }
      return false; 
   }
}
