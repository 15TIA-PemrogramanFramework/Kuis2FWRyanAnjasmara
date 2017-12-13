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
import javax.persistence.Table;

/**
 *
 * @author PC24
 */
@Entity
@Table(name = "identitas")
public class Identitas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id_identitas;
    @Column(length = 255, nullable = false) private String nama;
    @Column(length = 255, nullable = false) private String jenis_kelamin;
    @Column(length = 255, nullable = false) private String jurusan;

    /**
     * @return the id_identitas
     */
    public Long getId_identitas() {
        return id_identitas;
    }

    /**
     * @param id_identitas the id_identitas to set
     */
    public void setId_identitas(Long id_identitas) {
        this.id_identitas = id_identitas;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the jurusan
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
