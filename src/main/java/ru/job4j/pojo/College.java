package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Иван Иванович Иванов");
        student1.setGroup(1);
        student1.setAdmission(new Date());
        System.out.println("Студент " + student1.getFullName()
                + ", группа " + student1.getGroup()
                + ", дата поступления " + student1.getAdmission());
    }
}
