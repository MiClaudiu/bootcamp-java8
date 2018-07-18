package com.cegeka.bootcamp.exercise.common;

public class Person {
    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(Integer age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
