/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package innovadoressa_tpoo_t1;

import java.util.Scanner;

/**
 *
 * @author coolg
 */
public class InnovadoresSA_TPOO_T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Trabajadores trab = new Trabajadores();
        
        System.out.println("Registro Trabajador");
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su Tipo de Documento (DNI/Residencia Temporal): ");
        String tipoDocumento = sc.nextLine();
        
        System.out.println("Ingrese su Numero de Documento: ");
        String nroDocumento = sc.nextLine();
        
        System.out.println("Ingrese su Régimen Laboral: ");
        String regimenLaboral = sc.nextLine();
        
        System.out.println("Ingrese su Fondo de pensión: ");
        String fondoPension = sc.nextLine();
        
        trab.setNombre(nombre);
        trab.setTipo_doc(tipoDocumento);
        trab.setNro_documento(nroDocumento, tipoDocumento);
        trab.setRégimen(regimenLaboral);
        trab.setFondo_pensiones(fondoPension);
        
        trab.verDatos();
    }
    
}
