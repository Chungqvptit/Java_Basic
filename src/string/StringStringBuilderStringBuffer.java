/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author ADMIN
 */
public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {
        //String takes up a lot of heap
        String string = "hello";
        string = string + "String";
        System.out.println(string);
        //StringBuilder takes up less heap and asynchronous
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");
        stringBuilder.append("StringBuilder");
        System.out.println(stringBuilder.toString());
        //StringBuilder takes up less heap and synchronous
        StringBuffer stringBuffer = new StringBuffer("hello");;
        stringBuffer.append("StringBuffer");
        System.out.println(stringBuffer.toString());
    }
}
