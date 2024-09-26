# Java_HomeAssignments3_FHD

Matriculation number : 7222045

First we need to create the following classes

1. Engine(Superclass):
      CombustionEngine (subclass)
      ElectricEngine (subclass)
      HybridEngine (subclass)

2. Manufacture class with getters and setters.

3. Vehicle (abstract class) with an abstract method ShowCharacteristics().
      ICEV (Internal Combustion Engine Vehicle)
      BEV (Battery Electric Vehicle)
      HybridV (Hybrid Vehicle)

4. Arrays of Vehicle containing objects of ICEV, BEV, and HybridV.

5. Implement the ShowCharacteristics() method to demonstrate the characteristics of each vehicle.


Explanation of the various classe:

A. Engine Classification:
      Engine is the abstract superclass, while CombustionEngine, ElectricEngine, and HybridEngine are concrete subclasses defining different types of engines.

B. Manufacture Class:
      Contains attributes for the name and country of the manufacturer, along with getters and setters.

C. Vehicle Classification:
      - The abstract class Vehicle includes an abstract method ShowCharacteristics().
      - Subclasses ICEV, BEV, and HybridV implement the ShowCharacteristics() method to display their specific details.

D. Main Class:
      - Demonstrates the creation of Manufacture, Engine, and Vehicle objects.
      - Uses an array of Vehicle to hold different types of vehicles and calls the ShowCharacteristics() method to display their details.

