import javax.swing.*
import java.awt.*


class Panel : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val g2 = g as Graphics2D
        g2.stroke = BasicStroke(10f)
        g2.color = Color.GREEN

        g2.drawLine(50, 50, 150, 150)
    }
}

fun main() {
    val frame = JFrame("Kotlin 3D Renderer")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(800, 600)
    frame.add(Panel())
    frame.isVisible = true
}