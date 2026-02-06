public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age, int numberOfPets){
        this.name = name;
        this.age = age;
        this.petManager = new PetManager(numberOfPets);
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

    public boolean removePet(Pet pet) {
        return petManager.removePet(pet);
    }

    public Pet[] getPets(){
        return petManager.getPets();
    }

    public boolean updatePets(Pet pet, int index){
        return petManager.updatePets(pet, index);
    }
}
