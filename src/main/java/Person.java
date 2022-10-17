import java.util.ArrayList;
import java.util.List;
//they are both printing to the same address location in memory
public class Person {
    public String same1 = "Test";
    public String same2 = same1;
    private String name;
    private List<String> listNames = new ArrayList<>();

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void addName(String name){
        // we just need to add the name given to the list
        listNames.add(name);
    }

    public int getSizeOfList(){
        return listNames.size();
    }

    public void removeName(String name){
        listNames.remove(name);
    }
}
