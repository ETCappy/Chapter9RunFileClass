class Main {
  public static void main(String[] args) {
    Car myCar = new Car();                
       myCar.make = "Subaru";                
     myCar.model = "Outback";               
     myCar.year = 2017;                   
     myCar.mpg = 28;                      
       myCar.color = "black";  
   
      System.out.println("My car: ");
       System.out.println(myCar.getMake());   //
      System.out.println(myCar.getModel());
       System.out.println(myCar.getYear());
      System.out.println(myCar.getMPG());
      System.out.println(myCar.getColor());  //
           
       myCar.setMake("Ford");                  //
     myCar.setModel("Mustang");
      myCar.setYear(2018);
      myCar.setMPG(55.7);
       myCar.setColor("Red");                  //
           
     System.out.println("My car: ");
       System.out.println(myCar.getMake());   //
      System.out.println(myCar.getModel());
      System.out.println(myCar.getYear());
       System.out.println(myCar.getMPG());
       System.out.println(myCar.getColor());  //
  
      myCar.setYear(2075);                   //
     
   


  }
}