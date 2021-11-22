public class view {
    public static void main(String[] args) {
        Date date1 = new Date(10,2,2011);
        Date date2 = new Date(22,5,2011);
        Date date3 = new Date(30,10,2011);
        Product product1 = new Product("N10","Táo",15.5,date1);
        Product product2 = new Product("N11","Dứa",19.5,date2);
        Product product3 = new Product("N12","Dưa hấu",30.5,date3);

        ProductList productList = new ProductList();
        productList.addProduct(product1);
        productList.addProduct(product2);
        productList.addProduct(product3);
        productList.deleteProduct("N10");
        System.out.println(productList.toString());


    }
}
