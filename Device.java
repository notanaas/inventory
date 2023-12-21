/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author DELL
 */
public class Device extends Product {
    public Device(){}
    @Override
    public void setLength(int length) {length = 0;}
    @Override
    public int getLength() {
        return 0;
    }
}
