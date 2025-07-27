import javax.swing.*
import java.awt.*

class Panel : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val g2 = g as Graphics2D
        g2.stroke = BasicStroke(ProjectConstants.STROKE_SIZE)
        g2.color = Color.BLACK

        drawLine(g2, IntTranslation2D(0, 0), IntTranslation2D(800, 600))
    }
}

fun main() {
    val frame = JFrame("Kotlin 3D Renderer")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(ProjectConstants.X_LENGTH, ProjectConstants.Y_LENGTH)
    frame.add(Panel())
    frame.isVisible = true
}