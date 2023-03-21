package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;

public class Oddish extends Pokemon {
    public Oddish (String name, int level){
        super(name, level);
        setStats (45, 50, 55, 75, 65, 30);
        this.setType(Type.GRASS, Type.POISON);

        addMove(new Confide());
        addMove(new Swagger());
    }
}
