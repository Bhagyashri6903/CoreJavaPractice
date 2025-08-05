package com.inheritance;

public class Daughter extends Father {
    void daughterProperty() {
        System.out.println("Son has 5cr");
    }

    public static void main(String[] args) {
    	Daughter d = new Daughter();

        
        d.grandfatherproperty(); 
        d.fatherproperty();     
        d.daughterProperty();         
    }
}
