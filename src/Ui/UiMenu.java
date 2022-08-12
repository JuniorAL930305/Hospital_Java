package Ui;

import java.util.Scanner;

public class UiMenu {
    public static void mostrarMenu(){
        System.out.println("Bienvenida a mis citas\n");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Junior");
                    break;
                case 2:
                    response = 0;
                    mostrarMenuPaciente();

                    break;
                case 0:
                    System.out.println("Gracias por su vicita ");
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta correcta ");
            }
        }while (response != 0);
    }

    public static void  mostrarMenuPaciente(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. Reserva una cita ");
            System.out.println("2. Mi cita");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    mostrarMenu();
                    break;
            }
        }while (response != 0);
    }
    }

