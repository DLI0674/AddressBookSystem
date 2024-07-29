package AddressBookSystem;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    HashMap<String,Contact> mp=new HashMap<String,Contact>();
    Contact newContact;
    void greet(){
        System.out.println("You are Welcome");
    }
    void createContact(String fName,String lName,String eMail,String mbNo,String hNo, String col, String cty, String stat, String zp){
        newContact=new Contact(fName,lName,eMail,mbNo,hNo,col,cty,stat,zp);
    }
    void addContact(){
        mp.put(newContact.fname,newContact);
        newContact=null;
    }
    void edit(String fName,String prop,String upd){
        if(mp.containsKey(fName)){
            Contact contact=mp.get(fName);
            switch (prop){
                case "fName":
                    contact.fname=upd;break;
                case "lName":
                    contact.lname=upd;break;
                case "eMail":
                    contact.email=upd;break;
                case "mbNo":
                    contact.mbno=upd;break;
                case "houseNo":
                    contact.houseNo=upd;break;
                case "city": {
                    contact.city = upd;
//                    mp.put(fName,contact);
//                    System.out.println(contact);
                    break;
                }
                case "state":
                    contact.state=upd;break;
                case "zip":
                    contact.zip=upd;break;
                default:
                    System.out.println("All Done");
            }
        }
    }
    void delete(String fName){
        mp.remove(fName);
    }
    void display(String fName){
        if(mp.containsKey(fName)){
            Contact obj=mp.get(fName);
            System.out.println(obj.fname);
            System.out.println(obj.lname);
            System.out.println(obj.email);
            System.out.println(obj.mbno);
            System.out.println(obj.houseNo);
            System.out.println(obj.colony);
            System.out.println(obj.city);
            System.out.println(obj.state);
            System.out.println(obj.zip);
        }
        else{
            System.out.println("Contact does not exists");
        }
    }
}
