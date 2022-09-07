class Solution {
   public static int isStackPermutation(int n, int[] ip, int[] op) {
       // code here
       Stack<Integer> stack = new Stack<>();
       int j=0;
       for(int i=0;i<n;i++){
           stack.push(ip[i]);
           while(!stack.empty() && stack.peek()==op[j]){
               stack.pop();
               j++;
           }
       }
       if(j==n){
       return 1;
       }else{
           return 0;
       }
       
   }
}
