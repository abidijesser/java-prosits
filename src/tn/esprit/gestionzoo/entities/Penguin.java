package tn.esprit.gestionzoo.entities;

non-sealed public class Penguin extends Aquatic{

    protected float swimmingDepth ;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth){
        super(family, name, age, isMammal,habitat );
        this.swimmingDepth=swimmingDepth;
    }

     public Float getSwimmingDepth(){
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }



    public void swim(){
        System.out.println("This penguin is swimming.");
    }

    @Override
    public  String toString(){
        return "Animal { " +
                "family=' " + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat= '" +habitat + "'"+
                ", profondeur= '" +swimmingDepth+
                '}';
    }
}
