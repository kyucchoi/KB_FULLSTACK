package exception.check;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.callException();
            client.callRandException();
        } catch (MyCheckException e) {
            e.printStackTrace();
        } catch (MyCheckException2 e) {
            e.printStackTrace();
        }

        System.out.println("막았는가?");
    }
}
