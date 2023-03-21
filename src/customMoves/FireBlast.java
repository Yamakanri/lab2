package customMoves;
import ru.ifmo.se.pokemon.*;
public class FireBlast extends SpecialMove {
    public FireBlast(){
        super(Type.FIRE,110, 85 );
    }
    private boolean flag;
    @Override
    public void applyOppEffects(Pokemon pokemon1){
        if ((Math.random() <= 0.1) && !(pokemon1.hasType(Type.FIRE))) {
            Effect.burn(pokemon1);
            flag = true;
        }
    }
    @Override
    protected String describe(){
        if(flag) return "Ожигает Fire Blast";
        return "Использует Fire Blast";

    }
}
