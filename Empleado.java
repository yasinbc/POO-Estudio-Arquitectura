
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado extends Persona
{
    Persona empleados;

    /**
     * Constructor for objects of class Cliente
     */
    public Empleado()
    {
        super();
        empleados = new Persona();
    }
    
    public void guardarEmpleado(String empleado){
        guardarPersona(empleado);
    }
    
    public int numeroEmpleados(){
        return numeroPersonas();
    }
    
    public void mostrarEmpleados(){
        mostrarPersonas();
    }
}
