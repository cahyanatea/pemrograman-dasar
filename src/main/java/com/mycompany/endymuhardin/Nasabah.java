package com.mycompany.endymuhardin;

import java.util.Date;

public class Nasabah {
    private static int jumlahNasabah = 0;
    private String nomor;
    private String nama;
    private String email;
    
    public Nasabah() {
        jumlahNasabah++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
