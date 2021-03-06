/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

/**
 *
 * @author edva5
 */
public class Producto {

    private String codigoProducto;    
    private String importadoProducto;    
    private int precioProducto;    
    private String nombreProducto;    
    private String tipoProducto;

    public Producto() {
    }

    public Producto(String codigoProducto, String importadoProducto, int precioProducto, String nombreProducto, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.importadoProducto = importadoProducto;
        this.precioProducto = precioProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
    }

    
    
    /**
     * @return the codigoProducto
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return the importadoProducto
     */
    public String getImportadoProducto() {
        return importadoProducto;
    }

    /**
     * @param importadoProducto the importadoProducto to set
     */
    public void setImportadoProducto(String importadoProducto) {
        this.importadoProducto = importadoProducto;
    }

    /**
     * @return the precioProducto
     */
    public int getPrecioProducto() {
        return precioProducto;
    }

    /**
     * @param precioProducto the precioProducto to set
     */
    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the tipoProducto
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * @param tipoProducto the tipoProducto to set
     */
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
