package Assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class App {
    public static void printAllPrintableObjects(IPrint[] prints) {
        for (int i = 0; i < prints.length; i++) {
            prints[i].print();
        }
    }

    public static void consumeComsumables(Consumable[] consumables) {
        for (int i = 0; i < consumables.length; i++) {
            consumables[i].consume();

        }
    }

    public static void getTotalPriceOfCustomerProducts(Customer customer) {
       double total = 0;
      for(Product customer1 : customer.getProducts()){

          total += customer1.getPrice();
       }
        System.out.println(total);

    }

    public static String getSecondaryAddressOfCustomer(Customer customer){
        String seconAddress = "";
       // for(int i = 0; i < customer.toString().length(); i++){
            seconAddress = customer.getAddresses().get(1);

        return seconAddress;
    }


    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product> products){
        Collections.sort(products,new sortingList());
        for(Product product:products){
            System.out.println(product.getPrice());
        }
    }

   public static ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> products, Product product) {
       ArrayList<Double> x = new ArrayList<>();
       for(Product y : products){
       //  x.add(y.getPrice());
           if(product.getPrice() < y.getPrice()){
               x.add(y.getPrice());
           }
       }
       return x;
   };

    public static void addASingleProductToDirectoryTiedToCoustomerByNameThenPrint(Map<String,Product> productMap,Customer customer,Product product ){
       if(productMap.isEmpty()){
           productMap.put(customer.getUsername(),product);
           System.out.println(customer.getUsername() + " : " +product.toString());
          // System.out.println(productMap.keySet() + ":" + productMap.values());
       }
    }



}
