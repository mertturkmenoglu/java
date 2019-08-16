package gui.e001_ColorChooser

import java.awt.*
import javax.swing.*

class ColorChooserKotlin {
    init {
        initUI()
    }

    private fun initUI() {
        val mainFrame = JFrame("Color Chooser Example")
        mainFrame.setSize(512,512)
        mainFrame.layout = GridLayout(2, 1)
        mainFrame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        val headerLabel = JLabel("JColorChooser Example", JLabel.CENTER)

        val controlPanel = JPanel()
        controlPanel.layout = FlowLayout()

        val chooseButton = JButton("Choose Background")
        chooseButton.addActionListener {
            val bgColor = JColorChooser.showDialog(mainFrame, "Choose color", Color.white)
            bgColor?.apply {
                controlPanel.background = this
                mainFrame.contentPane.background = this
            }
        }

        controlPanel.add(chooseButton)

        mainFrame.add(headerLabel)
        mainFrame.add(controlPanel)
        mainFrame.isVisible = true
    }
}

fun main() {
    EventQueue.invokeLater { ColorChooserKotlin() }
}