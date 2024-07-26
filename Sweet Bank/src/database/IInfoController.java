
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package database;

import database.transactions.AccountInfo;

/**
 *
 * @author Karaarslan
 */
public interface IInfoController {
    
    public boolean isInfoValid();
    public AccountInfo getAccountInfo();
    
}
