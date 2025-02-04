package Lecture13;

import javax.swing.text.html.parser.Parser;
import java.text.DateFormat;

public class Person {

    public Person(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence){
        validateEGN(EGN);
        this.EGN = EGN;
        this.name = name;
        validateSex(sex);
        this.sex = sex;
        this.religion =religion;
        this.languageSpoken = languageSpoken;
        this.nationality = nationality;
        this.dateOfBirth = getDateOfBirth(EGN);
        this.age = getAge(EGN);
        this.job = job;
        this.countryOfresidence = countryOfresidence;
    }
    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private String job;
    private final String nationality;
    private final String EGN;
    private final String dateOfBirth;
    private final int age;
    private String countryOfresidence;
    private String getDateOfBirth(String EGN){
        return EGN.substring(0,6);
    }
    private int getAge(String EGN){
        String ageEGNString = EGN.substring(0,2);
        int ageEGNInt = Integer.parseInt("19"+ageEGNString);
        int currentYear = 2025;
        return currentYear - ageEGNInt;
    }

    private void validateEGN(String EGN){
        if (EGN == null || EGN.length() != 10){
            throw new IllegalArgumentException("Number of digits in EGN is not 10");
        }

        boolean areADigits = true;
        for (int i =0; i<EGN.length(); i++){
            String symbol = EGN.substring(i,i+1);
            try {
            int number = Integer.parseInt(symbol);
            }catch (NumberFormatException exception){
                areADigits = false;
            }
        }
        if (!areADigits){
            throw new IllegalArgumentException("Entered EGN is not only digits, here is the entered EGN: " + EGN);
        }
    }
    private void validateSex(String sex){
        if (!("male".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex))){
            System.out.println("The sex is wrong, please use only 'male' or 'female', your entry is: " + sex);
            System.out.println("System continue");
        }
    }

    public void setCountryOfresidence(String countryOfresidence) {
        this.countryOfresidence = countryOfresidence;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCountryOfresidence() {
        return countryOfresidence;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getLanguageSpoken() {
        return languageSpoken;
    }

    public String getEGN() {
        return EGN;
    }

    public String getReligion() {
        return religion;
    }

    public String getNationality() {
        return nationality;
    }
    public void sayHello(){
        switch (this.languageSpoken.toLowerCase()){
            case "bulgarian":
                System.out.println("Здравей");
                break;
            case "italian":
                System.out.println("Chao");
                break;
            case "english":
            default:
                System.out.println("Hello");
        }
    }
    public void celebrateEaster(){
        switch (this.religion.toLowerCase()){
            case "orthodox":
            case "catholic":
                System.out.println(this.name + " is celebrating Easter");
                break;
            default:
                System.out.println(this.name + " is NOT celebrating Easter");
        }
    }
    public void isAdult(){
        switch (this.countryOfresidence.toLowerCase()){
            case "bulgaria":
            case "italy":
                printAdult(18);
                break;
            case "usa":
                printAdult(21);
                break;
            default:
                System.out.println("We don`t know if " + this.name + " is adult in: " + this.countryOfresidence);
        }
    }
    private void printAdult(int age){
        if (this.age >= age){
            System.out.println(this.name + " is adult");
        }
        else {
            System.out.println(this.name + " is not adult");
        }
    }
    public boolean canTakeLoan(){
        return job !=null && !job.isEmpty();
    }
}
