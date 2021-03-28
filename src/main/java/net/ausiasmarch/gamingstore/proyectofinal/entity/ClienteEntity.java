/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.gamingstore.proyectofinal.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
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
import javax.persistence.Temporal;

@Entity
@Table(name = "cliente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nombreclie;
    
    private String direccionclie;
   
    private String ciudadclie;
   
    private Integer cpclie;
      
    private Integer telefonoclie;
   
    private String emailclie;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechanacclie;
    
    private String usuarioclie;
    
    @JsonIgnore
    private String passwordclie;
    
    private Long numtarjclie;

   
    
    /*@ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.REFRESH})
    @JoinColumn(name="id_tipousuario")
    private TipousuarioEntity tipousuario;
    


   @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = {CascadeType.REFRESH})
    private List<FacturaEntity> facturas = new ArrayList<>();
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = {CascadeType.REFRESH})
    private List<CarritoEntity> carritos = new ArrayList<>();*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
 public String getNombreclie() {
        return nombreclie;
    }

    public void setNombreclie(String nombreclie) {
        this.nombreclie = nombreclie;
    }

public String getDireccionclie() {
        return direccionclie;
    }

    public void setDireccionclie(String direccionclie) {
        this.direccionclie = direccionclie;
    }

    public String getCiudadclie() {
        return ciudadclie;
    }

    public void setCiudadclie(String ciudadclie) {
        this.ciudadclie = ciudadclie;
    }

    public Integer getCpclie() {
        return cpclie;
    }

    public void setCpclie(Integer cpclie) {
        this.cpclie = cpclie;
    }

    public Integer getTelefonoclie() {
        return telefonoclie;
    }

    public void setTelefonoclie(Integer telefonoclie) {
        this.telefonoclie = telefonoclie;
    }

    public String getEmailclie() {
        return emailclie;
    }

    public void setEmailclie(String emailclie) {
        this.emailclie = emailclie;
    }

    public Date getFechanacclie() {
        return fechanacclie;
    }

    public void setFechanacclie(Date fechanacclie) {
        this.fechanacclie = fechanacclie;
    }

    public String getUsuarioclie() {
        return usuarioclie;
    }

    public void setUsuarioclie(String usuarioclie) {
        this.usuarioclie = usuarioclie;
    }

    public String getPasswordclie() {
        return passwordclie;
    }

    public void setPasswordclie(String passwordclie) {
        this.passwordclie = passwordclie;
    }

    public Long getNumtarjclie() {
        return numtarjclie;
    }

    public void setNumtarjclie(Long numtarjclie) {
        this.numtarjclie = numtarjclie;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" + "id=" + id + ", nombreclie=" + nombreclie + ", direccionclie=" + direccionclie + ", ciudadclie=" + ciudadclie + ", cpclie=" + cpclie + ", telefonoclie=" + telefonoclie + ", emailclie=" + emailclie + ", fechanacclie=" + fechanacclie + ", usuarioclie=" + usuarioclie + ", passwordclie=" + passwordclie + ", numtarjclie=" + numtarjclie + '}';
    }

   
   
}