import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> loopCheck = new HashSet<>();
        while (n != 1 && !loopCheck.contains(n))    {
            loopCheck.add(n);   // needs to be added to Set before splitting the digits
            int sumToSquare = 0;    // reinitialize by 0 in every cycle since the sumToSquare is moved to n
            while (n != 0) {    // split the multi-digit number
                sumToSquare += (n%10)*(n%10);   // get the last digit and square it
                n /= 10;                        // get the first digit
            }
            n = sumToSquare;   
        }
        return n==1;    // if(n==1) return true
    }
    
}