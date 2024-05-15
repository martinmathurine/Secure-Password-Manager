# Secure-Password-Manager
<h2>Application Security Through Hashing Technologies Developed with Java</h2>

<h3>Introduction</h3>
A secure password manager application developed with Java to safely store, modify and remove an end-user’s data and personal information. The application incorporates an authentication mechanism by leveraging hash maps for application security. This application will efficiently store and manage sensitive data, ensuring only the authenticated user has access. Using hash maps for pairing unique keys to corresponding values streamlines the retrieval of user credentials and bolsters the application's defence against unauthorised access. 

The main components of the application's design include a login system that safeguards the master user method as well as encryption mechanisms employed to obfuscate passwords. I implemented conditional statements, only permitting system modifications upon verification of proper credentials. This application illustrates my competency in the nuances of hashing algorithms and BigInteger's role in handling numerical values, ensuring a comprehensive understanding of what it takes to protect user data with precision and care.

<h3>Requirements</h3>
This lab's objective aims to build a secure application to safely store, modify and remove an end-user’s data and information. The aim of the lab is to build a secure application that will store many pairs of IDs and passwords for an individual who enters a username and password. The application must also be able to encrypt the end-user’s data, preventing sensitive data or digital assets from being stolen or hijacked in the event of a potential data breach attack. This was developed as part of a group project an application using the Java programming language. The application allows the user to store usernames and passwords whilst being controlled by the master user. The master user has access to modify, add and remove passwords. The source code for the application will meet the requirements whilst being encrypted and secure, utilising the SHA-256 cryptographic hash algorithm.

<h3>Design Considerations and Block Diagram</h3>
The block diagram begins with the master user inputting a pre-defined master ID and password (ID = Username and Password = password). Then, the user will be able to enter a new user ID and password. If the user wants to delete an entry they will need to re-enter the master ID and the password as well. The user will be able to change the password too.

To store the password into a file the user will need to type in the master ID and also the new master password as well, such as if the user enters '4'. When a user selects '5' or '6' it will ask for the new master ID and password and both the master ID and passwords will be stored in separate files. When the user selects '5', it will show the encrypted password and proof that the user can delete entries. Now, the master ID and password are hashed and encrypted.

<img width="500" src="https://github.com/martinmathurine/Secure-Password-Manager/assets/42855193/9d2e59db-f79b-43af-a1e7-742771c2b374">

<h3>Development Methodology</h3>
While developing this Java application, I opted for a menu-based operating system to provide a clear structure and understanding of each command's function. Simplicity was prioritised to ensure accessibility for users of varying technical backgrounds. IntelliJ IDEA served as the Java IDE for developing the source code.

<h3>Functionality</h3> 
This program utilises a hash map to manage the master user's credentials, storing them in the add user ID hash map. This hash map pairs usernames with passwords for easy retrieval. The main method presents a menu-based interface, offering options for adding, updating, or deleting user entries.

 - Master User Authentication: The first method verifies the master user's credentials, allowing access to the main menu upon correct input. Incorrect entries result in program termination.
 
 - Main Menu: Displays available options for managing user entries.
  
 - Add User ID: Allows storing user entries in the add user ID hash map.
   
 - Delete User ID: Removes user entries if they exist in the hash map.
   
 - Update User Password: Enables changing passwords for existing users.
   
 - Modify Master Password: Allows changing the master password.
   
 - Official Master Access: Validates access to perform operations based on selected options.
   
 - Hashing: Utilises the SHA-256 algorithm to securely hash passwords before storing them in the hash map. Encrypted passwords are then written to files for storage.

The process involves looping through the add user ID hash map to encrypt and store passwords. Exception handling ensures program continuity, even in case of errors during encryption or file writing. The same process applies to encrypting the master password, with separate file and hash map names for distinction.

<h3>Security Features</h3>
I implemented SHA-256 to encrypt the passwords for the master user and students. SHA-256 is efficient enough to uniquely hash encrypted data and safely secure it such as account-specific end-user passwords and usernames. With no known security weaknesses, it ensures high-level data protection, making it the preferred choice for cryptography.

<h3>Usability Demo</h3> 

https://github.com/martinmathurine/Secure-Password-Manager/assets/42855193/2aa1f5cb-f725-47bc-b355-8b0d785f14da

<h3>Concluding Reflections</h3>
In conclusion, Java was chosen for its simplicity and security features, facilitating easy interpretation of the source code. Application security, crucial in various network environments, is ensured through pre-emptive measures during the development and implementation of cryptographic tools like SHA-256. Security at the network layer is vital and within the application layer. Java's efficiency in compiling and executing code aligns well with the need to safeguard user data and prevent unauthorized access.

<h3>References</h3>

 - TablePlus. (28/08/2018). CLI vs GUI - Which one is better?. Available: https://tableplus.com/blog/2018/08/cli-vs-gui-which-one-is-better.html. Last accessed 16/12/2021.
 - Indumathi S.. (March 20, 2020). 5+ Tips to Secure Your Java Code from Attackers. Available: https://www.secpod.com/blog/secure-your-java-code-2/. Last accessed 16/12/2021.
 - Mike Dane. ( 22 Oct 2017). Java - Programming Language | Tutorial. Available: https://www.youtube.com/playlist?list=PLLAZ4kZ9dFpPpdR_9IQBUDLjYalvdrGGb. Last accessed 16/12/2021.
 - Tutorials Point (India) Ltd.. (16 Dec 2019). Java Essential Training. Available: https://www.youtube.com/playlist?list=PLWPirh4EWFpFfTUVBl5KbeXly1sHKSc-Z. Last accessed 16/12/2021.
 - Baeldung. (March 5, 2021). SHA-256 and SHA3-256 Hashing in Java. Available: https://www.baeldung.com/sha-256-hashing-java. Last accessed 16/12/2021.
 - Gartner. (26 May 2021). Critical Capabilities for Application Security Testing. Available: https://www.gartner.com/en/documents/4001984/critical-capabilities-for-application-security-testing. Last accessed 16/12/2021.
 - Stackify. (SEPTEMBER 14, 2015). What is APM? Overview, Common Terms, and 10 Critical APM Features. Available: https://stackify.com/what-is-apm/. Last accessed 16/12/2021.
 - MicroFocus. What is Application Security?. Available: https://www.microfocus.com/en-us/what-is/application-security. Last accessed 16/12/2021.
 - vmware. What is application security?. Available: https://www.vmware.com/topics/glossary/content/application-security.html. Last accessed 16/12/2021.
 - Mansi Sheth. (April 18, 2017). Encryption and Decryption in Java Cryptography. Available: https://www.veracode.com/blog/research/encryption-and-decryption-java-cryptography. Last accessed 16/12/2021.
 - Anton Lawrence. (March 24, 2020). Best Practices for Java Security. Available: https://bitbucket.org/blog/best-practices-for-java-security. Last accessed 16/12/2021.
 - Diego Pacheco. (Jul 25, 2020). Hashing in Java. Available: https://diego-pacheco.medium.com/hashing-in-java-834feb0e0500. Last accessed 16/12/2021.
 - https://javatutorialhq.com/java/util/hashmap-class/put-method-example/
 - https://stackoverflow.com/questions/5531455/how-to-hash-some-string-with-sha-256-in-java
