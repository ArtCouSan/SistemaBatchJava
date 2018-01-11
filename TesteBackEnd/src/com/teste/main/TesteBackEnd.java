
package com.teste.main;

import com.teste.controller.Controller;
import java.sql.SQLException;

//CREATE DATABASE Teste_BackEnd;
//CREATE TABLE IF NOT EXISTS tb_customer_account (
//             ID_CUSTOMER INT(20) NOT NULL,
//             CPF_CNPJ VARCHAR(50) NOT NULL,
//             NM_CUSTOMER VARCHAR(255) NOT NULL,
//             IS_ACTIVE TINYINT(1) NOT NULL,
//             VL_TOTAL DECIMAL(5,2) NOT NULL,
//             PRIMARY KEY (ID_CUSTOMER));


public class TesteBackEnd {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        // Chama a classe controller com o metodo da logica pedida
        Controller c = new Controller();    
        c.logicaTeste();
        
    }
    
}
