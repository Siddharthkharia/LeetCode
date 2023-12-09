package easy;

public class CountOfMatchesTournament {

    public static void main(String[] args){
        int n =7;
    }

    public static int numberofmatches(int n){
        int count=0;
        return matchCount(n,0);
    }
    public static int matchCount(int n,int count){
        if(n!=1){
            if(n%2==0) {
                count=count+(n/2);
                return matchCount(n / 2, count);
            }else{
                count=count+(n-1)/2;
                return matchCount((n-1)/2+1,count);
            }
        }else{
            return count;
        }
    }

    public static int matchCount(int n) {
        int count = 0;
        if(n==1){
            return 1;
        }else{
            while (n != 1) {
                if (n % 2 == 0) {
                    count = count + (n / 2);
                    n=n/2;
                } else {
                    count = count + (n - 1) / 2;
                    n=(n-1)/2 + 1;
                }
            }
            return count;
        }
    }


    public static int rounds(int n){
        int count=0;
        while(n/2!=1){
            if(n%2==0){
                n=n/2;
                count++;
            }else{
                n=(n/2)+1;
                count++;
            }
        }
        return count++;
    }
}