package tn.esprit.gestionzoo.entities;

final public class Dolphin extends Aquatic{

    protected float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed){
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public  String toString(){
        return "Animal { " +
                "family=' " + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat= '" +habitat + "'"+
                ", vitesse de nage= '" +swimmingSpeed+
                '}';
    }
}

