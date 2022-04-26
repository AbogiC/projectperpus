package com.model.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="t_pengguna")

public class Pengguna {
    @Id
    @Column(name="kd_pengguna", length = 25)
    private String kodePengguna;

    @Column(name="nama_pengguna")
    private String namaPengguna;

    @Column(name="peran")
    private String peranPengguna;

    @Column(name="alamat")
    private String alamat;
    @Column(name="username")
    private String username;
    @Column(name = "password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKodePengguna() {
        return kodePengguna;
    }

    public void setKodePengguna(String kodePengguna) {
        this.kodePengguna = kodePengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getPeranPengguna() {
        return peranPengguna;
    }

    public void setPeranPengguna(String peranPengguna) {
        this.peranPengguna = peranPengguna;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
