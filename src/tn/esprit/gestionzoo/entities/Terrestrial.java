package tn.esprit.gestionzoo.entities;

 non-sealed public class Terrestrial extends Animal implements Omnivore<Food> {

    protected int nbrLegs;

    public Terrestrial (String family, String name, int age, boolean isMammal, int nbrLegs){
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;

    }
    @Override
    public void eatPlantAndMeet(Food food){
        System.out.println("the terrestrial " +getName()+ " is eating " +food);
    }

    @Override
    public void eatPlant(Food plant){
        System.out.println("the terrestrial " +getName()+ " is eating " +plant);
    }

    public void eatMeat(Food meat){
        System.out.println("the terrestrial " +getName()+ " is eating " +meat);
    }


    @Override
    public  String toString(){
        return "Animal { " +
                "family=' " + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", nombre de ses pates= '" +nbrLegs+
                '}';
    }
}

