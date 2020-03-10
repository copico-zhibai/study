package com.copico.study.prototype;

import com.copico.study.prototype.Class;

/**
 * @author owen
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Class aClass = new Class();
        aClass.setName("一班");

        Student student = new Student();
        student.setIdCard("c");
        student.setId(200);
        student.setAClass(aClass);
        System.out.println("被克隆对象--->" + student);

        Student clone = (Student) student.clone();
        clone.setId(300);
        clone.setIdCard("b");
        Class aClass1 = clone.getAClass();
        aClass1.setName("二班");
        System.out.println("克隆对象--->" + clone);

        System.out.println("克隆对象更改属性之后，被克隆对象--->" + student);
    }

    /*
    public static void main(String[] args) throws CloneNotSupportedException {
        Class aClass = new Class();
        aClass.setName("一班");

        DeepCloneStudent student = new DeepCloneStudent();
        student.setAClass(aClass);
        System.out.println("被克隆对象--->" + student);

        DeepCloneStudent clone = (DeepCloneStudent) student.clone();
        Class aClass1 = clone.getAClass();
        aClass1.setName("二班");
        System.out.println("克隆对象--->" + clone);

        System.out.println("克隆对象更改属性之后，被克隆对象--->" + student);
    }
    */


}
