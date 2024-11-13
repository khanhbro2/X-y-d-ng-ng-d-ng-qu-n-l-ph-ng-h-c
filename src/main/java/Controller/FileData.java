/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC
 */
public class FileData<T> implements IFileData<T>{

    @Override
    public void writeFile(List<T> ds, String fileName) {
        try {
            //Đối tượng có tác dụng tạo ra hoặc hoặc ghi đè lên tệp tin co tên  được chỉ định là fileName
            FileOutputStream fw = new FileOutputStream(fileName);
            
            //Đối tượng này cung cấp các phương thức để ghi các đối tượng và luồng đầu ra một cách dễ dàng
            ObjectOutputStream bw = new ObjectOutputStream(fw);
            
            //Đây là 1 phương thức của Đối tượng ObjectOutputStream có tác dụng là ghi đối tượng hoặc danh sách đối tượng vào file được chỉ định
            bw.writeObject(ds);
            
            //Đóng file
            bw.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public List<T> readFile(String fileName) {
        List<T> ds = new ArrayList<>();
        
        try {
            //Đối tượng này sẽ có tác dụng là mở tệp tin và chuẩn bị cho việc đọc dữ liệu từ nó
            FileInputStream fr = new FileInputStream(fileName);
            
            //Đối tượng này cung cấp các phương thức để ghi các đối tượng và luồng đầu ra một cách dễ dàng
            ObjectInputStream br = new ObjectInputStream(fr);
            
            //Để đọc dánh sách đối tượng
            ds = (List<T>) br.readObject();
            
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return ds;
    }
    
    
}
