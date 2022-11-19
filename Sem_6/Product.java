//Описать построителя товаров
public class Product {
    private int id;
    private int price;
    private int weight;
 
    public int finalPrice() {
        return this.price * this.weight;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
 
    public int getWeight() {
        return weight;
    }
 
    public void setWeight(int weight) {
        this.weight = weight;
    }
 
    public static void main(String[] args) {
        Product product = new Product();
 
        // Ввод шифра
        product.setId(1);
        // Ввод цены за кг
        product.setPrice(10);
        // Ввод веса товара
        product.setWeight(44);
 
        // Вывод шифра
        System.out.println("Product code: " + product.getId());
        // Вывод цены за кг
        System.out.println("Price per kg: " + product.getPrice());
        // Вывод веса товара
        System.out.println("Product weight: " + product.getWeight());
 
        // Вычисление стоимости товара
        System.out.println("Total price: " + product.finalPrice());
    }
}