
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		double itemPrice1 = 10.5;
		double itemPrice2 = 1.15;
		double walletMoney1 = 84;
		double walletMoney2 = 20;
		int numFriends1 = 10;
		int numFriends2 = 3;
		int age1 = 20;
		int age2 = 45;
		String firstName1 = "Greg";
		String firstName2 = "Ricky";
		String lastName1 = "Gonzalez";
		String lastName2 = "Burmeister";
		char midInitial1 = 'C';
		char midInitial2 = 'B';
		
		//output variables
		System.out.println("Values of variables:");
		System.out.println("itemPrice1= " + itemPrice1);
		System.out.println("itemPrice2= " + itemPrice2);
		System.out.println("walletMoney1= " + walletMoney1);
		System.out.println("walletMoney2= " + walletMoney2);
		System.out.println("numFriends1= " + numFriends1);
		System.out.println("numFriends2= " + numFriends2);
		System.out.println("age1= " + age1);
		System.out.println("age2= " + age2);
		System.out.println("firstName1= " + firstName1);
		System.out.println("firstName2= " + firstName2);
		System.out.println("lastName1= " + lastName1);
		System.out.println("lastName2= " + lastName2);
		System.out.println("midInitial1= " + midInitial1);
		System.out.println("midInitial2= " + midInitial2);
		
		//create variables
		double newWalletMoney1 = walletMoney1 - itemPrice1;
		double newWalletMoney2 = walletMoney2 - itemPrice2;
		int friendsMade1 = age1 * numFriends1;
		int friendsMade2 = age2 * numFriends2;
		String fullName1 = firstName1 + " " + midInitial1 + ". " + lastName1;
		String fullName2 = firstName2 + " " + midInitial2 + ". " + lastName2;
		
		//output new variables
		System.out.println();
		System.out.println("Money left in first wallet after purchase is $" + newWalletMoney1);
		System.out.println("Money left in second wallet after purchase is $" + newWalletMoney2);
		System.out.println("Total number of friends after " + age1 + " years, when making " + numFriends1 + " each year is " + friendsMade1);
		System.out.println("Total number of friends after " + age2 + " years, when making " + numFriends2 + " each year is " + friendsMade2);
		System.out.println("Full name of first person is " + fullName1);
		System.out.println("Full name of second person is " + fullName2);
	}

}
