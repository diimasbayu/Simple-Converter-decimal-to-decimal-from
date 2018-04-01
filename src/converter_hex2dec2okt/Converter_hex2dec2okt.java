/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter_hex2dec2okt;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Stack;

/**
 *
 * @author dbayu
 */
public class Converter_hex2dec2okt {

    Stack<Integer> stack = new Stack<Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //decimal to
        Converter_hex2dec2okt convertBinary = new Converter_hex2dec2okt();
        Converter_hex2dec2okt converteroctal = new Converter_hex2dec2okt();
        Converter_hex2dec2okt converterhex = new Converter_hex2dec2okt();

        //decimal from
        Converter_hex2dec2okt convertfromoctal = new Converter_hex2dec2okt();
        Converter_hex2dec2okt converfrombinary = new Converter_hex2dec2okt();
        Converter_hex2dec2okt converfromhexa = new Converter_hex2dec2okt();
        

        //panggil class decimal to
        convertBinary.dec2Binary(127);
        converterhex.dec2hex(127);
        converteroctal.dec2Octal(127);

        //panggil class decimal from
        convertfromoctal.octaltoDecimal(177);
        converfrombinary.BinaryToDecimal(1111111);
        converfromhexa.hextodecimal("7f");
    }

    /**
     * converter desimal ke hexadesimal
     * @param num type integer
     * 
     */
    public int dec2hex(int num) {
        int rem;
        String str2 = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            rem = num % 16;
            str2 = hex[rem] + str2;
            num = num / 16;
        }
        System.out.println("Decimal To Hexadecimal: " + str2);

        return num;
    }
        

    /**
     * converter desimal ke biner
     * @param no type integer
     */
    public int[] dec2Binary(int no) {
       
        int container[] = new int[100];
        int i = 0;
        while (no > 0) {
            container[i] = no % 2;
            i++;
            no = no / 2;
        }
        System.out.print("Decimal To Binary :");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(container[j]);
        }
        System.out.println("\n");

        return container;

    }

    
    /**
     * converter dari desimal ke oktal
     * @param decimal type integer
     */
    public String dec2Octal(int decimal) {
        int rem;
        String octal = "";
        char octalchars[] = {'0', '1', '2', '3', '4', '5', '6', '7'};

        while (decimal > 0) {
            rem = decimal % 8;
            octal = octalchars[rem] + octal;
            decimal = decimal / 8;
        }
        System.out.println("Decimal To Octal " + octal);

        return octal;
    }

    ////////////////////////////////////////////////////decimal from\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
    /**
     * converter dari octal ke desimal
     * @param octal type integer
     */
    public int octaltoDecimal(int octal) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (octal == 0) {
                break;
            } else {
                int temp = octal % 10;
                decimal += temp * Math.pow(8, n);
                octal = octal / 10;
                n++;
            }
        }
        System.out.println("Decimal from Octal " + decimal);
        return decimal;
    }
/**
 * converter dari biner ke desimal
 * @param binaryNumber type data integer
 */
    public int BinaryToDecimal(int binaryNumber) {

        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber / 10;
                p++;
            }
        }

        System.out.println("Decimal from binary " + decimal);
        return decimal;
    }

    /**
     * converter dari hexa ke desimal
     * @param hex type data string
     */
    public int hextodecimal(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        System.out.println("Decimal from hex "+val);
        return val;
    }
}
