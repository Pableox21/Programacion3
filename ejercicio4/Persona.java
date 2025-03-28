package ejercicio4;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Persona{String nombre;
    String primer_apellido;
    String segundo_apellido;
    Date fechaNacimiento;
    Integer numeroCI;
    String complemento;

    public Persona (){
    }
    public Persona(String nombre, String primer_apellido, String segundo_apellido, Date fechaNacimiento, Integer numeroCI, String complemento) {
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCI = numeroCI;
        this.complemento = complemento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getNumeroCI() {
        return numeroCI;
    }

    public String getComplemento() {
        return complemento;
    }

    private Integer calcularEdad(){
        Calendar c=Calendar.getInstance();
        c.setTime(fechaNacimiento);
    }
    public Boolean ciConComplemento(){
        if (complemento==null){
            return Boolean.FALSE;
        }else {
            return Boolean.TRUE;
        }
    }
}

