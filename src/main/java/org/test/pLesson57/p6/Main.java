package org.test.pLesson57.p6;


import org.test.pLesson57.p5.Pie;
import org.test.pLesson57.p5.PieUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PieUtils pieUtils = new PieUtils();

        Pie pie = new Pie();
        pie.setName("Pie1");
        pie.getEmails().add("test5");
        pie.getEmails().add("test6");

        Pie pie1 = new Pie();
        pie1.setName("Pie2");
        pie1.getEmails().add("test3");
        pie1.getEmails().add("test4");

        Pie pie2 = new Pie();
        pie2.setName("Pie3");
        pie2.getEmails().add("test2");
        pie2.getEmails().add("test3");

        pieUtils.savePie(pie);
        pieUtils.savePie(pie1);
        pieUtils.savePie(pie2);

        Utils utils = new Utils();
        final List<Pie> allPie = utils.getAllPie();
        final Pie pie3 = utils.getPie(1);

        System.out.println(allPie);
        System.out.println(pie3);

        utils.updatePie(pie2);

        System.out.println(utils.getPie(3).getName());

    }

}
