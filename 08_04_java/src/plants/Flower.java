package plants;


public class Flower extends Plant{

    private static int FLOWER_GROW_PER_SEASON = 3;
    private static int FLOWER_CUT_PER_SEASON = 1;

    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    public static int getFlowerCutPerSeason() {
        return FLOWER_CUT_PER_SEASON;
    }

    public void blooming() {
        System.out.println("Flowers are blooming at Summer ");
    }

    @Override
    public int getGrowProSeason() {
        return FLOWER_GROW_PER_SEASON;
    }

    @Override
    public void GrowInSummer() {
        System.out.println("We are blooming at Summer");

    }

    @Override
    public void GrowInAutumn() {
        setHeight(getHeight() - getFlowerCutPerSeason());

    }
}
