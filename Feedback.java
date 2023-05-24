package VehicleBreakdown;
import java.io.*;
class Feedback{
	Feedback(String msg,int choice){
		if(choice==1) {
			try {
				FileWriter f=new FileWriter("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\userFeedback.txt",true);
				f.write("\n"+msg+"\n-");
				f.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else if(choice==2) {
			try {
				FileWriter f=new FileWriter("C:\\Users\\mdsai\\eclipse-workspace\\Vehicle_Breakdown_Management_System\\src\\VehicleBreakdown\\mechanicFeedback.txt",true);
				f.write("\n"+msg+"\n-");
				f.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}