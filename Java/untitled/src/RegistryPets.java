import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RegistryPets{
    private final List<Pets> registryPets;

    public RegistryPets() {
        registryPets = new ArrayList<>();
    }

    public void add(Pets animal){
        registryPets.add(animal);
    }

    public List<Pets> getRegistryPets() {
        return registryPets;
    }

    @Override
    public String toString() {
        if(registryPets.isEmpty()){
            return  "Нет зарегестрированных животных!";

        } else {
            String tmp = "";
            for (Pets animal: registryPets) {
                tmp += animal.getTypeAnimal() + ": " +
                        animal.getName() +
                        " - дата рождения: " + animal.getBirthDate() + "\n";
            }
            return tmp;
        }

    }

    public String showRegistryPetsSortByBirthday(){
        registryPets.sort(Comparator.comparing(Pets::getBirthDate));
        return toString();
    }
}
