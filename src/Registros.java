import java.io.Serializable;

/**
 * Proyecto: Nómina
 * Materia: Programación orientada a objetos
 * Trimestre: 09-O
 * @author Juan José Guzmán Cruz
 *
 * En esta clase se definen los métodos utilizados en este proyecto
 */


public class Registros implements Serializable
{

/**
 * Campos
 * regemp (Registro de empleados) es un arreglo del tipo Empleado, inicialmente
 * vacío.
 */
    private Empleado[] regemp = null;


    //Contructor - inicializa el campo regEmp en 0
    public Registros()
    {
        regemp = new Empleado[0];
    }

    //Constructor - inicializa el campo regEmp en el valor num
    public Registros(int num)
    {
        regemp = new Empleado[num];
    }

    /**
     * Agrega un objeto Empleado al final de la lista
     * @param objeto Una instancia de la clase Empleado
     */
    public void nuevoReg(Empleado objeto)
    {
        Empleado[] arregloTemp = new Empleado[regemp.length +1];
        for(int i=0; i<regemp.length; i++)
            arregloTemp[i] = regemp[i];
        arregloTemp[regemp.length] = objeto;
        regemp = arregloTemp;
    }

    /**
     * Devuelve el número de elementos actuales del arreglo
     * @return Devuelve número de elementos del arreglo
     */
    public int longitud()
    {
        return regemp.length;
    }

    /**
     * Buscar un objeto Empleado en la lista
     * @param str Cadena a buscar
     * pos Determina la posición desde donde se buscará en el arreglo
     * @return i Devuelve la posición del elemento buscado
     */
    public int buscar(String str, int pos)
    {
        String nombre;

        // si str es nula, regresar -1
        if(str == null)
            return -1;

        if(pos<0)
            pos = 0;

        /**
          * Averiguar si str esta contenida en el campo nombre de la clase Empleado
          * ¿str está contenida en nombre?
          * indexOf(String str)
          * Devuelve la posición del elemento buscado
          * De no encontrar el elemento regresar -1
          */
        for(int i=pos; i<regemp.length; i++)
            {
                nombre = regemp[i].getNombre();
                if(nombre.indexOf(str) > -1)
                    return i; 
            }
        return -1;
    }

    /**
     * Devuelve el objeto Empleado que esta en la posición i en el arreglo
     * @param i Posición en el arreglo
     * @return Devuelve el objeto Empleado en la posición i
     */
    public Empleado registro(int i)
    {
        if(i >= 0 && i<regemp.length)
            return regemp[i];
        else
            return null;
    }

    /**
    * Elimina un objeto Empleado de la lista utilizando el número de empleado
     * como criterio de selección.
    * @param numemp Número de empleado del registro del trabajador a eliminar
    * Se elimina el objeto Empleado
    */
    public boolean eliminarReg(int numemp)
    {
        /**
         * Busca en la lista el objeto Empleado que tiene el número
         * de empleado a eliminar.
         * Remueve el elemento de la lista
         * Devuelve true si encontró y eliminó el elemento
         * Devuelve false si no eliminóel elemento
         */
        for (int i=0; i<regemp.length; i++)
            if (regemp[i].getNumEmp() == numemp)
            {
                regemp = borrarReg(i);
                return true;
            }
        return false;
    }

    /**
    * Crea un nuevo arreglo de Empleado saltando el elemento n.
    * @param n Indice del elemento del arreglo a remover
    */
    public Empleado[] borrarReg(int n)
    {
        // escribir instrucciones
        Empleado[]arregloTemp = new Empleado[regemp.length-1];
        for(int i=0; i<regemp.length; i++)
        {
            if (i<n)
                arregloTemp[i] = regemp[i];
            if (i>n)
                arregloTemp[i-1] = regemp[i];
        }
        return arregloTemp;
    }
    /**
     * Busca un registro utilizando el número de empleado como condición, obteniendo
     * la posición del elemento encontrado o devolviendo -1 en caso de que el
     * registro no exista.
     * @param bus Guarda el valor recibido como condición (número de empleado)
     * de búsqueda
     * @return
     */
    public int buscarParaCam(int bus)
    {
        int numeroE;
        if(bus <= 0)
            return -1;
        for(int i=0; i<regemp.length; i++)
            {
               numeroE = regemp[i].getNumEmp();
                if(numeroE == bus)
                    return i;
            }
        return -1;
    }
}
