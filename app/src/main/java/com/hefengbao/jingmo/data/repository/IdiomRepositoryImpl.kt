package com.hefengbao.jingmo.data.repository

import com.hefengbao.jingmo.data.database.dao.IdiomDao
import com.hefengbao.jingmo.data.database.entity.IdiomEntity
import javax.inject.Inject

class IdiomRepositoryImpl @Inject constructor(
    private val idiomDao: IdiomDao
) : IdiomRepository {
    override suspend fun getIdiom(id: Long): IdiomEntity = idiomDao.getIdiom(id)
    override suspend fun getNextId(id: Long): Long = idiomDao.getNextId(id)
    override suspend fun getPrevId(id: Long): Long = idiomDao.getPrevId(id)
}