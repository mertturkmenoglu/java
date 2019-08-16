package gui.e002_CheckBox

import java.awt.*
import java.awt.event.ItemEvent
import javax.swing.*

class CheckBoxKotlin {
    init {
        fun initUI() {
            val mainFrame = JFrame("CheckBox Example").apply {
                size = Dimension(512, 512)
                layout = GridLayout(3, 1)
                defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
            }

            val header = JLabel("CheckBox", JLabel.CENTER)
            val status = JLabel("", JLabel.CENTER).apply { setSize(256, 128) }

            val controlPanel = JPanel().apply { layout = FlowLayout() }

            val cboxJava = JCheckBox("Java").apply {
                addItemListener {
                    status.text = "Java ${if (it.stateChange == ItemEvent.SELECTED) "Checked" else "Unchecked"}"
                }
            }

            val cboxKotlin = JCheckBox("Kotlin").apply {
                addItemListener {
                    status.text = "Kotlin ${if (it.stateChange == ItemEvent.SELECTED) "Checked" else "Unchecked"}"
                }
            }

            controlPanel.add(cboxJava)
            controlPanel.add(cboxKotlin)

            with(mainFrame) {
                add(header)
                add(controlPanel)
                add(status)
                isVisible = true

            }
        }

        initUI()
    }
}

fun main() {
    EventQueue.invokeLater { CheckBoxKotlin() }
}