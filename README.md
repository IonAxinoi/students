# Учебная группа

Программа представляет собой пример реализации классов для работы с учебной группой, состоящей из преподавателя и списка студентов.

## Классы

### Teacher

Класс `Teacher` представляет преподавателя и содержит следующие поля:

- `teacherId`: идентификатор преподавателя
- `name`: имя преподавателя

### Student

Класс `Student` представляет студента и содержит следующие поля:

- `studentId`: идентификатор студента
- `name`: имя студента

### StudyGroup

Класс `StudyGroup` представляет учебную группу и содержит следующие поля:

- `teacher`: преподаватель группы (объект класса `Teacher`)
- `students`: список студентов группы (список объектов класса `Student`)

### StudyGroupService

Класс `StudyGroupService` содержит статический метод `createStudyGroup`, который используется для создания экземпляра класса `StudyGroup` на основе данных о преподавателе и студентах.

### Controller

Класс `Controller` содержит статический метод `aggregateData`, который агрегирует данные о преподавателе и студентах, а затем использует `StudyGroupService` для создания учебной группы.

### Main

Файл `Main` содержит метод `main`, который демонстрирует работу программы, создавая учебную группу и выводя информацию о ней в консоль.

## Запуск

Для запуска программы выполните метод `main` в файле `Main.java`.
