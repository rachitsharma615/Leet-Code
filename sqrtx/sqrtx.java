class Solution {
public int mySqrt(int x) {
int l = 1, r=x;
while(r>l){
int m = l+(r-l)/2;

        int div = x/m;
        if(m == div)
            return m;
        
        else if(m>div)
            r = m-1;
        else
            l = m+1;
    }
    
    if(l>(x/l))
        return l-1;
    return l;
}
}