
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun LoginCanvasPreview() {
    LoginCanvas(
        modifier = Modifier.fillMaxWidth()
        .height(321.dp)
    );
}
@Composable
fun LoginCanvas (
    modifier: Modifier,
    colorBackground: Color = Color.Green,
    hasBorderRight: Boolean = false,
) {
    val density = LocalDensity.current.density

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    val screenWidthInPx = screenWidth.value * density
    val path = remember { Path() }
    Canvas(
        modifier = modifier
    ) {
        path.reset()
        path.moveTo(0f, 0f)
        path.lineTo(0f, screenHeight.value)
        path.quadraticBezierTo(
            screenWidthInPx * 0.05f,
            screenHeight.value * 0.2f,
            screenWidthInPx * 0.4f,
            screenHeight.value * 0.2f
        )
        path.lineTo(screenWidthInPx * 0.9f, screenHeight.value * 0.2f)
        if(hasBorderRight) {
            path.quadraticBezierTo(screenWidthInPx, screenHeight.value * 0.14f,screenWidthInPx, screenHeight.value * 0.1f )
        }else {
            path.lineTo(screenWidthInPx,screenHeight.value * 0.2f)
        }
        path.lineTo(screenWidthInPx, 0f)
        path.close()
        drawPath(
            color = colorBackground,
            path = path,

        )

    }

}