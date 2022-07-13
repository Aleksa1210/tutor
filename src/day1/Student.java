package day1;

public class Student {
/*
    Create a class called Student
    Student has attributes: name, age, grade +
    Student has a constructor with parameters for  name age and grade +
    Student has getters and setters for age and grade
    Student has a method called graduate() which will increase the age and grade by 1
 */

    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge(){
        return age;
    }

    public int getGrade(){
        return grade;
    }

    public void setAge(int age){
       this.age = age;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void increase(){
        age = age + 1;
        grade = grade + 1;
    }











}
