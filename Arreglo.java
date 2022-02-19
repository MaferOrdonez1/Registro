
package arreglo;
import java.util.Scanner;
public class Arreglo {
    Persona [] arreglo = new Persona [6];
    Scanner in =new  Scanner(System.in);
    public static void main(String[] args) { 
         Arreglo arreglo = new Arreglo();
         arreglo.menu();
    }  
    
public void menu(){
    boolean  salir = false;
    int opcion;
    
    while(!salir) {
    
        System.out.println("------------Bienvenido a Citrix Connect-------------");
        System.out.println("Que desea realizar: \n"
                + "1.Ingresar \n"
                + "2.Mostrar\n"
                + "3.Buscar\n"
                + "4.Salir\n"); 
        System.out.println("Digite una opcion");
                 
        opcion = in.nextInt();
        switch(opcion) {

            case 1:   
                ingresar();
                break;   
                
            case 2: 
                print();
                break;

            case 3:
                buscar();
                break;

            case 4:
                System.out.println("Gracias por ser parte de nosotros");
                salir= true;
                break;
            default: 
                System.out.println("Se ha equivocado de menu de opcion");
            break;        
        } 
      }
    }


public void ingresar(){ 
    Persona persona = new Persona();     
    
    System.out.println("Ingrese su nombre");
    persona.setNombre(in.next());
    System.out.println("Ingrese su apellidos");
    persona.setApellidos(in.next());
    System.out.println("Ingrese su fecha_nacimiento");
    persona.setFecha_nacimiento(in.next());
    System.out.println("Ingrese su genero");
    persona.setGenero(in.next());
    System.out.println("Ingrese su dpi");
    persona.setDpi(in.nextInt());
    System.out.println("Ingrese su telefono");
    persona.setTelefono(in.nextInt());
    System.out.println("Su informacion ha sido guardada");
    System.out.println("----------------------------------------------------");
    arreglo [0] = persona;
}

public void print(){
    for (int i = 0 ; i < arreglo.length-1;i++){
       if( arreglo[i] !=null){
          arreglo[i].print();
         }
       }
        System.out.println("");
}
public void buscar(){
    int dpi;
    System.out.println("Ingrese dpi");
    dpi = in.nextInt();
    
        for (Persona arreglo1 : arreglo) {
            if (arreglo1 != null) {
                if (dpi == arreglo1.getDpi()) {
                    arreglo1.print();
                } else {
                    System.out.println("No se ha encontrado en el registro de Citrix Connect ");
                }
            }
        }
}



}
