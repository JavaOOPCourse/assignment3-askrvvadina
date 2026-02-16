public class CloudStorageService extends Service implements PremiumFeature, Billable {

    private boolean isPremium = false;
    private int usedStorage = 50; // example usage

    public CloudStorageService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("Cloud service is not active.");
            return;
        }

        System.out.println("Storing files in cloud. Used: " + usedStorage + "GB");
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Cloud storage upgraded to PREMIUM with extra capacity.");
    }

    @Override
    public void generateBill() {
        double bill = usedStorage * 0.5;
        System.out.println("Cloud storage bill: $" + bill);
    }
}
