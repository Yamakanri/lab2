package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;

public class Rayquaza extends Pokemon {
    public Rayquaza (String ghsd, int level){
        super(ghsd, 2);
        setStats (105, 150, 90, 150, 90, 95 );
        this.setType(Type.DRAGON, Type.FLYING);

        addMove(new DragonClaw());
        addMove(new FireBlast());
        addMove(new StoneEdge());
        addMove(new ExtremeSpeed());
    }
}
