package School;

import java.util.ArrayList;

public class   SchoolLocation {



    private String price;
    private String location;
    private static ArrayList<String> locationList= new ArrayList<>();




     /*
     3 private instance variables oluşturun
    String price and location
    Static String ArrayList locationList
     */

    //-------------------------------------------------------------------------------------------------------


    public SchoolLocation(String location){
        this.location=location;
        addLocation();
        setSchoolLocation();
        setPrice(price);

    }

    private void setSchoolLocation() {
    }


    public void setPrice(String price) {

        try {
            if (location.equalsIgnoreCase("USA"))
            {
                price ="$8000";
            }
            else if (location.equalsIgnoreCase("England")){
                price ="$6500";
            }

            else if (location.equalsIgnoreCase("France")){
                price ="$7200";
            }

            else if (location.equalsIgnoreCase("Germany")){
                price ="$7000";
            }

            else if (location.equalsIgnoreCase("Canada"))
            {
                price ="$7500";
            }

        }catch (Exception e){
            System.out.println("This is not a valid location");
        }





        this.price = price;
    }



    public void setLocation(String location) {
        this.location = location;
    }


    public String getPrice() {
        return price;
    }

    /*

        Parametresi string location olan constructor oluşturun

        üç methodu çağırın

        addLocation
        setSchoolLocation
        setPrice
     */

    //-------------------------------------------------------------------------------------------------------



  /*
             setPrice Methodunu oluşturun

            Eğer location  USA ise
                price  $8000 olmalı
            Eğer location  England ise
                price  $6500 olmalı
           Eğer location  France ise
                price  $7200 olmalı
            Eğer location  Germany ise
                price  $7000 olmalı
           Eğer location  Canada ise
                price  $7500 olmalı

            Eğer location bunlardan biri değil ise   exception fırlatın  --> "This is not a valid location"

     */

    //-------------------------------------------------------------------------------------------------------

     /*
    price için get methodu oluşturun
     */


    //-------------------------------------------------------------------------------------------------------

    public static void addLocation(){

        locationList.add("USA");
        locationList.add("England");
        locationList.add("France");
        locationList.add("Germany");
        locationList.add("Canada");
    }
     /*
        return türü olmayan addLocation isminde  public static methodunu oluşturun

        ArrayList locationList'e   USA , England , France , Germany , Canada  ekle
     */


    //-------------------------------------------------------------------------------------------------------

    public static ArrayList<String> getLocationList() {
        return locationList;
    }


    /*
     locationList için get methodunu oluşturun
     */

    //-------------------------------------------------------------------------------------------------------

       /*
    Create a set method for the locationList
    no return type
    one parameter String SchoolLocation
    Create an String ArrayList name is listOfLocations is equal to the get method of the locationList

    If the locationList contains SchoolLocation
    then instance variable location is equal to  SchoolLocation parameter

     If the locationList does NOT contains SchoolLocation parameter
     then throw a RunTimeException ("Location should be one of the following " +listOfLocations)
     */

    public void locationList(String SchoolLocation) {
        ArrayList<String> listOfLocations = new ArrayList<>(getLocationList());

        try {
            if (locationList.contains(SchoolLocation)) {
                location = SchoolLocation;
            }
            if (!locationList.contains(SchoolLocation))
                throw new RuntimeException("Location should be one of the following " + listOfLocations);


        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

 //            try {
    //            if (username.length() < 6)
    //                throw new Exception("6 karakterden az olamaz");
    //
    //            if (username.length() > 10)
    //                throw new Exception("10 karakterden fazla olamaz");
    //        }
    //        catch(Exception ex)
    //        {
    //            System.out.println("ex = " + ex);
    //        }




      /*

    parametresi  String SchoolLocation ve return türü olmayan locationList methodunu oluşturun

    Create an String ArrayList name is listOfLocations is equal to the get method of the locationList

     locationList'in get methoduna eşit olan listOfLocations adında bir String ArrayList oluşturun

    Eğer locationList  SchoolLocation içeriyorsa
    then instance variable location  SchoolLocation parametreye eşittir.

     Eğer locationList  SchoolLocation içermiyorsa
      RunTimeException fırlat ---> ("Location should be one of the following " +listOfLocations)
     */

    //-------------------------------------------------------------------------------------------------------

    public String getLocation() {
        return location;
    }

    /*
     location için get methodu oluşturun
     */


}
