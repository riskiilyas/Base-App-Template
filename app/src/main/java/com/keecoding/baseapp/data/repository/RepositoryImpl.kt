package com.keecoding.baseapp.data.repository

import com.keecoding.baseapp.data.repository.datasource.LocalDataSource
import com.keecoding.baseapp.data.repository.datasource.RemoteDataSource
import com.keecoding.baseapp.domain.Repository

class RepositoryImpl (
        localDataSource: LocalDataSource,
        remoteDataSource: RemoteDataSource
): Repository {

}