public class Customer extends User {

    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Customer cannot manage services.");
    }

    @Override
    public void useService(Service s) {
        if (s.isActive()) {
            System.out.println("Customer " + name + " is using " + s.getServiceName());
            s.performService();
        } else {
            System.out.println("Service is not available.");
        }
    }
}
