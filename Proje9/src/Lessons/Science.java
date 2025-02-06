package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Science extends LessonClass  {
    private ArrayList<String> topicList=new ArrayList<>();

    public Science(StudentClass object) {
        super(object);
    }

    @Override
    public ArrayList<String> topics() {

        topics().add("Animal Habitats");
        topics().add("Ball Launcher Challenge");
        topics().add("Balloon Car");
        topics().add("Bending Plant Roots with Gravity");
        topics().add("Birthday Season Weather Report");
        return topicList;
    }




     /*

    Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Science sınıfı LessonClass sınıfının child sınıfıdır


   abstract sınıftan gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

    Animal Habitats
     Ball Launcher Challenge
     Balloon Car
     Bending Plant Roots with Gravity
     Birthday Season Weather Report

     return topicList;
     */
}
