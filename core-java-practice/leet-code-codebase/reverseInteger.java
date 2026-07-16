class Solution {
    public int reverseInteger(int x) {
        if (x < 0) {
            return rev(x);
        } else if (x == 0) {
            return 0;
        } else {
            return rev1(x);
        }
    }

    int rev(int num) {
        int n = Math.abs(num);
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;

            
            if (sum > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            sum = (sum * 10) + digit;
            n = n / 10;
        }
        return -sum;  
    }

    int rev1(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;

            
            if (sum > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            sum = (sum * 10) + digit;
            num = num / 10;
        }
        return sum;
    }
}