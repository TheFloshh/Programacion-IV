package model;

import java.util.ArrayList;
import java.util.List;

public class estudianteModel {
    private int codigo;
    private String nombre;
    private static List<estudianteModel> estudianteLista = new ArrayList<>();

    /**
     * estudianteModel; constructor con parametros.
     * @param cod
     * @param nom
     */
    public estudianteModel(int cod, String nom){
        this.codigo=cod;
        this.nombre=nom;
    }

    //Getters
    /** 
     * obtenerCodigo: Devuelve el valor del codigo en la clase
     * @return codigo
     */
    public int obtenerCodigo(){
        return this.codigo;
    }
    
    public String  obtenerNombre(){
        return this.nombre;
    }

    public static void adicionarEstudianteLista(estudianteModel e){
        estudianteLista.add(e);
    }

    public static List<estudianteModel> obtenerEstudianteLista(){
        return estudianteLista;
    }

    public static void eliminarEstudianteLista(int cod){
        estudianteLista.removeIf(estudianteModel ->estudianteModel.obtenerCodigo()==cod);
    }
}//final
