package com.pt14354.quanlythuvien.Model;

public class Muon {
    private String idMuon;

    @Override
    public String toString() {
        return "Muon{" +
                "idMuon='" + idMuon + '\'' +
                ", loaiSach='" + loaiSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", hanTra=" + hanTra +
                ", soLuong=" + soLuong +
                '}';
    }

    private String loaiSach;
    private String tenSach;
    private int hanTra;
    public String getIdMuon() {
        return idMuon;
    }

    public void setIdMuon(String idMuon) {
        this.idMuon = idMuon;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }



    public Muon(String idMuon) {
        this.idMuon = idMuon;
    }


    public Muon(String idMuon, String loaiSach, String tenSach, int hanTra, int soLuong) {
        this.idMuon = idMuon;
        this.loaiSach = loaiSach;
        this.tenSach = tenSach;
        this.hanTra = hanTra;
        this.soLuong = soLuong;
    }

    private int soLuong;
}
