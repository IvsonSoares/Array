public class App {
    public static void main(String[] args) throws Exception {

    Array array = new Array(10);
    
    for(int i = 0; i < 9; i++){
        array.set(i, i);
    }

    System.out.println(array.contains(0));
    System.out.println(array.get(6));
    System.out.println(array.indexOf(8));
    System.out.println(array.size());
}
}
