📚 Library Management System – Java Swing
📝 Project Overview

This project consists of a desktop application developed using Java Swing to manage basic library operations.
It is designed for a single user (librarian) and provides a simple, clear, and user-friendly graphical interface.

The application allows the librarian to:

Add new books

Search for existing books

Manage book borrowing operations

No database is used; all data is stored temporarily in memory, as required by the project specifications.

🎯 Project Objectives

Design clear and ergonomic graphical interfaces

Implement a functional GUI using Java Swing

Apply basic Human–Computer Interaction (HCI) principles

Handle user interactions using ActionListener

Provide user-friendly feedback and error handling

👤 System User

Librarian (single user)

🖥️ Application Interfaces
🔹 Main Window

Full-screen interface on launch

Welcome message

Navigation buttons:

Add Book

Search Book

Borrow Book

Exit

Clean layout with consistent colors and spacing

🔹 Add Book Interface

Allows the librarian to add new books to the system.

Fields:

Book title

Author name

Publication year

Features:

Input validation (empty fields not allowed)

Confirmation message on successful addition

Error message if input is invalid

🔹 Search Book Interface

Enables searching for a book by its title.

Components:

Search input field

Search button

Result display area

Behavior:

Displays a success message if the book exists

Displays an error message if the book is not found

🔹 Borrow Book Interface

Used to validate book borrowing operations.

Fields:

Book title

Borrower name

Validation:

Ensures fields are not empty

Verifies that the requested book exists

Displays success or error messages accordingly

⚙️ Technical Details

Programming Language: Java

GUI Library: Java Swing

Event Handling: ActionListener

Data Storage: In-memory (ArrayList)

Architecture: Simple multi-window Swing application

⚠️ Error Handling

The application includes basic error handling to improve usability:

Empty input fields detection

Invalid book search handling

User-friendly dialog messages

🚧 Difficulties Encountered

The main challenges during development were:

Understanding Java Swing components and layouts

Managing user interactions using event listeners

Aligning components for a clean and ergonomic interface

These difficulties were resolved by:

Using simple and structured layouts

Applying consistent styling

Following basic HCI principles

✅ Conclusion

This project provided hands-on experience in developing a graphical user interface using Java Swing.
It reinforced key concepts of HCI, such as clarity, usability, feedback, and error prevention, while also strengthening understanding of event-driven programming in Java.

The final application satisfies all project requirements and offers a functional, clean, and user-friendly solution for basic library management tasks.

▶️ How to Run the Project: type in the terminla these commands below

-->javac *.java
-->java LibraryApp

📸 Screenshots
<img width="1089" height="670" alt="image" src="https://github.com/user-attachments/assets/adb8f88a-470c-4844-b578-2b2ef75c79fe" />


⭐ Why this README is enough

✔ Structured
✔ Professional
✔ Matches academic requirements
✔ Perfect for GitHub / GitLab submission
✔ No PDF needed
