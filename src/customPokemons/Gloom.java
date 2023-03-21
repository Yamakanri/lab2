package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;

public class Gloom extends Oddish {
    public Gloom (String name, int level){
        super(name, level);
        setStats (60, 65, 70, 85, 75, 40);
        this.setType(Type.GRASS, Type.POISON);
        addMove(new Acid());
    }
}
