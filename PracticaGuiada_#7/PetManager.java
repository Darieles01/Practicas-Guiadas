import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets;

    public PetManager(){
        this.pets = new ArrayList<>();
    }

    public boolean addPet(Pet pet){
        return pets.add(pet);
    }

    public boolean deletePet(Pet pet){
        if (pet != null) {
            if (pets.remove(pet)) {
                return true;
            }
        }
        return false;
    }

    public Pet searchPetByName(String name){
        for (Pet pet : pets) {
            if (pet.getPetName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    public boolean updatePet(Pet oldPet, Pet newPet){
        if (oldPet != null && newPet != null) {
            pets.set(pets.indexOf(oldPet), newPet);
            return true;
        }
        return false;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
}
