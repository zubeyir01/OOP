public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int note;
    int finalGrade;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve Ders bolumu uyusmuyor!");
        }
        this.teacher = teacher;

    }

    void printTeacher() {
        this.teacher.print();
    }
}
