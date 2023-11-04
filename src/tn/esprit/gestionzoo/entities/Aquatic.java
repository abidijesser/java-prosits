package tn.esprit.gestionzoo.entities;

sealed public abstract class Aquatic  extends Animal permits Dolphin, Penguin {

    protected String habitat;

    public Aquatic (String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;

    }

    public abstract void swim();

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
