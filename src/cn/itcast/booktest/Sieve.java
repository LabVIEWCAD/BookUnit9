package cn.itcast.booktest;

import java.util.BitSet;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2000000;
		long start = System.currentTimeMillis();
		BitSet b = new BitSet(n+1);
		int count = 0;
		int i;
		for (int j = 2; j < n; j++) {
			b.set(j);
		}
		i = 2;
		while (i*i<=n) {
			if (b.get(i)) {
				count++;
				int k = 2*i;
				while (k<=n) {
					b.clear(k);
					k+=i;
				}
			}
			i++;
		}
		while (i<=n) {
			if(b.get(i)) count++;
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println(count+" primes");
		System.out.println((end - start)+" milliseconds");
	}

}
