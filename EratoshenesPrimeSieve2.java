/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primesieve2;

/**
 *
 * @author anels
 */
public class EratoshenesPrimeSieve2 implements PrimeSieve2{

    int primemax;
    boolean[] primes;

    public EratoshenesPrimeSieve2(int primemax, boolean[] primes) {
        this.primemax = primemax;
        this.primes = new boolean[primemax];
    }
    
    
    @Override
    public boolean isPrime(int p) {
        this.primes[0] = false;
        this.primes[1] = false;
        //annehmen alle zahlen sind Primes 
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        //jede zahl prüfen ob Prime ist oder nicht
        for (int i = 2; i < primes.length; i++) {
            if(primes[i]==true){
                for (int j = i*i; j < primes.length; j+=i) {
                    primes[j] = false;
                }
            }
        }
        if(primes[p] == true){
            return true;
        }
        return false;
        
    }

    @Override
    public void PrintPrimes() {
        for (int i = 0; i < primes.length; i++) {
            if(primes[i]==true){
                System.out.println(i);
            }
        }
    }
    
    public void PrimesSum(){
        int j = 2;
        int h = 3;
        int z = 5;
        int b = 7;
        for (int i = 3; i < primemax; i++) {
            if(i%2 == 0){
                if(isPrime(i-j)==true){
                    int y = i-j;
                    System.out.println( i +" summe: " + i + " = " + j +" + " + y);
                }else if(isPrime(i-h) == true){
                int y = i-h;
                System.out.println( i +" summe: " + i + " = " + h +" + " + y);
                }else if(isPrime(i-z)==true){
                    int y = i-z;
                    System.out.println( i +" summe: " + i + " = " + z +" + " + y);
                }else if(isPrime(i-b)==true){
                    int y = i-b;
                    System.out.println( i +" summe: " + i + " = " + b +" + " + y);
                }
            }
        }
    }
    
    
    
}
