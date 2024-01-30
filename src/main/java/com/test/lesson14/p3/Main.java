package com.test.lesson14.p3;

public class Main {

    public static void main(String[] args) {

        /*Utils<Student> studentUtils = new Utils<>();

        Student student = new Student("1", "Student", Type.BIO);

        final Student en = studentUtils.getEn(student);

        Utils<Person> personUtils = new Utils<>();

        Person person = new Person("1", "Person", Gender.FEMALE);

        final Person en1 = personUtils.getEn(person);

        Student[] students = new Student[4];

        for (int i = 0; i < students.length; i++) {
            Student student1;
            if (i % 2 == 0) {
                student1 = new Student(i, "Student" + i, Type.BIO);
            } else {
                student1 = new Student(i, "Student" + i, Type.MUS);
            }
            students[i] = student1;
        }

        final Student[] students1 = studentUtils.setAndGetEnArray(students);

        for (Student student1 : students1) {
            System.out.println(student1);
        }

        final boolean delete = studentUtils.delete(1);

        System.out.println(delete);

        for (Student student1 : students1) {
            System.out.println(student1);
        }*/

     /*   Student student = new Student(1, "Student", Type.BIO);

        Person person = new Person(1, "Person", Gender.FEMALE);

        UtilsStudent utilsStudent = new UtilsStudent();

        utilsStudent.printEn(student);

        utilsStudent.printEn(person);

        utilsStudent.printEn(1);

        utilsStudent.printEn("Student");*/

        UtilsUn<? super User> userUtilsUn = new UtilsUn<>();

        Student student = new Student("1", "cat", Type.BIO);

        User user = new User("1", "5");

        userUtilsUn.print(student);

        userUtilsUn.print(user);


    }

}
