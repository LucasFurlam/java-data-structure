package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
//        Fila fila = new Fila();
//
//        fila.adiciona("mauricio");
//        fila.adiciona("guilherme");
//
//        System.out.println(fila);
//
//        String nome = fila.remove();
//        System.out.println(nome);
//
//        System.out.println(fila);

        Queue<String> queue = new LinkedList<>();

        queue.add("mauricio");
        String name = queue.poll();

        System.out.println(name);
    }
}
