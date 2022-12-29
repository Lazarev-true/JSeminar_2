import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
    
    dict_input();
    }

    public static void dict_input(){
        int result = 1;
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> values = new Hashtable<String, Integer>();
        String[] variables = data(sc ,"Введите уравнение произведения (a * b * c): ").split("\\*");

        for (String variable : variables) 
            values.put(variable, values.getOrDefault(variable, 0) + 1);
        
        for (String key : values.keySet()) {
            result *= values.get(key)*Integer.parseInt(data(sc ,"Введите значение для " + key + ": "));
        }

        for (String key : values.keySet()) {

        if (values.get(key) > 1)             
            System.out.print(" " + values.get(key) + key + " *");
        else
            System.out.print(" " + key + " *");
        }
        System.out.print("\b= "+ result);        
        sc.close();
    }

    public static String data(Scanner sc ,String text) {
        
        System.out.println();
        System.out.print(text);
        String res =  sc.nextLine();
        
        return res;       
        
    }    
    
}