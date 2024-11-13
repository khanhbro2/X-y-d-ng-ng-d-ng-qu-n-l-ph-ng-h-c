/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import java.util.List;

/**
 *
 * @author PC
 */
public interface IFileData<T> {
    //Phương thức dùng để ghi dữ liệu lên file
    void writeFile(List<T> ds, String fileName);
    
    //Phương thức dùng để đọc dữ liệu từ file
    List<T> readFile(String fileName);
}
