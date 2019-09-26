public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Adress adres1 = new Adress();
        Adress adres2 = new Adress();
        Adress registrationAdress2 = new Adress();

        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90011815940";

        adres1.city = "Warszawa";
        adres1.flatNumber = 3;
        adres1.houseNumber = 72;
        adres1.postCode = "41-200";
        adres1.street= "Nowa";

        person1.adres = adres1;
        person1.registrationAdress = adres1;

        person2.firstName = "Andrzej";
        person2.lastName = "Rok";
        person2.pesel = "90011815933";

        adres2.city = "Zebrzydowice";
        adres2.flatNumber = 4;
        adres2.houseNumber = 73;
        adres2.postCode = "41-577";
        adres2.street= "Stara";

        registrationAdress2.city = "Wioska";
        registrationAdress2.flatNumber = 5;
        registrationAdress2.houseNumber = 65;
        registrationAdress2.postCode = "44-444";
        registrationAdress2.street = "Wiosenna";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 15_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturn = 0;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.cashBorrowed = 20_000;
        credit2.cashReturn = 0;
        credit2.interestRate = 0.10;
        credit2.termMonths = 12;

        System.out.println("Osoba");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("Posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println("Osoba");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("Posiada konto bankowe z kwotą: " + account2.balance);
        System.out.println("oraz kredyt na kwotę: " + credit2.cashBorrowed);
    }
}
