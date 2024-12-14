package app_02_variables;

public class Variables {
    public static void main(String[] args) {
        int a = 5;
        a /= 2;
        a *= 2;
        a -= 1;
        a %= 2;
        a += 5;
        a++;
        a--;
        var systemVariables = System.getProperties(); //add to VMOptions -Dtest=test, add properties to arg1, arg2
        System.out.println(a / (double) 4); // (double) - явное привдение операнда к double
    }
}
