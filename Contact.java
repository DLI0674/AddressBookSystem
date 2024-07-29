package AddressBookSystem;

public class Contact {
    String fname;
    String lname;
    String email;
    String mbno;
    String houseNo;
    String colony;
    String city;
    String state;
    String zip;
    Contact(String fName,String lName,String eMail,String mbNo,String hNo, String col, String cty, String stat, String zp){
        this.fname=fName;
        this.lname=lName;
        this.email=eMail;
        this.mbno=mbNo;
        this.houseNo=hNo;
        this.colony=col;
        this.city=cty;
        this.state=stat;
        this.zip=zp;
    }
}
