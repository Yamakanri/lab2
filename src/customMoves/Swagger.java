package customMoves;
import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    public void applyOppEffects(Pokemon pokemon1) {
        pokemon1.setMod(Stat.ATTACK, +2);
        Effect.confuse(pokemon1);
    }
    @Override
    protected String describe(){
        return "Использует Swagger. Атака повышена на две еденицы, но покемон сбит с толку";
    }
}
