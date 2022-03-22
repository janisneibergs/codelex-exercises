package io.codelex.oop.computers;

public class ex7 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        Computer comp2 = new Computer();
        comp.setCompany("Dell");
        comp.setGarphicsCard("AMD");
        comp.setModel("Vostro");
        comp.setProcesor("AMD");
        comp.setRam("32");

        comp2.setCompany("HP");
        comp2.setGarphicsCard("Nvidia");
        comp2.setModel("Pro");
        comp2.setProcesor("Intel");
        comp2.setRam("32");
        System.out.println(comp.toString());
        System.out.println(comp2.toString());

        if (comp.equals(comp2)) {
            System.out.println("Similar computers");
        } else {
            System.out.println("Not similar");
        }
        Laptop note = new Laptop("6000mAh");
        note.setCompany("HP");
        note.setGarphicsCard("Nvidia");
        note.setModel("Pro");
        note.setProcesor("Intel");
        note.setRam("32");

        note.printLaptop();

    }
}
