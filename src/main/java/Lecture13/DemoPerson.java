package Lecture13;

public class DemoPerson {
    public static void main(String[] args) {
        Person Dido = new Person(
                "0510278086",
                "male",
                "Dido",
                "Hindo",
                "German",
                "IT",
                "Bulgarian",
                "Bulgaria");

        System.out.println("Print date of birth: " + Dido.getDateOfBirth());
        Dido.sayHello();
        Dido.celebrateEaster();
        Dido.isAdult();
        System.out.println("Can " + Dido.getName() + " take a loan: " + Dido.canTakeLoan());
        American american = new American("Jhon","male","Catholic","QA","9305264585","America");
    }
}
