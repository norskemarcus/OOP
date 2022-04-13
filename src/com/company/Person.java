package com.company;

public class Person {

  private String navn;
  private int alder;


  public Person(String navn, int alder){
    this.navn = navn;
    this.alder = alder;
  }

  public void hasBirthday(){
    alder ++;
  }

  public String getNavn() {
    return navn;
  }


  public int getAlder() {
    return alder;
  }

  @Override
  public String toString() {
    return "Person: " +
         navn + " " + alder + " år";
  }
}
