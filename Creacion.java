/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mafer
 */
import java.util.Scanner;
public class Creacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    int salir =1;
    Archivos objeto1 = new Archivos();
    System.out.println("------------Bienvenido a Citrix Connect-------------");
    System.out.println("""
                       Eliga una opcion: 
                       1.Crear base de datos 
                       2.Agregar
                       3.Buscar
                       4.Listar
                       5.Salir
                       """);    
    while (salir != 6)
    {
    try{

    System.out.println("----------------------------------------------------");
    System.out.println("Eliga una opcion:");
    salir = teclado.nextInt();
    if (salir ==1){objeto1.new_archivo();}           
         
    if (salir ==2){
    System.out.println("Ingresa su primer nombre: ");
    String  nombre = teclado.next();
    System.out.println("Ingrese sus apellidos:  ");
    String  apellidos = teclado.next();
    System.out.println("Ingrese su día de nacimiento: ");
    int dia_nacimiento = teclado.nextInt();
    System.out.println("Ingrese su mes de nacimiento: ");
    int mes_nacimiento = teclado.nextInt();
    System.out.println("Ingrese su año de nacimiento: ");
    int anio_nacimiento = teclado.nextInt();
    System.out.println("Digite su DPI: ");
    int dpi = teclado.nextInt();
    System.out.println("Ingrese su genero: ");
    String  genero = teclado.next();
    System.out.println("Digite su telefono: ");
    int telefono = teclado.nextInt();
    System.out.println("Digite su direccion: ");
    String  direccion = teclado.next();
       
    objeto1.asignardatos(nombre,apellidos,dia_nacimiento,mes_nacimiento,anio_nacimiento,dpi,genero,telefono,direccion);

    } 
    if (salir ==3){
    System.out.println("---------Ingrese su nombre----------");
    String nombre=teclado.next();
    objeto1.buscarregistro(nombre);
    }
    if (salir ==4){
    System.out.println("---------Registros----------");
    objeto1.Listar();
    }
    if (salir ==5){
    System.out.println("Gracias por se parte de nosotros");
    System.exit(0);
    }
}   
    catch (Exception ex )
    {
       System.out.println(ex.getMessage());
       teclado.nextLine();
    }
 //-----------------------------------------------------------------------------   
    }
    }
    
}
