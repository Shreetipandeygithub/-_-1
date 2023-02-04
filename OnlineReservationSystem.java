import java.util.*;
class ReservationSystem{
    String name;
    String LoginId;
    String Password;
     public void Register(){
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter your name:");
        this.name=sc1.nextLine();
        System.out.println("Enter you LoginId:");
        this.LoginId=sc1.nextLine();
        System.out.println("Enter you password:");
        this.Password=sc1.nextLine();
     }

     public void Login(){
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter your LoginId:");
        String loginId=sc2.nextLine();
        if(loginId.equals(LoginId)){
            System.out.println("Enter your password:");
            String pass=sc2.nextLine();
            if(pass.equals(Password)){
                System.out.println("successfully login");
            }
        }else{
            System.out.println("Wrong username or password");

        }
    }
    public static int PNR=01123;

    public void Reservation(){
        Scanner sc3=new Scanner(System.in);

        System.out.println("Enter your Train Number");
        String Train_number=sc3.nextLine();

        System.out.println("Enter your Train Name");
        String Train_name=sc3.nextLine();

        System.out.println("Date of Journey");
        String Date_of_Journey=sc3.nextLine();

        System.out.println("From place");
        String start_Place=sc3.nextLine();

        System.out.println("To place");
        String end_Place=sc3.nextLine();
;
        System.out.println("Enter your Class Type: sleeper, general, AC");
        String ClassType=sc3.nextLine();

        System.out.println("Enter (1) to insert the data and proceed further ");
        System.out.println(" (2) to exit");
        int choice=sc3.nextInt();
        if(choice==1){
            ReservationComplete(Train_name,Train_number,Date_of_Journey,start_Place,end_Place,ClassType);
        }else{
            System.exit(0);
        }
        System.out.println();
        System.out.println();
        System.out.println("Enter     1.Cancellation     2.Exit");
        int c=sc3.nextInt();
        if(c==1){
            ReservationSystem rs=new ReservationSystem();
            rs.Cancellation();
        }else{
            System.exit(0);
        }
    }
    public void ReservationComplete(String Train_name,String Train_number,String Date,String SPlace,String EPlace,String Class){
        System.out.println("*****************Reservation Successfully Completed************");
        System.out.println("Train Name: "+Train_name);
        System.out.println("Train Number: "+Train_number);
        System.out.println("Date of Journey: "+Date);
        System.out.println("Starting Place of Journey: "+SPlace);
        System.out.println("Ending Place of Journey: "+EPlace);
        System.out.println("Class Type: "+Class);
        PNR++;
        System.out.println("Your PNR Number: "+PNR);
        System.out.println("*********************************************************************************1****************");
    }
    public void Cancellation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your PNR number:");
        int pnr=sc.nextInt();
        System.out.println("Your Ticket Has Successfully Cancelled...");
    }


}
public class OnlineReservationSystem{
    public static void main(String args[]){
        System.out.println("*********************WELCOME ONLINE RESERVATION SYSTEM****************************");
        System.out.println("ENTER:   1.REGISTER    2.EXIT");
        System.out.println("Enter the choice:");

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input==1){
            ReservationSystem r=new ReservationSystem();
            r.Register();
            System.out.println();
            while(true){
                System.out.println("Enter:          1.Login         2.Exit");
                Scanner sc4=new Scanner(System.in);
                int choice=sc4.nextInt();
                if(choice==1){
                    r.Login();
                        System.out.println("Enter:     1.Reservation     2.Exit");
                        System.out.println("Enter the choice:");
                        Scanner sc5=new Scanner(System.in);
                        int ch=sc5.nextInt();
                        if(ch==1){
                            r.Reservation();
                            // System.out.println();
                            // System.out.println("Enter    1.cancellation   2.exit");
                            // System.out.println("Enter the choice:");
                            // Scanner sc6=new Scanner(System.in);
                            // int cho=sc6.nextInt();
                            // if(cho==1){
                            //     r.Cancellation();
                            // }else{
                            //     System.exit(0);
                            // }
                        }else{
                            System.exit(0);
                        }
                    }
            }
        }else{
            System.exit(0);
        }
    }
}
                            
