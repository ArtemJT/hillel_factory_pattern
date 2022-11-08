package it.hillel.factory.screenplay;

public enum StoryType {

    CLASSIC("%1$s is young and adorable. " +
            "%1$s and %2$s love each other. " +
            "%3$s interferes with their happiness, but loses in the end."),

    CONTEMPORARY("In the beginning, %1$s feels a bit awkward and uncomfortable. " +
            "But personal issue fades, when a big trouble comes - %2$s. %1$s stands up against it, " +
            "but with no success at first. But then, by putting self together and with the help of friends, " +
            "including spectacular, funny %3$s, %1$s restores the spirit, " +
            "overcomes the crisis and gains gratitude and respect."),

    MARVEL("%2$s threatens the world. But %1$s %4$s on guard. So, " +
            "no way that intrigues of %3$s will bend the willpower of %5$s");

    private final String text;

    StoryType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
