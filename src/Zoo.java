public class Zoo {

    Animal [] animals;
    String name, city;
    final int nbrCages=25;
    int nbrAnimals;

    public Zoo(String name, String city){
        animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;

    }

    public void displayZoo(){

        System.out.println("name : '"+name+ "', city : '"+city+"', nombre de cages: '"+nbrCages+"'");
    }

    public boolean addAnimal(Animal animal) {
        boolean resultat=false;
        if ((nbrAnimals < nbrCages) && (searchAnimal(animal) == -1)) {
            animals[nbrAnimals]=animal;
            nbrAnimals++ ;
            resultat=true;
        }
        return resultat ;

    }

    int searchAnimal(Animal animal){

        int res=-1;

        for(int i=0; i<nbrAnimals; i++){
            if(animal.name == animals[i].name){
                res=1;
            }
        }

        return res;
    }

    void displayAnimals(){
        System.out.println("la zoo "+name+" contient : ");
        for(int i=0; i<nbrAnimals;i++){
            System.out.println(animals[i].name);
        }
    }

    void removeAnimal( Animal animal){

        if (searchAnimal(animal) !=-1){
            for(int i=0; i<nbrAnimals;i++){
                if(animal.name == animals[i].name){
                    animals[i]=null;
                    nbrAnimals--;
                }
            }
            System.out.println("succès de la suppression.");
        }

        else{
            System.out.println("échec de la suppression.");
        }

    }

    boolean isZooFull(){
        boolean zoofull=false;
        if(nbrAnimals == nbrCages){
            zoofull=true;
        }
        return zoofull;
    }


    Zoo comparerZoo(Zoo z1, Zoo z2){

        Zoo z3;

        if(z1.nbrAnimals <z2.nbrAnimals){
            z3=z2;
        }
        else{
            z3=z1;
        }
        return z3;
    }

    @Override
    public String toString(){
        return "Zoo { Name= '" +name+ "', City= '" +city+ "', Nombre de cages= "+nbrCages+ "}" ;
    }
}
