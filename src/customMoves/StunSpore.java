package customMoves;
import ru.ifmo.se.pokemon.*;
public class StunSpore extends StatusMove {
    public StunSpore(){
        super(Type.GRASS,0, 75 );
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon1){
            Effect.paralyze(pokemon1);
        }
    @Override
    protected String describe(){

        return "Использует Stun Spore";
    }
}
