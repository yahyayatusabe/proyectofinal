/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.gamingstore.proyectofinal.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VentaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    private Year FechaLanzamientoVJ;
    private Double PrecioVenta;
    
     @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private LocalDateTime FechaVenta;
    private String EstadoVenta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Year getFechaLanzamientoVJ() {
        return FechaLanzamientoVJ;
    }

    public void setFechaLanzamientoVJ(Year FechaLanzamientoVJ) {
        this.FechaLanzamientoVJ = FechaLanzamientoVJ;
    }

    public Double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(Double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public LocalDateTime getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(LocalDateTime FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getEstadoVenta() {
        return EstadoVenta;
    }

    public void setEstadoVenta(String EstadoVenta) {
        this.EstadoVenta = EstadoVenta;
    }

    @Override
    public String toString() {
        return "VentaEntity{" + "id=" + id + ", FechaLanzamientoVJ=" + FechaLanzamientoVJ + ", PrecioVenta=" + PrecioVenta + ", FechaVenta=" + FechaVenta + ", EstadoVenta=" + EstadoVenta + '}';
    }
    
    
}
