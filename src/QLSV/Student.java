/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;
//1. Tạo class Student có chứa các thông tin sau:
// - Số hiệu sinh viên (id) : dạng string và được sinh ngẫu nhiên (không cần nhập) đảm bảo các id này không trùng lặp.

import java.io.Serializable;
import java.util.UUID;

// - Họ và tên (name) : dạng string nhập từ bàn phím
// - Ngày tháng năm sinh (birthday) : dạng string nhập từ bàn phím
// - Giới tính (gender) : dạng bool nhập vào từ bàn phím
/**
 *
 * @author ADMIN
 */
public class Student implements Serializable{
    
    private String id;
    private String name;
    private String brithday;
    private boolean gender;

    public Student() {
    }

    public Student( String name, String brithday, boolean gender) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.name = name;
        this.brithday = brithday;
        this.gender = gender;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
}
