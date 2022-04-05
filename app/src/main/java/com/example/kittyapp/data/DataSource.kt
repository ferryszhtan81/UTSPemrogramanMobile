/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.kittyapp.data

import com.example.kittyapp.R
import com.example.kittyapp.model.Kitty

object DataSource {

    val kitties: List<Kitty> = listOf(
        Kitty(
            R.drawable.ciara,
            "Ciara",
            "3 bulan",
            "bermain-main"
        ),
        Kitty(
            R.drawable.dina,
            "Dina",
            "4 bulan",
            "bertidur"
        ),
        Kitty(
            R.drawable.james,
            "James",
            "6 bulan",
            "dominan wilayah"
        ),
        Kitty(
            R.drawable.luis,
            "Luis",
            "5 bulan",
            "makan terus"
        ),
        Kitty(
            R.drawable.manuel,
            "Manuel",
            "8 bulan",
            "bertahan dengan ibunya"
        ),
        Kitty(
            R.drawable.trinity,
            "Trinity",
            "10 bulan",
            "keluar rumah"
        )
    )
}
