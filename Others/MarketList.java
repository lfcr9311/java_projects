package Others;

import java.util.LinkedList;
import java.util.Scanner;

public class MarketList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        String produto;
        
        while(produto == "Q"){
        lista.add(produto);
        produto = sc.next();
        }
        System.out.println("------------------------");

        System.out.println(lista);

        sc.close();
    }
}
