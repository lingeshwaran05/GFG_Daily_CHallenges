class Solution {
   public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) 
   {
    
    ArrayList<ArrayList<Integer>> al=new ArrayList<>();
    Node start=head;
    Node end=head;
    while(end.next!=null)
        end=end.next;
       
       while(start!=end&&end.next!=start)
       {
           int sum=start.data+end.data;
           if(sum==target)
           {
               ArrayList<Integer> temp=new ArrayList<>();
               temp.add(start.data);
               temp.add(end.data);
               
               al.add(new ArrayList<>(temp));
               start=start.next;
               end=end.prev;
           }
           else if(sum>target)
           end=end.prev;
           else
           start=start.next;
       }
       
       return al;
   }
   }
