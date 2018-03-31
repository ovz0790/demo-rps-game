# demo Rock-Paper-Scissors game

A little demo application game in which two players compete in a game of Rock-Paper-Scissors
with different strategies.
The rules:
- Scissors beats Paper
- Rock beat Scissors
- Paper beats Rock

If both players choose the same, the round is counted as a tie.

There two types of player:
- Player A always chooses Paper
- Player B chooses randomly
The game consists of 100(by default or could be setted as a program attribute)
 rounds of above two players competing.
Example of output of the program:
"Player A wins 31 of 100 games"
"Player B wins 37 of 100 games"
"Tie: 32 of 100 games"

Getting Started

- Download project
- Buid it with maven

Running application

- Run as a java app:
  1) with 200 rounds:
  java -jar ~/game-impl/target/game-impl-1.0-SNAPSHOT-jar-with-dependencies.jar 200
  2) with 100 rounds:
  java -jar ~/game-impl/target/game-impl-1.0-SNAPSHOT-jar-with-dependencies.jar
