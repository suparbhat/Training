package com.sapient.cui;

import java.util.logging.Logger;


class List1 {
  public static void main(String[] args) {
    int lightspeed;
    long days;
    long seconds; 
    Logger log = Logger.getLogger(List1.class.getName());

 // approximate speed of light in miles per second
    lightspeed = 186000;

    days = 1000; // specify number of days here

    seconds = days * 24 * 60 * 60; // convert to seconds
    long distance;
    distance = lightspeed * seconds; // compute distance

    log.fine("In " + days);
    log.fine(" days light will travel about ");
    log.fine(distance + " miles.");
  }
}


