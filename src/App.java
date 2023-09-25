public class App {
    public static void main(String[] args) throws Exception {

        int[] fält1 = new int[5];
        fält1[0]=8;
        fält1[1]=4;
        fält1[2]=6;
        fält1[3]=3;
        fält1[4]=9;
        double medelvärdet1 = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4])/5;
      
        System.out.println("a)");
        System.out.print("Fält1's innehåll:");
        System.out.println("");
        System.out.println("element 1: "+fält1[0]);
        System.out.println("element 2: "+fält1[1]);
        System.out.println("element 3: "+fält1[2]);
        System.out.println("element 4: "+fält1[3]);
        System.out.println("element 5: "+fält1[4]);
        System.out.println("Antal element i fält1 är= "+ fält1.length);
        System.out.println("Medelvärdet för alla element i fält1 är= "+ medelvärdet1);

        int[] fält2 = new int[5];
        fält2[0]=18;
        fält2[1]=14;
        fält2[2]=16;
        fält2[3]=13;
        fält2[4]=19;
        int summan1 = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        int summan2 = fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        double medelvärdet2 = (fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4])/5;


        System.out.println("");
        System.out.println("b)");
        System.out.print("Fält2's innehåll:");
        System.out.println("");
        System.out.println("element 1: "+fält2[0]);
        System.out.println("element 2: "+fält2[1]);
        System.out.println("element 3: "+fält2[2]);
        System.out.println("element 4: "+fält2[3]);
        System.out.println("element 5: "+fält2[4]);
        System.out.println("Summan av fält1 är= "+summan1+" och fält2 är= "+ summan2);
        System.out.println("Medelvärdet för alla element i fält2 är= "+ medelvärdet2);

        System.out.println("");
        System.out.println("c)");
        System.out.println("");

    }
}
