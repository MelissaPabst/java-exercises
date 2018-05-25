package exercises;

public class BankRobbery {
    public static void main(String... args) {
        Bank bank = new Bank("Not a safe place", "Secret");
        bank.setName(null);

        Hacker secretAgentPerson = new Hacker();

        System.out.println("Our total money before is: " + secretAgentPerson.getTotalMoney());

        secretAgentPerson.stealMoneyFromBank(bank);

        System.out.println("Our total money after is: " + secretAgentPerson.getTotalMoney());

//        System.out.println("Name length: " + bank.getNameLength());
    }
}

class Bank {
    private static int idCounter = 10;
    private final int id;
    private String name;
    private String location;

    public int getNameLength() {
        return getName().length();
    }

    private int money = 1000000;

    public Bank() {
        name = "Bank of Bob";
        location = "STL";
        id = idCounter;
        idCounter += 1;

    }

    public Bank(String aName) {
        this();
        name = aName;
    }

    public Bank(String aName, String aLocation) {
        this(aName);
        location = aLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        if (aName != null) {
            name = aName;
        }
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }
}

class Hacker {
    private int totalMoney = 5;

    public void stealMoneyFromBank(Bank targetBank) {
//        totalMoney += targetBank.getMoney();

        targetBank.setName("Stolen from");

    }

    public int getTotalMoney() {
        return totalMoney;
    }
}

