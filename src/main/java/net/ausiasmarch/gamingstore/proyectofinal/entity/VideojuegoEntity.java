/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.gamingstore.proyectofinal.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
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
@Table(name = "videojuego")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VideojuegoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String NameVJ;
    private String DescrpcionVJ;
    private String PlataformaVJ;
    private Year FechaLanzamientoVJ;
    private Double PrecioVJ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameVJ() {
        return NameVJ;
    }

    public void setNameVJ(String NameVJ) {
        this.NameVJ = NameVJ;
    }

    public String getDescrpcionVJ() {
        return DescrpcionVJ;
    }

    public void setDescrpcionVJ(String DescrpcionVJ) {
        this.DescrpcionVJ = DescrpcionVJ;
    }

    public String getPlataformaVJ() {
        return PlataformaVJ;
    }

    public void setPlataformaVJ(String PlataformaVJ) {
        this.PlataformaVJ = PlataformaVJ;
    }

    public Year getFechaLanzamientoVJ() {
        return FechaLanzamientoVJ;
    }

    public void setFechaLanzamientoVJ(Year FechaLanzamientoVJ) {
        this.FechaLanzamientoVJ = FechaLanzamientoVJ;
    }

    public Double getPrecioVJ() {
        return PrecioVJ;
    }

    public void setPrecioVJ(Double PrecioVJ) {
        this.PrecioVJ = PrecioVJ;
    }

    @Override
    public String toString() {
        return "VideojuegoEntity{" + "id=" + id + ", NameVJ=" + NameVJ + ", DescrpcionVJ=" + DescrpcionVJ + ", PlataformaVJ=" + PlataformaVJ + ", FechaLanzamientoVJ=" + FechaLanzamientoVJ + ", PrecioVJ=" + PrecioVJ + '}';
    }
    
    
}