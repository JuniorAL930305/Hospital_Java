 public class Doctor {
    //atributos
    static  int id = 0;// siempre va ser auto incrementado
    String nombre;
    String especialidad;
    int raiz=25;
    Doctor(){  // metodo costructor
        System.out.println("Construyendo el objeto Doctor");
        id++;
        System.out.println("el nuevo nombre asignado es: "+ nombre+"\n");
    }
    // comportamientos
    public  void mostrarnombre() {
        System.out.println(nombre);
    }
    public void mostarId(){
        System.out.println("El ID del Doctor es: "+id);
    }
}
