package n2s.ehc.surekha;

import java.util.Hashtable;
import java.util.InputMismatchException;

public class UserMain extends UserOptions {
	
	//static Scanner scd = new Scanner(System.in);

	public static void main(String[] args) throws InvalidEntry {
		// TODO Auto-generated method stub

		Hashtable<Integer, UserBean> hti = new Hashtable<Integer, UserBean>();
		
		while(true) {
			try {
				System.out.println("Choose the option below");
				System.out.println("***********************");
				System.out.println("1 - Insert");
				System.out.println("2 - Update");
				System.out.println("3 - Delete");
				System.out.println("4 - View");
				System.out.println("5 - Exit");
				System.out.println("Enter your option value: ");
				try {
					int option = scd.nextInt();

					switch (option) {
					case 1: {
						// Inserting
						insertUser(hti);
						break;
					}
					case 2: {
						// Updating
						updateUser(hti);
						break;
					}
					case 3: {
						// Deleting
						deleteUser(hti);
						break;
					}
					case 4: {
						// Viewing
						viewUser(hti);
						break;
					}
					case 5: {
						// Exit the program
						scd.close();
						System.out.println("Exit Success!!!");
						System.exit(0);
					}
					default: {
						// System.out.println("Invalid Option: Enter value between 1 and 5");
						System.err.println("Invalid Option: Enter value between 1 and 5");
						 //throw new InvalidEntry("Invalid Option: Enter value between 1 and 5");
					}
					} // switch close
				} catch (InputMismatchException ime) {
					System.err.println("Invalid Option: Enter a valid number");
				}
			} 
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
