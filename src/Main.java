public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "534");
        Teacher t2 = new Teacher("Albert Einstein", "FZK", "543");
        Teacher t3 = new Teacher("Kul Yutmaz", "BYO", "554");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103", "BIO");

        Student s1 = new Student("Inek Saban", "123", "4", tarih, fizik, biyo);
        Student s2 = new Student("Guduk Necmi", "124", "4", tarih, fizik, biyo);
        Student S3 = new Student("Domdom", "125", "4", tarih, fizik, biyo);

        s1.addBulkExamNote(55, 55, 55, 55, 55, 55);
        s1.isPass();

    }
}
