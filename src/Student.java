public class Student {
    Course c1, c2, c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int finalGrade1, int note2, int finalGrade2, int note3, int finalGrade3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (finalGrade1 >= 0 && finalGrade1 <= 100) {
            this.c1.finalGrade = finalGrade1;
        }

        if (finalGrade2 >= 0 && finalGrade2 <= 100) {
            this.c2.finalGrade = finalGrade2;
        }

        if (finalGrade3 >= 0 && finalGrade3 <= 100) {
            this.c3.finalGrade = finalGrade3;
        }
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu:" + this.c1.note + "\tSozlu Notu:" + this.c1.finalGrade);
        System.out.println(this.c2.name + " Notu:" + this.c2.note + "\tSozlu Notu:" + this.c2.finalGrade);
        System.out.println(this.c3.name + " Notu:" + this.c3.note + "\tSozlu Notu:" + this.c3.finalGrade);
        System.out.println("Ortalamaniz:" + this.avarage);
    }

    void isPass() {
        System.out.println("==========================");
        this.avarage = (((this.c1.finalGrade * 0.2) + (this.c1.note * 0.8)) +
                ((this.c2.finalGrade * 0.3) + (this.c2.note * 0.7)) +
                ((this.c3.finalGrade * 0.4) + (this.c3.note * 0.6))) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Hababam sinifi uyaniyor!");
            this.isPass = true;
        } else {
            System.out.println("Hababam sinifi sinifta kaldi!");
            this.isPass = false;
        }
        printNote();
    }

}
