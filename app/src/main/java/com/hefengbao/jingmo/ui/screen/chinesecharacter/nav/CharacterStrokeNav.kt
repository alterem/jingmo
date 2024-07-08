/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.ui.screen.chinesecharacter.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.hefengbao.jingmo.ui.screen.chinesecharacter.ChineseCharacterStrokeRoute

private const val ROUTE = "chinese_character_stroke"

fun NavController.navigateToChineseCharacterStrokeScreen() {
    this.navigate(ROUTE)
}

fun NavGraphBuilder.chineseCharacterStrokeScreen(
    onBackClick: () -> Unit,
) {
    composable(ROUTE) {
        ChineseCharacterStrokeRoute(
            onBackClick = onBackClick
        )
    }
}