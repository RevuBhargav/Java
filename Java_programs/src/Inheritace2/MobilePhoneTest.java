package Inheritace2;

//Base class: MobilePhone
class MobilePhone {
 // Attributes common to all mobile phones
 protected String brand;
 protected String model;
 protected String operatingSystem;

 // Constructor to initialize common features
 public MobilePhone(String brand, String model, String operatingSystem) {
     this.brand = brand;
     this.model = model;
     this.operatingSystem = operatingSystem;
 }

 // Method to display general phone details
 public void displayDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Operating System: " + operatingSystem);
 }

 // Method for calling functionality
 public void makeCall(String contact) {
     System.out.println("Calling " + contact + "...");
 }

 // Method to send a message
 public void sendMessage(String contact, String message) {
     System.out.println("Sending message to " + contact + ": " + message);
 }
}

//Derived class: SmartPhone (inherits from MobilePhone)
class SmartPhone extends MobilePhone {
 // Additional attributes specific to SmartPhones
 private boolean isTouchScreen;
 private boolean isWifiEnabled;

 // Constructor to initialize SmartPhone specific attributes
 public SmartPhone(String brand, String model, String operatingSystem, boolean isTouchScreen, boolean isWifiEnabled) {
     super(brand, model, operatingSystem); // Call the constructor of MobilePhone
     this.isTouchScreen = isTouchScreen;
     this.isWifiEnabled = isWifiEnabled;
 }

 // Overriding displayDetails method to add smart phone features
 @Override
 public void displayDetails() {
     super.displayDetails(); // Call the parent class method
     System.out.println("Touch Screen: " + (isTouchScreen ? "Yes" : "No"));
     System.out.println("Wi-Fi Enabled: " + (isWifiEnabled ? "Yes" : "No"));
 }

 // Additional method specific to SmartPhone
 public void browseInternet() {
     if (isWifiEnabled) {
         System.out.println("Browsing the internet...");
     } else {
         System.out.println("Cannot browse without Wi-Fi connection.");
     }
 }
}

//Derived class: BasicPhone (inherits from MobilePhone)
class BasicPhone extends MobilePhone {
 // Additional attributes specific to BasicPhones
 private boolean hasCamera;

 // Constructor to initialize BasicPhone specific attributes
 public BasicPhone(String brand, String model, String operatingSystem, boolean hasCamera) {
     super(brand, model, operatingSystem); // Call the constructor of MobilePhone
     this.hasCamera = hasCamera;
 }

 // Overriding displayDetails method to add basic phone features
 @Override
 public void displayDetails() {
     super.displayDetails(); // Call the parent class method
     System.out.println("Has Camera: " + (hasCamera ? "Yes" : "No"));
 }

 // Additional method specific to BasicPhone
 public void takePhoto() {
     if (hasCamera) {
         System.out.println("Taking a photo...");
     } else {
         System.out.println("No camera available on this phone.");
     }
 }
}

//Main class to test the program
public class MobilePhoneTest {
 public static void main(String[] args) {
     // Creating an object of SmartPhone
     SmartPhone smartphone = new SmartPhone("Apple", "iPhone 13", "iOS", true, true);
     smartphone.displayDetails(); // Display SmartPhone details
     smartphone.makeCall("John");
     smartphone.sendMessage("John", "Hello, how are you?");
     smartphone.browseInternet();

     System.out.println();

     // Creating an object of BasicPhone
     BasicPhone basicPhone = new BasicPhone("Nokia", "3310", "Nokia OS", true);
     basicPhone.displayDetails(); // Display BasicPhone details
     basicPhone.makeCall("Alice");
     basicPhone.sendMessage("Alice", "Good morning!");
     basicPhone.takePhoto();
 }
}

