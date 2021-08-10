import kotlinx.browser.document
import org.jetbrains.compose.web.renderComposable

fun main() {
    println("Hello")
    val root = document.getElementById("root")!!
    renderComposable(root) {
        App()
    }
}
