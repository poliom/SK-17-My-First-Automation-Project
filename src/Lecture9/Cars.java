package Lecture9;

public class Cars {
    public Cars(){
//        this.color = "Black";
//        this.transmission = "Auto";
//        this.isElectric = false;
        this("Black","Auto",false,"no brand", 1900, false);
    }
    public Cars(String color){
//        this.color = color;
//        this.transmission = "Auto";
//        this.isElectric = false;
        this(color,"Auto",false,"no brand", 1900, false);
    }


    public Cars(String color, String transmission){
//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = false;
        this(color,transmission,false,"no brand", 1900, false);
    }

    public Cars(String color, String transmission, boolean isElectric){
//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = isElectric;
        this(color,transmission,isElectric,"no brand", 1900, false);
    }

    public Cars(String color, String transmission, boolean isElectric, String brand){
//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = isElectric;
//        this.brand = brand;

        this(color,transmission,isElectric,brand, 1900, false);
    }

    public Cars(String color, String transmission, boolean isElectric, String brand, int year){
//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = isElectric;
//        this.brand = brand;
//        this.year = year;
        this(color,transmission,isElectric,brand, year, false);
    }

    public Cars(String color, String transmission, boolean isElectric, String brand, short year){
//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = isElectric;
//        this.brand = brand;
//        this.year = year;
        this(color,transmission, isElectric, brand, year, false);
    }

    public Cars(String color, String transmission, boolean isElectric, String brand, int year, boolean isEco){
        this.color = color;
        this.transmission = transmission;
        this.isElectric = isElectric;
        setBrand(brand);
        this.year = year;
        this.isEco = isEco;
        System.out.println("Object is defined with color: " + color);
    }

    private String brand;
    private int year;
    private String color;
    private String transmission;
    private boolean isElectric;

    public boolean isEco;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year=year;
    }

    public String getColor(){
        return this.color;
    }

    public String getTransmission(){
        return this.transmission;
    }

    public boolean getIsElectric(){
        return this.isElectric;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getYear(){
        return this.year;
    }
}
