setContent {
    PriyanshuWorshipTheme {
        // Surface या बाकी UI यहीं आएगा
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // आपका ऐप UI
            Text("Welcome to Priyanshu Worship App!", style = MaterialTheme.typography.headlineLarge)
        }
    }
}
