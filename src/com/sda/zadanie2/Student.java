package com.sda.zadanie2;

class Student extends Person {
    private String typeOfStudies;
    private int yearOfStudy;
    private float studiesPrice;
    public Student(String typeOfStudies,int yearOfStudy,
                   float studiesPrice) {
        super();
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudy = yearOfStudy;
        this.studiesPrice = studiesPrice;
    }
    public String getTypeOfStudies() {
        return typeOfStudies;
    }
    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public float getStudiesPrice() {
        return studiesPrice;
    }
    public void setStudiesPrice(float studiesPrice) {
        this.studiesPrice = studiesPrice;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudies='" + typeOfStudies + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", studiesPrice=" + studiesPrice +
                '}';
    }
}
