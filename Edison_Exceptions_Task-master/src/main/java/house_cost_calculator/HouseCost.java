package house_cost_calculator;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


import java.util.HashMap;

public class HouseCost {

   public static Logger logger;


    /**
     * material_standard types
     * 0- standard
     * 1- above standard
     * 2- high standard
     * 3-  high standard + fully automated
     */
    private int material_standarad;
    private double house_area;
    private boolean fully_automated;
    private HashMap<Integer, Double> priceMap;

    public HouseCost(int material_standarad, double house_area, boolean fully_automated) {
        this.material_standarad = material_standarad;
        this.house_area = house_area;
        this.fully_automated = fully_automated;
        priceMap = new HashMap<Integer, Double>();
        priceMap.put(0, 1200.0);
        priceMap.put(1, 1500.0);
        priceMap.put(2, 1800.0);
        priceMap.put(3, 2500.0);

        logger = LogManager.getLogger(HouseCost.class);
        logger.info("Logger object created in HouseCost Class");
        logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");


    }

    public int getMaterial_standarad() {

        return material_standarad;
    }

    public void setMaterial_standarad(int material_standarad) {
        this.material_standarad = material_standarad;
    }

    public double getHouse_area() {
        return house_area;
    }

    public void setHouse_area(double house_area) {
        this.house_area = house_area;
    }

    public boolean isFully_automated() {
        return fully_automated;
    }

    public void setFully_automated(boolean fully_automated) {
        this.fully_automated = fully_automated;
    }

    public double calculateConstructionCost() {

        logger.info("Calculating house cost");

        if (fully_automated && material_standarad != 2){
            logger.warn("options provided are invalid");
            return -1;
        }


        if (fully_automated)
            return house_area * priceMap.get(3);
        else
           return  house_area * priceMap.get(material_standarad);



    }

}
