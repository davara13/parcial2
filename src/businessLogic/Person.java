/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.*;

/**
 *
 * @author daaariaspa
 */
public class Person {
    private String name;
    private String id;
    private ArrayList<Pet> mascotas;

    public Person(String name, String id, ArrayList<Pet> mascotas) {
        this.name = name;
        this.id = id;
        this.mascotas = mascotas;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Pet> mascotas) {
        this.mascotas = mascotas;
    }

    public void showPets(){
        
    }
}
