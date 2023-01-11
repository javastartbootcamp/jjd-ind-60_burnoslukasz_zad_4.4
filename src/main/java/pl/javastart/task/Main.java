package pl.javastart.task;

import pl.javastart.task.service.Offer;
import pl.javastart.task.service.CustomerService;
import pl.javastart.task.service.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to juz nie jest mozliwe
//        salesRepresentative.config.setMinRequiredEarnings(0);

        Offer offer = salesRepresentative.createLoanOffer(4_000_000, 2000);

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);

//        test:
//        double p = offer.getPercentage();
//        System.out.println(p);

//        offer1.setValid(true);
//        offer1.setPercentage(-3);
//        offer1.setValue(1000000);
//        customerService.payoutOffer(offer1);
    }
}


