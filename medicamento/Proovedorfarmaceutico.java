/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicamento;

/**
 *
 * @author Vicente
 */
public class Proovedorfarmaceutico {
    private String codigoProveedor;
    private String nombreProveedor;
    private String medicamentoSuministrado;

    public Proovedorfarmaceutico(String codigoProveedor, String nombreProveedor, String medicamentoSuministrado) {
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.medicamentoSuministrado =  medicamentoSuministrado;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setMedicamentoSuministrado(String medicamentoSuministrado) {
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String getMedicamentoSuministrado() {
        return medicamentoSuministrado;
    }
    
    
}
