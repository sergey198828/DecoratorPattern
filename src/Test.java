import com.decoratorpattern.pizzas.*;


public class Test {
    public static void main(String[] args){
        Pizza pizza = new TomatoSauseTopping(new MozzarellaTopping(new SmallPlainPizza()));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
