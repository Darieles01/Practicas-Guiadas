
public class Main{
    public static void main(String[] args){
        /*
        int[] numbers = {10, 20, 30 ,40 ,50};
        String[] fruits = new String[3];

        System.out.println(numbers[2]);
        System.out.println(fruits[2]);
        */

        Person person = new Person("Dariel", 19);
        Pet pet = new Pet("Firulais", "Dog");
        Pet pet2 = new Pet("Michi", "Cat");
        Pet pet3 = new Pet("Nemo", "Fish");
        person.addPet(pet);
        person.addPet(pet2);
        person.addPet(pet3);

        person.deletePet(pet);
        person.searchPetByName("Michi");
        person.updatePet(pet3, new Pet("Zorro", "Caballo"));

        System.out.println(person.getPetManager().toString());
        
    }
}