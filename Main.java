public class Main {
    public static void main(String[] args) {
        Dzialanie pierwsze = new Dzialanie(1, 1);
        Dzialanie drugie = new Dzialanie(1,2);
        Dzialanie trzecie = new Dzialanie(1,3);
        Dzialanie czwarte = new Dzialanie(4,2);

        pierwsze.Dodawanie();
        drugie.Mnozenie();
        trzecie.Odejmowanie();
        czwarte.Dzielenie();
    }

}

