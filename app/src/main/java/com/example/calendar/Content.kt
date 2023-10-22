package com.example.calendar

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Content(data: CalendarUiModel) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(7),
    ) {
        items(data.visibleDates) { date ->
            ContentItem(date)
        }
    }
}