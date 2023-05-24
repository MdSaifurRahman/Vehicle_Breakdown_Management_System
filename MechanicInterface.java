package VehicleBreakdown;
import java.io.*;
import java.util.*;
 class MechanicInterface {
    Vector<Mechanic> mechanics=new Vector<Mechanic>();
    MechanicInterface(){
        String t,email,password,name,number,allotted;
        String userName,userNo,company,model,address;
        try{
            FileReader f=new FileReader("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\mechanicData.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                email=sc.nextLine();
                    password=sc.nextLine();
                    name=sc.nextLine();
                    number=sc.nextLine();
                    allotted=sc.nextLine();
                    Mechanic m=new Mechanic(email, password, name,number, allotted);
                
                t=sc.nextLine();
                while(!t.equals("-")){
                    userName=t;
                    userNo=sc.nextLine();
                    company=sc.nextLine();
                    model=sc.nextLine();
                    address=sc.nextLine();
                    t=sc.nextLine();
                    m.addService(userName, userNo, company, model, address);
                }
                mechanics.addElement(m);
                
                

            }
            sc.close();
            f.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    boolean newUserCheck(String e){
        for(Mechanic i:mechanics){
            if(i.email.equals(e))
            return true;
        }
        return false;
    }
    void addMechanic(String e,String p,String n,String nu){
        Mechanic m=new Mechanic(e, p,n,nu,"false");
        mechanics.addElement(m);
        try{
            FileWriter f=new FileWriter("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\mechanicData.txt",true);
            f.write("\n"+e+"\n"+p+"\n"+n+"\n"+nu+"\nfalse\n-");
            f.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    boolean verifyLogin(String e, String p){
        for(Mechanic i:mechanics){
            if(i.email.equals(e)){
            if(i.password.equals(p))
            return true;
            else
            return false;}
        }
        return false;
    }
    Vector<Service> history(String e){
        for(Mechanic m:mechanics){
            if(m.email.equals(e))
            return m.services;
        }
        return null;
    }
    Service currentjob(String e){
        
        for(Mechanic i: mechanics){
            if(i.email.equals(e)){
                if(i.onduty.equals("false")||i.services.size()==0){
                	
                    return null;
                }
                else{
                    try{
                        return i.services.lastElement();
                    }
                    catch(Exception ex){
                        System.out.println("in current job:"+ex);
                    }
                }
            }
        }
        System.out.println("mechanic not found in current job");
        return null;
    }
    void endService(String mail){
        UserInterface u=new UserInterface();
        for(Mechanic i:mechanics){
            if(i.email.equals(mail)){
                i.onduty="false";
                for(User j:u.users){
                    if(j.requests.lastElement().number.equals(i.services.lastElement().userNo)){
                        i.onduty="false";
                        j.needService="false";
                        j.allotted="false";
                    }
                }
            }
        }
        //
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
            for(Mechanic i:mechanics){
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
