package pl.javastart.task.service;

class Config {

    private int minRequiredEarnings = 2000;
    private double percentage = 0.03;

    int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    void setMinRequiredEarnings(int minRequiredEarnings) {
        this.minRequiredEarnings = minRequiredEarnings;
    }

    double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
