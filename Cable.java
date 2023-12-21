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
public class Cable extends Product {
    private int length;
    public Cable(){
        length = 0;
    }
    @Override
    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public int getLength() {
        return this.length;
    }
}
