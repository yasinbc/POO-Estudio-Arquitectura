import java.util.ArrayList;
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente extends Persona
{
    private Persona clientes;
    
    public Cliente(){
        super();
        clientes = new Persona();
    }
    
    public void guardarCliente(String cliente){
        guardarPersona(cliente);
    }
    
    public int numeroClientes(){
        return numeroPersonas();
    }
    
    public void mostrarClientes(){
        mostrarPersonas();
    }
}
