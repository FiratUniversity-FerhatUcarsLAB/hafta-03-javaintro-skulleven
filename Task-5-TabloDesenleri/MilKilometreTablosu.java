class MilKilometreTablosu{
    static double milesToKilometers(double miles){
        return miles * 1.609;
    }
    public static void main(String[] args) {
        System.out.println("Mil         Kilometre   ");
        System.out.println("========================");
        System.out.println("1           " + milesToKilometers(1));
        System.out.println("5           " + milesToKilometers(5));
        System.out.println("10          " + milesToKilometers(10));
        System.out.println("20          " + milesToKilometers(20));
        System.out.println("50          " + milesToKilometers(50));
    }
}