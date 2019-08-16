package gui.e004_List

import javax.swing.*
import java.awt.*

class ListKotlin {
    init {
        val mainFrame = JFrame("List Example").apply {
            size = Dimension(512, 512)
            layout = GridLayout(3, 1)
            defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        }

        val header = JLabel("JList Example", JLabel.CENTER)
        val status = JLabel("", JLabel.CENTER).apply { setSize(128, 128) }

        val controlPanel = JPanel().apply { layout = FlowLayout() }
        val studentsName = DefaultListModel<String>().apply {
            addAll(mutableListOf("Emily", "Diana", "Barbara", "Selina"))
        }

        val studentList = JList<String>(studentsName).apply {
            selectionMode = ListSelectionModel.SINGLE_SELECTION
            selectedIndex = 0
            visibleRowCount = 4
        }

        val items = DefaultListModel<String>().apply {
            addAll(mutableListOf("Book", "Pen", "Ruler", "Notebook"))
        }

        val itemList = JList<String>(items).apply {
            selectionMode = ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
            selectedIndex = 0
            visibleRowCount = 3
        }

        val showBtn = JButton("Show").apply {
            addActionListener {
                val strBuilder = StringBuilder()
                if (studentList.selectedIndex != -1) {
                    strBuilder.append("Student: ${studentList.selectedValue}")
                    status.text = strBuilder.toString()
                }
                if (itemList.selectedIndex != -1) {
                    strBuilder.append(" Items: ")
                    itemList.selectedValuesList.forEach { strBuilder.append("$it ") }
                }
                status.text = strBuilder.toString()
            }
        }

        with(controlPanel) { add(JScrollPane(studentList)); add(JScrollPane(itemList)); add(showBtn) }
        with(mainFrame) { add(header); add(controlPanel); add(status); isVisible = true }
    }
}

fun main() {
    EventQueue.invokeLater { ListKotlin() }
}