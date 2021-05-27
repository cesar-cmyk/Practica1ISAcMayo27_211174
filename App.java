import java.util.Scanner;
public class PrincipalHospital {
    static Paciente paciente1; //Instancia, de forma global
    public static void main(String[] args) {

        solicitarDatos();//llamada de método

        //Impresión de la información del objeto, se accede a los métodos de la clase Paciente
        System.out.println("Datos del paciente: "+paciente1.mostrarNombre()+" "+paciente1.mostrarEdad()+" anios");

    }
    public static void solicitarDatos(){
        Scanner entrada= new Scanner (System.in); //Creación del objeto Scanner


        System.out.println("Ingrese los datos del paciente\nEdad:");
        int edadIngresada= entrada.nextInt();

        entrada.nextLine();//Permite limpiar el objeto Scanner para una siguiente captura de datos

        System.out.println("Ingresa el nombre del paciente");
        String nombreIngresado=entrada.nextLine();

        //Creación del objeto con información pasada por parámetros
        paciente1=new Paciente(nombreIngresado,edadIngresada);
    }

}