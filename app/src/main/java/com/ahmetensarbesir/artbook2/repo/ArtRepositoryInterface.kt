package com.ahmetensarbesir.artbook2.repo

import androidx.lifecycle.LiveData
import com.ahmetensarbesir.artbook2.model.ImageResponse
import com.ahmetensarbesir.artbook2.roomdb.Art
import com.ahmetensarbesir.artbook2.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString: String) : Resource<ImageResponse>

}