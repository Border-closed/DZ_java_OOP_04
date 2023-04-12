public class GoldenApple extends Apple {
    public GoldenApple (int weight){
        super(weight);
    }

    public void add (Fruits fruit){
        GoldenApple.weight = GoldenApple.weight + fruit.getWeight();
    }
}
