import java.awt.Graphics2D

fun drawLine(g2: Graphics2D, from: IntTranslation2D, to: IntTranslation2D) {
    g2.drawLine(from.x, from.y, to.x, to.y)
}

fun drawLine(g2: Graphics2D, from: Translation2D, to: Translation2D) {
    drawLine(g2, from.toInt(), to.toInt())
}