import java.util.ArrayList;
import java.util.Date;

public class Doctor extends  User {
    //Atributos
    private String speciality;
    Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del doctor asignado es "+ name+"  y su especialidad es "+speciality);
        this.speciality=speciality;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void setAvailableAppointments(ArrayList<AvailableAppointment> availableAppointments) {
        this.availableAppointments = availableAppointments;
    }

    ArrayList<AvailableAppointment> availableAppointments=new ArrayList<>();
    public void  addAvailableAppointment(Date date, String time){ // añade nuevas citas deisponibles que se acumulan en el array de debajo
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    public  ArrayList<AvailableAppointment>getAvailableAppointments(){
        return availableAppointments;
    }

    public void availableAppointments(String s) {
    }

    public static class AvailableAppointment{
        //Available Appointment
        private  int id;
        private Date date;
        private  String time;



        public AvailableAppointment(Date date, String time) { // metodo cosntructor
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
