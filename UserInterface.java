package VehicleBreakdown;
import java.io.*;
import java.util.*;
public class UserInterface{
    Vector<User> users=new Vector<User>();
    UserInterface(){
        //filehandling
        String t,email,password,needService,allotted;
        String name,number,company,model, address,mechanic,mechNumber;
        try{
            FileReader f=new FileReader("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\userData.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                email=sc.nextLine();
                    password=sc.nextLine();
                    needService=sc.nextLine();
                    allotted=sc.nextLine();
                    User u=new User(email, password, needService, allotted);
                t=sc.nextLine();
                while(!t.equals("-")){
                    name=t;
                    number=sc.nextLine();
                    company=sc.nextLine();
                    model=sc.nextLine();
                    address=sc.nextLine();
                    mechanic=sc.nextLine();
                    mechNumber=sc.nextLine();
                    t=sc.nextLine();
                    u.addReq(name,number,company,model,address,mechanic,mechNumber);
                }
                users.addElement(u);
                
                

            }
            sc.close();
            f.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    boolean newUserCheck(String e){
        for(User i:users){
            if(i.email.equals(e))
            return true;
        }
        return false;
    }
    void addUser(String e,String p){
        User u=new User(e, p, "false", "false");
        users.addElement(u);
        try{
            FileWriter f=new FileWriter("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\userData.txt",true);
            f.write("\n"+e+"\n"+p+"\nfalse\nfalse\n-");
            f.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    boolean verifyLogin(String e, String p){
        for(User i:users){
            if(i.email.equals(e)){
            if(i.password.equals(p))
            return true;
            else
            return false;}
        }
        return false;
    }
    void newRequest(String e,String n,String nu,String c, String m, String a){
        User u=null;
        int found=0;
        for(int i=0;i<users.size();i++){
            if(users.get(i).email.equals(e)){
                users.get(i).newReq(n, nu, c, m, a);
                found=1;
                break;
            }
        }
        if(found==0){
            System.out.println("user not found in add request");
            return;
        }
        // u.newReq(n, nu, c, m, a);
        // users.set(count,u);
        int check=0;
        try{
            FileWriter f=new FileWriter("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\userData.txt");
            for(User i:users){
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
    }
    Vector<Request> history(String e){
        for(User u:users){
            if(u.email.equals(e))
            return u.requests;
        }
        return null;
    }
}