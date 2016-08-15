package com.tsp.gespro.hibernate.pojo;
// Generated 15/08/2016 09:59:36 AM by Hibernate Tools 3.6.0



/**
 * Reparto generated by hbm2java
 */
public class Reparto  implements java.io.Serializable {


     private Integer idreparto;
     private int idProyecto;
     private int idLugar;
     private int idProducto;
     private float cantidad;

    public Reparto() {
    }

    public Reparto(int idProyecto, int idLugar, int idProducto, float cantidad) {
       this.idProyecto = idProyecto;
       this.idLugar = idLugar;
       this.idProducto = idProducto;
       this.cantidad = cantidad;
    }
   
    public Integer getIdreparto() {
        return this.idreparto;
    }
    
    public void setIdreparto(Integer idreparto) {
        this.idreparto = idreparto;
    }
    public int getIdProyecto() {
        return this.idProyecto;
    }
    
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
    public int getIdLugar() {
        return this.idLugar;
    }
    
    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public float getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }




}

