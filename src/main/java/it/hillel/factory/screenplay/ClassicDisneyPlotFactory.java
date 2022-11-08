package it.hillel.factory.screenplay;

import it.hillel.factory.screenplay.interfaces.Character;

public class ClassicDisneyPlotFactory extends BasePlotFactory {

    public ClassicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        super(hero, beloved, villain);
    }

    @Override
    public String asText() {
        return String.format(textTemplate, hero.name(), beloved.name(), villain.name());
    }
}
