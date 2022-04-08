package plants;

public class Garden {
    public static void main(String[] args) {

        /**
         * Садовод-любитель
         * Выращиваем растения в течение нескольких лет и смотрим что будет
         * Задача: выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики
         * -name,height,age.  Каждый из видов растений вырастает за сезон на разную высоту, одинаковую для всех деревьев
         * и всех цветов
         *
         * Каждый сезон состоит из четырех времен года , в которые цветы и деревья ведут себя не всегда одинаково
         * Сезон для  цветов и деревьев начинается весной
         * Цветы: зимой не растут, летом тоже не растут а цветут,осенью их срезают
         * Деревья: зимой не растут,летом растут,осенью не растут, весной растут
         * В классе Garden создать по одному цветку и дереву и создать метод growPlants в котором происходит
         * процесс роста этих двух растений в течение нескольких лет.
         *
         * */


        int period = 2;

        Plant flower = new Flower("romashka",2,1);
        Plant tree = new Tree("berezka",10,4);


       growPlants(2,flower,tree);

        System.out.println(flower.getHeight());
        System.out.println(tree.getHeight());

        System.out.println(flower.getAge());
        System.out.println(tree.getAge());



    }
    public static void growPlants(int period,Plant flower, Plant tree) {


        for (int i = 1; i <= period; i++) {

            flower.GrowInAutumn();
            flower.growInWinter();
            flower.GrowInSpring();
            flower.GrowInSummer();

            tree.GrowInAutumn();
            tree.growInWinter();
            tree.GrowInSpring();
            tree.GrowInSummer();

            flower.addYear();
            tree.addYear();

        }

    }
}
