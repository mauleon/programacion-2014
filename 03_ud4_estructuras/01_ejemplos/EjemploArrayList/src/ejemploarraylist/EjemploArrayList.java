package ejemploarraylist;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {


        List<String> lista = new ArrayList<>();
        
        lista.add("Julio");
        lista.add("Dani");
        lista.add("Iker");
        lista.add("Iker");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }        

        System.out.println();
        
        for (String s : lista) {
            System.out.println(s);
        }
        
    }

}
