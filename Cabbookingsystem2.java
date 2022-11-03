
package cabbookingsystem2;
import java.util.*;

public class CabBookingSystem2 {
 public static List<User> UserList = new ArrayList<>();
    private  List<DestinationSetGet> DestinationList = new ArrayList<>();
    private static List<DriverList> DList = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    static String CurrentLOC, FINALDES;
    static String Name, Car, Plate;
    public static int choose;
    
    public static void NewUser(User user){
        UserList.add(user);
    }
    public static void main(String[] args) {
        
        existuser();
        RandomDriver();
        mainmenu();
        
    }
    
    public static void existuser()
    {
        User user1 = new User("Christina","Boborol", "123456789", "asdasd@gmail.com", "Yna", "Boborol");
        UserList.add(user1);
    }
    
    public static void mainmenu()
    {
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        System.out.println("[3] Exit");
        choose = scan.nextInt();
        switch(choose)
        {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
    public static void register(){
          try (Scanner scanner = new Scanner(System.in)) {
           
        
            System.out.print("Please Register ");
            System.out.print("\n***********************\n");
            
            System.out.print("Enter firstName : ");
            String firstname = scanner.next();
           

            System.out.print("Enter lastName : ");
            String lastname = scanner.next();
            

            System.out.print("Enter phoneNo : ");
            String phone = scanner.next();
            
            
            System.out.print("Enter email  : ");
            String email = scanner.next();
        

            System.out.print("Enter userName : ");
            String username = scanner.next();
           

            System.out.print("Enter password : ");
            String password = scanner.next();
            
            User user = new User(firstname, lastname, phone , email, username, password );
            NewUser(user);
            
        
            System.out.print("\nYou are finally register " + firstname +""+ lastname );
            System.out.print("\n-------------------------------\n");
            System.out.println("\n Please login To Book A CAB");
            System.out.print("\n-------------------------------\n\n");
            mainmenu();
                   
            }
        }
     public static void login(){
      
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print(" Enter userName: ");
            String username = scanner.next();
            
            System.out.print(" Enter password: ");
            String password = scanner.next();
            System.out.println("\n------------------\n");
            
            for(int i=0; i<UserList.size(); i++){
                if(UserList.get(i).getusername().equals(username)){
                  if(UserList.get(i).getpassword().equals(password)){
                      System.out.print("You are succesfully loged-in\n");
                      System.out.print("\n*******************************\n");
                      System.out.print("\nWelcome to Clar's Cab Booking Management!!");
                      System.out.print("\n*********************************************\n");
                    CabBookingSystem2 CAB = new CabBookingSystem2();
                  CAB.GetUserLocation();
                } 
                }
                if(!UserList.get(i).equals(username) || !UserList.get(i).getpassword().equals(password)){
                    System.out.print("\nInvalid Credentials\n");
                }     
           }    
        }
     }   
          
           
    public static void RandomDriver(){
        String[] driverList = {"Zoi Auza" , "Christina Boborol" , "Clarence Camarillo" , "Marlon Sajelan"};
        String[] driverCar = {"Honda Civic" , "Toyota Vios" , "Suziki Wigo" , "Hyundai Elantra"};
        String[] plateNum = {"KVE - 127" , "NPA - 123" , "JVA - 619" , "ABC - 123"};
        for(int i =0, j =0,k = 0; i<driverList.length && j<driverCar.length && k<plateNum.length; i++, j++, k++){
            Name = driverList[i];
            Car = driverCar[j];
            Plate = plateNum[k];
            DriverList dl = new DriverList(Name,Car,Plate);
            DList.add(dl);
        }
       
    }
    public void GetUserLocation(){
    System.out.print("\nEnter Pickup Location: ");
    String currentLoc = scan.next();
    
    System.out.print("Enter Final Destination: ");
    String finalDestination = scan.next();
    
    System.out.print("Enter Pick-up Date: ");
    String date = scan.next();
    
    System.out.print("Enter Pick-up Time: ");
    String time = scan.next();
    
    DestinationSetGet dsg = new DestinationSetGet(CurrentLOC,FINALDES,date,time);
    DestinationList.add(dsg);
    CabBookingSystem2 cbs = new CabBookingSystem2();
    cbs.PickDriver();
    }
    
    public static void bookagain()
    {
        System.out.println("Want to book again?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        choose = scan.nextInt();
        switch(choose)
        {
            case 1:
                 CabBookingSystem2 CAB = new CabBookingSystem2();
                 CAB.GetUserLocation();
                break;
            case 2:
                System.out.println("Thank you for booking:)");
                System.exit(0);
                break;
        }
    }
    
    
    
    
    public void PickDriver(){
        for(int i = 0; i<DList.size(); i++){
            System.out.print("\n" + i + "." + "" + DList.get(i).getDriverName() + "\n" + DList.get(i).getDriverCar() + "\n" + DList.get(i).getCarPlate() + "\n");
        }
        int a = 0;
        while(a < 3){
            System.out.print("Pick Your Driver: ");
            choose = scan.nextInt();
            switch(choose){
                case 0: System.out.println("You are succesfully Booked Your driver would be " + DList.get(choose).getDriverName() + " and will arrived on the Day and time that you booked. \nPlease be patient while waiting. Thank You :)/n");
                        bookagain();
                        break;
                case 1: System.out.println("You are succesfully Booked Your driver would be " + DList.get(choose).getDriverName() + " and will arrived on the Day and time that you booked. \nPlease be patient while waiting. Thank You :)/n");
                        bookagain();
                        break;
                case 2: System.out.println("You are succesfully Booked Your driver would be " + DList.get(choose).getDriverName() + " and will arrived on the Day and time that you booked. \nPlease be patient while waiting. Thank You :)/n");
                        bookagain();
                        break;
                case 3: System.out.println("You are succesfully Booked Your driver would be " + DList.get(choose).getDriverName() + " and will arrived on the Day and time that you booked. \nPlease be patient while waiting. Thank You :)/n");
                        bookagain();
                        break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }
        
    }
    }
    
               