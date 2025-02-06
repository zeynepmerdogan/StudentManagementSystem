package Student;


import Data.StudentData;
import School.SchoolLocation;

import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {

    private String username;
    private String password;
    private LinkedHashMap<String,Integer> classNameAndScore =new LinkedHashMap<>();

    public StudentClass(String username, String password, String location) {
        super(location);
        this.username = username;
        this.password = password;
        setUsernameAndPassword(username, password);
    }

    private void setUsernameAndPassword(String username,String  password) {
        StudentData studentData=new StudentData();

        LinkedHashMap<String,String> yeni= new LinkedHashMap<>(studentData.AddUserNameAndPassword());

        try {
            if ( !yeni.containsValue(password) && yeni.containsKey(username)) {

            }
        }catch (RuntimeException e)
        {
            System.out.println(e+ "Not able to find a username and password. Please sign up to website");
        }
        finally {
            this.username = username;
            this.password = password;
        }



    }




    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }


    @Override
    public String toString() {
        return "StudentClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", classNameAndScore=" + classNameAndScore +
                "price"+ getPrice()+
                "schoolLocation"+
                '}';
    }

    /*
    Bu sınıf   SchoolLocation sınıfının child sınıfıdır

     3 private instance variables oluşturun

    String username and password

    Linked hash map , key  String ve  value Integer ,  ismi  classNameAndScore

     */
    //-------------------------------------------------------------------------------------------------------

    /*

         String username, String password ve String studentSchoolLocation parametreleri olan constructor oluştur.

         constructor içinde setUsernameAndPassword methodunu çağır

     */
//-------------------------------------------------------------------------------------------------------
    /*
    Create a method name is  setUsernamePassword
    Parameter is String username and String  password
    no return type

    Check if given username and password pair exist in the StudentData class
    You will use AddUserNameAndPassword method to check it(create a new LinkedHashMap and make it equal to AddUserNameAndPassword from the StudentData class)
    if the pair exists,  make instance variable username equal to parameter username, and make instance variable password equal to parameter password

    if it doesn't not exist then throw an RunTimeException which is "Not able to find a username and password. Please sign up to website"
     */

    /*

    Parametreleri  String username ve  String  password olan , return türü olmayan setUsernamePassword isimli methodu oluşturun

    StudentData sınıfında verilen kullanıcı adı ve parola çifti olup olmadığını kontrol edin

     Kontrol etmek için AddUserNameAndPassword methodunu kullanacaksınız (yeni bir LinkedHashMap oluşturun ve StudentData sınıfından AddUserNameAndPassword ile eşit yapın)

    çift varsa, instance variable username ile  parameter username eşitle,  ve instance variable password ile parameter password eşitle

   Eğer çift yoksa   "Not able to find a username and password. Please sign up to website" olan RunTimeException fırlat
     */


    //-------------------------------------------------------------------------------------------------------

    /*
        create a set method for the classNameAndScore
     */

    /*
        classNameAndScore için set methodunu oluşturun
     */

    //-------------------------------------------------------------------------------------------------------

    /*
        create a get method for the classNameAndScore
     */

     /*
        classNameAndScore için get methodunu oluşturun
     */


    //-------------------------------------------------------------------------------------------------------
    /*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */

    /*
     toString method  oluşturun
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */
    //-------------------------------------------------------------------------------------------------------
}
