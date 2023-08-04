package facade;

import subsystem.AccountService;
import subsystem.EmailService;
import subsystem.PaymentService;
import subsystem.ShippingService;

public class ShopFacade {
    private static final ShopFacade INSTANCE = new ShopFacade();

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;

    private ShopFacade() {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
    }

    public static ShopFacade getInstance() {
        return INSTANCE;
    }


    public void buyProductByCashWithFreeShipping(String email) {
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendMail(email);
        System.out.println("Done\n");
    }

    public void buyProductByBankingAccountWithStandardShipping(String email, String mobilePhone) {
        accountService.getAccount(email);
        paymentService.paymentByEbankingAccount();
        shippingService.standardShipping();
        emailService.sendMail(email);
        System.out.println("Done\n");
    }
}
