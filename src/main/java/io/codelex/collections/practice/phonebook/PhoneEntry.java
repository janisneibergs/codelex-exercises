package io.codelex.collections.practice.phonebook;

public class PhoneEntry {
    public static void main(String[] args) {


        PhoneDirectory phone = new PhoneDirectory();


        phone.putNumber("Jānis", "345567");
        phone.putNumber("Aija", "5646455");
        phone.putNumber("Lauma", "354653456");
        System.out.println("Contents are:");
        System.out.println();
        phone.print();
        System.out.println();
        System.out.println("Jānis  " + phone.getNumber("Jānis"));
        System.out.println("Aija " + phone.getNumber("Aija"));
        System.out.println("Lauma " + phone.getNumber("Lauma"));
    }


}
