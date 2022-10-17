package Assignment;

import java.util.ArrayList;

public class Customer extends User{
    private int rewardPoints;
    private double accountBalance;
    private ArrayList<String> addresses;
    private Size size;
    private Product[] products;

    public Customer(String string1, String string2) {
        super(string1, string2);
    }

    public Customer(String string1, String string2, String username, String password) {
        super(string1, string2, username, password);
    }

    public Customer(String name, String lastname, String username, String password, int rewardPoints, double accountBalance, ArrayList<String> addresses, Size size, Product[] products) {
        super(name, lastname, username, password);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.addresses = addresses;
        this.size = size;
        this.products = products;
    }

    public void useRewardPoints(int rewardPoints){
        int total = getRewardPoints() - rewardPoints;
        System.out.println("You just used " + rewardPoints + " points and now you have " + total + " points left");
    };

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
    return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance < 0.0) {
            accountBalance = this.accountBalance;
        }
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "UserName " + getUsername() + '\n'+
                "rewardPoints: " + rewardPoints +'\n'+
                " accountBalance: " + accountBalance +'\n'+
                " size: " + size
                ;
    }
}


