class UcgenAlanHesap{
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        double s = (a + b + c) / 2;

        double alan = Math.sqrt(s  * (s-a) * (s-b) * (s-c));

        System.out.println("Alan : " + alan);
    }
}