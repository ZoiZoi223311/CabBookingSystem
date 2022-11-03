
package cabbookingsystem2;


public class User
{
      public static String firstname, lastname, email, username, password;
    public static String phone;
    
    User(String firstname, String lastname, String phone, String email, String username, String password)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    public String getfname()
    {
        return firstname;
    }
    
    public void setfname(String firstname)
    {
        this.firstname = firstname;
    }
    
        public String getlname()
    {
        return lastname;
    }
    
    public void setlastname(String lastname)
    {
        this.lastname= lastname;
    }
    public String getphone()
    {
        return phone;
    }
    
     public void setphone(String phone)
    {
        this.phone = phone;
      }
    public String getemail()
    {
        return email;
    }
    
     public void setemail(String email)
    {
        this.email = email;
    }    

     public String getusername()
    {
        return username;
    }
    
     public void setusername(String username)
    {
        this.username = username;
    }
        public String getpassword()
    {
        return password;
    }
    
     public void setpassword(String password)
    {
        this.password = password;
    
    }
}
