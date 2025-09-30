import controller.estudianteController;
import view.estudianteView;

public class app {
    public static void main(String[] args) {
        estudianteView  vista = new estudianteView();
        estudianteController controlador = new estudianteController(vista);
        controlador.ejecutable();
    }
    
}
