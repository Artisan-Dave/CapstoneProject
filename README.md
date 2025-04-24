# SMART WASTE MANAGEMENT SYSTEM
* My Capstone Project
# TECH STACKS:
* Programming Language: Java, C, C++
* IDE: Android Studio, Arduino
* Database: Firebase Realtime Database
# Description
* Smart Waste Mangement System has an Android App connected to firebase realtime database and also an embedded arduino system,
* it uses NodeMCU to upload the trash level scanned by the arduino using ultrasonic sensor to the database.
* The android up gets the update of the trashlevel from the database and notifies the admin and the trash collectors about the trash level of the trash bin real time.
* The android app also uses user management where the admin can assign who will be the collector/collectors.
* The arduino embedded system also has an mini LED for physical trashlevel indication. If the nodeMCU has no internet connection the LED of the trashbin is still functional but not the android application.