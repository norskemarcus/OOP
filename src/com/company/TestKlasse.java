package com.company;

public class TestKlasse {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_GREEN = "\u001B[32m";

  public static void main(String[] args) {

/*
            int[] karakterer;

            Student student1 = new Student("Marcus", "0007", "52340457", false);
            Student student2 = new Student("Rodrigo", "7080", "12345678", false);
            Student hjælpelærer = new Student("Rasmus", "1234", "22003344", false);
            Student tutorCodelab = new Student("Carsten", "5678", "28396735", true);

           // Opgave 1
           // System.out.println(student1.getNavn());
           // System.out.println(student1.getStudienummer());
           // System.out.println(student1.getMobilnummer());

            //Opdatere en værdi
            //student1.setStudienummer("303030");
            //System.out.println("Opdateret studienummer: " + student1.getStudienummer());

            // Opg. 2 med boolean
            System.out.println(student1.toString());
            System.out.println(student2.toString());
            System.out.println(hjælpelærer.toString());

            // Ændre tutor-status for Rasmus
            hjælpelærer.setTutor(true);
            System.out.println("Opdateret tutorstatus: ");
            System.out.println(hjælpelærer);

            // Opgave 3 med karakterer
            System.out.println("Karakterer:");
            student1.setKarakterer(new int[] {7, 10, 12, 10, 10, 12, 12}); // Lave et nyt array
            System.out.println(student1);

            // Tilføje en karakter til en studerende
            student2.setKarakter(1,12); // Eksamen nr. 1 får Rodrigo 12!
            System.out.println(student2);
            student2.setKarakter(2,10);
            System.out.println(student2);

            hjælpelærer.setKarakterer(new int[] {12,12,12,12,12,12,12});
            System.out.println(hjælpelærer);

 */ // Opgaver med Rasmus

    // Personoppave 8.marts af Tine
        /*    Person person = new Person("Marcus", 37);
           // Man kan enten bruge toString metoden for at printe
            System.out.println(person);
            person.hasBirthday();
            System.out.println(person);
            // Eller man kan bruge get metoder for at hente fx. navn og alder ud fra objektet
            System.out.println(person.getNavn());
            System.out.println(person.getAlder());

         */

    // Terningopgave hvor jeg laver en ny terning hvor jeg angiver antal sider på terningen
    Die die = new Die(6);
    final int TRIES = 100;
    int[] liste = new int[101];  // Lægge kastene ind i et array
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;

    System.out.println();
    System.out.println(ANSI_GREEN + "   Result of rolling the dice 100 times:" + ANSI_RESET);

      for (int i = 1; i <= TRIES; i++) {
        int dice = die.rollDice();
        liste[i] = i;
        System.out.printf("%4d", dice);
        if (i % 10 == 0) System.out.println();

        //TODO: This is not working!

        if (liste[i] == 1) {
          count1++;
        } else if (liste[i] == 2) {
          count2++;
        } else if (liste[i] == 3) {
          count3++;
        } else if (liste[i] == 4) {
          count4++;
        } else if (liste[i] == 5) {
          count5++;
        } else count6++;


    }
      System.out.println("1: " + count1);
      System.out.println("2: " + count2);
      System.out.println("3: " + count3);
      System.out.println("4: " + count4);
      System.out.println("5: " + count5);
      System.out.println("6: " + count6);

  }
}

