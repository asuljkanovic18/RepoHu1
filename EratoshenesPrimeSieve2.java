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
    public void isPrime(int p) {
        this.primes[0] = false;
        this.primes[1] = false;
        //annehmen alle zahlen sind Primes 
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        
    }

    @Override
    public void PrintPrimes(int max) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
