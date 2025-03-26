public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public static boolean isPrime(long n) {
        if (n <= 1) {return false;}
        if (n == 2) {return true;}
        for(int i = 2 ; i <Math.sqrt(n) ; i++)
        {
            if (n % i == 0)
                return false;}
        if(n>0)
            return true;
        return false;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */

    public long fibonacciIndex(long n) {
        if (n < 0) {
            return -1;
        }
        long a = 0 , b = 1 , max;
        if (n == a)
            return 0;
        else if(n == b)
            return 1;

        long  counter = 2 ;
        while(b < n) {
            max = a + b;
            a = b;
            b = max;
            if (max == n)
                return counter;
            counter++;
        }

        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        if(n != 0){
            char[][] testTriangle = new char[n][];
            for (int col = 0; col < n; col++) {
                testTriangle[col] = new char[col+1];
                for(int row = 0 ; row < testTriangle[col].length ; row++){
                    if(row == 0 || row == col || col == n - 1) {
                        testTriangle[col][row] = '*';}
                    else{
                        testTriangle[col][row] = ' ';}
                }
            }
            return testTriangle;

        }

        return new char[0][];
    }

    public static void main(String[] args) {


    }
}