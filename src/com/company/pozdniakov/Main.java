package com.company.pozdniakov;

public class Main {

    public static void main(String[] args) {

        Subject sbjcts0[] = new Subject[5];
        Subject sbjcts1[] = new Subject[5];
        Subject sbjcts2[] = new Subject[5];
        Subject sbjcts3[] = new Subject[5];
        Subject sbjcts4[] = new Subject[5];
        for (int i = 0; i < 5; i++) {
            sbjcts0[i] = new Subject(i);
            sbjcts1[i] = new Subject(i);
            sbjcts2[i] = new Subject(i);
            sbjcts3[i] = new Subject(i);
            sbjcts4[i] = new Subject(i);
        }
        Student students[] = new Student[5];
        students[0] = new Student(1, "Nickola", "Tesla", "KB-71", sbjcts0);
        students[1] = new Student(2, "Barak", "Obama", "KB-71", sbjcts1);
        students[2] = new Student(3, "Jenya", "Melkovsky", "KB-71", sbjcts2);
        students[3] = new Student(4, "Philip", "Morris", "KB-71", sbjcts3);
        students[4] = new Student(5, "Albert", "Einstein", "KB-71", sbjcts4);

        System.out.println(Utils.getTheBestStudent(students));
        System.out.println(Utils.getTheBestSubject(students));

        for(int i=0;i < students.length;i++){
            System.out.println("Student " + i + "Mark: " + students[i].avgMark());
            if(students[i].avgMark() == 5f)
                System.out.println("Student has a scholarship and he is a cool guy :)");
            else if(students[i].avgMark() >= 4f)
                System.out.println("Student has a scholarship");
            else
                System.out.println("Student does not have a scholarship");

        }

        for(int i = 0 ; i< students.length;i++){
            System.out.println(students[i].getName() + ' ' + students[i].getSurname() + ':');
            students[i].passedSub();
        }
    }
}

