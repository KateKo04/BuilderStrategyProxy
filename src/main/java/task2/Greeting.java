package task2;

public class Greeting implements MailCode{
    private static String TEMPLATE = "DEAR %NAME,JOIN OUR COMMUNITY!";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}
