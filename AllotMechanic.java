package VehicleBreakdown;
import java.io.*;
public class AllotMechanic {
    AllotMechanic(){
        UserInterface u=new UserInterface();
        MechanicInterface m=new MechanicInterface();
        int index=0;
        for(User i:u.users){
            if(i.needService.equals("true")&&i.allotted.equals("false")){
                while(index<m.mechanics.size()){
                    if(m.mechanics.get(index).onduty.equals("false")){
                        i.allotted="true";
                        m.mechanics.get(index).onduty="true";
                        m.mechanics.get(index).addService(i.requests.lastElement().name, i.requests.lastElement().number, i.requests.lastElement().company, i.requests.lastElement().model, i.requests.lastElement().address);
                        i.requests.lastElement().mechanic=m.mechanics.get(index).name;
                        i.requests.lastElement().mechNumber=m.mechanics.get(index).number;
                        index++;
                        break;
                    }
                }
                index++;
            }
        }
        int check=0,check1=0;
        try{
            FileWriter f=new FileWriter("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\userData.txt");
            for(User i:u.users){
                if(check==0){
                    f.write(i.email);
                    check=1;
                }
                else{f.write("\n"+i.email);}
                f.write("\n"+i.password);
                f.write("\n"+i.needService);
                f.write("\n"+i.allotted);
                for(Request j:i.requests){
                    f.write("\n"+j.name);
                    f.write("\n"+j.number);
                    f.write("\n"+j.company);
                    f.write("\n"+j.model);
                    f.write("\n"+j.address);
                    f.write("\n"+j.mechanic);
                    f.write("\n"+j.mechNumber);
                }
                f.write("\n-");
            }
            f.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        try{
            FileWriter f=new FileWriter("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\mechanicData.txt");
            for(Mechanic i:m.mechanics){
                if(check1==0){
                    f.write(i.email);
                    check1=1;
                }
                else{f.write("\n"+i.email);}
                f.write("\n"+i.password);
                f.write("\n"+i.name);
                f.write("\n"+i.number);
                f.write("\n"+i.onduty);
                for(Service j:i.services){
                    f.write("\n"+j.userName);
                    f.write("\n"+j.userNo);
                    f.write("\n"+j.company);
                    f.write("\n"+j.model);
                    f.write("\n"+j.address);
                }
                f.write("\n-");
            }
            f.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}