import java.util.Scanner;

public class Menu{
    private static int countAnimals = 0;
    Scanner scanner = new Scanner(System.in);

    RegistryPets registryPets = new RegistryPets();
    private Pets animal;


    public static int getCountAnimals() {
        return countAnimals;
    }

    private int constructorAnimals(String type, String name, String birthday){
        if(type.equalsIgnoreCase("кошка") || type.equalsIgnoreCase("кот")){
            animal = new Cat(type, name, birthday);
        }else if(type.equalsIgnoreCase("собака") || type.equalsIgnoreCase("пес")) {
            animal = new Dog(type, name, birthday);
        }else if(type.equalsIgnoreCase("хомяк")){
            animal = new Hamster(type, name,birthday);
        } else {
            System.out.println("Неверный тип животного!");
            return -1;
        }
        return 1;
    }

    private void addAnimal(){
        registryPets.add(animal);
        System.out.println("Животное успешно добавлено!");
        countAnimals++;
    }

    private Pets searchAnimal(String name){
        for (Pets animal: registryPets.getRegistryPets()) {
            if(animal.getName().equalsIgnoreCase(name)){
                return animal;
            }
        }
        return null;
    }

    private String userStringInput(String text){
        System.out.println(text);
        return scanner.next();
    }
    public void start(){
       System.out.println("\nВведите команду!\n" +
                    "Для добавления нового животного в реестр нажмите - 1\n" +
                    "Вывести список команд выполняемые животным нажмите - 2\n" +
                    "Обучить новой команде животного нажмите - 3\n" +
                    "Вывести список животных из реестра по дате рождения нажмите - 4\n" +
                    "Вывести общее колличество животных в реестре нажмите - 5\n" +
                    "Выйти из программы нажмите - 6\n");

       String userNumber = scanner.next();

        switch (userNumber){
            case "1":
                String type = userStringInput("Введите тип (кошка, собака, хомяк) животного");
                String name = userStringInput("Введите имя животного");
                String birthday = userStringInput("Введите дату рождения (формат гггг-мм-дд) животного");
                if(constructorAnimals(type, name, birthday) == 1){
                    addAnimal();
                }
                start();
                break;
            case "2":
                Pets anim = searchAnimal(userStringInput("Введите имя животного.\n"));
                if(!(anim == null)){
                    System.out.println(anim.showCommands());
                }else System.out.println("Животное не найдeно!");
                start();
                break;
            case "3":
                Pets userSearchName = searchAnimal(userStringInput("Введите имя животного\n"));
                if(!(userSearchName == null)){
                    String newCommand = userStringInput("Введите новую команду.\n");
                    userSearchName.addCommand(newCommand);
                }else System.out.println("Животное не найдeно!");
                start();
                break;
            case "4":
                System.out.println(registryPets.showRegistryPetsSortByBirthday());
                start();
                break;
            case "5":
                System.out.println("Общее количество животных в реестре - " + getCountAnimals());
                start();
                break;
            case "6":
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Неправильныйы ввод команды!");
                start();
        }
    }

}
