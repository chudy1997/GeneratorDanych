/**
 * Created by Karol on 2017-01-09.
 */
class Tabele {
    /*
    Uczestnicy Uczestnicy;
    Konferencje Konferencje;
    Dni_Konf Dni_Konf;
    Warsztaty Warsztaty;
    Klienci Klienci;
    Rezerwacje_Konferencji Rezerwacje_Konferencji;
    Oplaty Oplaty;
    Progi_Cenowe Progi_Cenowe;
    Rezerwacje_Dni Rezerwacje_Dni;
    Konferencja_Uczestnicy Konferencja_Uczestnicy;
    Rezerwacje_Warsztatow Rezerwacje_Warsztatow;
    Warsztaty_Uczestnicy Warsztaty_Uczestnicy;*/

    class Uczestnicy{
        int ID_Uczestnika;
        String Login;
        String Hasło;
        String Imie;
        String Nazwisko;
    }

    class Konferencje{
        int ID_Konferencji;
        String Nazwa;
        String Data_Rozpoczęcia;
        int Ilosc_Miejsc;
    }


    class Dni_Konf{
        int ID_Dnia;
        int ID_Konferencji;
        String Opis_Dnia;
        String Data;
    }

    class Warsztaty{
        int ID_Warsztatu;
        int ID_Dnia;
        String Opis;
        String Godzina_Rozpoczecia;
        String Godzina_Zakonczenia;
        String Miejsce;
        int Cena;
        int Ilosc_Miejsc;
    }

    class Klienci{
        int ID_Klienta;
        String Nazwa;
        String Nr_Telefonu;
        String Email;
        String Login;
        String Haslo;
        boolean Czy_Firma;
    }

    class Rezerwacje_Konferencji{
        int ID_Rezerwacji_Konferencji;
        int ID_Klienta;
        String Data_Rezerwacji;
        int Liczba_Studentow;
        int Liczba_Pozostalych;
        int Ile_Jeszcze_Do_Zaplacenia;
    }

    class Oplaty{
        int ID_Oplaty;
        int ID_Rezerwacji_Konferencji;
        int Oplaty_Konferencji;
        String Data;
    }

    class Progi_Cenowe{
        int ID_Progu;
        int ID_Konferencji;
        String Data_Rozpoczecia_Obowiazywania;
        int Cena;
    }

    class Rezerwacje_Dni{
        int ID_Rezerwacji_Dnia;
        int ID_Rezerwacji_Konferencji;
        int Liczba_Osob;
        int ID_Dnia;
    }

    class Konferencja_Uczestnicy{
        int ID_Listy_Konf_Uczestnik;
        int ID_Rezerwacji_Dnia;
        int ID_Uczestnika;
        String Numer_Legitymacji_Studenta;
    }

    class Rezerwacje_Warsztatow{
        int ID_Rezerwacji_Warsztatu;
        int ID_Rezerwacji_Dnia;
        int ID_Warsztatu;
        int Liczba_Osob;
    }

    class Warsztaty_Uczestnicy{
        int ID_Listy;
        int ID_Rezerwacji_Warsztatu;
        int ID_Listy_Konf_Uczestnik;
    }
}
