/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10_personcharacteristics1;

/**
 *
 * @author User
 */
public class Task10_PersonCharacteristics1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "Peter";
        String lastName = "Ivanov";
        short yearBorn = 1991;
        float weight = 81.5f;
        short height = 184;
        String occupation = "Java Programmer";

        final short currentYear = 2016;

        short age = (short) (currentYear - yearBorn);

        System.out.println(
                firstName + " " + lastName + " is " + age + " years old. "
                + "He was born in " + yearBorn + ". "
                + "His weight is " + weight + " and he is " + height + " cm tall. "
                + "He is a " + occupation + ".");
    }
}
}
    
}
