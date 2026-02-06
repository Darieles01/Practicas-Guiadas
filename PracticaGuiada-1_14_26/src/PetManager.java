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

    public boolean removePet(Pet pet){
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)){
                //Corrimiento
                for (int j = i; j < pets.length - 1; j++) {
                    pets[i] = pets[i + 1];
                }
                pets[pets.length - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public Pet[] getPets(){
        Pet[] pets = new Pet[this.size];

        for (int i = 0; i < this.size; i++) {
            pets[i] = this.pets[i];
        }

        return pets;
    }

    public boolean updatePets(Pet pet, int index){
        if(pet != null && index >= 0 && index <= this.size){
            pets[index] = pet;
            return true;
        }
        return false;
    }
}
