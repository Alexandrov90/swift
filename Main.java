
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author livanov
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        
        Car car = new Car();
        car.brand = split[0];
        car.model = split[1];
        car.yearProduced = Integer.parseInt(split[2]);
        car.horsePower = Integer.parseInt(split[3]);
        
        System.out.println(car.getInsurancePrice());
    }
}
