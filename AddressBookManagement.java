package AddressBookSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBookManagement {
    HashMap<Integer,AddressBook> library=new HashMap<Integer,AddressBook>();
    void displayAddressBook(){
        for(Map.Entry<Integer,AddressBook>book:library.entrySet()){
            System.out.print(book.getKey());
            System.out.print(" : ");
            System.out.println(book.getValue());
        }
    }
    void createAddressBook(int index){
        if(library.containsKey(index)){
            System.out.println("This index is unavailable.");
            return;
        }
        AddressBook newAddressBook=new AddressBook();
        library.put(index,newAddressBook);
    }
    AddressBook selectAddressBook(int index){
        if(library.containsKey(index)){
            return library.get(index);
        }
        System.out.println("Address book does not exists.");
        return null;
    }
}
