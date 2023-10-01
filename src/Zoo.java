public class Zoo {

    Animal [] animals;
    String name, city;
    int nbrCages;
    int nbrAnimals;

    public Zoo(String name, String city, int nbrCages){
        animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;

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
    

    @Override
    public String toString(){
        return "Zoo { Name= '" +name+ "', City= '" +city+ "', Nombre de cages= "+nbrCages+ "}" ;
    }
}
