/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThànhIT.service;

import ThànhIT.model.MayTinh;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author longsuwu
 */
public class QuanLyMayTinh {
    ArrayList<MayTinh> mtList = new ArrayList<>();
    
    public ArrayList<MayTinh> getList() {
        return mtList;
    }
    
    public QuanLyMayTinh() {
        mtList.add(new MayTinh(1, "Asus","i9 14900k", "Co", 100));
        mtList.add(new MayTinh(2, "Acer","i9 13900k", "Co", 90));
        mtList.add(new MayTinh(3, "MSI","i9 12900k", "Co", 80));
        mtList.add(new MayTinh(4, "Lenovo","i9 11900k", "Co", 70));
        mtList.add(new MayTinh(5, "Gigabyte","i9 10900k", "Co", 60));
    }
    
    public ArrayList<MayTinh> read() {
        String path = "output.txt";
        
        ArrayList<MayTinh> file = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                Integer ID = Integer.parseInt(parts[0]);
                String hangMay = parts[1];
                String CPU = parts[2];
                String GPU = parts[3];
                float gia = Float.parseFloat(parts[4]);
                
                MayTinh mt = new MayTinh(ID, hangMay, CPU, GPU, gia);
                file.add(mt);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return file;
    }
    
    public String add(MayTinh mt) {
        mtList.add(mt);
        return "Them thanh cong";
    }
    
    public String remove(int row) {
        mtList.remove(row);
        return "Xoa thanh cong";
    }
    
    public String update(int row, MayTinh mt) {
        mtList.set(row, mt);
        return "Cap nhat thanh cong";
    }
}
