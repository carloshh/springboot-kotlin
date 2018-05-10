package com.carloshh.reverseapp.service

import com.carloshh.reverseapp.domain.ReversedText

interface ReverseService {

    fun reverseText(text : String) : String

    fun findAll() : Iterable<ReversedText>

}