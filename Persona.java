
package arreglo;

public class Persona {
    String nombre;
    String apellidos ;
    String fecha_nacimiento;
    String genero;
    int dpi;
    int telefono;
    
    public Persona(String nombre,String apellidos,String fecha_nacimiento,String genero,int dpi,int telefono){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fecha_nacimiento = fecha_nacimiento;
    this.genero = genero;
    this.dpi = dpi;
    this.telefono = telefono;  
}  

    Persona() {}
    public void Persona(){}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
public void print (){
    System.out.println("\t"+ this.apellidos);
    System.out.println("\t"+ this.fecha_nacimiento);
    System.out.println("\t"+ this.genero);
    System.out.println("\t"+ this.nombre);
    System.out.println("\t"+ this.dpi);
    System.out.println("\t"+ this.telefono);
   
}


}
