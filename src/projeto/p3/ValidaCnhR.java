/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop3refeito;

public class ValidaCnhR {
    public static boolean validaCNH(String cnh) {
        char char1 = cnh.charAt(0);
        if (cnh.replaceAll("\\D+", "").length() != 11 
                || String.format("%0" + 11 + "d", 0).replace('0', char1).equals(cnh)) {
            return false;
        }
        long v = 0, j = 9;
        for (int i = 0; i < 9; ++i, --j) {
            v = v + ((cnh.charAt(i) - 48) * j);
        }
        long dsc = 0, vl1 = v % 11;
        if (vl1 >= 10) {
            vl1 = 0;
            dsc = 2;
        }
        v = 0;
        j = 1;
        for (int i = 0; i < 9; ++i, ++j) {
            v += ((cnh.charAt(i) - 48) * j);
        }
        long x = v % 11;
        long vl2 = (x >= 10) ? 0 : x - dsc;
        return (String.valueOf(vl1) + String.valueOf(vl2)).equals(cnh.substring(cnh.length() - 2));
    }
}
    
