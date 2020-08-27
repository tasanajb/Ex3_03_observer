/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observer;
/**
 *
 * @author user
 */
public class TestObserver {
    public static void main(String[] args) {
	Observer obj1 = new Senior();
	Observer obj2 = new Marketing();
	HeadQuater obj = new HeadQuater();              
	obj.addObserver(obj1);              
	obj.addObserver(obj2);              
	obj.setSomeData(6);
        obj.setSomeData(7);
    }
}
