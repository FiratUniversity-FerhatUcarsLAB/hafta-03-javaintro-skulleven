class SaatDonusturme{
    public static void main(String[] args) {
        int sure = 4865;
        int saat = sure / 3600;
        int dakika = sure / 60;
        if(dakika >= 60){
            dakika -= 60;
        }
        int saniye = sure % 10;

        if(dakika < 10 && saniye < 10){
            System.out.println(saat + ":0" + dakika + ":0" + saniye);
        }
        if(dakika >= 10 && saniye < 10){
            System.out.println(saat + ":" + dakika + ":0" + saniye);
        }
        if(dakika >= 10 && saniye >= 10){
            System.out.println(saat + ":" + dakika + ":" + saniye);
        }

    }
}