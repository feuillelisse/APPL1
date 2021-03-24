/*
 * Nama             : Nisa Shadrina
 * NIM              : 191524053
 * Hari, Tanggal    : Senin, 22 Maret 2021
 */
package ThrowingExceptions;
// **************************************************************** 
// MathUtils.java 
// Provides static mathematical utility functions. 
// **************************************************************** 
public class MathUtils{ 
//------------------------------------------------------------- 
// Returns the factorial of the argument given 
//------------------------------------------------------------- 
    public static int factorial(int n){
        if(n >= 0 && n <= 16){
            int fac = 1;
            for (int i = n; i > 0; i--)
                fac *= i;
            return fac;
        }else if (n > 16){
            throw new IllegalArgumentException("You can't enter value more than 16!");
        }else{
            throw new IllegalArgumentException("You can't enter negative value!");
        }
    }
}