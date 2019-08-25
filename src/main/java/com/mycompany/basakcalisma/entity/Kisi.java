/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basakcalisma.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ayberk
 */
@Entity
@Table(name = "kisi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kisi.findAll", query = "SELECT k FROM Kisi k"),
    @NamedQuery(name = "Kisi.findById", query = "SELECT k FROM Kisi k WHERE k.id = :id"),
    @NamedQuery(name = "Kisi.findByName", query = "SELECT k FROM Kisi k WHERE k.name = :name"),
    @NamedQuery(name = "Kisi.findBySurname", query = "SELECT k FROM Kisi k WHERE k.surname = :surname"),
    @NamedQuery(name = "Kisi.findByPassword", query = "SELECT k FROM Kisi k WHERE k.password = :password")})
public class Kisi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NAME")
    private String name;
    @Size(max = 25)
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(mappedBy = "anneid")
    private List<Detay> detayList;
    @OneToMany(mappedBy = "babaid")
    private List<Detay> detayList1;

    public Kisi() {
    }

    public Kisi(Integer id) {
        this.id = id;
    }

    public Kisi(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public List<Detay> getDetayList() {
        return detayList;
    }

    public void setDetayList(List<Detay> detayList) {
        this.detayList = detayList;
    }

    @XmlTransient
    public List<Detay> getDetayList1() {
        return detayList1;
    }

    public void setDetayList1(List<Detay> detayList1) {
        this.detayList1 = detayList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kisi)) {
            return false;
        }
        Kisi other = (Kisi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.basakcalisma.entity.Kisi[ id=" + id + " ]";
    }
    
}
