/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarization;

/**
 *
 * @author luisduarte
 */
public class Familiarization {
    private static int numOne;
    private static int numTwo;
    private static int result;
    private static int num;
    private static boolean boleanSuccess;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numOne = 20;
        numTwo = 30;
        result = 0;
        num = 15; 
        arithmetic();
        compoundAssign();
        unary();
        relational();
        conditional();
    }//end of public static void main(String[] args)
    private static void arithmetic()
    {
        result = numOne + numTwo;
        System.out.println("result = numOne + numTwo is " + result);
        result = numOne - numTwo;
        System.out.println("result = numOne - numTwo is " + result);
        result = numOne * numTwo;
        System.out.println("result = numOne * numTwo is " + result);
        result = numOne / numTwo;
        System.out.println("result = numOne / numTwo is " + result);
        result = numOne % numTwo;
        System.out.println("result = numOne % numTwo is " + result);
    }//end of private static void arithmetic(){
    private static void compoundAssign()
    {
        result += numTwo;
        System.out.println("result += numTwo is  " + result);
        result -= numOne;
        System.out.println("result -= numOne is  " + result);
        result *= numTwo;
        System.out.println("result *= numTwo is  " + result);
        result /= numOne;
        System.out.println("result /= numOne is  " + result);
        result %= numTwo;
        System.out.println("result %= numTwo is  " + result);
        
    }//end of private static void compoundAssign()
    private static void unary()
    {
        num = --num;
        System.out.println("num = num-- is  " + num);
        num = ++num;
        System.out.println("num = num++ is  " + num);
        num = -num;
        System.out.println("num = -num is  " + num);
        num = +num;
        System.out.println("num = +num is  " + num);
        System.out.println("success = " + !boleanSuccess);
        System.out.println("!success = " + boleanSuccess);   
        
    }//end of private static void unary()
    private static void relational()
    {
        if(numOne == numTwo)
        {
            System.out.println("numOne == numTwo");
        }//end of if(numOne == numTwo)
        if(numOne != numTwo)
        {
            System.out.println("numOne != numTwo");
        }//end of if(numOne != numTwo)
        if(numOne > numTwo)
        {
            System.out.println("numOne > numTwo");
        }//end of if(numOne > numTwo)
        if(numOne >= numTwo)
        {
            System.out.println("numOne >= numTwo");
        }//end of if(numOne >= numTwo)
        if(numOne < numTwo)
        {
            System.out.println("numOne < numTwo");
        }//end of if(numOne < numTwo)
        if(numOne <= numTwo)
        {
            System.out.println("numOne <= numTwo");
        }//end of if(numOne <= numTwo)
    }//end of private static void relational()
    private static void conditional()
    {
        if(numOne >= 10 && numTwo >= 10)
        {
            System.out.println("numOne && numTwo >= 10");
        }//end of if(numOne >= 10 && numTwo >= 10)
        if(numOne >= 10 || numTwo >= 10)
        {
            System.out.println("numOne || numTwo >= 10");
        }//end of if(numOne >= 10 || numTwo >= 10)
    }
    
}//end of public class Familiarization
