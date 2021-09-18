package QLSV;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private StudentDao studentDao;
    /**
     * init StudentDao object and
     * read when init
     */
    public StudentManager() {
        studentDao = new StudentDao();
        studentList = studentDao.read();
    }
    /**
     * add student to studentList
     */
    public void add() {
        System.out.println("please input total number of students (3-40): ");
        boolean check=true;
        while(check){
            int n = Integer.parseInt(scanner.nextLine());
            if (n >= 3 && n <= 40 ){
                for(int i = 1 ;i <= n ;i++){
                    System.out.println("input infomation student "+i+"\n");
                    String name = inputName();
                    String brithday = inputBrithday();
                    boolean gender = inputGender();
                    Student student = new Student(name, brithday, gender);
                    studentList.add(student);
                    studentDao.write(studentList,"student.txt");
                }
                System.out.println("add student successfully!");
                check = false;
            } else {
                System.out.println("invalid! Input student gender again (3-40): ");
            }
        }
    }
    public void show(){
        System.out.format("%7s |", "number");
        System.out.format("%20s |", "Name");
        System.out.format("%15s |", "Brithday");
        System.out.format("%5s%n", "Gender");
        int index=0;
        for(Student student : studentList){
            System.out.format("%7d |", ++index);
            System.out.format("%20s |", student.getName());
            System.out.format("%15s |", student.getBrithday());
            String gender="girl";
            if(student.isGender()==true){
                gender="boy";
            }
            System.out.format("%5s%n", gender);
        }
    }
    public void writeInFile(){
        studentList=studentDao.read();
        System.out.println("please input file name : ");
        String file=scanner.nextLine();
        studentDao.write(studentList, file);
        System.out.println("write successfully!");
    }
    /**
     * input student name
     * 
     * @return student name
     */
    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine().trim();
    }
    /**
     * input student brithday
     * 
     * @return student brithday
     */
    private String inputBrithday() {
        System.out.print("Input student brithday (day/month/year): ");
        while(true)
        {
            try {
                String value= scanner.nextLine().trim();
                Date date = null;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                date = sdf.parse(value);
                if (value.equals(sdf.format(date))) {
                    return value;
                }
            } catch (ParseException ex) {
                System.out.println("invalid! Input student gender again (day/month/year):");
            }
        }
    }
    /**
     * input student gender
     * 
     * @return student gender
     */
    private boolean inputGender() {
        System.out.print("Input student gender (boy or girl): ");
        while (true) {
            String gender= scanner.nextLine().trim();
            if("boy".equals(gender)){
                return true;
            }else if("girl".equals(gender)){
                return false;
            }else{
                System.out.println("invalid! Input student gender again (boy or girl): ");
            }
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
}
