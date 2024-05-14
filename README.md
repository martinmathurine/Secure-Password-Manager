# Secure-Password-Manager
<h2>Application Security Through Hashing Technologies Developed with Java</h2>

<img width="500" src="
  ">

<h3>Introduction</h3>
A secure password manager application developed with Java to safely store, modify and remove an end-user’s data and personal information. The application incorporates an authentication mechanism by leveraging hash maps for application security. This application will efficiently store and manage sensitive data, ensuring only the authenticated user has access. Using hash maps for pairing unique keys to corresponding values streamlines the retrieval of user credentials and bolsters the application's defence against unauthorised access. 

The main components of the application's design include a login system that safeguards the master user method as well as encryption mechanisms employed to obfuscate passwords. I implemented conditional statements, only permitting system modifications upon verification of proper credentials. This application illustrates my competency in the nuances of hashing algorithms and BigInteger's role in handling numerical values, ensuring a comprehensive understanding of what it takes to protect user data with precision and care.

<h3>Requirements</h3>
The objective for this lab is to build a secure application to safely store, modify and remove an end-user’s data and information. The aim for the lab is to build a secure application that will store many pairs of IDs and passwords for an individual that enters a username and password. The application must also be able to encrypt the end-user’s data which in turn prevents sensitive data or digital assets from being stolen or hijacked in the event of a potential data breach attack. This was developed as part of a group project an application using the Java programming language. The application allows the user to store the username and passwords, whilst being controlled by the master user. The master user has access to modify, add and remove passwords. The source code for the application will meet the requirements whilst being encrypted and secure utilising the SHA-256 cryptographic hash algorithm.

<h3>Design Considerations and Block Diagram</h3>
The block diagram begins with the master user inputting a pre-defined master ID and password (ID = Username and Password = password). Then they will be able to enter in a new user ID and password. If the user wants to delete an entry they will need to re-enter the master ID and the password as well. The user will be able to change the password too.
In order to store the password into a file the user will need to type in the master ID and also the new master password as well, such as if the user enters '4'. When a user selects '5' or '6' it will ask for the new master ID and password and both the master ID and passwords will be stored in separate files. When the user selects '5' it will show the encrypted password and proof that we can delete entries. Now the master ID and password are hashed and encrypted.

<img width="500" src="https://github.com/martinmathurine/Secure-Password-Manager/assets/42855193/9d2e59db-f79b-43af-a1e7-742771c2b374">

<h3>Development Methodology</h3>
When developing this Java application I decided to implement a menu based operating system, as I believed it will be an easy way in order to structure the layout to know what each command does. I believe that simplicity is key as that will allow many from any technical background reading the source code to easily interpret the application’s function. IntelliJ IDEA was Java IDE use to develop the source code.

<h3>Functionality Demo</h3> 
https://github.com/martinmathurine/Secure-Password-Manager/assets/42855193/cc9b25db-5dc2-4912-8548-ab1d554d311d

<h3>Security Features</h3> 
I decided to implement SHA-256 to encrypt the passwords for both the master user and students. I believe SHA-256 is efficient enough to uniquely hash, encrypt and secure user data such as account specific end-user passwords and usernames. The fundamental reason SHA-256 was used is due to the fact that it does not have any known security weaknesses in contrast to other hashing algorithms. This is considered the most secure in cryptography.

<h3>Usability Demo</h3> 
https://github.com/martinmathurine/Secure-Password-Manager/assets/42855193/e265846f-dfa4-403d-9e38-c82fa6ba03cc

<h3>Concluding Reflections</h3>
In conclusion, we decided that Java is the most suitable programming language for this application since Java is a high-level language and can be easily interpreted. This makes the source code simple and easy to use whilst fulfilling the requirements to be secure whilst in use. Application security is important because applications are often times used over various network topologies and infrastructures which increase the possibility for potential data breaches. Security at the network layer is vital but also within the application layer too. Application security entails pre-emptive considerations during the development, design phase as well as ways the application can pivot to protect itself after it has been deployed which can be achieved through the use of appropriate cryptographic tools and APIs implemented within the application’s source code. Java is fast and efficient to compile and execute source code making it ideal to use in conjunction with SHA-256 to safely store the end-user’s data and information and prevent unauthorised access from potential data breach attacks.

