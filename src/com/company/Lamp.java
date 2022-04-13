package com.company;

public class Lamp {

  private boolean isOn;


  public Lamp(){
    isOn = false;
  }

  public Lamp (String name, boolean isOn){
    this.isOn = isOn;
  }

  public void pushContact(){

    if(isOn){
      isOn = false;
    } else isOn = true;
  }

  public boolean displayLampStatus() {
    return isOn;
  }
}
