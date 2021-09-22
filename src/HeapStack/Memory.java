/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeapStack;

/**
 *
 * @author ADMIN
 */
/**
 *Stack:
 * str
 * param
 * foo()
 * memory
 * obj
 * int i=1
 * main()
 * Heap:
 * Object
 * Memory
 * String
 */

public class Memory {
    private void foo( Object param ){
        String str = param.toString();
        System.out.println(str);
    }
    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        Memory memory = new Memory();
        memory.foo(obj);
    }
}
