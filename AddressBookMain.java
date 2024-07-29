package AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AddressBookManagement manager=new AddressBookManagement();
        manager.createAddressBook(0);
        AddressBook addressBook=manager.selectAddressBook(0);
        addressBook.greet();
        Boolean flag=false;
        while(!flag){
            System.out.println("Enter operation: ");
            String operation=sc.nextLine();
            switch (operation){
                case "CreateAddressBook":{
                    System.out.println("Enter your addressbook index: ");
                    int idx=sc.nextInt();
                    sc.nextLine();
                    manager.createAddressBook(idx);
                    break;
                }
                case "DisplayAddressBook":{
                    manager.displayAddressBook();
                    break;
                }
                case "SelectAddressBook":{
                    System.out.println("Enter index of your addressbook you want to select: ");
                    int idx=sc.nextInt();
                    sc.nextLine();
                    addressBook=manager.selectAddressBook(idx);
                    break;
                }
                case "Create":{
                    System.out.println("Enter first name: ");
                    String fName=sc.nextLine();
                    System.out.println("Enter last name: ");
                    String lName=sc.nextLine();
                    System.out.println("Enter email id: ");
                    String eMail= sc.nextLine();
                    System.out.println("Enter mobile number: ");
                    String mbNo=sc.nextLine();
                    System.out.println("Enter house number: ");
                    String hNo=sc.nextLine();
                    System.out.println("Enter colony name: ");
                    String col=sc.nextLine();
                    System.out.println("Enter city name: ");
                    String city=sc.nextLine();
                    System.out.println("Enter state name");
                    String state=sc.nextLine();
                    System.out.println("Enter zip:");
                    String zp=sc.nextLine();
                    addressBook.createContact(fName,lName,eMail,mbNo,hNo,col,city,state,zp);
                    break;
                }
                case "Add":{
                    addressBook.addContact();
                    break;
                }
                case "Edit":{
                    System.out.println("Enter first name: ");
                    String fName=sc.nextLine();
                    System.out.println("Enter property to be updated: ");
                    String prop=sc.nextLine();
                    System.out.println("Enter updated value: ");
                    String upd=sc.nextLine();
                    addressBook.edit(fName,prop,upd);
                    break;
                }
                case "Delete":{
                    System.out.println("Enter first name of contact to be deleted");
                    String fName=sc.nextLine();
                    addressBook.delete(fName);
                    break;
                }
                case "Display":{
                    System.out.println("Enter fname of contact to be displayed");
                    String fName=sc.nextLine();
                    addressBook.display(fName);
                    break;
                }
                default:{
                    System.out.println("Thank You");
                    flag=true;
                }
            }
        }
    }
}
