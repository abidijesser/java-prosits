public class ZooManagement {

    public static void main(String[] args) {

        Animal lion=new Animal("cats", "lion", 5, true);
        System.out.println(lion.toString());

        System.out.println("---------------------------------------");

        Zoo zoo=new Zoo("My Zoo", "New York");
        zoo.animals=new Animal[zoo.nbrCages];
        System.out.println(zoo.toString());

        System.out.println("---------------------------------------");

        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(dog.toString());

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

        Zoo zoo2=new Zoo("My Zoo2", "los angeles");
        zoo.animals=new Animal[zoo.nbrCages];
        System.out.println(zoo2.toString());

        System.out.println(" le zoo avec le plus d'animaux est: "+zoo2.comparerZoo(zoo, zoo2)) ;


    }
}
