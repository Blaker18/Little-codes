
public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);
        String userName;
        final int validLength = 6; // this is the valid lenght of an user name
        System.out.print("Please enter the username : ");
        userName = input.nextLine();
        while(userName.length() < validLength){
            // if user enters less than validLength characters
            // ask for entering again
            System.out.println("\nUsername needs to be " + validLength + " character long");
            System.out.print("\nPlease enter the username again: ");
            userName = input.nextLine();
        }
        System.out.println("Username is : " + userName);
	}

}
