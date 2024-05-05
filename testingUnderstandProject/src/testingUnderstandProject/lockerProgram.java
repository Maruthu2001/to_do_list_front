package testingUnderstandProject;

public class lockerProgram {

	public static void main(String[] args) {
		int totalStudents = 100;
		int count = 0, square = 1, ind = 2;
		while (square <= totalStudents) {
			count++;
			square = ind * ind;
//			System.out.println(square);
			ind++;
		}
		System.out.println("open : " + count + "\nclosed : " + (totalStudents - count));
//		int numLockers = 100;
//        boolean[] lockers = new boolean[numLockers];
//
//        // Simulate the students passing along the lockers
//        for (int student = 1; student <= numLockers; student++) {
//            for (int locker = student - 1; locker < numLockers; locker += student) {
//                // Change the state of the locker
//                lockers[locker] = !lockers[locker];
//            }
//        }
//
//        // Print the final state of the lockers
//        for (int i = 0; i < numLockers; i++) {
//            System.out.println("Locker " + (i + 1) + ": " + (lockers[i] ? "Open" : "Closed"));
//        }
//
//        // Print the lockers that are open (those with a perfect square number)
//        System.out.print("Open lockers: ");
//        for (int i = 0; i < numLockers; i++) {
//            if (lockers[i]) {
//                System.out.print((i + 1) + " ");
//            }
//        }
	}
}
