/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class PhongThucHanh extends Phong  {
    
    private short diemSangLoc;
    
    private short diemSapXep;
    
    private short diemSachSe;
    
    private short diemSanSoc;
    
    private short diemSanSang;

    public PhongThucHanh(){
        
    }
    
    public PhongThucHanh(String maPhong) {
        super(maPhong);
    }

    public short getDiemSangLoc() {
        return diemSangLoc;
    }

    public void setDiemSangLoc(short diemSangLoc) {
        this.diemSangLoc = diemSangLoc;
    }

    public short getDiemSapXep() {
        return diemSapXep;
    }

    public void setDiemSapXep(short diemSapXep) {
        this.diemSapXep = diemSapXep;
    }

    public short getDiemSachSe() {
        return diemSachSe;
    }

    public void setDiemSachSe(short diemSachSe) {
        this.diemSachSe = diemSachSe;
    }

    public short getDiemSanSoc() {
        return diemSanSoc;
    }

    public void setDiemSanSoc(short diemSanSoc) {
        this.diemSanSoc = diemSanSoc;
    }

    public short getDiemSanSang() {
        return diemSanSang;
    }

    public void setDiemSanSang(short diemSanSang) {
        this.diemSanSang = diemSanSang;
    }
    
    @Override
    public byte tongDiem() {
        return (byte) (diemSangLoc + diemSapXep + diemSachSe + diemSanSoc + diemSanSang);
    }

    @Override
    public String toString() {
        return "PhongThucHanh{" + "maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", taiKhoan=" + tk + ", loaiPhong=" + loaiPhong + 
                ", viTriPhong=" + viTriPhong + " ,diemSangLoc=" + diemSangLoc + ", diemSapXep=" + diemSapXep + ", diemSachSe=" + diemSachSe +
                ", diemSanSoc=" + diemSanSoc + ", diemSanSang=" + diemSanSang + '}';
    }

    @Override
    public String danhGia() {
        if(tongDiem() == 0)
            return "Chưa đánh giá";
        if(tongDiem() <= 5)
            return "Kém";
        if(tongDiem() <= 10)
            return "Trung bình";
        if(tongDiem() <= 15)
            return "Khá";
        return "Tốt";    
    }
}
