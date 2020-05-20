public class Main {
    public static void main (String[] args) {

        BmiService service = new BmiService();
        int index = service.calculate(6200,164);

        System.out.println(index);
    }
}
