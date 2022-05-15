import java.util.ArrayList;
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private ArrayList<String> personas;

    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        personas = new ArrayList<String>();
    }
    
    public void guardarPersona(String persona){
        personas.add(persona);
    }
    
    public int numeroPersonas(){
        return personas.size();
    }
    
    public void mostrarPersonas(){
        for(String index: personas){
            System.out.println(index);
        }
    }
    
    
    
    //imprime en consola personas registradas
    /*public void mostrarUsuarios(){
        if(numeroPersonas()<1){//si no hay personas registradas lanza un mensaje notificandolo
            System.out.println("Todavía no hay personas registradas en el sistema");
        }else{//Lista a las personas y los ordena con un indice
            System.out.println("Lista de personas: ");   
            System.out.println("ID         Personas");
            for(String index:personas){
                System.out.println(personas.indexOf(index) +"          "+ index);//asigna un indice a cada personas por orden de registro
            }
        }
    }*/
    
}
