package com.company;

import java.util.Arrays;

public class Student {
  private String navn;
  private String studienummer;
  private String mobilnummer;
  private boolean tutor;
  private int[] karakterer;
  private int position;

  public Student(String navn, String studienummer, String mobilnummer, boolean tutor){
    this.navn = navn;
    this.studienummer = studienummer;
    this.mobilnummer = mobilnummer;
    this.tutor = tutor;
    this.karakterer = new int[7];
  }



  public void setTutor(boolean tutor){
    this.tutor = tutor;
  }


  public String toString(){
    return "Navn: " + navn + '\n' + "Studienummer: " + studienummer + '\n'
        + "Mobilnummer: " + mobilnummer + '\n' + "Tutor: " + tutor + '\n'
        + "Karakterer: " + Arrays.toString(karakterer) + '\n';

  }

  public void setKarakterer(int[] karakterer){
    this.karakterer = karakterer;
  }



  // Skriv en metode, der kan tilføje en karakter til en studerende.
  public void setKarakter(int eksamen, int karakter){
    karakterer[eksamen-1] = karakter; // -1 --> første kar. i arrayet som bliver opdateret
  }


}



