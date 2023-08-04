import facade.ShopFacade;

public class Client {
    public static void main(String[] args) {
        ShopFacade shopFacade = ShopFacade.getInstance();
        shopFacade.buyProductByCashWithFreeShipping("quan@gmail.com");
    }
}
