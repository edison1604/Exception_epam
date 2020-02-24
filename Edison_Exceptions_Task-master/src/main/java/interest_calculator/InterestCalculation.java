package interest_calculator;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;



public class InterestCalculation implements Interest{
    private double principal;
    private double time_years;
    private double interest_rate;

    private Logger logger;

    public InterestCalculation(double pricipal, double time_years, double interest_rate) {
        this.principal = pricipal;
        this.time_years = time_years;
        this.interest_rate = interest_rate;
        logger = LogManager.getLogger(InterestCalculation.class);
        logger.info("Logger object created in InterestCalculation Class");
        logger.info("Logger object created in HouseCost Class");
        logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPricipal(double pricipal) {
        this.principal = pricipal;
    }

    public double getTime_years() {
        return time_years;
    }

    public void setTime_years(double time_years) {
        this.time_years = time_years;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }


    public double calculateSimpleInterest() {
        double si = (principal * interest_rate * time_years) / 100;
        logger.info("Simple interest is calculated and the result is " + si);

        return si;
    }


    public double calculateCompoundInterest() {
        double ci = principal * (Math.pow((1 + interest_rate / 100), time_years));
        logger.info("Compound interest is calculated and the result is " + ci);
        return ci;
    }
}
