package ed.conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {

    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("marcelo");
        conjunto.adiciona("guilherme");
        System.out.println(conjunto);

        conjunto.remove("mauricio");
        System.out.println(conjunto);

        Set<String> set = new HashSet<>();

        set.add("mauricio");
        set.add("paulo");

        System.out.println(set);
    }
}
