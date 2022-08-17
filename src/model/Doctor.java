package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;
    public Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del doctor asignado es "+ name+"  y su especialidad es "+speciality);
        this.speciality=speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciality='" + speciality + '\'' +
                '}';
    }
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia ");
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
    public void  addAvailableAppointment(String date, String time){ // añade nuevas citas deisponibles que se acumulan en el array de debajo
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

        SimpleDateFormat format = new SimpleDateFormat("dd//MM/yyyy");


        public AvailableAppointment(String date, String time) { // metodo cosntructor
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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

        public String getDate(String DATE) {
            return format.format(date);
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
