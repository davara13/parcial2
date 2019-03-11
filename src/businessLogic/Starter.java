/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.*;
import java.io.*;

/**
 *
 * @author daaariaspa
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    private Person persona;
    private Vet v;

    public void readPets(Vet v) throws FileNotFoundException {
        ArrayList<Pet> mascotas = new ArrayList();
        Pet mascota;
        ArrayList<Person> duenos = new ArrayList();
        Person dueno;
        Scanner input = new Scanner(new File("pets.txt"));
        String id;
        String name;
        String hairColor;
        while (input.hasNextLine()) {
            String text = input.nextLine();
            String palabra;
            StringTokenizer st = new StringTokenizer(text);
            while (st.hasMoreTokens()) {
                palabra = st.nextToken();
                if(palabra.equals("Dog")){
                    id = st.nextToken();
                    name = st.nextToken();
                    hairColor = st.nextToken();
                    String breed = st.nextToken();
                    mascota  = new Dog(breed,id,name,hairColor);
                    mascotas.add(mascota);
                }else if(palabra.equals("Cat")){
                    id = st.nextToken();
                    name = st.nextToken();
                    hairColor = st.nextToken();
                    boolean isHunter = Boolean.valueOf(st.nextToken());
                    mascota  = new Cat(isHunter,id,name,hairColor);
                    mascotas.add(mascota);
                }else if(palabra.equals("Dog")){
                    id = st.nextToken();
                    name = st.nextToken();
                    hairColor = st.nextToken();
                    double weight = Double.valueOf(st.nextToken());
                    mascota  = new Hamster(weight,id,name,hairColor);
                    mascotas.add(mascota);
                }       
            }
            
            text = input.nextLine();
            st = new StringTokenizer(text);
            while (st.hasMoreTokens()){
                name = st.nextToken();
                id = st.nextToken();
                dueno = new Person(name, id, mascotas);
                duenos.add(dueno);
            }
        
        }
    }

    public void manageVet(Vet v, String action) {
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
