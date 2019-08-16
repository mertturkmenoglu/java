package gui.e006_TextField

import java.awt.*
import javax.swing.*

class TextFieldKotlin {
    init {
        val mainFrame = JFrame("TextField Example").apply {
            size = Dimension(512, 512)
            layout = GridLayout(3, 1)
            defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        }

        val header = JLabel("JTextField", JLabel.CENTER)
        val status = JLabel("", JLabel.CENTER).apply { setSize(128, 128) }

        val controlPanel = JPanel().apply { layout = FlowLayout() }

        val name = JLabel("Name: ", JLabel.RIGHT)
        val age = JLabel("Age: ", JLabel.CENTER)
        val nameText = JTextField(6)
        val ageText = JTextField(6)

        val btn = JButton("Check").apply {
            addActionListener {
                status.text = "Name: ${nameText.text} Age: ${ageText.text}"
            }
        }

        with(controlPanel) { add(name); add(nameText); add(age); add(ageText); add(btn) }
        with(mainFrame) { add(header); add(controlPanel); add(status); isVisible = true }
    }
}

fun main() {
    EventQueue.invokeLater { TextFieldKotlin() }
}