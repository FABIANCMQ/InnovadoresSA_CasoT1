/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innovadoressa_tpoo_t1;

/**
 *
 * @author coolg
 */
public class Trabajadores {
    private String nombre;
    private String tipo_doc;
    private String nro_documento;
    private String regimen;
    private String fondo_pensiones;
    private float sueldo;
    private boolean turno_noche;
    private boolean hijos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento, String tipo_doc) {
        if (tipo_doc.equalsIgnoreCase("DNI")) {
            if (nro_documento.length()==8) {
                this.nro_documento = nro_documento;
            }else{
                System.out.println("Error. El DNI solo puede tener 8 digitos");
                this.nro_documento = "No Valido";
            }
        }else if (tipo_doc.equalsIgnoreCase("Residencia Temporal")) {
            if (nro_documento.length()==11) {
                this.nro_documento = nro_documento;
            }else{
                System.out.println("Error. El DNI solo puede tener 11 digitos");
                this.nro_documento = "No Valido";
            }
        }
    }

    public String getRégimen() {
        return regimen;
    }

    public void setRégimen(String régimen) {
        this.regimen = régimen;
    }

    public String getFondo_pensiones() {
        return fondo_pensiones;
    }

    public void setFondo_pensiones(String fondo_pensiones) {
        this.fondo_pensiones = fondo_pensiones;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isTurno_noche() {
        return turno_noche;
    }

    public void setTurno_noche(boolean turno_noche) {
        this.turno_noche = turno_noche;
    }

    public boolean isHijos() {
        return hijos;
    }

    public void setHijos(boolean hijos) {
        this.hijos = hijos;
    }

    public Trabajadores() {
    }

    public Trabajadores(String nombre, String tipo_doc, String nro_documento, String régimen, String fondo_pensiones, float sueldo, boolean turno_noche, boolean hijos) {
        this.nombre = nombre;
        this.tipo_doc = tipo_doc;
        this.nro_documento = nro_documento;
        this.regimen = régimen;
        this.fondo_pensiones = fondo_pensiones;
        this.sueldo = sueldo;
        this.turno_noche = turno_noche;
        this.hijos = hijos;
    }
    
    public void verDatos(){
        System.out.println("Trabajadores");
        System.out.println("Nombre: "+this.nombre+ "Tipo Documento: "+this.tipo_doc+
                "Numero Documento: "+this.nro_documento+"Régimen Laboral: "+this.regimen+
                "Fondo de Pensiones: "+this.fondo_pensiones);
    }
}
