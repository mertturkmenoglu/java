package gui.e005_ComboBox

import java.awt.*
import javax.swing.*

class ComboBoxKotlin {
    init {
        val mainFrame = JFrame("ComboBox Example").apply {
            size = Dimension(512, 512)
            layout = GridLayout(3, 1)
            defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        }

        val status = JLabel("", JLabel.CENTER).apply { setSize(128, 128) }
        val controlPanel = JPanel().apply { layout = FlowLayout() }

        val namesCombo = JComboBox<String>(DefaultComboBoxModel<String>().apply {
            addAll(mutableListOf("Emily", "Diana", "Barbara", "Selina"))
        }).apply { selectedIndex = 0 }

        val btn = JButton("Show").apply { addActionListener {
            status.text = namesCombo.selectedItem?.toString()
        } }

        with (controlPanel) { add(JScrollPane(namesCombo)); add(btn) }
        with (mainFrame) { add(JLabel("JComboBox", JLabel.CENTER)); add(controlPanel); add(status); isVisible = true }
    }
}

fun main() {
    EventQueue.invokeLater { ComboBoxKotlin() }
}