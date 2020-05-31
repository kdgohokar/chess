# chess
A simple console based chess board game. The program will detect the possible moves of a piece.

### Prerequisites
```
✔ Java 1.8.0
✔ Gradle 6.1
```

### Running Locally

1. Compile jar
```
$ ./gradlew clean build
```
2. Run jar
```
$ java -jar build/lib/chess-1.0-SNAPSHOT.jar
```
### Sample Input
The first string will be the type of piece followed by its position on the board.
```
King D5
```
### Sample Output
List of all the possible move positions of the input piece.
```
[D6, E6, E5, E4, D4, C4, C5, C6]
```
