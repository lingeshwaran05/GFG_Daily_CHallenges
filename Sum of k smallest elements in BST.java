
class Tree {
    
    int k;
    
    int sum(Node root, int a) {
        k=a;//we can,t use 'k' as dynamic, so ..........
      return  summ(root);
    }
    int summ(Node root) { 
        //base conditions
        if(root==null)
        return 0;
        
        if(root.left==null&&root.right==null){
            if(k>0){
                 k--;
                return root.data;
                
                }
        return 0;
        }
// left call
        int left=sum(root.left,k);
        
    //in order work
        if(k>0){
            left+=root.data;
            k--;
        }
//right call
        left+=sum(root.right,k);
        
        return left;
    }
