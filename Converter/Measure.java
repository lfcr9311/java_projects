package Converter;

public class Measure {
    public static double meters;
    public static double feet;
    public static double nauticMile;
    public static double streetMile;
    public static double yards;

    


    public static double getMeters() {
        return meters;
    }
    
    public static double getFeet() {
        return feet;
    }

    public static double getNauticMile() {
        return nauticMile;
    }

    public static double getStreetMile() {
        return streetMile;
    }


    public static double getYards() {
        return yards;
    }

    public static double metersToNM(double meters){

        nauticMile = meters * 1.852;

        

    return nauticMile;
    }


    

    public static void main(String[] args) {
    
    
    }

}