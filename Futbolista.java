
package modulo4part1;


public class Futbolista {
    
   private String nombre;
   private int edad;
   private String equipo;
   
public Futbolista (){
    
}

public Futbolista(String nombre, int edad, String equipo){
    this.setNombre(nombre);
    this.setEdad(edad);
    this.setEquipo(equipo);
}

public String getNombre (){
    return nombre;
} 
public int getEdad(){
    return edad;
}
public String getEquipo(){
    return equipo;
}

public void setNombre(String _nombre){
    this.nombre = _nombre;
}
public void setEdad(int _edad){
    this.edad = _edad;
}
public void setEquipo(String _equipo){
    this.equipo = _equipo;
}
}
