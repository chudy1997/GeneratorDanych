import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Karol on 2017-01-09.
 */
public class Generator {
    public static void main(String[] args) {

        //Tabela Uczestnicy //6972

        String[] UczestnicyLoginy=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\UczestnicyLoginy");
        String[] UczestnicyHasla=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\UczestnicyHasla");
        String[] UczestnicyImiona=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\UczestnicyImiona");
        String[] UczestnicyNazwiska=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\UczestnicyNazwiska");

/*
        for(int i=0;i<6972;i++){
            if(i%1000==0)System.out.println("GO\nINSERT INTO Uczestnicy (ID_Uczestnika,Login,Hasło,Imie,Nazwisko) VALUES");
          if(i!=6971 && (i+1)%1000!=0)System.out.println('('+Integer.toString(i+1)+','+UczestnicyLoginy[i]+','+UczestnicyHasla[i]+','+UczestnicyImiona[i/581]+','+UczestnicyNazwiska[i%581]+"),");
          else System.out.println('('+Integer.toString(i+1)+','+UczestnicyLoginy[i]+','+UczestnicyHasla[i]+','+UczestnicyImiona[i/581]+','+UczestnicyNazwiska[i%581]+")");
        }
*/
        //Tabela Konferencje //72

        String[] KonferencjeNazwa=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\KonferencjeNazwa");
        String[] KonferencjeDataRozpoczęcia=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\KonferencjeDataRozpoczęcia");

        /*
        System.out.println("INSERT INTO Konferencje (ID_Konferencji,Nazwa,Data_Rozpoczęcia) VALUES");
        for(int i=0;i<72;i++){
            if(i!=71)System.out.println("("+Integer.toString(i+1)+","+KonferencjeNazwa[i]+","+KonferencjeDataRozpoczęcia[i]+"),");
            else System.out.println("("+Integer.toString(i+1)+","+KonferencjeNazwa[i]+","+KonferencjeDataRozpoczęcia[i]+")");
        }
        */

        //Tabela Dni_Konf//179

        String[] DniKonfIDDnia=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\DniKonfIDDnia");
        String[] DniKonfIDKonferencji=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\DniKonfIDKonferencji");
        String[] DniKonfOpisDnia;
        String[] DniKonfData=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\DniKonfData");
        String[] DniKonfIloscMiejsc=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\DniKonfIloscMiejsc");

        /*
        System.out.println("INSERT INTO Dni_Konf (ID_Dnia,ID_Konferencji,Opis_Dnia,Data,Ilosc_Miejsc) VALUES");
        for(int i=0;i<179;i++){
            if(i!=178)System.out.println('('+DniKonfIDDnia[i]+','+"(Select ID_Konferencji From Konferencje Where ID_Konferencji="+DniKonfIDKonferencji[i]+"),NULL,"+DniKonfData[i]+','+DniKonfIloscMiejsc[i]+"),");
            else System.out.println('('+DniKonfIDDnia[i]+','+"(Select ID_Konferencji From Konferencje Where ID_Konferencji="+DniKonfIDKonferencji[i]+"),NULL,"+DniKonfData[i]+','+DniKonfIloscMiejsc[i]+')');
        }
        */


        //Tabela Warsztaty
        String[] WarsztatyIDWarsztatu=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\WarsztatyIDWarsztatu");
        String[] WarsztatyIDDnia=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\WarsztatyIDDnia");
        String[] WarsztatyOpis;
        String[] WarsztatyGodzinaRozpoczecia=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\WarsztatyGodzinaRozpoczecia");
        String[] WarsztatyGodzinaZakonczenia=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\WarsztatyGodzinaZakonczenia");
        String[] WarsztatyMiejsce=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\WarsztatyMiejsce");
        String[] WarsztatyIloscMiejsc=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\WarsztatyIloscMiejsc");
        String[] WarsztatyCena=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\WarsztatyCena");

        /*
        System.out.println("INSERT INTO Warsztaty (ID_Warsztatu,ID_Dnia,Opis,Godzina_Rozpoczecia,Godzina_Zakonczenia,Miejsce,Ilosc_Miejsc,Cena) VALUES");
        for(int i=0;i<1390;i++) {
            if(i==1000) System.out.println("Go\nINSERT INTO Warsztaty (ID_Warsztatu,ID_Dnia,Opis,Godzina_Rozpoczecia,Godzina_Zakonczenia,Miejsce,Ilosc_Miejsc,Cena) VALUES");

            System.out.print('(' + WarsztatyIDWarsztatu[i] + ',' + "(Select ID_Dnia From Dni_Konf Where ID_Dnia="+WarsztatyIDDnia[i] +
                    "),NULL," + WarsztatyGodzinaRozpoczecia[i] + ',' + WarsztatyGodzinaZakonczenia[i] + ',' + WarsztatyMiejsce[i] +
                    ',' + WarsztatyIloscMiejsc[i] + ',' + WarsztatyCena[i] + ")"+(i==1389 || i==999 ? '\n' : ",\n"));
        }
        */

        //Tabela Klienci //130

        String[] KlienciNazwa=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\KlienciNazwa");
        String[] KlienciNrTelefonu=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\KlienciNrTelefonu");
        String[] KlienciEmail=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\KlienciEmail");
        String[] KlienciLogin=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\KlienciLogin");
        String[] KlienciHaslo=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\KlienciHaslo");

        /*
        System.out.println("INSERT INTO Klienci (ID_Klienta,Nazwa,Nr_Telefonu,Email,Login,Haslo,Czy_Firma) VALUES");
        for(int i=0;i<130;i++) {
            System.out.print('(' +Integer.toString(i+1)+','+KlienciNazwa[i]+','+KlienciNrTelefonu[i]+','+KlienciEmail[i]+','+
                    KlienciLogin[i]+','+KlienciHaslo[i]+','+((i+1)%10==0 ? Integer.toString(0) : Integer.toString(1))+ ")"+(i==129  ? '\n' : ",\n"));
        }
        */

        //Tabela Rezerwacje_Konferencji

        String[] RezerwacjeKonferencjiIDKlienta=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\RezerwacjeKonferencjiIDKlienta");
        String[] RezerwacjeKonferencjiDataRezerwacji=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\RezerwacjeKonferencjiDataRezerwacji");
        String[] RezerwacjeKonferencjiLiczbaStudentow=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\RezerwacjeKonferencjiLiczbaStudentow");
        String[] RezerwacjeKonferencjiLiczbaPozostalych=decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\RezerwacjeKonferencjiLiczbaPozostalych");
        String[] RezerwacjeKonferencjiIleJeszczeDoZaplacenia;

        //Tworzenie tablicy Rezerwacje_Konferencji
        /*
        System.out.println("INSERT INTO Rezerwacje_Konferencji (ID_Rezerwacji_Konferencji,ID_Klienta,Data_Rezerwacji,Liczba_Studentow," +
                "Liczba_Pozostalych,Ile_Jeszcze_Do_Zaplacenia) VALUES");
        for(int i=0,k=0;i<72;i++)
            for(int j=0;j<liczbaZarezerwowanychMiejsc[i];j++,k++) {
                if(k==1000) System.out.println("Go\nINSERT INTO Warsztaty (ID_Warsztatu,ID_Dnia,Opis,Godzina_Rozpoczecia,Godzina_Zakonczenia,Miejsce,Ilosc_Miejsc,Cena) VALUES");


                System.out.println('(' + Integer.toString(k + 1) + ',' + RezerwacjeKonferencjiIDKlienta[k] + ',' + RezerwacjeKonferencjiDataRezerwacji[k] +
                        ',' + RezerwacjeKonferencjiLiczbaStudentow[k] + ',' + RezerwacjeKonferencjiLiczbaPozostalych[k] + ',' + Integer.toString(0) + (k==999 ? ')' :"),"));
            }
*/

/*
        String[] nazwy = decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\aaaaaa");

        for(int i=870;i<1000;i++)
            System.out.print("\"'"+nazwy[i-870]+Integer.toString(i)+"\"',");
            //System.out.print("\"'"+"0048876543"+Integer.toString(i)+"'\",");

        String[] nazwy = decoder("C:\\Users\\Karol\\IdeaProjects\\GeneratorDanych\\src\\TextFiles\\aaaaaa");
        for (String s:nazwy)
            System.out.print("\"'"+s+"@coolmail.pl'\",");


        String s1="",s2="";
        for(int i=0;i<1390;i++){
            String[] s=HourGenerator.generateStartAndEndHours();
            s1+=s[0]+',';
            s2+=s[1]+',';
            if(s[0].compareTo(s[1])==1)break;
        }
        System.out.println(s1+'\n'+s2);*/
/*
        String[] s=new String[]{"Kraków,AGH,U2","Kraków,UJ,Aud. Max.","Kraków,Tauron Arena","Kraków,ICE"};
        Random random=new Random();
        for(int i=1;i<=1390;i++)System.out.print("\"'"+s[random.nextInt(4)]+"'\",");
        Random random=new Random();
        for(int i=1;i<=179;i++)System.out.print('"'+Integer.toString(10*random.nextInt(20)+100)+"\",");
System.out.println();
        for(int i=1;i<=1390;i++)System.out.print('"'+Integer.toString(random.nextInt(3)*5+15)+"\",");

        for(int i=1;i<=1390;i++)System.out.print('"'+Integer.toString(i%3==0 ? 0 : 5*(new Random()).nextInt(5))+"\",");
        */



    //Tabela Oplaty
    /*
    CREATE TABLE [dbo].[Oplaty](
    [ID_Oplaty] [int] PRIMARY KEY IDENTITY(1,1) NOT NULL,
    [ID_Rezerwacji_Konferencji] [int] NOT NULL
 FOREIGN KEY REFERENCES Rezerwacje_Konferencji(ID_Rezerwacji_Konferencji),
    [Oplaty_Konferencji] [money] NOT NULL CHECK(Oplaty_Konferencji>0),
   [Data] [date] NOT NULL,
)*/
    int rk = RezerwacjeKonferencjiIDKlienta.length;

    System.out.println(Integer.toString(RezerwacjeKonferencjiDataRezerwacji.length)+' '+Integer.toString(RezerwacjeKonferencjiIDKlienta.length)+' '+Integer.toString(RezerwacjeKonferencjiLiczbaPozostalych.length)+' '+Integer.toString(RezerwacjeKonferencjiLiczbaStudentow.length));

    int[] ileJeszczeDoZaplacenia=new int[rk];

    for(int i=0;i<rk;i++)ileJeszczeDoZaplacenia[i]=100;

    Random random = new Random();

    int ileOplatDlaRezerwacji[] = new int [rk];
    LinkedList<Integer> listaOpłacanychRezerwacji = new LinkedList<>();
    LinkedList<Integer> listaKwot = new LinkedList<>();

    for(int i=0;i<rk;i++)
        ileOplatDlaRezerwacji[i]=random.nextInt(3)+1;

    for(int i=0;i<rk;i++){
        int k = ileJeszczeDoZaplacenia[i];
        int l = k / ileOplatDlaRezerwacji[i];
        for(int j=0;j<ileOplatDlaRezerwacji[i];j++) {
            int indeks = Math.max(listaOpłacanychRezerwacji.size() - 1 - random.nextInt(2), 0);
            listaOpłacanychRezerwacji.add(indeks, i + 1);
            if(j!=ileOplatDlaRezerwacji[i]-1) listaKwot.add(indeks,l);
            else listaKwot.add(indeks,k-l*(ileOplatDlaRezerwacji[i]-1));
            ileJeszczeDoZaplacenia[i]-=listaKwot.get(indeks);
        }
    }

    System.out.println();

    for (Integer i:listaOpłacanychRezerwacji) {
        System.out.print('"'+Integer.toString(i)+"\",");
    }

    System.out.println();

    for(Integer i:listaKwot){
        System.out.print('"'+Integer.toString(i)+"\",");
    }

    System.out.println();

    //daty

    for(int i=0;i<rk;i++){
        for(int j=0;j<ileOplatDlaRezerwacji[i];j++){
            System.out.print('"'+DateGenerator.addDaystoDate(RezerwacjeKonferencjiDataRezerwacji[i],random.nextInt(9))+"\",");
        }
    }



}



