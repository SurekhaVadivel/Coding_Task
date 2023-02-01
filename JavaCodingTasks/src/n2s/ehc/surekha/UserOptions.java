package n2s.ehc.surekha;

import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class UserOptions {

	public static int findKey = 0;

	public static Scanner scd = new Scanner(System.in);
	
	
	public static int getKey(Hashtable<Integer, UserBean> htip, String uId)
	{
		for (Map.Entry<Integer, UserBean> me : htip.entrySet()) {
			if (me.getValue().getUserId().equals(uId)) {
				findKey = me.getKey();
				break;
			} else {
				findKey = 0;
			}
		}
		return findKey;
	}
	
	public static void insertUser(Hashtable<Integer, UserBean> htip) {
		System.out.println();
		System.out.println("Insert");
		System.out.println("********");
		while (true) {
			try {
				System.out.println("\nEnter UserId:");
				String uId = scd.next();
				System.out.println("Enter Name:");
				String uName = scd.next();
				findKey = getKey(htip,uId);
				if (htip.containsKey(findKey)) {
					System.err.println("User Id already exist. \nEnter 'Y' to Try different or 'X' to Exit");
		
					String inp = scd.next();
					if (inp.equalsIgnoreCase("Y")) {
						continue;
					} else {
						break;
					}
				} else {
					htip.put(htip.size() + 1, new UserBean(uId, uName));
					System.out.println("Your Insert success !!!");
					System.out.println("Wish to Insert more (y/n):");
					String cont = scd.next();
					if (cont.equalsIgnoreCase("Y"))// | cont.equals("y") )
					{
						continue;
					} else {
						break;
					}
				}
			} catch (InputMismatchException ime) {
				System.err.println("Invalid UserID: Enter a valid number");
			}

		}
	}

	public static void updateUser(Hashtable<Integer, UserBean> htip) {
		System.out.println();
		System.out.println("Update");
		System.out.println("*******");
		while (true) {
			try {
				System.out.println("\nEnter UserId:");
				String uId = scd.next();
				System.out.println("Enter new Name:");
				String uName = scd.next();
				findKey = getKey(htip,uId);
				if (htip.containsKey(findKey)) {
					htip.replace(findKey, new UserBean(uId, uName));
					System.out.println("Update success !!!");
					System.out.println("Wish to Update more (y/n):");
					String cont = scd.next();
					if (cont.equalsIgnoreCase("Y"))// | cont.equals("y") )
					{
						continue;
					} else {
						break;
					}
				} else {
					System.err.println("User Id not available. \nEnter 'Y' to Try different or 'X' to Exit\"");
					String inp = scd.next();
					if (inp.equalsIgnoreCase("Y")) {
						continue;
					} else {
						break;
					}
				}
			} catch (InputMismatchException ime) {
				System.err.println("Invalid UserID: Enter a valid number");
			}

		}
	}

	public static void deleteUser(Hashtable<Integer, UserBean> htip) {
		System.out.println();
		System.out.println("Delete");
		System.out.println("*******");
		while (true) {
			System.out.println("\nEnter UserId:");
			try {
				String uId = scd.next();
				findKey = getKey(htip,uId);
				if (htip.containsKey(findKey)) {
					htip.remove(findKey);
					System.out.println("Delete success !!!");
					System.out.println("Wish to delete more (y/n):");
					String cont = scd.next();
					if (cont.equalsIgnoreCase("Y"))// | cont.equals("y") )
					{
						continue;
					} else {
						break;
					}
				} else {
					System.err.println("User Id not available. \nEnter 'Y' to Try different or 'X' to Exit");
					String inp = scd.next();
					if (inp.equalsIgnoreCase("Y")) {
						continue;
					} else {
						break;
					}
				}

			} catch (InputMismatchException ime) {
				System.err.println("Invalid UserID: Enter a valid number");
			}
		}
	}

	public static void viewUser(Hashtable<Integer, UserBean> htip) {

		System.out.println();
		System.out.println("View");
		System.out.println("******");
		if (htip.size() > 0) {
			System.out.println("S.No   Id     Name");
			System.out.println("--------------------------");
//			 for (Map.Entry<Integer, UserBean> me : htip.entrySet()) 
//			 {
//			  System.out.println(me.getKey()+"  "+me.getValue());
//			  }
			htip.forEach((key, value) -> System.out.println(key + " " + value));
		} else {
			System.out.println("No records to view");
		}
		System.out.println("--------------------------");
	}
}
