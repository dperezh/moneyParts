# Money Parts
Algoritmo para encontrar las posibles combinaciones de cambio dado un monto.

## Ejemplo

> Denominaciones
```java
double[][] denominaciones = {0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200}
```
> Monto
```java
double monto = 0.5
```
> Posibles combinaciones
```java
[[0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05], [0.1, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05], [0.1, 0.1, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05], [0.1, 0.1, 0.1, 0.05, 0.05, 0.05, 0.05], [0.1, 0.1, 0.1, 0.1, 0.05, 0.05], [0.1, 0.1, 0.1, 0.1, 0.1], [0.2, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05], [0.2, 0.1, 0.05, 0.05, 0.05, 0.05], [0.2, 0.1, 0.1, 0.05, 0.05], [0.2, 0.1, 0.1, 0.1], [0.2, 0.2, 0.05, 0.05], [0.2, 0.2, 0.1], [0.5]]
```

## Descargar proyecto
```
$ git clone https://github.com/dperezh/moneyParts.git
```