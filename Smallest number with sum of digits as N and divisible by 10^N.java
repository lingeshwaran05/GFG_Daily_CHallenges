int m=N%9;
        int n=N/9;
        String s="";
        if(m!=0){
            s+=m;
        }
        for(int i=1;i<=n;i++)
        {
            s+='9';
        }
        for(int i=0;i<N;i++){
            s+='0';
        }
        return s;
