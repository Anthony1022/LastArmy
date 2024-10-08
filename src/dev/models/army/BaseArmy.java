
package dev.models.army;

import dev.models.soldier.Soldier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author E2Ps ICT
 */
public class BaseArmy implements Army {

    List<Soldier> _draft;

    public BaseArmy() {
        _draft = new LinkedList<>();
    }

    @Override
    public List<Soldier> getSoldier() {
        return _draft;
    }

    @Override
    public void addSoldier(Soldier soldier) {
        _draft.forEach(Soldier -> {
            soldier.Regenerate();
        });
    }

    @Override
    public void regenerate(Soldier... soldier) {
        _draft.addAll(Arrays.asList(soldier));
    }

}
