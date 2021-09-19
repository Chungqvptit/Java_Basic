/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOG;

import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
abstract class dogs {
    private String name;
    private int age;
    private String height;
    private String weight;
    public dogs() {
    }
    public dogs(String name, int age, String height, String weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    abstract void barking();
    public void show(){
        System.out.println("name is: "+ name+"\n");
        System.out.println("age is : "+age+"\n");
        System.out.println("height is : "+height+"\n");
        System.out.println("weight is : "+weight+"\n");
    }
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
class Chihuahua extends dogs{
    public Chihuahua() {
        super();
    }
    public Chihuahua(String name, int age, String height, String weight) {
        super(name, age, height, weight);
    }
    
    @Override
    void barking() {
        System.out.println("barking: goc goc");
    }
}
class Begie extends dogs{
    public Begie() {
        super();
    }
    public Begie(String name, int age, String height, String weight) {
        super(name, age, height, weight);
    }
    @Override
    void barking() {
        System.out.println("barking: gau gau");
    }
}
class AlskanMalamute extends dogs{
    private String hu;
    public AlskanMalamute() {
        super();
    }
    public AlskanMalamute( String name, int age, String height, String weight) {
        super(name, age, height, weight);
        this.hu = "hu hu";
    }
    @Override
    void barking() {
        System.out.println("barking: Woof Woof"+ hu);
    }
}
class Husky extends dogs{
    private String hu;
    public Husky() {
        super();
    }
    public Husky( String name, int age, String height, String weight) {
        super(name, age, height, weight);
        this.hu = "huhu";
    }    
    @Override
    void barking() {
        System.out.println("barking: Wooooooo "+ hu);
    }
}
class Pitbull extends dogs{
    public Pitbull() {
        super();
    }
    public Pitbull(String name, int age, String height, String weight) {
        super(name, age, height, weight);
    }
    @Override
    void barking() {
        System.out.println("barking: gu gu");
    }
}
public class Dog {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        dogs chiHuaHua=new Chihuahua("Rex",1,"0,3 m","9 kg");
        dogs begie=new Begie("To",1,"0,6 m","40 kg");
        dogs alskanMalamute=new AlskanMalamute("Beo",1,"0,3 m","15 kg");
        dogs husky=new Husky("Ngao",2,"0,3 m","15 kg");
        dogs pitbull= new Pitbull("Bo",2,"0,4 m","20 kg");
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                chiHuaHua.show();
                chiHuaHua.barking();
                break;
            case "2":
                begie.show();
                begie.barking();
                break;
            case "3":
                alskanMalamute.show();
                alskanMalamute.barking();
                break;
            case "4":
                husky.show();
                husky.barking();
                break;
            case "5":
                pitbull.show();
                pitbull.barking();
                break;                
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------dS------------");
        System.out.println("1. Chihuahua.");
        System.out.println("2. Begie");
        System.out.println("3. AlskanMalamute");
        System.out.println("4. Husky");
        System.out.println("5. Pitbull");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
