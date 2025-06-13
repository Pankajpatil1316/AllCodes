package com.JavaFeatures;


import com.JavaFeatures.Files.Person;

public class Java14 {
    public static void main(String[] args) {


        //JAVA14
        //record
        //here if you double click on Person then you will see that
        //Person is not a class it is record which is the feature of Java14
        Person person = new Person("Pankaj", 5000, 12);
        System.out.println(person.name() + " " +  person.salary() + " " + person.age());
    }
}
