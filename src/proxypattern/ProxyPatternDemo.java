/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxypattern;

/**
 *
 * @author Umman Hasan
 */
public class ProxyPatternDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Image image = new ProxyImage("test_10mb.jpg");
//        Image image = ObjectCreator.createObject(RealImage.class);// eslinde ProxyImage qaytarir

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }

}
