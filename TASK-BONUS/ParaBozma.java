class ParaBozma{
    public static void main(String[] args) {
        int para = 354;
        int yuzluk = para / 100;
        para = para - (100 * yuzluk);
        int ellilik = para / 50;
        para = para - (50 * ellilik);
        int yirmilik = para / 20;
        para = para - (20 * yirmilik);
        int onluk = para / 10;
        para = para - (10 * onluk);
        int beslik = para / 5;
        para = para - (beslik * 5);

        System.out.println("100x" + yuzluk + " 50x" + ellilik + " 20x" + yirmilik + " 10x" + onluk + " 5x" + beslik + " 1x" + para);
    }
}