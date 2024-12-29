package customMoves;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon1) {
        pokemon1.setMod(Stat.SPECIAL_ATTACK, -1);
    }
        @Override
        protected String describe(){
            return "Доверяет секрет с помощью Confide... Cпециальная атака понижена";

        }
    }
