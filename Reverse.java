public class Reverse {
    class Solution {
    public int reverse(int x) {
       int r;
       long rev=0;
       while(x!=0){
           r=x%10;
           rev=rev*10+r;
           x=x/10;
        }
        if(rev>2147483647||rev<-2147483648){
           return 0;
        }
     return (int) rev;
    }
}
}
