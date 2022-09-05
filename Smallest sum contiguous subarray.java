

//Kadane Algorithm 

 

class Solution
{
   static int smallestSumSubarray(int a[], int size)
   {
       int ans= Integer.MAX_VALUE, curr = 0;
 
       for (int i = 0; i < size; i++)
       {
           curr=Math.min(curr+a[i],a[i]);
           ans=Math.min(ans,curr);
       }
       return ans;
   }
