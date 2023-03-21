import ru.ifmo.se.pokemon.*;
import customPokemons.*;
public class Poke {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Rayquaza p1 = new Rayquaza("Рейкваза",6);
        Drilbur p2 = new Drilbur("Дрилбур",6);
        Excadrill p3 = new Excadrill("Ескадрил",6);
        Oddish p4 = new Oddish("Оддиш",6);
        Gloom p5 = new Gloom("Глум",6);
        Bellossom p6 = new Bellossom("Белоссом",6);

        battle.addAlly(p5);
        battle.addAlly(p4);
        battle.addAlly(p3);
        battle.addFoe(p2);
        battle.addFoe(p1);
        battle.addFoe(p6);

        battle.go();
    }
}