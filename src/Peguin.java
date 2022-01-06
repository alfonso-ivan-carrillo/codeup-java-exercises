public class Peguin {
    private String name;
    private int weight;
    private String species;
    private char sex;

    public Peguin(String name, int weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }
    public Peguin(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String getSpecies(){
        return species;
    }

    public char getSex(){
        return sex;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public void setSex(char sex){
        this.sex = sex;
    }
    public static boolean canFly(){
        return false;
    }

    public static boolean areEvil(){
        return true;
    }

    public static void main(String[] args){
        Peguin mumble = new Peguin("mumble");

        System.out.println(mumble.getName());


    }
}
