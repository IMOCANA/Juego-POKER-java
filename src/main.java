
import pokerjava.clases.Baraja;
import pokerjava.clases.Jugador;
import pokerjava.clases.Mano;



public class main {
    public static void main(String[] args) {

        
        Poker poker = new Poker(new Baraja(), new Jugador("Isamar", new Mano(), 0) {});
        poker.jugar();
        
        
        
        
    }
     
}