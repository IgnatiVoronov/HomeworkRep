package lesson14.task2

import java.awt.Point




/**
 * 2) Дан data class Circle(val center: Point, val radius: Double) {}
 * Простая (2 балла)
 *
 * Рассчитать расстояние между двумя окружностями.
 * Расстояние между непересекающимися окружностями рассчитывается как
 * расстояние между их центрами минус сумма их радиусов.
 * Расстояние между пересекающимися окружностями считать равным 0.0.
 */
data class Circle(val center: Point, val radius: Double) {
    fun distance(other: Circle): Double? {
        if ((center.distance(other.center)) < (radius + other.radius)) {
            println("Окружности пересекаются")
            return null
        }
        print("Расстояние между двумя окружностями - ")
        return (center.distance(other.center)) - (radius + other.radius)
    }
}

fun main() {
    val circle1: Circle = Circle(Point(3, 4), 4.6)
    val circle2: Circle = Circle(Point(25, 0), 5.0)
    println(circle1.distance(circle2))

}

