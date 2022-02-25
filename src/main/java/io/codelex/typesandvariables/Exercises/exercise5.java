package io.codelex.typesandvariables.Exercises;

public class exercise5 {
    public static void main(String[] args) {
        String[] course={"English III", "Precalculus", "Music Theory", "Biotechnology",
                "Principles of Technology I", "Latin II", "AP US History",
                "Business Computer Infomation Systems"};

        String[] teacher={"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer", "Ms. Garcia",
                "Mrs. Barnett", "Ms. Johannessen", "Mr. James"};

        System.out.println("+------------------------------------------------------------+");
        for (int i=0; i<8; i++){
            int courseLength = course[i].length();
            int teacherLength = teacher[i].length();
            System.out.print("| " + i + " |");
            for(int s = 0; s<36 - courseLength; s++){
                System.out.print(" ");
            }
            System.out.print(course[i]+" |");
            for(int c = 0; c<17 - teacherLength; c++){
                System.out.print(" ");
            }
            System.out.print(teacher[i]+" |");
            System.out.print("\n");

        }
        System.out.println("+------------------------------------------------------------+");
    }
}
