/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class VanPhong extends Phong {

    private short diemVanPhongPham;
    
    private short diemThungRac;
    
    private short diemTaiLieuBan;
    
    private short diemTrangPhuc;
    
    private short diemThe;

    public VanPhong(){
        
    }
    
    public VanPhong(String maPhong) {
        super(maPhong);
    }

    public short getDiemVanPhongPham() {
        return diemVanPhongPham;
    }

    public void setDiemVanPhongPham(short diemVanPhongPham) {
        this.diemVanPhongPham = diemVanPhongPham;
    }

    public short getDiemThungRac() {
        return diemThungRac;
    }

    public void setDiemThungRac(short diemThungRac) {
        this.diemThungRac = diemThungRac;
    }

    public short getDiemTaiLieuBan() {
        return diemTaiLieuBan;
    }

    public void setDiemTaiLieuBan(short diemTaiLieuBan) {
        this.diemTaiLieuBan = diemTaiLieuBan;
    }

    public short getDiemTrangPhuc() {
        return diemTrangPhuc;
    }

    public void setDiemTrangPhuc(short diemTrangPhuc) {
        this.diemTrangPhuc = diemTrangPhuc;
    }

    public short getDiemThe() {
        return diemThe;
    }

    public void setDiemThe(short diemThe) {
        this.diemThe = diemThe;
    }

    @Override
    public String toString() {
        return "VanPhong{" + "maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", taiKhoan=" + tk + ", loaiPhong=" + loaiPhong + 
                ", viTriPhong=" + viTriPhong + ", diemVanPhongPham=" + diemVanPhongPham + ", diemThungRac=" + diemThungRac +
                ", diemTaiLieuBan=" + diemTaiLieuBan + ", diemTrangPhuc=" + diemTrangPhuc + ", diemThe=" + diemThe + '}';
    }
    
    
    
    @Override
    public byte tongDiem() {
        return (byte) (diemVanPhongPham + diemThungRac + diemTaiLieuBan + diemTrangPhuc + diemThe);
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
