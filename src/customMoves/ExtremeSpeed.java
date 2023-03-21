package customMoves;
import ru.ifmo.se.pokemon.*;
public class ExtremeSpeed extends PhysicalMove {
    public ExtremeSpeed(){
        super(Type.NORMAL,80, 100 );
    }
    @Override
    protected String describe(){
        return "Использует Extreme Speed";
    }
}
