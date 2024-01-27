package org.test.lesson16.p2.tryWithResource;

public class Scale implements AutoCloseable {
    private final int maxWeight;
    private int currentWeight;
    private boolean isOn = false;

    public void addWeight(int weight) throws ScaleOverWeightException {
        if (this.isOn == false){
            System.out.println("Scale On");
            this.isOn = true;
        }

        System.out.println("add - " + weight);

        int targetWeight = currentWeight + weight;

        if (targetWeight > maxWeight){
            throw new ScaleOverWeightException(targetWeight + " surpassed the weight! Maximum = " + this.maxWeight);
        }
        this.currentWeight = targetWeight;
        System.out.println("current weight = " + this.currentWeight);
    }

    public Scale(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Scale Off");
    }

    public static void main(String[] args) throws Exception {
        Scale scale = null;
        try {
            scale = new Scale(10);
            scale.addWeight(3);
            scale.addWeight(4);
        }finally {
            if (scale != null)
                scale.close();
        }

//        try(Scale scale = new Scale(10)){
//            scale.addWeight(3);
//            scale.addWeight(4);
//            scale.addWeight(4);
//        }

    }
}