    static String[] decoder (String pathname) {
        String content = "";
        try {
            content = new Scanner(new File(pathname)).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {}

        int j = 0;
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) == '"') j++;
        }
        String[] res = new String[j / 2];
        j = 0;
        String par;
        for (int i = 0; i < content.length(); i++) {
            par = "";
            if (content.charAt(i++) == '"')
                while (content.charAt(i) != '"') par += content.charAt(i++);
            i++;
            res[j++] = par;

        }
        return res;
    }








}


/*
        //losowanie klientow do konferencji

        boolean[] czyKlientUzyty = new boolean[130];
        boolean[] czyKlientUzytyWDanejKonferencji= new boolean[130];
        int[][] tablicaKlientowNaKonferencjach= new int[72][];
        for(int i=0;i<130;i++)czyKlientUzyty[i]=false;
        Random random = new Random();
        int[] liczbaZarezerwowanychMiejsc = new int[72];
        for(int i=0;i<71;i++)liczbaZarezerwowanychMiejsc[i]=random.nextInt(10)+11;
        for(int i=0;i<72;i++){
            for(int j=0;j<130;j++)czyKlientUzytyWDanejKonferencji[j]=false;
            int k=0;
            if(i==71){
                for(int j=0;j<130;j++)if(!czyKlientUzyty[j])k++;
                liczbaZarezerwowanychMiejsc[71]=Math.max(k,10);
            }
            tablicaKlientowNaKonferencjach[i]=new int[liczbaZarezerwowanychMiejsc[i]];
            int j=0;
            if(i==71)
                for(;j<k;j++){
                    int l=0;
                    while(czyKlientUzyty[l])l++;
                    czyKlientUzyty[l]=true;
                    tablicaKlientowNaKonferencjach[i][j]=l+1;
                }
            for(;j<liczbaZarezerwowanychMiejsc[i];){
                int c = random.nextInt(130);
                if(!czyKlientUzytyWDanejKonferencji[c]){
                    czyKlientUzyty[c]=true;
                    czyKlientUzytyWDanejKonferencji[c]=true;
                    tablicaKlientowNaKonferencjach[i][j]=c+1;
                    j++;
                }
            }
        }
        for(int i=0;i<72;i++)
            for (int j = 0; j < liczbaZarezerwowanychMiejsc[i]; j++)System.out.print('"'+Integer.toString(tablicaKlientowNaKonferencjach[i][j])+"\",");

        System.out.println();

        //losowanie dat rezerwacji

        for(int i=0;i<72;i++){
            for(int j=0;j<liczbaZarezerwowanychMiejsc[i];j++)
                System.out.print('"'+DateGenerator.genereteMSSQLDateBefore(KonferencjeDataRozpoczęcia[i])+"\",");
        }

        //losowanie liczby wszystkich uczestnikow zglaszanych

        int[] liczbaUczestnikowKonferencji = new int[72];
        int[][] liczbaUczestnikowKonferencjiKazdegoKlienta = new int[72][];
        for(int i=0;i<72;i++)liczbaUczestnikowKonferencjiKazdegoKlienta[i]=new int[liczbaZarezerwowanychMiejsc[i]];

        for(int i=0;i<72;i++)liczbaUczestnikowKonferencji[i]=150+random.nextInt(10)*10;
        int[] liczbaUczestnikowKonferencjiCopy = Arrays.copyOf(liczbaUczestnikowKonferencji,liczbaUczestnikowKonferencji.length);

        //for(int i=0;i<72;i++)System.out.println(Integer.toString(liczbaUczestnikowKonferencjiCopy[i])+' '+Integer.toString(liczbaZarezerwowanychMiejsc[i])+' '+Integer.toString(liczbaUczestnikowKonferencjiCopy[i]/liczbaZarezerwowanychMiejsc[i]));

        for(int i=0;i<72;i++)
            for(int j=0;j<liczbaZarezerwowanychMiejsc[i];j++){
                if(j==liczbaZarezerwowanychMiejsc[i]-1)liczbaUczestnikowKonferencjiKazdegoKlienta[i][j]=liczbaUczestnikowKonferencji[i];
                else if(liczbaUczestnikowKonferencji[i]<50)liczbaUczestnikowKonferencjiKazdegoKlienta[i][j]=liczbaUczestnikowKonferencji[i]/(liczbaZarezerwowanychMiejsc[i]-j)+random.nextInt(2);
                else liczbaUczestnikowKonferencjiKazdegoKlienta[i][j]=liczbaUczestnikowKonferencjiCopy[i]/liczbaZarezerwowanychMiejsc[i]-5+random.nextInt(20);
                liczbaUczestnikowKonferencji[i]-=liczbaUczestnikowKonferencjiKazdegoKlienta[i][j];
            }
            System.out.println();

        int[][] liczbaStudentow = new int [72][];
        int[][] liczbaPozostalych = new int[72][];

        for(int i=0;i<72;i++) {
            liczbaPozostalych[i]= new int[liczbaZarezerwowanychMiejsc[i]];
            liczbaStudentow[i]= new int[liczbaZarezerwowanychMiejsc[i]];
            for (int j = 0; j < liczbaZarezerwowanychMiejsc[i]; j++) {
                liczbaPozostalych[i][j] = liczbaUczestnikowKonferencjiKazdegoKlienta[i][j] -
                        random.nextInt(liczbaUczestnikowKonferencjiKazdegoKlienta[i][j]+1);
                liczbaStudentow[i][j] = liczbaUczestnikowKonferencjiKazdegoKlienta[i][j] - liczbaPozostalych[i][j];
            }
        }

        System.out.println();

        for(int i=0;i<72;i++)
            for(int j=0;j<liczbaZarezerwowanychMiejsc[i];j++)
                System.out.print('"'+Integer.toString(liczbaUczestnikowKonferencjiKazdegoKlienta[i][j])+"\",");

        System.out.println();

        for(int i=0;i<72;i++)
            for(int j=0;j<liczbaZarezerwowanychMiejsc[i];j++)
                System.out.print('"'+Integer.toString(liczbaPozostalych[i][j])+"\",");

        System.out.println();

        for(int i=0;i<72;i++)
            for(int j=0;j<liczbaZarezerwowanychMiejsc[i];j++)
                System.out.print('"'+Integer.toString(liczbaStudentow[i][j])+"\",");

        System.out.println();


 */