package Task2;

public class Good implements Cloneable {
    private String name;
    private String art;
    private int price;

    public Good(String name, String art, int price) {
        this.name = name;
        this.art = art;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Good good = new Good(this.name,this.art,this.price);
        return good;
    }
}
