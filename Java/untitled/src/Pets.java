import java.util.ArrayList;
import java.util.List;

public abstract class Pets extends Animals{

    protected List<String> commands;
    protected String typeAnimal;
    public Pets(String type, String name, String birthDate) {
        super(name, birthDate);
        commands = new ArrayList<>();
        typeAnimal = type;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String showCommands(){
        if(commands.isEmpty()){
            return "Животное ничего не умеет!";
        } else {
            String tmp = name + " знает команду(ы): ";
            for (String command: commands) {
                tmp += command + " ";
            }
            return tmp;
        }
    }

    public void addCommand(String command){
        commands.add(command);
        System.out.println("Команда успешно добавлена!");
    }
}
