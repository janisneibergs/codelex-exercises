package io.codelex.classesandobjects.practice.exercises;


class Dog{
    private static String name;
    private static String sex;
    private static String motherName;
    private static String fatherName;


    public Dog(String name, String sex){
        this.name = name;
        this.sex = sex;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    public static String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public static String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    static void displayDog(){
        System.out.println(getName()+" "+getSex()+" "+getMotherName()+" "+getFatherName());
    }
}
class dogTest{
    String[][] dogs = {{"Max", "male"},{"Rocky", "male"},{"Sparky", "male"},{"Buster", "male"}, {"Sam", "male"},
            {"Lady", "female"},{"Molly", "female"},{"Coco", "female"}};

    public void getDogs(String name, String sex) {

        for(int i = 0; i<dogs.length; i++){
            name = dogs[i][i];
            sex = dogs[i][i+1];
            Dog dogs = new Dog(name,sex);

        }
    }



}

public class exercise7 {
    public static void main(String[] args) {
        dogTest d = new dogTest();
        Dog.displayDog();

        
    }
}
