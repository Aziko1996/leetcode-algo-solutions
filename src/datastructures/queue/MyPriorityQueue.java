package datastructures.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(3,new StudentComparator());
        queue.add(new Student("Aziko1", 12.2));
        queue.add(new Student("Aziko2", 1.2));
        queue.add(new Student("Aziko3", 13.2));
        Iterator<Student> studentIterator = queue.iterator();
        while  (!queue.isEmpty()) {
            System.out.print(queue.poll().getName() + " ");
        }
    }


    static class StudentComparator implements Comparator<Student> {

        public int compare(Student s1, Student s2) {
            if (s1.cgpa < s2.cgpa) return -1;
            else if (s1.cgpa > s2.cgpa) return 1;
            return 0;
        }

    }

    static class Student {
        public String name;
        public double cgpa;

        // A parametrized Student constructor
        public Student (String name, double cgpa) {
            this.name = name;
            this.cgpa = cgpa;
        }

        public String getName() {
            return name;
        }
    }

}
