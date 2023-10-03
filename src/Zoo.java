
public class Zoo {

    private Animal [] animals;
    private String name;
    private String city;
    private final int nbrCages=25;
    private int nbrAnimals;

    public Zoo(String name, String city){
        if (name !=""){
            animals=new Animal[nbrCages];
            this.name=name;
            this.city=city;
        }

        else{
            throw new IllegalArgumentException("Le nom d'un zoo ne doit pas être vide.");
        }

    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public int getNbrCages(){
        return nbrCages;
    }

    public Animal[] getAnimals(){
        return animals;
    }

    public void setName(String name){
        if(name !=""){
            this.name=name;
        }
        else{
            throw new IllegalArgumentException("Le nom d'un zoo ne doit pas être vide.");
        }
    }

    public void setCity(String city){
        this.city=city ;
    }

    public void setAnimals(Animal[] animals){
        this.animals=animals;
    }

    public void displayZoo(){

        System.out.println("name : '"+name+ "', city : '"+city+"', nombre de cages: '"+nbrCages+"'");
    }

    public boolean addAnimal(Animal animal) {
        boolean resultat=false;
        if ((isZooFull()== false) && (searchAnimal(animal) == -1)) {
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
