package customMoves;
import ru.ifmo.se.pokemon.*;
public class DragonClaw extends PhysicalMove {
    public DragonClaw(){
        super(Type.DRAGON,80, 100 );
    }
    @Override
    protected String describe(){
        return "Использует Dragon Claw";
    }
}
