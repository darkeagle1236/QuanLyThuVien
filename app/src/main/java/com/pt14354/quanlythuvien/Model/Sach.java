package com.pt14354.quanlythuvien.Model;

public class Sach {
    private String idSach;

    public Sach(String idSach) {
        this.idSach = idSach;
    }

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "idSach='" + idSach + '\'' +
                ", loaiSach='" + loaiSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }

    public Sach(String idSach, String loaiSach, String tenSach, int soLuong) {
        this.idSach = idSach;
        this.loaiSach = loaiSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
    }

    private String loaiSach;
    private String tenSach;
    private int soLuong;
}
