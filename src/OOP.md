# ООП (ООД). Геометрические фигуры. 

Приведите диаграмму классов или код иерархии объектов точка, линия, прямоугольник и квадрат. Постройте приложение, создающее фигуры, изменяющее фигуры и "рисующее" их через toString

Основные моменты:
- Методы перемещения реализуем только у `Point`, остальные классы вызывают перемещение у своих `Point`.
- Линия - самостоятельная фигура, у которой нет ограничений и свой способ изменения длины.
- Квадрат и прямоугольник унаследованы от абстрактного четырехугольника, который реализует базовый функционал хранения координат и требует реализовать проверку установки этих координат. Эта же абстракция реализует перемещение. Но изменение размеров реализуют сами классы фигур.

```plantuml
@startuml
interface Movable
Movable : + {abstract} void move(int dX, int dY)

class Point
Movable <|.. Point 
Point : - int x
Point : - int y
Point : + Point(int x, int y)
Point : + void move(int dX, int dY)

class Line
Movable <|.. Line 
Line : - Point pointA
Line : - Point pointB
Line : + Line(int xA, int yA, int xB, int yB)
Line : + void setSize(int l)
Line : + void move(int dX, int dY)

abstract class Quad
Movable <|.. Quad
Quad : - Point pointA
Quad : - Point pointB
Quad : - Point pointC
Quad : - Point pointD
Quad : + Quad(int xA, int yA, int xB, int yB, int xC, int yC, int xD, int yD) throws IllegalArgumentException
Quad : + void move(int dX, int dY)
Quad : - {abstract} validate()

class Rectangle
Quad <|-- Rectangle 
Rectangle : + setSizeA(int a)
Rectangle : + setSizeB(int b)
Rectangle : - validate()

class Square
Quad <|-- Square 
Square : + setSize(int a)
Square : - validate()

Line *-- Point
Quad *-- Point

@enduml
```