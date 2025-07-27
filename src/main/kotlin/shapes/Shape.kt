package shapes

import Translation3D
import drawLine
import projectVertex
import java.awt.Graphics2D

class Shape(private val vertices: Array<Translation3D>, private val connections: Array<Pair<Int, Int>>) {
    fun draw(g2: Graphics2D) {
        val projectedPoints = Array(vertices.size) { i -> vertices[i].projectVertex() }

        for (line in connections) {
            drawLine(g2, projectedPoints[line.first], projectedPoints[line.second])
        }
    }
}