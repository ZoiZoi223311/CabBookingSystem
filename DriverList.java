
package cabbookingsystem2;


public class DriverList {
       public String driverName, driverCar, carPlate;
    
    public DriverList(String Name, String Car, String Plate){
        this.driverName = Name;
        this.driverCar = Car;
        this.carPlate = Plate;
    }
    
   public String setDriverName(String Name){
       this.driverName = Name;
       return this.driverName;
   }
   
   public String setDriverCar(String Car){
       this.driverCar = Car;
       return this.driverCar;
   }
   public String setCarPlate(String Plate){
       this.carPlate = Plate;
       return this.carPlate;
   }
   //GETTERS
   public String getDriverName(){

       return this.driverName;
   }
   
   public String getDriverCar(){

       return this.driverCar;
   }
   public String getCarPlate(){

       return this.carPlate;
   }
}
