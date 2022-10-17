package Assignment;

public class PostalStamp extends Product implements LickAble,IPrint{
    private int amount;
    public PostalStamp(String name, double price, Size size) {
        super(name, price, size);
    }

    public PostalStamp(String name, double price, Size size, int amount) {
        super(name, price, size);
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public boolean saleToLick() {
        return false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Name :" + getName()+'\n'+
                "amount: " + amount + '\n'+
                "price: " + getPrice() + '\n'+
                "size:" + getSize();
    }
}

