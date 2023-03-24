import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<String> frutas1 = new ArrayList<>(List.of("manga", "morango", "uva", "banana", "mamão", "pitomba", "jambo", "melão"));
        List<String> frutas2 = new ArrayList<>(List.of("goiaba", "melancia", "uva", "manga", "jambo","melão", "kiwi"));
        List<String> repetidos = new ArrayList<>();
        for (int index = 0; index < frutas1.size(); index++) {
            if ( frutas2.contains(frutas1.get(index))){
                repetidos.add(frutas1.get(index));
            }
        }
        for (int index = 0; index < repetidos.size(); index++) {
            System.out.println(repetidos.get(index));
        }
 
    }
}
