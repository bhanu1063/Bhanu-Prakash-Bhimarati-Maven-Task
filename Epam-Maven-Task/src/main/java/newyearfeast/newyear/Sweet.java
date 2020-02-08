package newyearfeast.newyear;
public class Sweet {
    int price,weight;
    Sweet(int price,int weight)
    {
        this.price=price;
        this.weight=weight;
    }
                int getPrice()
    {
        return price;
    }
    int getWeight()
    {
        return weight;
    }
    String className()
    {
        return "sweet";
    }
}