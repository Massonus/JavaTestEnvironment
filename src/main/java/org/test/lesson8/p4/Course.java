package org.test.lesson8.p4;

public class Course {

    static int count_lecture_id;

    int id;

    String name;

    Lecture lecture;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        extracted();
    }

    public Course() {
    }

    private void extracted() {
        lecture = new Lecture();
        lecture.id = count_lecture_id;
        count_lecture_id ++;
        lecture.name = "name " + count_lecture_id;
    }
}
