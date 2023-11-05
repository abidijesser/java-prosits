package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal [] animals;
    private String name;
    private String city;
    private final int nbrCages=3;
    public int nbrAnimals;
    public Aquatic[] aquaticAnimals= new Aquatic[10];

    private int nbrAquaticAnimals;

    public Zoo(String name, String city){
        if (name !=""){
            animals=new Animal[nbrCages];
            this.name=name;
            this.city=city;
        }

        else{
            System.out.println("Le nom d'un zoo ne doit pas être vide.");
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
            System.out.println("Le nom d'un zoo ne doit pas être vide.");
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

    public void addAnimal(Animal animal) {

        try{
            if ((searchAnimal(animal) == -1)) {
                if (isZooFull()) {
                    throw new ZooFullException();
                }
                animals[nbrAnimals]=animal;
                nbrAnimals++ ;
                System.out.println("Animal ajouté avec succés");
                System.out.println("Le nombre d'animaux maintenant est : "+nbrAnimals);
            }
            else{
                System.out.println("Animal deja existe");
            }
        }
        catch(ZooFullException ex){
            System.out.println(ex.getMessage());
        }
    }

     public int searchAnimal(Animal animal){

        int res=-1;
        for(int i=0; i<nbrAnimals; i++){
            if(animal.getName() == animals[i].getName()){
                res=1;
            }
        }

        return res;
    }

    public void displayAnimals(){
        System.out.println("la zoo "+name+" contient : ");
        for(int i=0; i<nbrAnimals;i++){
            System.out.println(animals[i].getName());
        }
    }

    public void removeAnimal( Animal animal){

        if (searchAnimal(animal) !=-1){
            for(int i=0; i<nbrAnimals;i++){
                if(animal.getName() == animals[i].getName()){
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

    public boolean isZooFull(){
        boolean zoofull=false;
        if(nbrAnimals == nbrCages){
            zoofull=true;
        }
        return zoofull;
    }


    public Zoo comparerZoo(Zoo z1, Zoo z2){

        Zoo z3;

        if(z1.nbrAnimals <z2.nbrAnimals){
            z3=z2;
        }
        else{
            z3=z1;
        }
        return z3;
    }

    public Boolean addAquaticAnimal(Aquatic aquatic){
        boolean resultat=false;
        if ((isAquaticZooFull()== false) && (searchAquaticAnimal(aquatic) == false)) {
            aquaticAnimals[nbrAquaticAnimals]=aquatic;
            nbrAquaticAnimals++ ;
            resultat=true;
        }
        return resultat ;

    }

    public Boolean searchAquaticAnimal(Aquatic aquatic){

        Boolean res=false;
        for(int i=0; i<nbrAquaticAnimals; i++){
            if(aquatic.getName() == aquaticAnimals[i].getName()){
                res=true;
            }
        }

        return res;
    }

    public boolean isAquaticZooFull(){
        boolean aquaticzoofull=false;
        if(nbrAnimals == 10){
            aquaticzoofull=true;
        }
        return aquaticzoofull;
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth=-1;
        for(int i=0; i<nbrAquaticAnimals; i++){
            if(aquaticAnimals[i] instanceof Penguin){
                float penguinDepth = ((Penguin) aquaticAnimals[i]).swimmingDepth;
                if( penguinDepth > maxDepth) {
                    maxDepth=penguinDepth ;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int dolphinNumber=0;
        int penguinNumber=0;
        for(int i=0; i<nbrAquaticAnimals; i++){
            if(aquaticAnimals[i] instanceof Penguin){
                penguinNumber +=1;
            }
            if(aquaticAnimals[i] instanceof Dolphin){
                dolphinNumber +=1;
            }
        }
        System.out.println("le nombre des Daulphins est: "+dolphinNumber+ " et le nombre des Penguin est: "+penguinNumber);
    }

    @Override
    public String toString(){
        return "Zoo { Name= '" +name+ "', City= '" +city+ "', Nombre de cages= "+nbrCages+ "}" ;
    }
}
