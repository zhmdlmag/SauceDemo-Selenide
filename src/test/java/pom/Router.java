package pom;

public class Router {
    public AuthPage authPage;
    public ProductsPage productsPage;

    public Router() {
        this.authPage = new AuthPage();
        this.productsPage = new ProductsPage();
    }

}
