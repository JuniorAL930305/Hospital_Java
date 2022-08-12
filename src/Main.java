import static Ui.UiMenu.*;


public class Main {
    public static void main(String[] args) {
        // Doctor --> class   MiDoctor-->Objet
        // new Doctor(); --> metodo constructor ó instantiation del objet
        // tiene el mimso nombre de la clase que se inicializa
        Doctor MiDoctor=new Doctor();//objeto MiDoctor creado en la clase Doctor
//        MiDoctor.nombre="alejandro rodriguez  ";
//        MiDoctor.mostrarnombre();
//        MiDoctor.mostarId();
//        System.out.println();
//
//        Doctor miDoctoe2=new Doctor();
//        miDoctoe2.mostarId();
//        System.out.println(Doctor.id);
        mostrarMenu();
        mostrarMenuPaciente();
    }
}
