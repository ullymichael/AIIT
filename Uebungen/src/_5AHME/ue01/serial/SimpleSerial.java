package _5AHME.ue01.serial;

import com.fazecast.jSerialComm.SerialPort;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class SimpleSerial
{
  //Funktion gibt eine Liste mit den verfügbaren 

  public static List<String> findSerialPorts()
  {
    final List<String> portNames = new ArrayList<>();
    final SerialPort[] serialPorts = SerialPort.getCommPorts();
    for (SerialPort serialPort : serialPorts)
      portNames.add(serialPort.getSystemPortName());
    return portNames;
  }
  
  public static void main(String[] args)
  {
    try
    {
      
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
