import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        showMenu();

        Doctor myDoctor = new Doctor("junior acuña","fisioterapia");
        myDoctor.addAvailableAppointment(new Date(),"5pm");
        myDoctor.addAvailableAppointment(new Date(),"6pm");

        for (Doctor.AvailableAppointment aA :myDoctor.getAvailableAppointments()
             ) {
            System.out.println(aA.getDate()+" "+aA.getTime());
        }

            System.out.println();
            System.out.println();
            Patient patient = new Patient("pedro torrez","Servi@sp");
            System.out.println(patient);




    }

}
