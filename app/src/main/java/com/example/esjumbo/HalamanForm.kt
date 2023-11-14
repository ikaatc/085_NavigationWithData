package com.example.esjumbo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HalamanForm() {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textTlp by remember { mutableStateOf("") }

    var ListDataTxt: MutableList<String> = mutableListOf(textNama, textAlamat, textTlp)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "Data Pelanggan",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { textNama = it },
            label = { Text(text = "Nama") })

        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { textAlamat = it },
            label = { Text(text = "Alamat") })

        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(
            value = textTlp,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { textTlp = it },
            label = { Text(text = "Nomor Telepon") })

        Spacer(modifier = Modifier.padding(16.dp))

        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.cancel))
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.submit))
            }
        }
    }
}