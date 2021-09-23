/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ADMIN
 */
/**
 * Create the generic class 
 */
class MyGeneric<T>
{
    T object;
    /**
    * @param object type T
    */
    void addObject(T object)
    {
        this.object = object;
    }
    /**
     * @return object
     */
    T getObject() 
    {
        return object;
    }
}

abstract class Shape {
    abstract void draw();
}
 
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("ve hinh chu nhat.");
    }
}
 
class Circle extends Shape {
    void draw() {
        System.out.println("ve hinh tron.");
    }
}
public class Generics 
{
    /**
     * 
     * @param <E>
     * @param elements 
     */
    public static <E> void printArray(E[] elements)
    {
        for(E element : elements)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    /**
     * key '?' in generic
     * @param lists 
     */
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();// goi phuong thuc cua lop Shape boi lop con
        }
    }
    public static void main(String[] args) 
    {
        //generic class
        MyGeneric<String> mess = new MyGeneric<String>();
        mess.addObject("hello");
        System.out.println(mess.getObject());
        //generic method
        Integer[] intArray = { 10, 20, 30, 40 };
        System.out.print("In mảng số nguyên : ");
        printArray(intArray);
        //key '?' in generic
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShapes(list1);
        drawShapes(list2);
    }
    
}
