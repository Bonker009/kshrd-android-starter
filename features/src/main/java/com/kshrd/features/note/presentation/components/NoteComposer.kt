package com.kshrd.features.note.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kshrd.coreui.preview.PreviewSurface
import com.kshrd.coreui.preview.ThemePreviews
import com.kshrd.coreui.theme.PillShape
import com.kshrd.features.R

/** The "add a note" form. State is hoisted: the ViewModel owns the draft. */
@Composable
fun NoteComposer(
    title: String,
    body: String,
    isSaving: Boolean,
    onTitleChange: (String) -> Unit,
    onBodyChange: (String) -> Unit,
    onSubmit: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.fillMaxWidth().padding(16.dp)) {
        OutlinedTextField(
            value = title,
            onValueChange = onTitleChange,
            label = { Text(stringResource(R.string.note_title_label)) },
            singleLine = true,
            enabled = !isSaving,
            modifier = Modifier.fillMaxWidth(),
        )
        OutlinedTextField(
            value = body,
            onValueChange = onBodyChange,
            label = { Text(stringResource(R.string.note_body_label)) },
            enabled = !isSaving,
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
        )
        Button(
            onClick = onSubmit,
            enabled = !isSaving,
            shape = PillShape,
            modifier = Modifier.align(Alignment.End).padding(top = 12.dp),
        ) {
            Text(stringResource(if (isSaving) R.string.note_saving else R.string.note_add))
        }
    }
}

@ThemePreviews
@Composable
private fun NoteComposerPreview() {
    PreviewSurface(padding = 0) {
        NoteComposer(
            title = "Buy milk",
            body = "",
            isSaving = false,
            onTitleChange = {},
            onBodyChange = {},
            onSubmit = {},
        )
    }
}
