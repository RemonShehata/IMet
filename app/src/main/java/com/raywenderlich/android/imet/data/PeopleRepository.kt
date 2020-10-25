package com.raywenderlich.android.imet.data

import android.app.Application
import com.raywenderlich.android.imet.data.db.PeopleDao
import com.raywenderlich.android.imet.data.db.PeopleDatabase
import com.raywenderlich.android.imet.data.model.People

class PeopleRepository(application: Application) {

    private val peopleDao: PeopleDao

    init {
        val peopleDatabase = PeopleDatabase.getInstance(application)
        peopleDao = peopleDatabase.peopleDao()
    }

    fun getAllPeople(): List<People> {
        return peopleDao.getAll()
    }

    fun insertPeople(people: People) {
        peopleDao.insert(people)
    }

    fun findPeople(id: Int): People {
        return peopleDao.find(id)
    }

}
