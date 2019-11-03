import objects.car;

public class Main {
    public static void main(String[] args){
        car tesla = new car();
        tesla.setAll("Tesla", "model S", 500, true);

        System.out.println(tesla.getAll());
    }
}
