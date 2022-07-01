
package modulo_3;


public class Abogado {
   
    private String nombre;
    private String apellido;
    private String tel;
    
    
 public Abogado(){
     
 }
    
    
//constructor
    public Abogado (String nombre, String apellido, String tel){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTel (tel);
    }
    
    
//Metodos
    public String getNombre (){
        return nombre;
    }
    public String getApellido (){
        return apellido;
    }
    public String getTel (){
        return tel;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    
    
}
