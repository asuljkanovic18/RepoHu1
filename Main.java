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
public class Main {
    public static void main(String[] args) {
        EratoshenesPrimeSieve2 ers = new EratoshenesPrimeSieve2(10);
        ers.isPrime(9);
        ers.PrintPrimes();
        ers.PrimesSum();
        
    }
}
