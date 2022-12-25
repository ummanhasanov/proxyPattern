/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypattern;

/**
 *
 * @author Umman Hasan
 */
public class ProxyImage implements Image
{

    private RealImage realImage;
    private String fileName;

    public ProxyImage() {

    }

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // yoxlama emeliyyati aparir
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
