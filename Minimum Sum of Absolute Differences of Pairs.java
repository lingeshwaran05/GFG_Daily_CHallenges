class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);long m=0;
        for(int i=0;i<N;i++){
            
             m+=Math.abs(A[i]-B[i]);
        }
        return (m);
    }
}
