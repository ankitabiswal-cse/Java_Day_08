class Food {
    String foodName;
    String foodQuantity;
    double foodPrice;

    Food(String name, String quantity, double price) {
        foodName = name;
        foodQuantity = quantity;
        foodPrice = price;
    }

    void display() {
        System.out.println("Food Name :" + foodName);
        System.out.println("Food Quantity :" + foodQuantity);
        System.out.println("Food Price:" + foodPrice);
    }
}
public class FoodOrder {
    public static void main(String[] args){
        Food f1 = new Food("Chicken Biryani","1kg",300);
        Food f2 = new Food("Mutton Biryani","500gm",500);
        Food f3 = new Food("ThumbsUp","20ml",20);
        f1.display();
        f2.display();
        f3.display();
    }
}
