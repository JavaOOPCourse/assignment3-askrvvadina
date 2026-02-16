public class StreamingService extends Service implements PremiumFeature {

    private boolean isPremium = false;

    public StreamingService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("Streaming service is not active.");
            return;
        }

        if (isPremium) {
            System.out.println("Streaming in 4K Ultra HD.");
        } else {
            System.out.println("Streaming in standard quality.");
        }
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Streaming upgraded to PREMIUM.");
    }
}
