class faktoriyel{
    public static void main(String[] args) {
        int sayi = 6;
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println(sonuc);
    }
}