package com.datageeks;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductDAO dao = new ProductDAO();
        
        System.out.println("getById() => " + dao.getById(333));
        
        System.out.println("search(name) => " + dao.search("apple"));
        
        System.out.println("getMaxPrice() => " + dao.getMaxPrice());
        
        System.out.println("getAll() => " + dao.getAll());
        
        System.out.println("getIdNamesRealTime() => " + dao.getIdNamesRealTIme());
        
        System.out.println("pagination() => " + dao.pagination());
        
        System.out.println("updatePrice() => " + dao.updatePrice());
        
        System.out.println("from delte() method successfull => " + dao.deleteById(111));
    }
}
