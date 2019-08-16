package gui.e003_RadioButton

import java.awt.*
import java.awt.event.ItemEvent.SELECTED
import javax.swing.*

class RadioButtonKotlin {
    init {
        val mainFrame = JFrame("Radio Button Example").apply {
            size = Dimension(512, 512)
            layout = GridLayout(3, 1)
            defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        }

        val header = JLabel("Radio Button", JLabel.CENTER)
        val status = JLabel("", JLabel.CENTER)

        val controlPanel = JPanel().apply { layout = FlowLayout() }

        val rBtnJava = JRadioButton("Java", true).apply { addItemListener {
            status.text = "Java: ${if (it.stateChange == SELECTED) "Checked" else "Unchecked"}"
        } }

        val rBtnKotlin = JRadioButton("Kotlin").apply { addItemListener {
            status.text = "Kotlin: ${if (it.stateChange == SELECTED) "Checked" else "Unchecked"}"
        } }

        ButtonGroup().apply { add(rBtnJava); add(rBtnKotlin) }
        with (controlPanel) { add(rBtnJava); add(rBtnKotlin) }
        with (mainFrame) {
            add(header)
            add(controlPanel)
            add(status)
            isVisible = true
        }
    }
}

fun main() {
    EventQueue.invokeLater { RadioButtonKotlin() }
}