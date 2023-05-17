package com.SanketEnterprise.java_practicals;
interface Teacher {
    default void qualification(){
        String qualification="B.Ed";
        System.out.println("Teacher's qualification is "+qualification);
    }

    default void ExperienceInYears(){
        int experienceInYears=3;
        System.out.println("Teacher's experience is "+experienceInYears+"years");
    }
}
