package view;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionListener;

import controller.estudianteController;

public class estudianteGUI extends JFrame{
    private estudianteController estC;

    //Elementos graficos para representar el modelo
    //Recibir informacion del usuario

    private JTextField id;
    private JTextField nombre;
    
    //elementos de interaccion del usuario
    private JButton adicionar;
    private JButton ver;
    private JButton eliminar;
    private JButton salir;

    //Variables para listar estudiantes
    private JList<String> estudianteLista;
    private DefaultListModel<String> listaModelo;
    
    //Variable para los mensajes
    private JLabel mensajes;
    
    
    public estudianteGUI(){
        setTitle("Sistema de gestion de Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);
        
        //usar layout adecuado por ejemplo flowlayout
        setLayout(new BorderLayout());

        //Distribucion espacial de los elementos
        JPanel entradaPanel =new JPanel(new GridLayout(5,2,10,10));
        entradaPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        entradaPanel.add(new JLabel("ID Estudiante: "));
        id= new JTextField();
        entradaPanel.add(id);

        entradaPanel.add(new JLabel("NOMBRE Estudiante: "));
        nombre= new JTextField();
        entradaPanel.add(nombre);

        entradaPanel.add(new JLabel("NOMBRE Estudiante: "));
        nombre= new JTextField();
        entradaPanel.add(nombre);

        adicionar = new JButton("Ingresar Estudiante");
        ver = new JButton("Mostrar Estudiantes");
        eliminar = new JButton("Eliminar Estudiante");
        salir = new JButton("Salir");

        entradaPanel.add(adicionar);
        entradaPanel.add(ver);
        entradaPanel.add(eliminar);
        entradaPanel.add(salir);

        //agregar el panel al jframe

        mensajes = new JLabel("Ingrese datos.");
        mensajes.setForeground(Color.blue);
        entradaPanel.add(new JLabel());
        entradaPanel.add(mensajes);

        add(entradaPanel, BorderLayout.NORTH);

        //programar los botones.
        adicionar.addActionListener(new ActionListener() {
            @Override
            public void 
        });
    }
    public void show(){
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            estudianteGUI ventana = new estudianteGUI();
            ventana.show();
        });
    }
}//final
