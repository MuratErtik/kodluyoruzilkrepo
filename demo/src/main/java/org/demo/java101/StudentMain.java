package org.demo.java101;

class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double verbalWeight;

    public Course(String name, String code, String prefix, double verbalWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        this.verbalWeight = verbalWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
}

class Student {
    String name, stuNo;
    int classes;
    Course mat, fizik, kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
    }

    public void addBulkExamNote(int mat, int matV, int fizik, int fizikV, int kimya, int kimyaV) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (matV >= 0 && matV <= 100) this.mat.verbalNote = matV;
        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (fizikV >= 0 && fizikV <= 100) this.fizik.verbalNote = fizikV;
        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
        if (kimyaV >= 0 && kimyaV <= 100) this.kimya.verbalNote = kimyaV;
    }

    public void calcAvarage() {
        double matAvg = (this.mat.note * (1 - this.mat.verbalWeight)) + (this.mat.verbalNote * this.mat.verbalWeight);
        double fizikAvg = (this.fizik.note * (1 - this.fizik.verbalWeight)) + (this.fizik.verbalNote * this.fizik.verbalWeight);
        double kimyaAvg = (this.kimya.note * (1 - this.kimya.verbalWeight)) + (this.kimya.verbalNote * this.kimya.verbalWeight);
        this.avarage = (matAvg + fizikAvg + kimyaAvg) / 3.0;
    }

    public void isPass() {
        calcAvarage();
        printNote();
        System.out.println("Ortalama : " + this.avarage);
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçti.");
        } else {
            System.out.println("Sınıfta Kaldı.");
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " (Sözlü: " + this.mat.verbalNote + ")");
        System.out.println("Fizik Notu : " + this.fizik.note + " (Sözlü: " + this.fizik.verbalNote + ")");
        System.out.println("Kimya Notu : " + this.kimya.note + " (Sözlü: " + this.kimya.verbalNote + ")");
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.30);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.25);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 90, 20, 80, 40, 70);
        s1.isPass();
    }
}
