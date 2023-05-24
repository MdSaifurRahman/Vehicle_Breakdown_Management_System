package VehicleBreakdown;
import java.util.Vector;

class Mechanic {
    String email,password,name,number,onduty;
    Vector<Service> services=new Vector<Service>();
    Mechanic(String e,String p,String n,String nu,String od){
        email=e;
        password=p;
        name=n;
        number=nu;
        onduty=od;
    }
    void addService(String u,String uno,String c,String m,String a){
        Service s=new Service(u, uno, c, m, a);
        services.addElement(s);
    }
}
