package pl.javastart.task.service;

import pl.javastart.task.data.Config;
import pl.javastart.task.data.Offer;

public class SalesRepresentative {

    public Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.setPercentage(config.getPercentage());
            offer.setValid(true);
            offer.setValue(requestedAmount);
        }
        return offer;
    }

}
