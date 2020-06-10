package com.pt14354.quanlythuvien.Model;

import androidx.annotation.NonNull;

public class NguoiDung {
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "idUser='" + idUser + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private  String idUser;
    private String userName;
    private String password;

    public NguoiDung() {
    }

    public NguoiDung(String idUser, String userName, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
    }

}
