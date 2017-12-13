/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1075.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC24
 */
@Entity
@Table(name = "ipk")
public class Ipk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id_ipk;
    @Column(length = 11, nullable = false) private int semester;
    @Column(length = 11, nullable = false) private double nilai;
    @ManyToOne private Identitas identitas;

    /**
     * @return the id_ipk
     */
    public Long getId_ipk() {
        return id_ipk;
    }

    /**
     * @param id_ipk the id_ipk to set
     */
    public void setId_ipk(Long id_ipk) {
        this.id_ipk = id_ipk;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * @return the nilai
     */
    public double getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the identitas
     */
    public Identitas getIdentitas() {
        return identitas;
    }

    /**
     * @param identitas the identitas to set
     */
    public void setIdentitas(Identitas identitas) {
        this.identitas = identitas;
    }

    
    
}
