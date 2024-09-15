package pom;

public class Router {
    public AuthPage authPage;
    public ProductsPage productsPage;
    public Header header;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;
    public OverviewPage overviewPage;

    public Router() {
        this.authPage = new AuthPage();
        this.productsPage = new ProductsPage();
        this.header = new Header();
        this.cartPage = new CartPage();
        this.checkoutPage = new CheckoutPage();
        this.overviewPage = new OverviewPage();
    }

}
