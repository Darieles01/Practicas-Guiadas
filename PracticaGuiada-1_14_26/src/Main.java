public class Main{
    public static void main(String[] args){
        /*
        int[] numbers = {10, 20, 30 ,40 ,50};
        String[] fruits = new String[3];

        System.out.println(numbers[2]);
        System.out.println(fruits[2]);
        */

        Person person = new Person("Dariel", 19, 5);
       
        /* 
        System.out.println(person.getPets());

        for (Pet pet : person.getPets()) {
            System.out.println(pet.getPetName());
        }
        */
       
        Pet pet1 = new Pet("Manchitas", "Dog");
        Pet pet2 = new Pet("Nemo", "Fish");
        Pet pet3 = new Pet("Leviatan", "Cat");

        if (person.addPet(pet1)) {
            IOManager.printMessage("Pet added successfully");
        }else{
            IOManager.printMessage("Falled to add pet");
        }

        if (person.addPet(pet2)) {
            IOManager.printMessage("Pet added successfully");
        }else{
            IOManager.printMessage("Falled to add pet");
        }

        if (person.removePet(pet1)) {
            IOManager.printMessage("Pet removed successfully");
        }else{
            IOManager.printMessage("Failed to remove pet");
        }

        if (person.getPets().length == 0){
            IOManager.printMessage("No pets found");
        }else{
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        if (person.updatePets(pet3, 1)) {
            IOManager.printMessage("Pet update successfully");
        } else {
            IOManager.printMessage("Error");
        }
    }
}