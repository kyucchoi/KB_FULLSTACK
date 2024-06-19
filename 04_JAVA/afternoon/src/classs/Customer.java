package classs;

public class Customer {
    String name = "아직 몰라요";
    int age = 0;
    int total = 0;
    boolean blacklist = false;

    Customer() {
    }

    Customer(String name, int age, int total, boolean blacklist) {
        this.name = name;
        this.age = age;
        this.total = total;
        this.blacklist = blacklist;
    }

    void printCustomerInfo() {
        System.out.println("고객의 성함은??? : " + this.name);
        System.out.println("고객의 나이는??? : " + this.age);
        System.out.println("고객의 총 사용 금액은??? : " + this.total);
        System.out.println("고객의 블랙리스트 여부는??? : " + this.blacklist);
    }
}