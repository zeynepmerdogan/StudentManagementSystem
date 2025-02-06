package Lessons;


import Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class LessonClass {

  private static int totalCreditCount;
  private LinkedHashMap<String,Integer> classNameAndScore=new LinkedHashMap<>();





     /*
        LessonClass  abstract sınıftır


        2 private variable oluşturun
        static int totalCreditCount
        LinkedHashMap Key is String, value is Integer, name is classNameAndScore

        one private StudentClass object.

     */
    //-------------------------------------------------------------------------------------------------------
    /*
        Create a method name is topics

        This method is a abstract method

        Return type is String ArrayList

     */

    public abstract ArrayList<String> topics();



     /*
         topics isminde method oluşturun

        Bu method abstract method

        Return türü  String ArrayList olmalı

     */
//-------------------------------------------------------------------------------------------------------
     public LessonClass(StudentClass object) {

         StudentClass studentClass = object;
         setCreditCount();
     }

    /*
     LessonClass için constructor oluşturun

    parametresi StudentClass object

   StudentClass instance variable'ini StudentClass parametresine eşit yapın

   aşağıda oluşturmanız beklenen setCreditCount methodunu çağırın
     */
//-------------------------------------------------------------------------------------------------------
   /*

    Create a method name setCreditCount
    No parameter and no return type
    Create an arraylist name is lessonsName

    Ask to user "Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music"
    After asking also  print the current totalCreditCount(this comes from the instance variable)


    If the user took the class (you wrote in the console with the scanner class) is already exits in the arraylist and the user would like to take it again

    Then print "You already took this class please choose other class"

    If the user didn't take that class before, then add it to the arraylist, and add the credit of the class(which comes from the lessonsName list) to the
    totalCreditCount(you need to use checkCredit method)

    NOTE: The user can add a class until totalCreditCount equals to 7 (it is better to use while loop)



     */

   void setCreditCount() {

       ArrayList<String> lessonsName = new ArrayList();
       Scanner sc = new Scanner(System.in);


       for (; totalCreditCount < 6; totalCreditCount++) {

           System.out.println("Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music");

           System.out.println(totalCreditCount);
           if (lessonsName.contains(sc)) {
               System.out.println("You already took this class please choose other class");
               totalCreditCount--;
           }



       }
       }




    /*

    setCreditCount isminde bir method oluşturun
    Parametre ve return türü yok
    lessonsName isminde bir arraylist oluşturun

    Kullanıcıya sor --> "Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music"
    Sorduktan sonra mevcut totalCreditCount'u da yazdırın (bu, instance variable'dan gelir)

    Kullanıcı class aldıysa (scanner class ile  konsolda yazdınız) ve bu arraylistte zaten varsa ve kullanıcı bunu tekrar almak istiyorsa
     "You already took this class please choose other class"  print et

    Kullanıcı bu classı daha önce almadıysa, arrayliste ekleyin ve classın kredisini (lessonsName  listden gelen)
    totalCreditCount (checkCredit methodunu kullanmanız gerekir) ekle

    NOTE: Kullanıcı, totalCreditCount 7'ye eşit olana kadar class ekleyebilir (while loop kullanmak daha iyidir)

     */
//-------------------------------------------------------------------------------------------------------
     /*
    Create a method name is checkCredit
    parameter is one String lessonName
    return type is int

    IF the lessonName = Math
     credit should be 3

     IF the lessonName = Science
     credit should be 4

      IF the lessonName = Biology
     credit should be 2

      IF the lessonName = Chemistry
     credit should be 2

      IF the lessonName = Music
     credit should be 3

     if the class is non of these options
        Throw an exception "You class name is not a valid class name."

    After the if statement
     put lessonName as a key in the classNameAndScore
     value should take from the next method which is RandomNum
     */

    int checkCredit (String lessonName) {

        if (lessonName.equalsIgnoreCase("Math"))
            return 3;
        else if (lessonName.equalsIgnoreCase("Science"))
            return 4;
        else if (lessonName.equalsIgnoreCase("Biology"))
            return 2;
        else if (lessonName.equalsIgnoreCase("Chemistry"))
            return 3;
        else if (lessonName.equalsIgnoreCase("Music"))
            return 3;
        else{
            System.out.println( "You class name is not a valid class name.");
        return  0;
        }




    }


      /*

    parametresi String lessonName ve return türü int olan checkCredit  isminde bir method oluşturun

    Eğer lessonName = Math
     credit  3 olmalı

     Eğer lessonName = Science
     credit  4 olmalı

      Eğer lessonName = Biology
     credit  2 olmalı

      Eğer lessonName = Chemistry
     credit  2 olmalı

      Eğer lessonName = Music
     credit  3 olmalı

     if the class is non of these options
     Class bu seçeneklerden değilse
         "You class name is not a valid class name."  diye exception fırlat.


     İf statementten  sonra
     lessonName'i classNameAndScore'a key olarak koyun
     value RandomNum olan sonraki methodundan almalıdır
     */
//-------------------------------------------------------------------------------------------------------


    /*
    Create a method name is RandomNum
    no parameter
    Return type is int

    create an int number between 0 to 100
     */


int RandomNum(){

    return  (int) java.lang.Math.random()*100;
}

     /*

    Parametresi olmayan ve return türü int olan RandomNum methodunu oluşturun

    0 ile 100 arasında bir int  oluştur
     */

//-------------------------------------------------------------------------------------------------------
    /*
    Create a get method for the ClassNameAndScore
     */

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

/*
   ClassNameAndScore için get methodu oluşturun
     */
}
