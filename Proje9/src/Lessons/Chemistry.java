package Lessons;


import Student.StudentClass;

import java.util.ArrayList;

public class Chemistry extends LessonClass {
    private ArrayList<String> topicList= new ArrayList<>();

    public Chemistry(StudentClass object) {
        super(object);
    }

    @Override
    public ArrayList<String> topics() {

        topics().add("Pedagogy");
        topics().add("Prerequisites");
        topics().add("Course Offerings");
        topics().add("Safety");
        topics().add("General Chemistry");


        return topicList;
    }



     /*

    Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Chemistry sınıfı LessonClass sınıfının child sınıfı


   abstract sınıfından gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

    Pedagogy
     Prerequisites
     Course Offerings
     Safety
     General Chemistry
     return topicList

     */

}
