package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {

        Animal lion=new Animal("cats", "lion", 5, true);
        System.out.println(lion);

        System.out.println("---------------------------------------");

        Zoo zoo=new Zoo("My Zoo", "New York");
        zoo.setAnimals(new Animal[zoo.getNbrCages()]);
        System.out.println(zoo);

        System.out.println("---------------------------------------");

        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(dog);

        System.out.println("---------------------------------------");

        zoo.displayZoo();

        System.out.println("---------------------------------------");

        System.out.println(zoo.addAnimal(lion)) ;
        System.out.println(zoo.addAnimal(lion)) ;
        System.out.println(zoo.addAnimal(dog)) ;
        System.out.println(zoo.addAnimal(dog)) ;
        System.out.println(zoo.searchAnimal(dog)) ;

        System.out.println("---------------------------------------");

        zoo.displayAnimals();

        zoo.removeAnimal(dog);

        System.out.println(zoo.searchAnimal(dog)) ;

        System.out.println(zoo.isZooFull()) ;

        Zoo zoo2=new Zoo("a", "los angeles");
        zoo2.setAnimals(new Animal[zoo2.getNbrCages()]);
        System.out.println(zoo2);

        System.out.println(" le zoo avec le plus d'animaux est: "+zoo2.comparerZoo(zoo, zoo2)) ;

        System.out.println("---------------------------------------");

        Dolphin dolphin1 =new Dolphin("Aquatic","dolphin", 2,false,"mer",15);
        Penguin penguin1 = new Penguin("Terrestrial","penguin", 3,false,2,50);
        Aquatic shark=new Aquatic("Aquatic","shark", 5,false,"mer");
        Terrestrial cow=new Terrestrial("Terrestrial","la vache qui rit", 4,true,4);

        System.out.println(dolphin1);
        System.out.println(penguin1);
        System.out.println(cow);
        System.out.println(shark);

        System.out.println("---------------------------------------");

        dolphin1.swim();
        shark.swim();

    }
}
