package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Music extends LessonClass  {

    private ArrayList<String> topicList=new ArrayList<>();
    public Music(StudentClass object) {
        super(object);
    }

    @Override
    public ArrayList<String> topics() {

        topics().add(" Peacemaking Skills for Little Kids");
        topics().add("Learning Through Literature");
        topics().add("Creative Conflict Solving");
        topics().add("Creating Peace, Building Community");
        topics().add("WinWin!");


        return topicList;
    }


     /*

   Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Music sınıfı LessonClass sınıfının child sınıfı


   abstract sınıftan gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

    Peacemaking Skills for Little Kids
     Learning Through Literature
     Creative Conflict Solving
     Creating Peace, Building Community
     WinWin!
    return topicList

     */


}
