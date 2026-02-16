public class ConsultationService extends Service implements Billable {

    private int sessions = 3;

    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("Consultation service is not active.");
            return;
        }

        System.out.println("Starting online consultation session.");
    }

    @Override
    public void generateBill() {
        double bill = sessions * 30;
        System.out.println("Consultation bill: $" + bill);
    }
}
