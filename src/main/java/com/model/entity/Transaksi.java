package com.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_transaksi")
public class Transaksi {
    @Id
    @Column(name = "kode_transaksi")
    private String kodeTransaksi;

    @ManyToOne
    @JoinColumn(name = "kd_pengguna",nullable = false)
    private Pengguna kodePengguna;

    @OneToMany
    @JoinColumn(name = "kode_buku",nullable = false)
    private List<Buku> kodeBuku;

    @Column(name = "tanggal_pinjam")
    private Date tanggalPinjam;

    @Column(name = "tanggal_kembali")
    private Date tanggalKembali;

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public Pengguna getKodePengguna() {
        return kodePengguna;
    }

    public void setKodePengguna(Pengguna kodePengguna) {
        this.kodePengguna = kodePengguna;
    }

    public List<Buku> getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(List<Buku> kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
}
