/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.sql.Connection;

/**
 *
 * @author rijo0
 */
public class TestApplication {
    public static void main(String[] args){
    
        Connection con=DBConnection.getConnection();
    
        if(con!=null){
            System.out.println("Test Connection Passed");}
        else{
            System.out.println("Test Connection not passed");}
    }
    
}
