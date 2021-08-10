import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.common.material.Button
import org.jetbrains.compose.common.material.Text

@Composable
fun App() {
    var counter by remember { mutableStateOf(0) }

    Button(onClick = {
        counter++
    }) {
        Text("Test $counter")
    }
}