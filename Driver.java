/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
public class Driver {
    public static void main(String[] args)
    {
        int i = 0;
        GenerateQuote.populateQuotes();
        while(i<5)
        {
            System.out.println(GenerateQuote.getQuote());
            i++;
        }
        
    }
    
}
