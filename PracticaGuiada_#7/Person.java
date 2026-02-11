import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.petManager = new PetManager();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean addPet(Pet pet){
        return petManager.addPet(pet);
    }

    public boolean deletePet(Pet pet){
        return petManager.deletePet(pet);
    }

    public Pet searchPetByName(String name) {
        return petManager.searchPetByName(name);
    }

    public boolean updatePet(Pet oldPet, Pet newPet) {
        return petManager.updatePet(oldPet, newPet);
    }

    public ArrayList<Pet> getPetManager() {
        return petManager.getPets();
    }

}
