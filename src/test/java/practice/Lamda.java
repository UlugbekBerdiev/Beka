package practice;

import java.util.ArrayList;




    public class Lamda {
        public static void main(String args[]) {
            ArrayList<Student> studentList = new ArrayList<Student>();
            studentList.add(new Student("Raja", 30));
            studentList.add(new Student("Adithya", 25));
            studentList.add(new Student("Jai", 20));
            studentList.removeIf(student -> (student.age <= 20)); // Lambda Expression
            System.out.println("The final list is: ");
            for(Student student : studentList) {
                System.out.println(student.name);
            }

        }
        private static class Student {
            private String name;
            private int age;
            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
    }

