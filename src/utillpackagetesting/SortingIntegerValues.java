/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utillpackagetesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class SortingIntegerValues {

    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Integer(1));
        al.add(new Integer(0));
        al.add(new Integer(3));
        al.add(new Integer(2));
        al.add(new Integer(5));
        al.add(new Integer(2));
        al.add(new Integer(8));
        
        Collections.sort(al);
        for (Iterator it = al.iterator(); it.hasNext();) {
            Integer al1 = (Integer) it.next();
            System.out.println(al1);
        }
    }
    
}
