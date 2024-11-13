/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class PhongLyThuyet extends Phong {

    private short diemBanGhe;

    private short diemBang;

    private short diemDieuHoaQuat;

    private short diemSanNha;

    private short diemThungRac;

    private short diemTietKiemDienNang;

    public PhongLyThuyet() {

    }

    public PhongLyThuyet(String maPhong) {
        super(maPhong);
    }

    public short getDiemBanGhe() {
        return diemBanGhe;
    }

    public void setDiemBanGhe(short diemBanGhe) throws Exception {
        if (this.diemBanGhe < 0 || this.diemBanGhe > 4) {
            throw new Exception("Điểm bàn ghế không được âm và vượt qua 4 ạ!");
        }
        this.diemBanGhe = diemBanGhe;
    }

    public short getDiemBang() {
        return diemBang;
    }

    public short getDiemDieuHoaQuat() {
        return diemDieuHoaQuat;
    }

    public short getDiemSanNha() {
        return diemSanNha;
    }

    public short getDiemThungRac() {
        return diemThungRac;
    }

    public short getDiemTietKiemDienNang() {
        return diemTietKiemDienNang;
    }

    public void setDiemBang(short diemBang) throws Exception {
        if (this.diemBang < 0 || this.diemBang > 4) {
            throw new Exception("Điểm bảng không được âm và vượt quá 4 ạ!");
        }
        this.diemBang = diemBang;
    }

    public void setDiemDieuHoaQuat(short diemDieuHoaQuat) throws Exception {
        if (this.diemDieuHoaQuat < 0 || this.diemDieuHoaQuat > 4) {
            throw new Exception("Điểm điều hòa và quạt không được âm và vượt quá 4 ạ!");
        }
        this.diemDieuHoaQuat = diemDieuHoaQuat;
    }

    public void setDiemSanNha(short diemSanNha) throws Exception {
        if (this.diemSanNha < 0 || this.diemSanNha > 4) {
            throw new Exception("Điểm sàn nhà không được âm và vượt quá 4 ạ!");
        }
        this.diemSanNha = diemSanNha;
    }

    public void setDiemThungRac(short diemThungRac) throws Exception {
        if (this.diemThungRac < 0 || this.diemThungRac > 4) {
            throw new Exception("Điểm thùng rác không được âm và vượt quá 4 ạ!");
        }
        this.diemThungRac = diemThungRac;
    }

    public void setDiemTietKiemDienNang(short diemTietKiemDienNang) throws Exception {
        if (this.diemTietKiemDienNang < 0 || this.diemTietKiemDienNang > 4) {
            throw new Exception("Điểm tiết kiệm điện năng không được âm và vượt quá 4 ạ!");
        }
        this.diemTietKiemDienNang = diemTietKiemDienNang;
    }

    @Override
    public String toString() {
        return "PhongLyThuyet{" + "maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", taiKhoan=" + tk + ", loaiPhong=" + loaiPhong
                + ", viTriPhong=" + viTriPhong + " ,diemBanGhe=" + diemBanGhe + ", diemBang=" + diemBang + ", diemDieuHoaQuat=" + diemDieuHoaQuat
                + ", diemSanNha=" + diemSanNha + ", diemThungRac=" + diemThungRac + ", diemTietKiemDienNang=" + diemTietKiemDienNang + '}';
    }

    @Override
    public byte tongDiem() {
        return (byte) (diemBanGhe + diemBang + diemDieuHoaQuat + diemSanNha + diemThungRac + diemTietKiemDienNang);
    }

    @Override
    public String danhGia() {
        if (tongDiem() == 0) {
            return "Chưa đánh giá";
        }
        if (tongDiem() <= 6) {
            return "Kém";
        }
        if (tongDiem() <= 12) {
            return "Trung bình";
        }
        if (tongDiem() <= 18) {
            return "Khá";
        }
        return "Tốt";
    }

}
