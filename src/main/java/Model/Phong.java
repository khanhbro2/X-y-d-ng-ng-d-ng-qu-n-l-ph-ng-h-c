/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author PC
 */
public abstract class Phong implements Serializable{
    
    protected String maPhong;
    
    protected TaiKhoan tk = new TaiKhoan();
    
    protected String tenPhong;
    
    protected String loaiPhong;
    
    protected String viTriPhong;

    public Phong(){
        
    }
    public Phong(String maPhong){
        this.maPhong = maPhong;
    }
    
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public TaiKhoan getTk() {
        return tk;
    }

    public void setTk(TaiKhoan tk) {
        this.tk = tk;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getViTriPhong() {
        return viTriPhong;
    }

    public void setViTriPhong(String viTriPhong) {
        this.viTriPhong = viTriPhong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.maPhong);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Phong other = (Phong) obj;
        if (!Objects.equals(this.maPhong, other.maPhong)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Phong{" + "maPhong=" + maPhong + ", tk=" + tk + ", tenPhong=" + tenPhong + ", loaiPhong=" + loaiPhong + ", viTriPhong=" + viTriPhong + '}';
    }
    
    public abstract byte tongDiem();
    
    public abstract String danhGia();
}
 