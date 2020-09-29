package com.antoniomonteiro.loginsdk

import org.koin.dsl.module

val testeModule = module {
    single{TesteDI()}
}