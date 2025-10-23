class VucutKitleIndeksi{
    public static void main(String[] args) {
        int boy = 180;
        int kilo = 62;

        double bmi = kilo / Math.pow(boy, 2);
        System.out.println("BMI = " + bmi);
    }
}