/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.ui.screen.poemsentence.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.hefengbao.jingmo.ui.screen.poemsentence.PoemSentenceSearchRoute

private const val ROUTE = "poem_sentence_search"

fun NavController.navigateToPoemSentenceSearchScreen() {
    this.navigate(ROUTE)
}

fun NavGraphBuilder.poemSentenceSearchScreen(
    onBackClick: () -> Unit,
    onCaptureClick: (Int) -> Unit,
) {
    composable(
        ROUTE
    ) {
        PoemSentenceSearchRoute(
            onBackClick = onBackClick,
            onCardClick = onCaptureClick
        )
    }
}