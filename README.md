# Introduction:
Android Jetpack compose is a modern toolkit for building a native UI, which is simplified and accelerates the UI development on Android & makes your life easier with less code.

# Requirements:
To use the JetPack Compose you need to download the Android Studio 4.0 Canary.

# In the Smaple:
In this sample project I explored some basics UI things.
* How to add a Text
* How to define composable functions. 
* How to preview your Composable functions.
* How to add a button
* How to add a style on text

# How to define a Text Element in Your Layout File:
```
setContent {
    Text("Hello Text")
}
```

# How to Add a Composable Function:
 ```
 @Composable
fun ComposableFunction(name: String) {
    Text(text = "$name!")
}
```

# How to Preview Your Composable Functions:
```
@Preview
@Composable
fun Preview() {
        ComposableFunction("Hello Compose Function")
}
```

# How to add a Button:
```
@Composable
fun addButton() {
    Container(width = 300.dp, height = 100.dp) {
        Button(
            text = "I'm a Compose Button"
        )
    }
}
```

# Add a Style on Text:
```
@Composable
fun styleOnText()
{
    MaterialTheme() {
        val typography = +MaterialTheme.typography()
        HeightSpacer(16.dp)
        Text(
            "Hello Text with style",
            style = typography.h6
                .withOpacity(0.87f)
        )
    }

}
```
# Text With Style Color
```
@Composable
fun textWithColor()
{
    Text("Text with color", style = TextStyle(color = Color.Red))

}
```
