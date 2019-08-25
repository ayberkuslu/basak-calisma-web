/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basakcalisma.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ayberk
 */
@Entity
@Table(name = "detay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detay.findAll", query = "SELECT d FROM Detay d"),
    @NamedQuery(name = "Detay.findByDetayid", query = "SELECT d FROM Detay d WHERE d.detayid = :detayid"),
    @NamedQuery(name = "Detay.findByOkul", query = "SELECT d FROM Detay d WHERE d.okul = :okul")})
public class Detay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DETAYID")
    private Integer detayid;
    @Size(max = 25)
    @Column(name = "OKUL")
    private String okul;
    @JoinColumn(name = "ANNEID", referencedColumnName = "ID")
    @ManyToOne
    private Kisi anneid;
    @JoinColumn(name = "BABAID", referencedColumnName = "ID")
    @ManyToOne
    private Kisi babaid;

    public Detay() {
    }

    public Detay(Integer detayid) {
        this.detayid = detayid;
    }

    public Integer getDetayid() {
        return detayid;
    }

    public void setDetayid(Integer detayid) {
        this.detayid = detayid;
    }

    public String getOkul() {
        return okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    public Kisi getAnneid() {
        return anneid;
    }

    public void setAnneid(Kisi anneid) {
        this.anneid = anneid;
    }

    public Kisi getBabaid() {
        return babaid;
    }

    public void setBabaid(Kisi babaid) {
        this.babaid = babaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detayid != null ? detayid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detay)) {
            return false;
        }
        Detay other = (Detay) object;
        if ((this.detayid == null && other.detayid != null) || (this.detayid != null && !this.detayid.equals(other.detayid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.basakcalisma.entity.Detay[ detayid=" + detayid + " ]";
    }
    
}
