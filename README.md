DevTools

A small Java project demonstrating Java records, methods, Gradle, and unit testing with JUnit 5 and AssertJ.

Quick Start

Requirements:

* JDK 25
* Gradle (the project includes a Gradle build configuration)

Run the application:

./gradlew run

Run tests:

./gradlew test

Packages

Package: ru.mentee.power

* ProgressDemo — application entry point that creates and displays mentee progress.
* MenteeProgress — record containing mentee progress data and related methods.
* MenteeProgressTest — unit tests for the MenteeProgress record.

MenteeProgress Fields

| Поле | Тип | Описание |
|---|---|---|
| `menteeName` | `String` | Имя студента |
| `sprintNumber` | `int` | Номер спринта |
| `plannedHoursPerWeek` | `int` | Запланированные часы обучения в неделю |

Readiness Rule

The readyForSprint() method returns true when plannedHoursPerWeek is greater than or equal to 3. Otherwise, it returns false.