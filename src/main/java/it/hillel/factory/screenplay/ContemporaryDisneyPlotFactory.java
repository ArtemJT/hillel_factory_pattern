package it.hillel.factory.screenplay;

import it.hillel.factory.screenplay.interfaces.Character;
import it.hillel.factory.screenplay.interfaces.EpicCrisis;

public class ContemporaryDisneyPlotFactory extends BasePlotFactory {

    public ContemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        super(hero, epicCrisis, funnyFriend);
    }

    @Override
    public String asText() {
        return String.format(textTemplate, hero.name(), epicCrisis.name(), funnyFriend.name());
    }
}
