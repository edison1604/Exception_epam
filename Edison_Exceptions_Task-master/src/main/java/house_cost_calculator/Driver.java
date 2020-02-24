package house_cost_calculator;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseCost houseCost = new HouseCost(1,25,false);
        houseCost.calculateConstructionCost();

	}

}