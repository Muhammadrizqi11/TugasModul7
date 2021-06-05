/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author Lenovo
 */
public class No1_App {
        public static void main(String[] args){
                No1 antrian = new No1(5);
                antrian.enqueue(40);
                antrian.display();
                antrian.enqueue(33);
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.peek());
                antrian.enqueue(60);
                antrian.display();
                System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
                antrian.display();
                System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
                antrian.display();
                antrian.enqueue(54);
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.dequeue());
    }    
}
    

