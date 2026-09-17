
# Project Statement

## Problem Statement
Many students and job seekers struggle with complex formatting and bloated software when trying to create a simple, standard text-based resume. There is a need for a rapid, distraction-free tool that collects essential professional data and automatically handles the layout.

## Scope of the Project
The CLI Resume Generator is scoped to operate entirely within the command-line interface. It will accept personal details, an unlimited list of skills, and education history, temporarily storing them in memory. It will then compile and export this data into a standardized `.txt` document. It does not include GUI components, PDF generation, or cloud database storage, keeping it highly portable and fast.

## Target Users
* University students needing a quick text-based resume for applications.
* Developers who prefer terminal-based utilities over web applications.
* Individuals lacking access to word processing software.

## High-Level Features
1. **Interactive Data Entry:** Menu-driven collection of personal, academic, and skill data.
2. **Persistent Export:** Immediate translation of runtime memory into a persistent `.txt` file.
3. **Graceful Error Recovery:** Input validation to ensure the application does not crash during data entry.
