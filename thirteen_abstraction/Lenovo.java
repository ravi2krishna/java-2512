package thirteen_abstraction;

public class Lenovo implements Laptop {

    public void processorLogic(){
        System.out.println("i3 Processor");
    }

    public void ramLogic(){
        System.out.println("4 GB RAM");
    };

    public void hddLogic(){
        System.out.println("1 TB HDD");
    };

    public void screenLogic(){
        System.out.println("11 Inch Screen");
    };

    public void keyboardLogic(){
        System.out.println("Small Size Keyboard");
    };

    // some special feature from lenovo to boost sales
    public void graphicCard(){
        System.out.println("NVIDIA Graphic Card");
    };

    @Override
    public void bioMetricLogin() {
        System.out.println("Lenovo Providing Bio Metric");
    }

}
