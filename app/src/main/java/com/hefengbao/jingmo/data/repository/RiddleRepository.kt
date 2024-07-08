/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.data.repository

import com.hefengbao.jingmo.data.database.entity.RiddleEntity
import kotlinx.coroutines.flow.Flow

interface RiddleRepository {
    fun getRiddle(id: Int): Flow<RiddleEntity>
    suspend fun getNextId(id: Int): Int
    suspend fun getPrevId(id: Int): Int
    fun searchResultList(query: String): Flow<List<RiddleEntity>>
}