public class Animal {
    private String name;
    private Boolean isDog;

    public Animal(String animalName, Boolean isDog) {        
        this.name = animalName;
        this.isDog=isDog;    
    }

    public Animal(String animalName)
    {
        this.name = animalName;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String animalName) {
        this.name = animalName;
    }

    public Boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString()
    {
        return name + " is a dog : " + isDog;
    }
}

