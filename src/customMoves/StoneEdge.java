package customMoves;
import ru.ifmo.se.pokemon.*;
public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK,100, 80 );
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1){
        if (Math.random() <= 1/8){
            System.out.println("Критический урон от Stone Edge");
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    protected String describe(){
        return "Использует Stone Edge";
    }
}
