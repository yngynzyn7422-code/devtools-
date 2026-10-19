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

Field	Type	Description
menteeName	String	Name of the mentee
sprintNumber	int	Sprint number
plannedHoursPerWeek	int	Planned study hours per week

Readiness Rule

The readyForSprint() method returns true when plannedHoursPerWeek is greater than or equal to 3. Otherwise, it returns false.
Git локальный цикл

1. Изменить файлы в рабочей директории (Working Directory).
2. Добавить нужные изменения в подготовленную область (Staging Area).
3. Создать коммит (Commit), сохранив подготовленные изменения в истории репозитория.

Правило веток: feature/DVT-X

Для работы над отдельной задачей создаётся ветка с именем feature/DVT-X, где X — номер задания. Например, feature/DVT-3.

Изменения задачи следует фиксировать коммитами в соответствующей ветке, не смешивая независимые задачи в одном коммите.