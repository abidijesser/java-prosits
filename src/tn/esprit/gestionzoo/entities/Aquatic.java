package tn.esprit.gestionzoo.entities;

sealed abstract public class Aquatic extends Animal implements Carnivore<Food> permits Dolphin, Penguin  {

    protected String habitat;

    public Aquatic (String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;

    }

    public abstract void swim();

    @Override
    public void eatMeat(Food meat){
        System.out.println("the Aquatic " +getName()+ " is eating "+meat);
    }

    @Override
    public boolean equals(Object obj){

        if (null == obj) return false;
        if (this == obj) return true;

        if (obj instanceof Aquatic aquatic){
            return age == aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat);
        }
        return false;
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
