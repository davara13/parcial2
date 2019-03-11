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
public class Vet {
    
    private ArrayList<Pet> mascotas;

    public Vet(ArrayList<Pet> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void removePet(Pet p){
        
    }
    
    public void showPetsByType(String type){
        Dog dog;
        Cat cat;
        Hamster ham;
        for (int i = 0 ; i < this.mascotas.size(); i++) {
            if(this.mascotas.get(i).getClass().getName().equals("Dog") && this.mascotas.get(i).getClass().getName().equals(type) ){
                dog = (Dog) this.mascotas.get(i);
                System.out.println("Id: "+ dog.getId());
                System.out.println("Nombre: "+ dog.getName());
                System.out.println("Color del pelo: "+ dog.getHairColor());
                System.out.println("Breed: "+ dog.getBreed());
            } else if(this.mascotas.get(i).getClass().getName().equals("Cat") && this.mascotas.get(i).getClass().getName().equals(type)){
                cat = (Cat) this.mascotas.get(i);
                System.out.println("Id: "+ cat.getId());
                System.out.println("Nombre: "+ cat.getName());
                System.out.println("Color del pelo: "+ cat.getHairColor());
                System.out.println("Is Hunter: "+ cat.getIsHunter());
            }else if(this.mascotas.get(i).getClass().getName().equals("Hamster") && this.mascotas.get(i).getClass().getName().equals(type)){
                ham = (Hamster) this.mascotas.get(i);
                System.out.println("Id: "+ ham.getId());
                System.out.println("Nombre: "+ ham.getName());
                System.out.println("Color del pelo: "+ ham.getHairColor());
                System.out.println("Tamano: "+ ham.getWeight());
            }
        }
    }
    
    public void showPets(){
        Dog dog;
        Cat cat;
        Hamster ham;
        for (int i = 0 ; i < this.mascotas.size(); i++) {
            if(this.mascotas.get(i).getClass().getName().equals("Dog")){
                dog = (Dog) this.mascotas.get(i);
                System.out.println("Id: "+ dog.getId());
                System.out.println("Nombre: "+ dog.getName());
                System.out.println("Color del pelo: "+ dog.getHairColor());
                System.out.println("Breed: "+ dog.getBreed());
            } else if(this.mascotas.get(i).getClass().getName().equals("Cat")){
                cat = (Cat) this.mascotas.get(i);
                System.out.println("Id: "+ cat.getId());
                System.out.println("Nombre: "+ cat.getName());
                System.out.println("Color del pelo: "+ cat.getHairColor());
                System.out.println("Is Hunter: "+ cat.getIsHunter());
            }else if(this.mascotas.get(i).getClass().getName().equals("Hamster")){
                ham = (Hamster) this.mascotas.get(i);
                System.out.println("Id: "+ ham.getId());
                System.out.println("Nombre: "+ ham.getName());
                System.out.println("Color del pelo: "+ ham.getHairColor());
                System.out.println("Tamano: "+ ham.getWeight());
            }
        }
    }
}
