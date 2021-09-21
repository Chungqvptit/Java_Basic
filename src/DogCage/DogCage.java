/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogCage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
     /**
     *  abstract class  Dogs
     */ 
abstract class  Dogs {
    private String name;
    private int age;
    private int height;
    private int weight;
    public Dogs() {
    }
    public Dogs(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    abstract String barking();
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
     /**
     *  class chihuahua
     */ 
class Chihuahua extends Dogs{
    public Chihuahua() {
        super();
    }
    public Chihuahua(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
    @Override
    String barking() {
        return ("goc goc");
    }
}
     /**
     *  class begie
     */ 
class Begie extends Dogs{
    public Begie() {
        super();
    }
    public Begie(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
    @Override
    String barking() {
        return ("gau gau");
    }
}
     /**
     *  class AlskanMalamute
     */  
class AlskanMalamute extends Dogs{
    private String hu;
    public AlskanMalamute() {
        super();
    }
    public AlskanMalamute( String name, int age, int height, int weight) {
        super(name, age, height, weight);
        this.hu = "huhu";
    }
    @Override
    String barking() {
        return ("Woof Woof "+hu);
    }
}
     /**
     *  class Husky
     */  
class Husky extends Dogs{
    private String hu;
    public Husky() {
        super();
    }
    public Husky( String name, int age, int height, int weight) {
        super(name, age, height, weight);
        this.hu = "huhu";
    }    
    @Override
    String barking() {
        return ("Wooooooo "+ hu);
    }
}
     /**
     *  class Pitbull
     */  
class Pitbull extends Dogs{
    public Pitbull() {
        super();
    }
    public Pitbull(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
    @Override
    String barking() {
        return ("gu gu");
    }
}
     /**
     *  class dogcages
     */   
class DogCages{
    public static Scanner scanner = new Scanner(System.in);
    private int maxWeight ;
    private List<Dogs> listDogInDC;
    private List<Dogs> listDogOutDC;
    public static final int MAX_WEIGHT= 100;

    public DogCages() {
    }

    public DogCages( List<Dogs> listDogInDC, 
            List<Dogs> listDogOutDC) {
        this.maxWeight = MAX_WEIGHT;
        this.listDogInDC = listDogInDC;
        this.listDogOutDC = listDogOutDC;
    }
     /**
     *  add a dog
     */   
    public void addDog() {
        if(maxWeight==0){
            System.out.println("can't add dog, because the dogcage is full");
        }else{
            System.out.println("List the Dogs in the dogcage: ");
            for(Dogs x: listDogOutDC){
                System.out.println("name: "+ x.getName()+", age: "+ x.getAge()
                        +", height: "+x.getHeight()+", weight:"+x.getWeight()
                        +", barking: "+x.barking());
            }
            boolean check=true; // check input the name 
            System.out.println("please input the name of the dog  to  put in "
                        + "the dogcage : ");
            while(check){
                String name= scanner.nextLine().trim(); 
                for(Dogs x: listDogOutDC) {
                    if(name.equals(x.getName())){
                        maxWeight-=x.getWeight();
                        if(maxWeight>=0){
                            listDogInDC.add(x);
                            listDogOutDC.remove(x);
                            System.out.println("add dog Successfully");
                        }else{
                            maxWeight+=x.getWeight();
                            System.out.println("can't add dog, because there's "
                                    + "not enough room in the dog's cage");
                        }
                        check=false;
                        break;
                    }
                }
                if(check){
                System.out.println("the name invalid , please input again: ");
                }
            } 
            System.out.println("List the Dogs in the dogcage: ");
            for( Dogs x: listDogInDC){
                System.out.println("name: "+ x.getName()+", age: "+ x.getAge()
                        +", height: "+x.getHeight()+", weight:"+x.getWeight()
                        +", barking: "+x.barking());
            } 
        }
    }
     /**
     *  remove a dog
     */   
    public void removeDog() {
        if(listDogInDC.size()==0){
            System.out.println("the dogcage has no Dogs . Please add the dog "
                    + "to the dogcage");
        }else{
            for(Dogs x: listDogInDC){
                System.out.println("name: "+ x.getName()+", age: "+ x.getAge()
                        +", height: "+x.getHeight()+", weight:"+x.getWeight()
                        +", barking: "+x.barking());
            }
            boolean check=true; // check input the name 
            System.out.println("please input the name of the dog  to  put in "
                        + "the dogcage : ");
            while(check){
                String name= scanner.nextLine().trim(); 
                for(Dogs x: listDogInDC) {
                    if(name.equals(x.getName())){
                        listDogInDC.remove(x);
                        maxWeight+=x.getWeight();
                        System.out.println("remove dog Successfully");
                        check=false;
                        break;
                    }
                }
                System.out.println("the name invalid , please input again: ");
            } 
            System.out.println("");
            for( Dogs x: listDogInDC){
                System.out.println("name: "+ x.getName()+", age: "+ x.getAge()
                        +", height: "+x.getHeight()+", weight:"+x.getWeight()
                        + ", barking: "+x.barking());
            } 
        }
    }
     /**
     *  when throw squirrel
     */   
    public void throwSquirrel(){
        for( Dogs x: listDogInDC){
            System.out.println(x.getName()+", barking: "+x.barking());
        } 
    }
     /**
     *  Total weight in the dogcage
     */   
    public int getTotalWeight(){
        int totalWeight=0;
        for(Dogs x: listDogInDC){
            totalWeight=+x.getWeight();
        }
        return totalWeight;
    }
     /**
     *  List Chihuahua
     */    
    public void listChihuahua(){
        checkListDogs("goc goc");
    }
     /**
     *  List Begie
     */    
    public void listBegie(){
        checkListDogs("gau gau");
    }
     /**
     *  List AlskanMalamute
     */    
    public void listAlskanMalamute(){
        checkListDogs("Woof Woof huhu");
    }
     /**
     *  List Husky
     */  
    public void listHusky(){
        checkListDogs("Wooooooo huhu");
    }
     /**
     *  List Pitbull
     */  
    public void listPitbull(){
        checkListDogs("gu gu");
    }
     /**
     * Check List Dogs type in the dog cage
     */
    public void checkListDogs(String barking){
        boolean check=true;
        for(Dogs x: listDogInDC){
            if(x.barking().equals(barking)){
                System.out.println("name: "+ x.getName()+", age: "+ x.getAge()
                        +", height: "+x.getHeight()+", weight:"+x.getWeight()
                        + ", barking: "+x.barking());
                check=false;
            }
        }
        if(true){
            System.out.println("There are no Dogs of this type in the dog cage");
        }        
    }
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Dogs> getListDogInDC() {
        return listDogInDC;
    }

    public void setListDogInDC(List<Dogs> listDogInDC) {
        this.listDogInDC = listDogInDC;
    }

    public List<Dogs> getListDogOutDC() {
        return listDogOutDC;
    }

    public void setListDogOutDC(List<Dogs> listDogOutDC) {
        this.listDogOutDC = listDogOutDC;
    }
    
}
    /**
     * Main
     */
public class DogCage {
        public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        Dogs chiHuaHua=new Chihuahua("Rex",1,300,9);
        Dogs begie=new Begie("To",1,600,40);
        Dogs alskanMalamute=new AlskanMalamute("Beo",1,300,15);
        Dogs husky=new Husky("Ngao",2,300,15);
        Dogs pitbull= new Pitbull("Bo",2,500,35);
        List<Dogs> listDogInDC = new ArrayList<Dogs>();
        List<Dogs> listDogOutDC = new ArrayList<Dogs>();
        listDogOutDC.add(chiHuaHua);
        listDogOutDC.add(begie);
        listDogOutDC.add(alskanMalamute);
        listDogOutDC.add(husky);
        listDogOutDC.add(pitbull);
        DogCages dogcage=new DogCages(listDogInDC, listDogOutDC);
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                dogcage.addDog();
                break;
            case "2":
                dogcage.removeDog();
                break;
            case "3":
                dogcage.throwSquirrel();
                break;
            case "4":
                System.out.println("Total weight is:"+ dogcage.getTotalWeight());
                break ;
            case "5":
                dogcage.listChihuahua();
                break;
            case "6":
                dogcage.listBegie();
                break;
            case "7":
                dogcage.listAlskanMalamute();
                break;
            case "8":
                dogcage.listHusky();
                break;
            case "9":
                dogcage.listPitbull();
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
        System.out.println("1.add the dog enter the dogcage ");
        System.out.println("2. remote the dog");
        System.out.println("3. Throw Squirrel ");
        System.out.println("4. Total weight in the doccage ");
        System.out.println("5. List Chihuahua ");
        System.out.println("6. List Begie ");
        System.out.println("7. List AlskanMalamute ");
        System.out.println("8. List Husky ");
        System.out.println("9. List Pitbull ");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
