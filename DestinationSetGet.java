

package cabbookingsystem2;

public class DestinationSetGet {

     private String currentlocation, finaldestination,date,time;
     
    public DestinationSetGet(String CurrentLOC, String FINALDES, String Date, String Time){
        this.currentlocation = CurrentLOC;
        this.finaldestination = FINALDES;
        this.date = Date;
        this.time = Time;
    }
    
    public String setCurrentDes(String CurrentLOC){
        this.currentlocation = CurrentLOC;
        return this.currentlocation;
    }
    
    public String setFinalDes(String FINALDES){
        this.finaldestination = FINALDES;
        return this.finaldestination;
    }
    public String Date(String Date){
        this.date = Date;
        return this.date;
    }
    public String Time(String Time){
        this.time = Time;
        return this.time;
    }
    public String getCurrentDes(){
       
        return this.currentlocation;
    }
    
    public String getFinalDes(){
       
        return this.currentlocation;
    }
public String getDate(){
       
        return this.date;
    }
    
    public String Date(){
       
        return this.date;
    }
    public String Time(){
       
        return this.time;
    }
    
    public String time(){
       
        return this.time;
    }
}
