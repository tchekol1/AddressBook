import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        AddressBook addressBook= new AddressBook();
        System.out.println("Enter your name: ");
        addressBook.setName(scanner.nextLine());
        System.out.println("Enter city: ");
        addressBook.setCity(scanner.nextLine());
        System.out.println("Enter state");
       addressBook.setState(scanner.nextLine());
        System.out.println("Enter zip ");
        addressBook.setZip(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter phone");
        String phone=scanner.nextLine();
        while (!addressBook.isPhoneNumberValid(phone)){
            System.out.println("You entered in wrong pattern.  please enter in this pattern (xxx)-xxx-xxxx");
            System.out.println("Enter phone");
            phone=scanner.nextLine();
        }
        addressBook.setPhone(phone);
        System.out.println("Enter email");
        String email=scanner.nextLine();
        while (!addressBook.isEmailValid(email)) {
            System.out.println("Enter valid email ");
            System.out.println("Enter email again please");
            email=scanner.nextLine();
        }
            addressBook.setEmail(email);
        System.out.println(addressBook.toString());
    }
}
