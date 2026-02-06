public class PetManager {
    private int size;
    private Pet[] pets;

    public PetManager(int numbersOfPets){
        this.size = 0;
        this.pets = new Pet[numbersOfPets];
    }

    public boolean addPet(Pet pet){
        for (int i = 0; i < pets.length; i++){
            if (pets[i] == null) {
                pets[i] = pet;
                size ++;
                return true;
            }
        }
        return false;
    }
}
