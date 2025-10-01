import controller.estudianteController;
import view.estudianteGUI;
import view.estudianteView;

public class app {
    public static void main(String[] args) {
        //Ejecutable de la interfaz en consola
        //estudianteView  vista = new estudianteView();
        //estudianteController controlador = new estudianteController(vista);
        //controlador.ejecutable();

        //Ejecutable con interfaz grafica
        estudianteGUI eg = new estudianteGUI();
        eg.show();
    }
}
