package SortierAlgo;

public class SortAlgo {
    public static void main(String[] args) {
        int [][] LkwBeladenNr= new int[10][2];
        int[][] ladeListe = {
                {800,0,25562},
                {700,0,23322},
                {500,0,43344},
                {900,0,45665},
                {400,0,67688},
                {100,0,32345},
                {300,0,45599},
                {600,0,44846},
                {200,0,66999},
                {800,0,66213},
                {400,0,35562},
                {700,0,53322},
                {500,0,63344},
                {900,0,23665},
                {400,0,47688},
                {100,0,82345},
                {300,0,95599},
                {600,0,14846},
                {200,0,26999},
                {800,0,36213},
                {800,0,79562},
                {700,0,27322},
                {500,0,45344},
                {900,0,48665},
                {400,0,61688},
                {100,0,34345},
                {300,0,47599},
                {600,0,41846},
                {200,0,63999},
                {800,0,62213},
                {400,0,37562},
                {700,0,52322},
                {500,0,69344},
                {900,0,27665},
                {400,0,43688},
                {100,0,88345},
                {300,0,93599},
                {600,0,18846},
                {200,0,23999},
                {800,0,79213}
        };


        int verladungKG = 0;
        int paletteKg = 0;
        int zulaessigeGesamtGewicht = 7500;
        int maxPaletten = 14;
        int LkwNr = 0;
        int LkwAnzahl = 10;
        int counterPaletten =0;
        int TestKgMessung = 0;

        for(int i = 0; i < LkwAnzahl; i++){
            LkwNr++;
            for (int j = 0; j<ladeListe.length;j++){

                paletteKg = ladeListe[j][0];
                zulaessigeGesamtGewicht -= paletteKg ;
                counterPaletten ++;

                if (zulaessigeGesamtGewicht>0 && ladeListe[j][1] == 0 && maxPaletten >= counterPaletten){

                    verladungKG+= ladeListe[j][0];
                    ladeListe[j][1]= LkwNr;
                    ///Kontroll Array
                    LkwBeladenNr[i][0]= verladungKG;
                    LkwBeladenNr[i][1]= LkwNr;

                }else {
                    counterPaletten --;
                    zulaessigeGesamtGewicht += paletteKg ;
                }
            }
            if(counterPaletten!=0){
                System.out.println("Paletten Anzahl: "+counterPaletten+"/  Beladung in Kg: "+LkwBeladenNr[i][0]+ "/  LKW Nr:  "+LkwBeladenNr[i][1]);
            }

            counterPaletten = 0;
            zulaessigeGesamtGewicht = 7500;
            verladungKG = 0;
        }

        for(int i = 0; i <ladeListe.length;i++){
            TestKgMessung+= ladeListe[i][0];
        }

        System.out.println("Gesamt gewicht: "+TestKgMessung+"Kg");
    }
}
