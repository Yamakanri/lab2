package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;

public class Bellossom extends Gloom {
    public Bellossom (String name, int level){
        super(name, level);
        setStats (75, 80, 95, 90, 100, 50);
        this.setType(Type.GRASS);


        addMove(new StunSpore());
    }
}
