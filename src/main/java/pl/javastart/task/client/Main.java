package pl.javastart.task.client;

import pl.javastart.task.data.Offer;
import pl.javastart.task.service.CustomerService;
import pl.javastart.task.service.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
//        salesRepresentative.config.minRequiredEarnings = 0;

        Offer offer = salesRepresentative.createLoanOffer(2_000_000, 2200);

        // to również nie powinno być możliwe
//        offer.valid = true;
//        offer.percentage = -0.5;
//        offer.value = 2_000_000;

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}