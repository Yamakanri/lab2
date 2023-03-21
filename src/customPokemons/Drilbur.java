package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;

public class Drilbur extends Pokemon {
    public Drilbur (String name, int level){
        super(name, level);
        setStats (60, 85, 40, 30, 45, 68 );
        setType(Type.GROUND);

        addMove(new Confide());
        addMove(new MudSlap());
        addMove(new RockSlide());
    }
}
