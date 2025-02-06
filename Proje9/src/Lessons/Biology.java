package Lessons;


import Student.StudentClass;

import java.util.ArrayList;

public class Biology extends LessonClass {
 /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Biology class is the child of the LessonClass

      add following values to arrayList(topicList) in the override method that comes from the abstract class
     Ecology
     Opportunities in Biology
     Principles of Biology 1
     Principles of Biology 2
     Principles of Genetics
     return topicList

     */

private ArrayList<String> topicList=new ArrayList<>();

    public Biology(StudentClass object) {
        super(object);
    }

    @Override
    public ArrayList<String> topics() {
        topics().add("Ecology");
        topics().add("Opportunities in Biology");
        topics().add("Principles of Biology 1");
        topics().add("Principles of Biology 2");
        topics().add("Principles of Genetics");

        return topicList;

    }



/*

    Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Biology sınıfı LessonClass classının child sınıfıdır


   abstract classtan gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

     Ecology
     Opportunities in Biology
     Principles of Biology 1
     Principles of Biology 2
     Principles of Genetics
     return topicList

     */
}
