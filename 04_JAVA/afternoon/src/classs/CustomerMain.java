package classs;

public class CustomerMain {
    public static void main(String[] args) {
//        Customer customer1 = new Customer();

//        customer1.name = "최규찬";
//        customer1.age = 29;
//        customer1.total = 10000000;
//        customer1.blacklist = true;
//
//        System.out.println("고객의 이름은?? : " + customer1.name);
//        System.out.println("고객의 나이는?? : " + customer1.age);
//        System.out.println("고객이 총 사용한 금액은?? : " + customer1.total);
//        System.out.println("고객은 블랙리스트인가요?? : " + customer1.blacklist);

        Customer customer1 = new Customer("최규찬", 29, 10000, true);
        customer1.printCustomerInfo();

        Customer customer2 = new Customer();
        customer2.printCustomerInfo();
    }
}
