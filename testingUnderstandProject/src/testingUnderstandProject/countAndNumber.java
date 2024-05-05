package testingUnderstandProject;

public class countAndNumber {

	public static void main(String[] args) {
		int n = 5, count = 0;
		String k = "1";
		for (int l = 0; l < 5; l++) {
			int leng = k.length();
			if (k.length() == 1 && l == 0) {
				System.out.print(k);
			} else if(leng >1 ){
				String temp = "";
				int len = k.length();
				System.out.print(len);
				for (int i = len; i > 0; i--) {
					if (k.charAt(i-1) == k.charAt(i)) {
						count++;
					}else {
						break;
					}
				}
				temp = count + "" + k.charAt(l);
				System.out.print(temp);
			} else {
				k+=k;
			}
		}
	}
}
