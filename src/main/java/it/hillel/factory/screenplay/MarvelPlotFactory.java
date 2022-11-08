package it.hillel.factory.screenplay;

import it.hillel.factory.screenplay.interfaces.Character;
import it.hillel.factory.screenplay.interfaces.EpicCrisis;

public class MarvelPlotFactory extends BasePlotFactory {

    private String isAre = "are";
    private String endOfSentence = "inflexible heroes.";

    public MarvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        super(heroes, epicCrisis, villain);
        if (heroes.length == 1) {
            isAre = "is";
            endOfSentence = "the inflexible hero.";
        }
    }

    @Override
    public String asText() {
        return String.format(textTemplate, getHeroesNames(heroes), epicCrisis.name(), villain.name(), isAre, endOfSentence);
    }

    private String getHeroesNames(Character[] heroes) {
        String brave = "the brave ";
        StringBuilder builder = new StringBuilder();
        if (heroes.length == 1) {
            builder.append(brave).append(heroes[0].name());
        } else {
            for (int i = 0; i < heroes.length; i++) {
                builder.append(brave).append(heroes[i].name());
                if (i == heroes.length - 2) {
                    builder.append(" and ");
                } else if (i == heroes.length - 1) {
                    return builder.toString();
                } else {
                    builder.append(", ");
                }
            }
        }
        return builder.toString();
    }
}
