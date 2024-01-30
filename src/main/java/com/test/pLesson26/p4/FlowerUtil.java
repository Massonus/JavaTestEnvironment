package com.test.pLesson26.p4;

public class FlowerUtil {

    private Flower flower;

    public FlowerUtil(Flower flower) {
        this.flower = flower;
    }

    public void setUpFlower() {
        flower.setName("G");
        flower.setId(4);
        flower.setColor("Green");
    }

    public FlowerBean getFlowerBean() {
        final FlowerBean flowerBean = new FlowerBean();
        flowerBean.name = flower.getName();

        if (flower.getColor().equals("red")) {
            flowerBean.isRed = true;
        }

        return flowerBean;
    }


    static class FlowerBean {
        String name;

        boolean isRed;

        @Override
        public String toString() {
            return "FlowerBean{" +
                    "name='" + name + '\'' +
                    ", isRed=" + isRed +
                    '}';
        }
    }

}
