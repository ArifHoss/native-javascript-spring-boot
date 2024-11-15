# Book Management Application 📚

A dynamic web application built with native JavaScript, HTML, and CSS for managing a collection of books. This app allows users to add, delete, search, filter, and sort books through a clean and responsive user interface.

Table of Contents

	•	Features
	•	Technologies Used
	•	Project Structure
	•	Getting Started
	•	Prerequisites
	•	Installation
	•	Usage
	•	API Endpoints
	•	Known Issues
	•	Future Improvements

Features

	•	Add New Books: Fill in the form to add a new book with title, description, release date, pages, and genre.
	•	Search: Quickly search for books by title.
	•	Filter: Filter books by release year.
	•	Sort: Sort books alphabetically by title or chronologically by release date.
	•	View Details: Click on a book to view detailed information in a modal.
	•	Delete Books: Remove books from the collection.

Technologies Used

	•	Native JavaScript (ES6+)
	•	HTML5
	•	CSS3
	•	Bootstrap 5: For styling and responsiveness
	•	Fetch API: For handling API calls

Project Structure

	•	index.html - main HTML file
	•	styles.css - custom css style
	•	index.js - main javascript logic
	•	loadContent.js - logic to dynamically load header/footer	•	Fetch API: For handling API calls
  • README.md       - Project documentation
  • api              -  Mock API or backend

Getting Started

Prerequisites

	•	A modern web browser (Chrome, Firefox, Edge, etc.).
	•	A basic HTTP server to serve the project files (e.g., VS Code Live Server, Node.js with http-server, or Python’s SimpleHTTPServer).

Installation

	1.	Clone the repository:

	2.	Navigate to the project directory:

Usage

	1.	Open index.html in your web browser.
	2.	Use the Add New Book button to add books.
	3.	Search, filter, and sort books using the controls at the top of the page.
	4.	Click on a book card to view more details in a modal.
	5.	Delete a book by clicking the Delete button in the modal.

API Endpoints

	•	Base URL: http://localhost:8080/api/v1/books
	•	GET /books: Retrieve all books.
	•	POST /books: Add a new book. (Requires title, description, releaseDate, pages, and genre in the body.)
	•	DELETE /books/:id: Delete a book by its ID.

Known Issues

	•	The delete functionality might fail due to incorrect variable reference or API endpoint mismatch. Ensure that the id passed to the delete function matches the backend’s expected parameter.
	•	Missing book cover images default to a placeholder.

Future Improvements

	•	Add an Edit Book feature.
	•	Implement user authentication for CRUD operations.
	•	Save data to a persistent backend or database.
	•	Enhance the UI with custom animations and transitions.
	•	Improve error handling and display error messages to the user.

Feel free to contribute to the project by submitting issues or pull requests! 😊
