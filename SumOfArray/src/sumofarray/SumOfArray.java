/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofarray;

/**
 *
 * @author arifa
 */
public class SumOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = { 5, 10, 15, 20 };
	int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
	System.out.println(result);
    }
    
}
