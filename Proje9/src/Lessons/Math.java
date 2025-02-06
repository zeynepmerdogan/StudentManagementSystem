package Lessons;


import Student.StudentClass;

import java.util.ArrayList;

public class Math extends LessonClass {

    private ArrayList<String> topicList=new ArrayList<>();
    public Math(StudentClass object) {
        super(object);
    }

    @Override
    public ArrayList<String> topics() {
        topics().add("Place Value");
        topics().add("Compare Whole Numbers");
        topics().add("Represent Decimals");
        topics().add("Place Value through Thousandths");
        topics().add("Multiplication Patterns");
        return topicList;
    }

     /*

    Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Math sınıfı LessonClass sınıfının child sınıfı


   abstract sınıfından gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

    Place Value
     Compare Whole Numbers
     Represent Decimals
     Place Value through Thousandths
     Multiplication Patterns

     */

}
