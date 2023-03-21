package customMoves;
import ru.ifmo.se.pokemon.*;
public class Acid extends SpecialMove {
    public Acid(){

        super(Type.POISON,40, 100 );
    }
    private boolean flag;
    @Override
    public void applyOppEffects(Pokemon pokemon1){
        if (Math.random() <= 0.1){
            pokemon1.setMod(Stat.SPECIAL_DEFENSE, -1);;
            flag = true;
        }
    }
    @Override
    protected String describe(){
        if (flag) return "Специальная атака понижена";
        return "Использует Acid";
    }
}
