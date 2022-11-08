package it.hillel.factory.screenplay;

import it.hillel.factory.screenplay.interfaces.Character;
import it.hillel.factory.screenplay.interfaces.EpicCrisis;
import it.hillel.factory.screenplay.interfaces.Plot;
import it.hillel.factory.screenplay.interfaces.PlotFactory;

public abstract class BasePlotFactory extends PlotFactories implements PlotFactory, Plot {

    private final StoryType storyType;
    protected Character hero;
    protected Character beloved;
    protected Character villain;
    protected Character funnyFriend;
    protected EpicCrisis epicCrisis;
    protected Character[] heroes;
    protected String textTemplate;

    protected BasePlotFactory(Character hero, Character beloved, Character villain) {
        this.hero = hero;
        this.beloved = beloved;
        this.villain = villain;
        storyType = StoryType.CLASSIC;
        textTemplate = storyType.getText();
    }

    protected BasePlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
        storyType = StoryType.CONTEMPORARY;
        textTemplate = StoryType.CONTEMPORARY.getText();
    }

    protected BasePlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
        storyType = StoryType.MARVEL;
        textTemplate = StoryType.MARVEL.getText();
    }


    @Override
    public Plot plot() {
        return switch (storyType) {
            case CLASSIC -> new ClassicDisneyPlotFactory(hero, beloved, villain);
            case CONTEMPORARY -> new ContemporaryDisneyPlotFactory(hero, epicCrisis, funnyFriend);
            case MARVEL -> new MarvelPlotFactory(heroes, epicCrisis, villain);
        };
    }
}
