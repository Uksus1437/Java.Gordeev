package lab11;

public class Student {
    private String name;
    private int iDNumber;
    private int gpa;

    public Student(String name, int iDNumber, int gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public int getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + name  +
                ", iD = " + iDNumber +
                ", mark = " + gpa +
                '}';
    }

    public static int compareByIDNumber(Student student1, Student student2) {
        return Integer.compare(student1.getIDNumber(), student2.getIDNumber());
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && compareByIDNumber(students[j], key) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}