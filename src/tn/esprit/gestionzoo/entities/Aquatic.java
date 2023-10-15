package tn.esprit.gestionzoo.entities;

sealed public class Aquatic  extends Animal permits Dolphin {

    protected String habitat;

    public Aquatic (String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;

    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public  String toString(){
        return "Animal { " +
                "family=' " + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat= '" +habitat + "'"+
                '}';
    }

}
