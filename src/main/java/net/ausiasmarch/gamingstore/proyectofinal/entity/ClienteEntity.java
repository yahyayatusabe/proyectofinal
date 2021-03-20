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

@Entity
@Table(name = "cliente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String NombreCompletoClie;
    private String DireccionClie;
    private String CiudadCLie;
    private String CPClie;
    private String TelefonoClie;
    private String EmailClie;
    private Date FechaNacimientoClie;
    private String UsuarioClie;
    
    @JsonIgnore
    private String PasswdClie;
    
    private Integer NumTarClie;

    
    
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

    public String getNombreCompletoClie() {
        return NombreCompletoClie;
    }

    public void setNombreCompletoClie(String NombreCompletoClie) {
        this.NombreCompletoClie = NombreCompletoClie;
    }

    public String getDireccionClie() {
        return DireccionClie;
    }

    public void setDireccionClie(String DireccionClie) {
        this.DireccionClie = DireccionClie;
    }

    public String getCiudadCLie() {
        return CiudadCLie;
    }

    public void setCiudadCLie(String CiudadCLie) {
        this.CiudadCLie = CiudadCLie;
    }

    public String getCPClie() {
        return CPClie;
    }

    public void setCPClie(String CPClie) {
        this.CPClie = CPClie;
    }

    public String getTelefonoClie() {
        return TelefonoClie;
    }

    public void setTelefonoClie(String TelefonoClie) {
        this.TelefonoClie = TelefonoClie;
    }

    public String getEmailClie() {
        return EmailClie;
    }

    public void setEmailClie(String EmailClie) {
        this.EmailClie = EmailClie;
    }

    public Date getFechaNacimientoClie() {
        return FechaNacimientoClie;
    }

    public void setFechaNacimientoClie(Date FechaNacimientoClie) {
        this.FechaNacimientoClie = FechaNacimientoClie;
    }

    public String getUsuarioClie() {
        return UsuarioClie;
    }

    public void setUsuarioClie(String UsuarioClie) {
        this.UsuarioClie = UsuarioClie;
    }

    public String getPasswdClie() {
        return PasswdClie;
    }

    public void setPasswdClie(String PasswdClie) {
        this.PasswdClie = PasswdClie;
    }

    public Integer getNumTarClie() {
        return NumTarClie;
    }

    public void setNumTarClie(Integer NumTarClie) {
        this.NumTarClie = NumTarClie;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" + "id=" + id + ", NombreCompletoClie=" + NombreCompletoClie + ", DireccionClie=" + DireccionClie + ", CiudadCLie=" + CiudadCLie + ", CPClie=" + CPClie + ", TelefonoClie=" + TelefonoClie + ", EmailClie=" + EmailClie + ", FechaNacimientoClie=" + FechaNacimientoClie + ", UsuarioClie=" + UsuarioClie + ", PasswdClie=" + PasswdClie + ", NumTarClie=" + NumTarClie + '}';
    }

    


}