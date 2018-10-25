/*
 * Jared Craig
 * 18/10/2018
 * Opens the customer list and edits it
 */

package customerlist;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */

import java.io.*;
public class CustomerList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        
         BufferedReader fileOut = new BufferedReader( 
          new FileReader("CustomerList.txt")); 
        String myline;
        myline = fileOut.readLine();
          while((myline = fileOut.readLine()) != null){  //outputs all the customers that are already in the file
            System.out.println(myline);
        }
        fileOut.close();  //closes the file
        
           PrintWriter fileOut2 = new PrintWriter(new FileWriter(
      "CustomerList.txt",true));
        
        String Customer = JOptionPane.showInputDialog("Input amount of customers"); 
       // if(Integer.parseInt(Customer)= true){
        
  //  }    
        Double customer = Double.parseDouble(Customer);
        while(!Character.isDigit(Customer.charAt(0)) && !Character.isDigit(Customer.charAt(1)) ){
                JOptionPane.showMessageDialog(null,"Invalid input");//Outputs invalid input
                Customer = JOptionPane.showInputDialog("Input amount of customers"); 
            }
        
        for(int i=1; i <= customer; i++) {
            String Cust = JOptionPane.showInputDialog("Input Name of Customer");
                while(Cust != null && Cust.isEmpty()){
                   JOptionPane.showMessageDialog(null,"Invalid input");//Outputs invalid input
                    Cust = JOptionPane.showInputDialog("Input Name of Customer");
            }
            String Cust2 = JOptionPane.showInputDialog("Input Address of " + Cust);
                while(Cust2 != null && Cust2.isEmpty()){
                   JOptionPane.showMessageDialog(null,"Invalid input");//Outputs invalid input
                    Cust2 = JOptionPane.showInputDialog("Input Address of " + Cust);
            }
            String Cust3 = JOptionPane.showInputDialog("Input City of " + Cust);
                while(Cust3 != null && Cust3.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Invalid input");//Outputs invalid input
                    Cust3 = JOptionPane.showInputDialog("Input City of " + Cust);
            }
            String Cust4 = JOptionPane.showInputDialog("Input Province of " + Cust);
                while(Cust4 != null && Cust4.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Invalid input");//Outputs invalid input
                    Cust4 = JOptionPane.showInputDialog("Input Province of " + Cust);
            }
            String Cust5 = JOptionPane.showInputDialog("Postal code of " + Cust + " (L#L#L# format)");    
                while(Cust5.length() != 6){
                    JOptionPane.showMessageDialog(null,"Invalid input");//Outputs invalid input
                    Cust5 = JOptionPane.showInputDialog("Error in postal code use L#L#L# format and only 6 letters/numbers");   
                }
 
           while(!Character.isLetter(Cust5.charAt(0)) || !Character.isDigit(Cust5.charAt(1)) || !Character.isLetter(Cust5.charAt(2))|| !Character.isDigit(Cust5.charAt(3))|| !Character.isLetter(Cust5.charAt(4))|| !Character.isDigit(Cust5.charAt(5))) { 
               JOptionPane.showMessageDialog(null,"Invalid input"); //Outputs invalid input
               Cust5 = JOptionPane.showInputDialog("Error in postal code use L#L#L# format"); 
               while(Cust5.length() != 6 ){
                   JOptionPane.showMessageDialog(null,"Invalid input"); //Outputs invalid input
                   Cust5 = JOptionPane.showInputDialog("Error in postal code use L#L#L# format and only 6 letters/numbers");   
                }
           }
           String Cust6 = "Name: " + Cust + "         Address: " + Cust2 + "         City: " + Cust3 + "         Province: " + Cust4 + "         Postal code: " + Cust5; //Puts all the imputs together
            fileOut2.println(Cust6); //Prints out customer information
            System.out.println(Cust6);            
        } 
       fileOut2.close(); //closes the file
        }
    }
    

 