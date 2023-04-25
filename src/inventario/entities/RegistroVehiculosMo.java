/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario.entities;

/**
 *
 @author SergioCardoza
 */
public class RegistroVehiculosMo {
    
    private String tipoCarro;
    private String tipoMotor;
    private String marca;
    private int transs;
    private String modelo;
    private Double precio;
    private String anio;

    /**
     * @return the tipoCarro
     */
    public String getTipoCarro() {
        return tipoCarro;
    }

    /**
     * @param tipoCarro the tipoCarro to set
     */
    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    /**
     * @return the tipoMotor
     */
    public String getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the transs
     */
    public int getTranss() {
        return transs;
    }

    /**
     * @param transs the transs to set
     */
    public void setTranss(int transs) {
        this.transs = transs;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "RegistroVehiculosMo{" + "tipoCarro=" + tipoCarro + ", tipoMotor=" + tipoMotor + ", marca=" + marca + ", transs=" + transs + ", modelo=" + modelo + ", precio=" + precio + ", anio=" + anio + '}';
    }
    
    
    
}
