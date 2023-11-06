package com.telran.org.homeworkten;

public class Publisher {
    private String publisherName;
    private  int yearOfFoundation;

    public Publisher(String publisherName, int yearOfFoundation) {
        this.publisherName = publisherName;
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                '}';
    }
}
