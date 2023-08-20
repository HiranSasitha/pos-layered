/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao;

import pos.layerd.dao.custom.impl.CustomerDaoImpl;

/**
 *
 * @author Hiran
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
    
    if(daoFactory == null){
    
    daoFactory = new DaoFactory();
    
    }
    return daoFactory;
    
    }
    
    public SuperDao getDao(DaoType type){
    
    switch(type){
    
        case CuSTOMER:
            return new CustomerDaoImpl();
            
            default:
                return null;
    
    
    }
    
    }
    
    public enum DaoType{
    
    CuSTOMER
    
    }
}