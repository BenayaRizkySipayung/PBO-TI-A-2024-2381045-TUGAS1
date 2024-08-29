public class KonversiNumber {
    public static void main(String[] args) {
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataByte;
        double tipeDataDouble =tipeDataFloat;

        int tipeDataInt2 = 128;
        byte tipeDataByte2 =(byte) tipeDataInt2;
        System.out.println(tipeDataByte2);
    }
}
