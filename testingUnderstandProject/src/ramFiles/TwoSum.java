package ramFiles;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {3,3};
		int target = 10;
		boolean bool = Boolean.FALSE;
		for(int i =0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]== target) {
					System.out.println(arr[i] +" "+ arr[j]);
					bool = Boolean.TRUE;
					break;
				}
			}
		}
		if(!bool)
			System.out.println("No match found");
	}

}
