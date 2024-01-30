package com.test.pLesson35.p4.ex1;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        FeatureGiraffe featureGiraffe = new FeatureGiraffe();
        Annotation[] classAnnotations = featureGiraffe.getClass().getAnnotations();

        System.out.println(featureGiraffe.getClass().getName() + " annotations:");
        for (Annotation annotation : classAnnotations) {
            System.out.println("  " + annotation);
        }
    }

}

