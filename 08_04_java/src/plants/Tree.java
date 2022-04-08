package plants;

public class Tree extends Plant  {

    private static int TREE_GROW_PER_SEASON = 5;

    public Tree(String name, int height, int age) {
        super(name, height, age);
    }


    @Override
    public int getGrowProSeason() {
        return TREE_GROW_PER_SEASON;
    }

    @Override
    public void GrowInSummer() {
        setHeight(getHeight() + getGrowProSeason());

    }

    @Override
    public void GrowInAutumn() {
        System.out.println("We are not growing at Spring");

    }
}
