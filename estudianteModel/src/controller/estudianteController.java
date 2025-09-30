package controller;

import java.util.List;
import java.util.Scanner;

import model.estudianteModel;
import view.estudianteView;

public class estudianteController {
    private estudianteView ev;
    private Scanner sc = new Scanner(System.in);

    public estudianteController(estudianteView e){
        this.ev = e;
    }

    public void ejecutable(){
        int opcion = 0;
        do{
            ev.Menu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    estudianteModel em = ev.adicionarEstudiante();
                    estudianteModel.adicionarEstudianteLista(em);
                    ev.mostrarMensajes("Estudiante adicionado!");
                    break;
                case 2:
                    List<estudianteModel> el= estudianteModel.obtenerEstudianteLista();
                    ev.mostrarEstudianteLista(el);
                    break;

                case 3:
                    int codigo = ev.eliminarEstudianteLista();
                    estudianteModel.eliminarEstudianteLista(codigo);
                    break;

                case 4:
                    ev.mostrarMensajes("Saliendo de la aplicacion.");
                    break;
                default:
                    ev.mostrarMensajes("Opcion Incorrecta!");
                    break;
            }
        }while(opcion !=4);
    }

}//final
