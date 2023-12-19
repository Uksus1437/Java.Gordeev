package lab11;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students1 = new ArrayList<>(Arrays.asList(
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1),
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1),
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1),
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1)
        ));
        List<Student> students2 = new ArrayList<>(Arrays.asList(
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1),
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1),
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1),
                new Student(GenRandStr(), (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1)
        ));
        System.out.println("Список студентов (до сортировки):");
        for (Student student : students1) {
            System.out.println(student);
        }
        students1.sort(Comparator.comparingInt(Student::getIDNumber));

        System.out.println("\nСписок студентов (сортировка по ID):");
        for (Student student : students1) {
            System.out.println(student);
        }

        Collections.sort(students1, new SortingStudentsByGPA());

        System.out.println("\nСписок студентов (сортировка по оценке в порядке убывания):");
        for (Student student : students1) {
            System.out.println(student);
        }

        List<Student> mergedStudents = mergeSortedLists(students1, students2);

        System.out.println("\nОбъединенный и отсортированный список студентов:");
        for (Student student : mergedStudents) {
            System.out.println(student);
        }


    }

    public static String GenRandStr() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = (int) (Math.random() * 10) + 1;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }
    private static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() >= list2.get(j).getGPA()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
