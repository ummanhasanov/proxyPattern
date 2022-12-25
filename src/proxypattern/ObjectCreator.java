/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypattern;

/**
 *
 * @author Umman Hasan
 */
public class ObjectCreator
{

    public static Image createObject(Class clazz) {
        if (clazz == RealImage.class) {
            return new ProxyImage();
        }
        return null;
    }
}
