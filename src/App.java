public class App {
    public static void main(String[] args) throws Exception {
    
        int[] fält1 ={8,4,6,3,9 };

        System.out.println(fält1[0]+" "+fält1[1]+" "+fält1[2]+" "+fält1[3]+" "+fält1[4] );

        System.out.println("fält1 har "+ fält1.length+" antal element (tal)");

        int summa = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        System.out.println("Storlek fält "+fält1.length); 
        System.out.println("medelvärdet är "+summa/5 );
    }
}
