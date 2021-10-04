// File: T07AFraction.java
public class TO7AFraction {
	// bagian ide/ algoritma
	
	// Method sumFraction untuk penjumlahan pecahan
	static void sumFraction(int e1, int d1, int e2, int d2) {
		//hasil penjumlahan disimpan di dalam variabel es dan ds
		int es = e1 * d2 + e2 * d1; 
		int ds = d1 * d2;
		int fpb = fpb(es, ds);
		es = es / fpb;
		ds = ds / fpb;
	  
		printFraction(es, ds);
	}
	
	// Method productFraction untuk mengalikan pecahan
	static void productFraction(int e1, int d1, int e2, int d2) {
		//hasil perkalian disimpan di dalam variabel ep dan dp
		int ep = e1 * e2;
		int dp = d1 * d2;
		int fpb = fpb(ep, dp);
		ep = ep / fpb;
		dp = dp / fpb;
	  
		printFraction(ep, dp);
	}
	
	// Method printFraction untuk mencetak pecahan berbentuk x/y, contohnya 2/3
	static void printFraction(int x, int y) {
		System.out.println(x + " / " + y); 
	}

	// Method untuk fpb agar bisa disederhanakan
	static int fpb (int x, int y) {
		if ( (y <= x ) && 	// memeriksa apakah y lebih kecil dari x (&& = jika kondisi yang kiri
							          //bernilai false, maka operasi yang kanan tidak akan dijalankan
							          //karna sudah pasti hasilnya false
							
		(x % y == 0)) // jika sisa bagi y dan x = 0
			return y; // maka fpb = y
		else if (x < y) // jika x lebih kecil dari y
			return fpb (y, x); // maka fpb = x
		else
			return fpb (y, x % y); //fungsi rekursif yang memanggil fungsi itu sendiri
	}

	public static void main(String[] args) {
    // main method untuk mencetak testcase sesuai soal
	  sumFraction(1, 2, 2, 3);
    sumFraction(1, 3, 3, 4);
    productFraction(1, 2, 2, 3);
    productFraction(1, 4, 2, 3);
  }
}
