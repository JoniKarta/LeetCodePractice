class Solution {
	/*
	This is the naive approach of find all prime numebr Time Complexity: O(n ^ 1.5)
	*/
    public boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int countPrimes(int n) {
        int counter = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime(i)) counter++;
        }
        
        return counter;
        
    }
    //The approach uses Sieve Of Eratosthenes Time complexity : O(n*log(log(n)))
    public int countPrimes(int n){
        if(n <= 1) return 0;
        // 
        int counter = 0;
        boolean[] primes = new boolean[n]; // [0...49]
        Arrays.fill(primes,true);
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(primes[i]){
                for(int j = i; j * i < primes.length; j++){
                    primes[j * i] = false; 
                }    
            }
        }
        for(int i = 2; i < primes.length; i++){
            if(primes[i])
                counter++;
        }
        return counter;
    }
}
