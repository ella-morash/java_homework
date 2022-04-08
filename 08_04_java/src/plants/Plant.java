package plants;

public abstract class Plant {
    private String name;
    private int height;
    private int age;


    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
    public void addYear() {
        this.age++;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getGrowProSeason();

    public void growInWinter() {
        System.out.println("We are not growing at Winter");
    }

    public abstract void GrowInSummer();

    public abstract void GrowInAutumn();

    public void GrowInSpring() {
        this.height = this.height + getGrowProSeason();
    }


}
