import java.util.ArrayList;

public class ProductList {
    ArrayList<Product> productList = new ArrayList<>();
    Product product = new Product();


    public void addProduct(Product product){
        productList.add(product);
    }

    public void EditProduct(String id, String newId){
        for (Product product : productList){
             if (product.getId() == id ){
                 product.setId(newId);
             }
        }
    }
    public void deleteProduct(String id){
        productList.removeIf(product -> product.getId() == id);
    }

    public void FindProductName(String name){
        for (Product product : productList){
            if (product.getName() == name){
                System.out.println(product);
            }
        }
    }



    @Override
    public String toString() {
        return "ProductList{" +
               productList +
                '}';
    }
}
