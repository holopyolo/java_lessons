package src.pr9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class poker {
    public void game(){
        List<String> masti = new ArrayList<>(List.of("В", "Ч", "К", "Б"));
        List<String> numb = new ArrayList<>(List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "T", "К", "В", "Д"));
        Scanner scan = new Scanner(System.in);
        List<String> koloda = new ArrayList<>(List.of("JR", "JB"));
        for(String mast : masti){
            for(String num : numb){
                koloda.add(mast + num);
            }
        }
        Collections.shuffle(koloda);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%s ",koloda.get(i*5 + j));
            }
            System.out.printf(" | ");
        }
    }


}
