# Chess Piece Polymorphism
Java OOP project that models a small part of chess using an abstract `ChessPiece`.
base class and concrete subclasses `Bishop` and `Knight`. The program can check
which squares on the board are threatened by the pieces.

## Classes
- `ChessPiece` (abstract)
  - Common fields: `row`, `col`, `color`.
  - Methods: getters, `setPosition(...)`, `isThreatening(...)` (abstract), `toString()`

- `Bishop` (extends `ChessPiece`)
  - Implements `isThreatening(...)` using diagonal movement rules
  - Threatens squares where `|Δrow| == |Δcol|` and target is not the current square

- `Knight` (extends `ChessPiece`)
  - Implements `isThreatening(...)` using the L-shaped move
  - Threatens squares where the move is `(2,1)` or `(1,2)` in any direction

- `ChessBoard`
  - Holds a list of `ChessPiece` objects
  - Methods:
    - `addPiece(ChessPiece piece)`
    - `isSquareThreatened(int row, int col)`
    - `printThreatMap()` to print an 8x8 map of threatened squares

- `Main`
  - Creates a board, adds a `Bishop` and `Knight`.
  - Prints the pieces and the threat map

## Concepts Demonstrated
- Abstraction & polymorphism
- Inheritance in Java
- Method overriding
- Simple board representation and threat detection logic

