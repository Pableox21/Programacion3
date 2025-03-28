package ejercicio4;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class estudiante extends Persona {
    String codigoSIS;

    public estudiante() {
        super();
        Persona[] personas = new Persona[18];
        Scanner scanner = new Scanner(System.in);
    }
    public estudiante(String nombre,String codigoSIS)
        super(String nombre,String primer_apellido,String segundo_apellido,Date fechaNacimiento,Integer numeroCI,String complemento);{
            this.codigoSIS=codigoSIS;
    }
    public void ejecutar() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Estudiante" + (i + 1) + ":");
            System.out.println("Ingrese su nombre= ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese su primerapellido= ");
            String primer_apellido = scanner.nextLine();
            System.out.println("Ingrese su segundo_apellido= ");
            String segundo_apellido = scanner.nextLine();
            System.out.println("Ingrese su numero de CI= ");
            Integer numroCI = scanner.nextInt();
            LocalDate fechaNacimiento = null;
        }
    }
}
