public class Box <Int> {

    private static int weight;
    
    public Box (){
    }

    /*дженерик */
    //public void add (Fruits fruit){
    static <T> void add (Fruits fruit){
        Box.weight = Box.weight + fruit.getWeight();
    }

    public static int getWeight () { // sum of all fruit's weigt in the box
        return weight;
        //throw new UnsupportedOperationException();
    }

    public <GoldenApple> void moveTo (Box <? super GoldenApple> target){ //Box <? extends Fruits> target
        Box.weight = Box.weight - Fruits.getWeight();
        //метод не статический, значит относится к какому-то объекту. если на объекте вызвать  
        //moveTo и передать коробку, то он должен пересыпать фрукты в коробку
        //пересыпаем фрукты отсюда в target
    }
}
