/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8_secondsinbiggerintervals;

/**
 *
 * @author User
 */
public class Task8_SecondsInBiggerIntervals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalSeconds = 129600;

        int seconds = totalSeconds;

        int minutes = seconds / 60;
        seconds %= 60;

        int hours = minutes / 60;
        minutes %= 60;

        int days = hours / 24;
        hours %= 24;

        System.out.println(days + " days, "
                + hours + " hours, "
                + minutes + " minutes, "
                + seconds + " seconds");
    }
}
}
    
}
