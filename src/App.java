public class App {
    public static void main(String[] args) throws Exception {
    
        int[] fält1 ={8,4,6,3,9 };

        System.out.println(fält1[0]+" "+fält1[1]+" "+fält1[2]+" "+fält1[3]+" "+fält1[4] );

        System.out.println("fält1 har "+ fält1.length+" antal element (tal)");

        int summa1 = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        System.out.println("Storlek fält "+fält1.length); 
        System.out.println("medelvärdet är "+summa1/5 );
        System.out.println("medelvärdet är "+(double)summa1/5 );

        int[] fält2 ={18,14,16,13,19};

        int summa2 = fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        int summan = summa1+summa2;
        System.out.println( "summan av fält1 + fält2 är "+summan);
        System.out.println("medelvärdet är "+ (double)summa2/fält2.length);
    }
}
