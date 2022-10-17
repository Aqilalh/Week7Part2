package Assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("Aqil","ALhaidari");

        ArrayList<String> addresses = new ArrayList<String>();
        addresses.add("home");
        addresses.add("crib");
        addresses.add("fox dr");

        Size size1 = Size.S;
        Size size2 = Size.M;
        Size size3 = Size.L;

       // PostalStamp postalStamp = new PostalStamp("white",50.0,size3,20);
        IceCream iceCream = new IceCream("chocalate",20.0,size1);
        Battery battery = new Battery("red battery",100.0,size2);
        PostalStamp postalStamp1 = new PostalStamp("real madrid",30,size2,2);

        Product [] products = {iceCream,battery,postalStamp1};

        ArrayList<Product> products1 = new ArrayList<Product>();
        products1.add(iceCream);
        products1.add(battery);
        products1.add(postalStamp1);

        HashMap<String,Product> productHashMap = new HashMap<String,Product>();
        //productHashMap.put("Vannilla",iceCream);

        Customer customer1 = new Customer("Steve","jobs","steve123","password1",100,-10000.0,addresses,size2,products);
        Customer customer2 = new Customer("Mike","Tyson","Mikepunch","Mike123",200,2000.0,addresses,size3,products);
        Customer customer3 = new Customer("Luke","shaw","Luke123","lukeman123",20,3400.0,addresses,size1,products);

        Consumable [] consumables = {iceCream,battery};

        IPrint [] iPrint = {postalStamp1,customer1,customer2,customer3};


        System.out.println("======Get and print out Customer1's balance");
        System.out.println(customer1.getAccountBalance());
        System.out.println("===useRewardPoints====");
        customer1.useRewardPoints(10);
        System.out.println("==getSecondaryAddressOfCustomer of customer1==");
        System.out.println(App.getSecondaryAddressOfCustomer(customer1));
        System.out.println("===PrintCustomers1 info with the print() method ==");
        customer1.print();
        System.out.println("====================");
        App.consumeComsumables(consumables);
        System.out.println("=============");
       App.printAllPrintableObjects(iPrint);
        System.out.println("===============");
        System.out.println(admin.getName());
        System.out.println("======get total========");
        App.getTotalPriceOfCustomerProducts(customer1);
        System.out.println("====reverseSortAndPrintAllProductsByPrice====");
        App.reverseSortAndPrintAllProductsByPrice(products1);
        System.out.println("====getListOfProductGreaterThanThePriceOfProductGiven===");
        System.out.println(App.getListOfProductPricesGreaterThanThePriceOfProductGiven(products1,iceCream));
        System.out.println("================");
        App.addASingleProductToDirectoryTiedToCoustomerByNameThenPrint(productHashMap,customer1,iceCream);

    }
}


