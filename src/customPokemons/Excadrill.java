package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;

public class Excadrill extends Drilbur {
    public Excadrill (String name, int level){
        super(name, level);
        setStats (110, 135, 60, 50, 65, 88);
        this.setType(Type.GROUND, Type.STEEL);

        addMove(new BrutalSwing());
    }
}
