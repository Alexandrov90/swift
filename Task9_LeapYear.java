/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9_leapyear;

/**
 *
 * @author User
 */
public class Task9_LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 1900;

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0);

        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);

    }
}

}
    
}
