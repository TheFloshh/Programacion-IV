package view;

import java.util.List;
import java.util.Scanner;

import model.estudianteModel;

public class estudianteView {
    private Scanner sc = new Scanner(System.in);

    public void Menu(){
        System.out.println("\n---Gestion de estudiante---");
        System.out.println("1. Adicionar Estudiante a la lista.");
        System.out.println("2. Ver estudiantes de la lista.");
        System.out.println("3. Eliminar Estudiante de la lista.");
        System.out.println("4. Salir de la aplicacion.");
        System.out.println("Ingrese su opcion:  ");
    }

    public estudianteModel adicionarEstudiante(){
        System.out.println("\n---Ingrese los datos del estudiante: ");
        System.out.println("Ingrese Codigo: ");
        int cod = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese nombre: ");
        String nom = sc.nextLine();
        return new estudianteModel(cod, nom);
    }

    public void mostrarEstudianteLista(List<estudianteModel> el){
        if(el.isEmpty()){
            System.out.println("\nNo hay estudiantes en la lista");
        }  else{
            for(estudianteModel e:el){
                System.out.println("Codigo: " + e.obtenerCodigo());
                System.out.println("Nombre: " + e.obtenerNombre());
            }
        }
    }

    public int eliminarEstudianteLista(){
        System.out.println("\n---Eliminar estudiante de la lista.");
        System.out.println("\nIngrese el codigo del estudiante: ");
        return Integer.parseInt(sc.nextLine());
    }

    public void mostrarMensajes(String mensaje){
        System.out.println(mensaje);
    }
}
