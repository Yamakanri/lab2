package customMoves;
import ru.ifmo.se.pokemon.*;
public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK,75, 90 );
    }
    private boolean flag;
    @Override
    public void applyOppEffects(Pokemon pokemon1){
        if (Math.random() <= 0.3){
            Effect.flinch(pokemon1);
            flag = true;
        }
    }
    @Override
    protected String describe(){
        if (flag) return "Противник дрогнул от Rock Slide";
        return "Использует Rock Slide";
    }
}
