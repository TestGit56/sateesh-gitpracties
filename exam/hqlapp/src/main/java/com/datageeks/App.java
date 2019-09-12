package com.datageeks;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductDAO dao = new ProductDAO();
        
        System.out.println("getAll() =>" + dao.getAll());
        
        System.out.println("getById() =>" + dao.getById(222));
        
        System.out.println("getIdNamesRealTIme() =>" + dao.getIdNameRealTime());
        
        System.out.println("getIdNames() !!!  List<Object[]>");
        
        List<Object[]> objectArrayList = dao.getIdNames();
        
        for(Object[] objectArray : objectArrayList) 
        {
        	for(Object element : objectArray) 
        	{
        		System.out.print(element+"\t");
        	}
        	System.out.println();
        }
        
    }
}
