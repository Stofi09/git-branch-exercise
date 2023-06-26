public class Main {
    public static void main(String[] args) {
        greet("name");
    }
    public static void greet(String name){
        System.out.println("Hello" + name);
    }

    public void count(Integer i) {
        i = 25;
        System.out.println(i);
    }

    public void cheer(String name) {
        System.out.println(name);
    }
}

