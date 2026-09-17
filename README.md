# Terminal-Resume-Maker

## Overview
The CLI Resume Generator is a lightweight, terminal-based Java application that allows users to rapidly input their personal details, academic qualifications, and professional skills to automatically generate a cleanly formatted, text-based resume file.

## Features
* **Interactive CLI Menu:** Navigate seamlessly through data entry steps.
* **Dynamic Data Structures:** Handles varying amounts of skills and education history using Java Collections.
* **Automated File Export:** Generates a formatted `.txt` file ready for sharing or printing.
* **Robust Error Handling:** Prevents crashes from invalid user inputs using Exception Handling.

## Technologies Used
* **Language:** Java (JDK 8+)
* **Concepts Applied:** Object-Oriented Programming (Encapsulation), Collections Framework (`ArrayList`), Exception Handling (`try-catch`), and File I/O Streams (`FileWriter`).

## Steps to Install & Run
1. Ensure the Java Development Kit (JDK) is installed on your system.
2. Clone this repository to your local machine: `git clone <your-repository-url>`
3. Navigate to the project directory in your terminal.
4. Compile the application:
   ```bash
   javac ResumeGenerator.

 ## Instructions for Testing

1. Launch the application.
2. Select Option **1** and intentionally type invalid data (leave blank) to test basic acceptance.
3. Type a letter (e.g., `A`) instead of a number at the main menu to test the `InputMismatchException` handling.
4. Add multiple skills and education entries to verify the `ArrayList` scaling.
5. Select Option **4** and verify that a `.txt` file is successfully created in the root directory containing the inputted data.

## Screenshots  
**CODE**  
<img width="1087" height="885" alt="image" src="https://github.com/user-attachments/assets/a14af310-bfba-4944-beb9-30fb628abae6" />  
<img width="910" height="812" alt="image" src="https://github.com/user-attachments/assets/3bf1cd66-aa0e-4dc7-b924-cda99963a451" />
<img width="931" height="671" alt="image" src="https://github.com/user-attachments/assets/136672cc-0e41-4b4d-8d24-f2b3d2da886f" />

**OUTPUT**  
<img width="827" height="843" alt="Screenshot 2026-09-17 211758" src="https://github.com/user-attachments/assets/fcd92698-4990-4c28-97c8-6c0944e6640b" />

<img width="352" height="52" alt="Screenshot 2026-09-17 211905" src="https://github.com/user-attachments/assets/dfcfc2a4-2caf-427e-9e99-406fa8f5406e" />  

<img width="532" height="203" alt="Screenshot 2026-09-17 211916" src="https://github.com/user-attachments/assets/0f9bd302-30c3-482e-9364-14ef482eab26" />




