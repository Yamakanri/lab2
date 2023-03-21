package customMoves;
import ru.ifmo.se.pokemon.*;
public class MudSlap extends StatusMove {
    public MudSlap() {
        super(Type.GROUND, 20, 100);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon1) {
        pokemon1.setMod(Stat.ACCURACY, -1);
    }
    @Override
    protected String describe(){
        return "Использует Mud-Slap. Точность понижена ";

    }
}
