package ramFiles;

public class SwappingNumbers {
	public static void main(String[] args) {
		int n = 10, m = 5;
		swapArithmetic(n, m);
		swapLogic(n, m);
		swapBitwise(n, m);
	}

	static void swapArithmetic(int n, int m) {
		n = n + m;
		m = n - m;
		n = n - m;
		System.out.println(n + " " + m);
	}

	static void swapLogic(int n, int m) {
		n = (n * m) / (m = n); // 50/10
		System.out.println(n + " " + m);
	}

	static void swapBitwise(int n, int m) {
		// n = 1010, m =0101
		n = n ^ m; //n=1111
		m = n ^ m; //m=1010
		n = n ^ m; //n=0101
		System.out.println(n + " " + m);
	}
}
