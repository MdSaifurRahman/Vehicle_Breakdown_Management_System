package VehicleBreakdown;
import java.util.Vector;

 class User {
    String email,password,needService="false",allotted="false";
    Vector<Request> requests=new Vector<Request>();
    User(String e, String p,String n,String a){
        email=e;password=p;needService=n;allotted=a;
    }
    void addReq(String n,String nu,String c, String m, String a, String me,String men){
        Request r=new Request(n, nu, c, m, a, me, men);
        requests.addElement(r);
    }
    void newReq(String n,String nu,String c, String m, String a){
        needService="true";allotted="false";
        Request r=new Request(n, nu, c, m, a, "", "");
        requests.addElement(r);
        needService="true";
        allotted="false";
    }
}
