import java.io.Serializable;

/**
 * Proyecto: Nómina
 * Materia: Programación orientada a objetos
 * Trimestre: 09-O
 * @author Juan José Guzmán Cruz
 *
 * En esta clase se especifican los campos que se utilizarán para la creación
 * de la nómina del personal.
 * Estos son los datos que serán requeridos en pantalla para que el usuario
 * los ingrese, excepto sueldototal que será calculado de forma automática, sin
 * intervención del ususario y también será mostrado en pantalla.
 *

 */

public class Empleado implements Serializable
{

    private String nombre, rfc;
    private int numemp, diaslab;
    private float sueldodiario, sueldototal;

    public Empleado(int numemp, String nombre, String rfc, float sueldodiario, int diaslab, float sueldototal)

    {
        this.nombre = nombre;
        this.numemp = numemp;
        this.rfc = rfc;
        this.sueldodiario = sueldodiario;
        this.diaslab = diaslab;
        this.sueldototal = sueldototal;
    }

    /**
     * Asigna el nombre del empleado tecleado por el ususario al campo nombre
     * @param nombre - recibe el nombre del empleado tecleado por el usuario
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor almacenado en el campo nombre
     * @return
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Asigna el número del empleado tecleado por el ususario al campo nomemp
     * @param numemp - recibe el número del empleado tecleado por el usuario
     */
    public void setNumemp(int numemp)
    {
        this.numemp = numemp;
    }

    /**
     * Devuelve el valor almacenado en el campo numemp
     * @return
     */
    public int getNumEmp()
    {
        return numemp;
    }

    /**
     * Asigna los días laborados por el empleado tecleado por el ususario al
     * campo diaslab.
     * @param diaslab - recibe el número de días laborados por el empleado
     * tecleado por el usuario.
     */
    public void setDiasLab(int diaslab)
    {
        this.diaslab = diaslab;
    }

    /**
     * Devuelve el valor almacenado en el campo diaslab
     * @return
     */
    public int getDiasLab()
    {
        return diaslab;
    }

    /**
     * Asigna el RFC del empleado tecleado por el ususario al campo rfc
     * @param rfc - recibe el RFC del empleado tecleado por el usuario
     */
    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }

    /**
     * Devuelve el valor almacenado en el campo rfc
     * @return
     */
    public String getRfc()
    {
        return rfc;
    }

    /**
     * Asigna el sueldo diario del empleado tecleado por el ususario al campo sueldodiario
     * @param sueldodiario - recibe el sueldo diario del empleado tecleado por el usuario
     */
    public void setSueldoDiario(float sueldodiario)
    {
        this.sueldodiario = sueldodiario;
    }

    /**
     * Devuelve el valor almacenado en el campo numemp
     * @return
     */
    public float getSueldoDiario()
    {
        return sueldodiario;
    }

    /**
     * Guarda el valor del sueldo total calculado automaticamente cuando el
     * usuario ingresa los datos del empleado
     * @param sueldototal - Guarda el sueldo total
     */
    public void setSueldoTotal(float sueldototal)
    {
        this.sueldototal = sueldototal;
    }

    /**
     * Devuelve el sueldo total, este se calculo automaticamente cuando el
     * usuario ingresa los datos del empleado
     * @return sueltototal - Devuelve el sueldo total
     */
    public float getSueldoTotal()
    {
        return sueldototal;
    }

}
