import java.util.ArrayList;
import java.util.List;

public class ColectionHW {

    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.add("555930883","Amina");
        contact.add("555930884","Elkhan");
        contact.add("555930885","Ramin");
        contact.add("555930886","Lenura");
        contact.get("Amina");
        repetitionwords();
    }

    private static void repetitionwords() {
        String[] words = {"Elkhan","Amina","Ramin","Elkhan","Lenura","Ramin","Venera","Atrafil","Lenura","Fatima"};
        List<String> word = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            for (int j=i+1; j<words.length; j++) {
                if(words[i].equals(words[j])) {
                    word.add(words[j]);
                }
            }
        }
        for (String s :
                word) {
            System.out.println(s);
        }
    }
}


